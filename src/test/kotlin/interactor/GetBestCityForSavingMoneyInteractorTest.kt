package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import dataSource.utils.FakeDataProvider
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetBestCityForSavingMoneyInteractorTest {


    lateinit var bestCity: GetBestCityForSavingMoneyInteractor
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    @BeforeAll
    fun setUp() {

        bestCity = GetBestCityForSavingMoneyInteractor(FakeDataProvider)
    }


    @Test
    fun should_ReturnTrue_When_TheCityHasNotNullRequireValues(){

        // given a city haven't null fields
        val cityWithoutNullFields = dataSource.getAllCitiesData()[0]

        // when check if the output is true
        val result = bestCity.checkNullFields(cityWithoutNullFields)

        // then check the result
        Assertions.assertTrue(result)
    }

    @Test
    fun should_ReturnFalse_When_TheCityHasNullRequireValues(){

        // given a city have null fields
        val cityWithNullFields = dataSource.getAllCitiesData()[1]

        // when check if the output is false
        val result = bestCity.checkNullFields(cityWithNullFields)
        // then check the result
        Assertions.assertFalse(result)
    }

    @Test
    fun should_ReturnTrue_When_WePassTheFakeData(){

        // Given a city name and the name of returned city
        val cityName = "Moncks Corner"
        val nameOfReturnedCity = bestCity.execute(true).cityName

        // when check if the two names are the same
        val areEqual = cityName == nameOfReturnedCity

        // then check the result
        Assertions.assertTrue(areEqual)
    }

    @Test
    fun should_ReturnFalse_When_WePassTheFakeData(){

        // Given a city name and the name of returned city
        val cityName = "Cairo"
        val nameOfReturnedCity = bestCity.execute(true).cityName

        // when check if the two names are the same
        val areEqual = cityName == nameOfReturnedCity

        // then check the result
        Assertions.assertFalse(areEqual)
    }
}