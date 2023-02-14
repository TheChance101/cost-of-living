package interactor

import data.FakeDataSource
import data.TestCase
import model.CityEntity
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
        fakeData.changeDataSource(TestCase.BestCityForSavingMoney)

    }
    // endregion

    @Test
    fun should_ReturnTrue_When_TheCityHasNotNullRequireValues() {

        // given
        val data = fakeData.getAllCitiesData()[0]
        val checkNullFieldsFunction =
            bestCityForSavingMoney::class.java.getDeclaredMethod("checkNullFields", CityEntity::class.java)
        checkNullFieldsFunction.isAccessible = true

        // when check if the output is true
        val result = checkNullFieldsFunction.invoke(bestCityForSavingMoney, data) as Boolean

        // then check the result
        Assertions.assertTrue(result)
    }

    @Test
    fun should_ReturnCity_When_ValidData() {

        // Given a city name and the name of returned city
        val cityName = "Moncks Corner"

        // when
        val nameOfReturnedCity = bestCityForSavingMoney.execute(true).cityName

        // then check the result
        Assertions.assertEquals(cityName, nameOfReturnedCity)
    }

    @Test
    fun should_ReturnFalse_When_WePassTheFakeData() {

        // Given a city name and the name of returned city
        val cityName = "Cairo"
        val nameOfReturnedCity = bestCityForSavingMoney.execute(true).cityName

        // when check if the two names are the same
        val areEqual = cityName == nameOfReturnedCity

        // then check the result
        Assertions.assertFalse(areEqual)
    }
}