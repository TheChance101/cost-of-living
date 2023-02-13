package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test
import kotlin.test.*

class GetAvgFruitNVeggieInteractorTest {
    private lateinit var cheapestFruitNVeggie: GetAvgFruitNVeggieInteractor

    @Test
    fun should_ReturnLowest10CityPricesComparedToSalaries_When_TheListNotEmptyAndNotNullAndTheAttributesNotNull(){
        //given list of cities prices of fruit and vegetables and salaries
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, SUB_FILE_NAME) // CSV : comma separated values
        cheapestFruitNVeggie=GetAvgFruitNVeggieInteractor(dataSource)
        val list=dataSource.getAllCitiesData()
        //when average prices of fruits and vegetables are the lowest compared to the city salaries
        val cheapestCityInPrices = cheapestFruitNVeggie.execute()

        //then find the lowest 10 cities fruits and vegetables compared to salaries
            assertEquals(list.subList(0, 10), cheapestCityInPrices)
    }
    @Test
    fun should_ReturnFirst10City_When_just10CityProvided() {
        //given List of 10 cities prices of fruit and vegetables and salaries
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, TEN_CITY_FILE)

        cheapestFruitNVeggie=GetAvgFruitNVeggieInteractor(dataSource)
        val list=dataSource.getAllCitiesData()
        //when average prices of fruits and vegetables are the lowest compared to the city salaries
        val cheapestCityInPrices = cheapestFruitNVeggie.execute()
        //then find the lowest 10 cities fruits and vegetables compared to salaries
        assertEquals(list.subList(0, 10), cheapestCityInPrices)
    }

    @Test
    fun should_ReturnNull_When_TheFileIsEmpty(){
        //given
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, EMPTY_FILE)
        cheapestFruitNVeggie=GetAvgFruitNVeggieInteractor(dataSource)

        //when
        val cheapestCityInPrices = cheapestFruitNVeggie.execute()
        //then
        assertNull(cheapestCityInPrices)

    }
    @Test
    fun should_ReturnNull_When_AllTheSalariesAreNull(){
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, NULL_SALARIES_FILE)
        cheapestFruitNVeggie=GetAvgFruitNVeggieInteractor(dataSource)

        //when
        val cheapestCityInPrices = cheapestFruitNVeggie.execute()
        //then
        assertNull(cheapestCityInPrices)
    }

    @Test
    fun should_ReturnNull_When_AllTheFruitsAndVegetablesPricesAreNull(){
        //given
       val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, NULL_FRUITNVEGGIE_COST_FILE)
        cheapestFruitNVeggie=GetAvgFruitNVeggieInteractor(dataSource)

        //when
        val cheapestCityInPrices = cheapestFruitNVeggie.execute()
        //then
        assertNull(cheapestCityInPrices)


    }

    companion object{
        private const val SUB_FILE_NAME = "csvFiles/subListOfCostOfLiving20City.csv"
        private const val EMPTY_FILE = "csvFiles/emptyFile.csv"
        private const val NULL_SALARIES_FILE = "csvFiles/null10Salaries.csv"
        private const val NULL_FRUITNVEGGIE_COST_FILE = "csvFiles/null10Salaries.csv"
        private const val TEN_CITY_FILE = "csvFiles/tenCityFile.csv"


    }
}