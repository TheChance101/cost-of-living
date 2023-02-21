package interactor

import data.BestCityForSavingMoneyFakeData
import data.InvalidFakeData
import model.CityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetBestCitiesForBuyingSoftDrinksInteractorTest {

    // region init
    private lateinit var bestCitiesForBuyingSoftDrinks: GetBestCitiesForBuyingSoftDrinksInteractor

    @BeforeAll
    fun setup() {

        bestCitiesForBuyingSoftDrinks =
            GetBestCitiesForBuyingSoftDrinksInteractor(BestCityForSavingMoneyFakeData)
    }
    // endregion

    @Test
    fun `should return true when the city has not null require values`() {

        // given
        val data = BestCityForSavingMoneyFakeData.getAllCitiesData()[0]
        val excludeNullRequireValues =
            bestCitiesForBuyingSoftDrinks::class.java.getDeclaredMethod(
                "excludeNullRequireValues",
                CityEntity::class.java
            )
        excludeNullRequireValues.isAccessible = true

        // when check if the output is true
        val result = excludeNullRequireValues.invoke(bestCitiesForBuyingSoftDrinks, data) as Boolean

        // then check the result
        assertTrue(result)
    }

    @Test
    fun `should return best three cities names when we pass the fake data`() {

        // Given a cities names and the names of returned cities
        val bestThreeCitiesNames = BestCityForSavingMoneyFakeData.getAllCitiesData()
            .filter { it.cityName != "Malden" }

        // when check if the two lists are the same
        val namesOfReturnedCities = bestCitiesForBuyingSoftDrinks(3)

        // then check the result
        assertEquals(bestThreeCitiesNames,namesOfReturnedCities)
    }

    @Test
    fun `should throw exception when the data is empty`() {

        // change data source to empty data
        bestCitiesForBuyingSoftDrinks =
            GetBestCitiesForBuyingSoftDrinksInteractor(BestCityForSavingMoneyFakeData.emptyData)

        // when the function throw exception

        val result = Executable {
            bestCitiesForBuyingSoftDrinks(3)
        }

        // then check the result
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `should throw exception when the limit is below 1`() {

        // change data source to empty data
        bestCitiesForBuyingSoftDrinks =
            GetBestCitiesForBuyingSoftDrinksInteractor(BestCityForSavingMoneyFakeData)

        // when the function throw exception

        val result = Executable {
            bestCitiesForBuyingSoftDrinks(0)
        }

        // then check the result
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `should throw exception when the data is invalid`() {

        // change data source to empty data
        bestCitiesForBuyingSoftDrinks =
            GetBestCitiesForBuyingSoftDrinksInteractor(InvalidFakeData)

        // when the function throw exception

        val result = Executable {
            bestCitiesForBuyingSoftDrinks(3)
        }

        // then check the result
        assertThrows(Exception::class.java, result)
    }
}