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

    // region init
    private lateinit var bestCityForSavingMoney: GetBestCityForSavingMoneyInteractor

    private lateinit var fakeData: FakeDataSource

    @BeforeAll
    fun setup() {
        fakeData = FakeDataSource()
        bestCityForSavingMoney =
            GetBestCityForSavingMoneyInteractor(fakeData)
//        fakeData.changeDataSource(TestCase.BananaCheapest)

    }
    // endregion

//    @Test
//    fun should_ReturnTrue_When_TheCityHasNotNullRequireValues(){
//
//        // given a city haven't null fields
//        val cityWithoutNullFields = dataSource.getAllCitiesData()[0]
//
//        // when check if the output is true
//        val result = bestCity.checkNullFields(cityWithoutNullFields)
//        // then check the result
//        Assertions.assertTrue(result)
//    }
//
//    @Test
//    fun should_ReturnFalse_When_TheCityHasNullRequireValues(){
//
//        // given a city have null fields
//        val cityWithNullFields = dataSource.getAllCitiesData()[1]
//
//        // when check if the output is false
//        val result = bestCity.checkNullFields(cityWithNullFields)
//
//        // then check the result
//        Assertions.assertFalse(result)
//    }

    @Test
    fun should_ReturnTrue_When_WePassTheFakeData(){

        // Given a city name and the name of returned city
        val cityName = "Moncks Corner"
        val nameOfReturnedCity = bestCityForSavingMoney.execute(true).cityName

        // when check if the two names are the same
        val areEqual = cityName == nameOfReturnedCity

        // then check the result
        Assertions.assertTrue(areEqual)
    }

    @Test
    fun should_ReturnFalse_When_WePassTheFakeData(){

        // Given a city name and the name of returned city
        val cityName = "Cairo"
        val nameOfReturnedCity = bestCityForSavingMoney.execute(true).cityName

        // when check if the two names are the same
        val areEqual = cityName == nameOfReturnedCity

        // then check the result
        Assertions.assertFalse(areEqual)
    }
}