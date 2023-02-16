package interactor
import dataSource.CsvDataSource
import dataSource.utils.CsvParser

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class GetTopFiveFashionCitiesInteractTest {

    private lateinit var interactor: GetTopFiveFashionCitiesInteractor

    @Test
    fun should_ReturnTopFiveFashionCities_When_TheListNotEmptyAndNotNullAndTheAttributesNotNull() {
        // given list of cities
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, CITIES_FILE)
        interactor = GetTopFiveFashionCitiesInteractor(dataSource)
        val citiesList= dataSource.getAllCitiesData()

        //when
        val bestFiveFashionCities= interactor.execute()

        // then
        assertEquals(citiesList[1], bestFiveFashionCities)
    }

    companion object{
        private const val CITIES_FILE = "csvFiles/fashionCities.csv"

        private const val TEST_CSV_CONTENT = "city,meals_prices,drinks_prices,fruit_and_vegetables_prices,food_prices,services_prices,transportation_prices\n" +
                "Paris,100.0,100.0,100.0,100.0,100.0,100.0\n" +
                "New York,90.0,90.0,90.0,90.0,90.0,90.0\n" +
                "London,80.0,80.0,80.0,80.0,80.0,80.0\n" +
                "Berlin,70.0,70.0,70.0,70.0,70.0,70.0\n" +
                "Barcelona,60.0,60.0,60.0,60.0,60.0,60.0\n" +
                "Tokyo,50.0,50.0,50.0,50.0,50.0,50.0\n"
    }


}



