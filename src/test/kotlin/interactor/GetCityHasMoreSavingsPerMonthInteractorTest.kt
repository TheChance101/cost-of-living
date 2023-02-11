package interactor

import org.junit.jupiter.api.Test
import dataSource.utils.CsvParser
import dataSource.CsvDataSource
import org.junit.jupiter.api.Assertions.*


internal class GetCityHasMoreSavingsPerMonthInteractorTest {
    private lateinit var citySavings: GetCityHasMoreSavingsPerMonthInteractor




    @Test
    fun should_ReturnCity_When_CityFoodCostIsNotNull(){
        // given city food cost not null
        val limit = 4
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource =
            CsvDataSource(csvParser, GetCityHasMoreSavingsPerMonthInteractorTest.CITY_COST_FOOD_NOT_NULL_FILE)
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)
        val listCityName=dataSource.getAllCitiesData()


        // when find the most suitable city in the world that they can have more savings per month.
        val getCityCostFoodNotNull = citySavings.execute(limit)

        //done

        assertEquals(listCityName[0],getCityCostFoodNotNull)


    }



    @Test
    fun should_ReturnCity_When_ApartmentIsNotNull(){
        // given city apartment not null
        val limit = 2
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, GetCityHasMoreSavingsPerMonthInteractorTest.CITY_APARTMENT_NOT_NULL_FILE)
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)
        val listCityName=dataSource.getAllCitiesData()


        // when find the most suitable city in the world that they can have more savings per month.
        val getCityCostFoodNotNull = citySavings.execute(limit)


        //done
        assertEquals(listCityName[0],getCityCostFoodNotNull)


    }
    @Test
    fun should_ReturnCity_When_TransportationsPricesNull(){
        // given city with Transportations Prices null
        val limit = 5
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, GetCityHasMoreSavingsPerMonthInteractorTest.CITY_WITH_TRANSPORTATIONS_PRICES_NULL_FILE)
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)
        val listCityName=dataSource.getAllCitiesData()


        // when find the most suitable city in the world that they can have more savings per month.
        val getCityCostFoodNotNull = citySavings.execute(limit)


        //done
        assertEquals(listCityName[0],getCityCostFoodNotNull)


    }


    @Test
    fun should_ReturnCity_When_ApartmentAndCostFoodNotNullAndTransportationsIsNull(){
        // given city apartment and cost food not null and Transportations is null
        val limit = 4
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, GetCityHasMoreSavingsPerMonthInteractorTest.CITY_WITH_TRANSPORTATIONS_PRICES_NULL_AND_APARTMENT_AND_COST_FOOD_NOT_NULL_FILE)
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)
        val listCityName=dataSource.getAllCitiesData()


        // when find the most suitable city in the world that they can have more savings per month.
        val getCityCostFoodNotNull = citySavings.execute(limit)


        //done
        assertEquals(listCityName[0],getCityCostFoodNotNull)


    }


    @Test
    fun should_ReturnNull_When_LimitCityIsZero(){
        // given limit equal zero
        val limit = 0
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, GetCityHasMoreSavingsPerMonthInteractorTest.NULL_CITY_FILE)
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)


        // when find the most suitable city in the world that they can have more savings per month.
        val getCityNull = citySavings.execute(limit)


        //done
        assertNull(getCityNull)

    }

    @Test
    fun should_ReturnNull_When_LimitCityNegativeNumber(){
        // given limit negative number
        val limit = -100
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, GetCityHasMoreSavingsPerMonthInteractorTest.NULL_CITY_FILE)
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)


        // when find the most suitable city in the world that they can have more savings per month.
        val getCityNull = citySavings.execute(limit)


        //done
        assertNull(getCityNull)


    }
    @Test
    fun should_ReturnNull_When_FoodPriceNull(){
        // given null food price is null
        val limit = 1
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, GetCityHasMoreSavingsPerMonthInteractorTest.NULL_CITY_FILE)
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)


        // when find the most suitable city in the world that they can have more savings per month.
        val getCityNull = citySavings.execute(limit)


        //done
        assertNull(getCityNull)


    }
    @Test
    fun should_ReturnNull_When_ApartmentNull(){
        // given null Apartment is null
        val limit = 1
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, GetCityHasMoreSavingsPerMonthInteractorTest.NULL_CITY_FILE)
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)


        // when find the most suitable city in the world that they can have more savings per month.
        val getCityNull = citySavings.execute(limit)


        //done
        assertNull(getCityNull)


    }
    @Test
    fun should_ReturnNull_When_TransportationsNotNull(){
        // given  null Transportations not null
        val limit = 1
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, GetCityHasMoreSavingsPerMonthInteractorTest.NULL_CITY_FILE)
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)


        // when find the most suitable city in the world that they can have more savings per month.
        val getCityNull = citySavings.execute(limit)


        //done
        assertNull(getCityNull)


    }
    @Test
    fun should_ReturnNull_When_TransportationsNotNullAndFoodPriceAndApartmentNull(){
        // given null with Transportations not null And Food Price And Apartment is null
        val limit = 1
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, GetCityHasMoreSavingsPerMonthInteractorTest.NULL_CITY_FILE)
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)


        // when find the most suitable city in the world that they can have more savings per month.
        val getCityNull = citySavings.execute(limit)


        //done
        assertNull(getCityNull)


    }


    companion object{


        private const val NULL_CITY_FILE = "csvFiles/nullCity.csv"
        private const val CITY_COST_FOOD_NOT_NULL_FILE = "csvFiles/findCityWithCostFoodNotNull.csv"
        private const val CITY_APARTMENT_NOT_NULL_FILE = "csvFiles/findCityWithApartmentNotNull.csv"
        private const val CITY_WITH_TRANSPORTATIONS_PRICES_NULL_FILE= "csvFiles/findCityWithTransportationsPricesIsNull.csv"
        private const val CITY_WITH_TRANSPORTATIONS_PRICES_NULL_AND_APARTMENT_AND_COST_FOOD_NOT_NULL_FILE= "csvFiles/findCityWithTransportationsPricesIsNullAndFoodPriceAndApartmentNotNull.csv"


    }

}




