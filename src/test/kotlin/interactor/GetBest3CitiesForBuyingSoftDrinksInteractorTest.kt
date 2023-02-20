package interactor

import data.FakeDataSource
import data.TestCase
import model.CityEntity
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetBest3CitiesForBuyingSoftDrinksInteractorTest{


    // region init
    private lateinit var best3CitiesForBuyingSoftDrinks: GetBest3CitiesForBuyingSoftDrinksInteractor
    private lateinit var fakeData: FakeDataSource

    @BeforeAll
    fun setup() {

        fakeData = FakeDataSource()
        best3CitiesForBuyingSoftDrinks =
            GetBest3CitiesForBuyingSoftDrinksInteractor(fakeData)
        fakeData.changeDataSource(TestCase.BestCityForSavingMoney)
    }
    // endregion

    @Test
    fun should_ReturnTrue_When_TheCityHasNotNullRequireValues() {

        // given
        val data = fakeData.getAllCitiesData()[0]
        val excludeNullRequireValues =
            best3CitiesForBuyingSoftDrinks::class.java.getDeclaredMethod("excludeNullRequireValues", CityEntity::class.java)
        excludeNullRequireValues.isAccessible = true

        // when check if the output is true
        val result = excludeNullRequireValues.invoke(best3CitiesForBuyingSoftDrinks, data) as Boolean

        // then check the result
        Assertions.assertTrue(result)
    }

    @Test
    fun should_ReturnTrue_When_WePassTheFakeData() {

        // Given a cities names and the names of returned cities
        val bestThreeCitiesNames = listOf("Moncks Corner" , "Keller" , "Pearl City")
        val namesOfReturnedCities =
            listOf(
            best3CitiesForBuyingSoftDrinks()[0].cityName,
            best3CitiesForBuyingSoftDrinks()[1].cityName,
            best3CitiesForBuyingSoftDrinks()[3].cityName
            )

        // when check if the two lists are the same
        val areEqual = bestThreeCitiesNames == namesOfReturnedCities

        // then check the result
        Assertions.assertTrue(areEqual)
    }

    @Test
    fun should_ReturnFalse_When_WePassTheFakeData() {

        // Given a cities names and the names of returned cities
        val bestThreeCitiesNames = listOf("Moncks Corner" , "Keller" , "Pearl City")
        val namesOfReturnedCities =
            listOf(
                best3CitiesForBuyingSoftDrinks()[0].cityName,
                best3CitiesForBuyingSoftDrinks()[1].cityName,
                best3CitiesForBuyingSoftDrinks()[2].cityName
            )

        // when check if the two lists are the same
        val areEqual = bestThreeCitiesNames == namesOfReturnedCities

        // then check the result
        Assertions.assertTrue(areEqual)
    }

}