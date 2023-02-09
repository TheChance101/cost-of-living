package interactor

import dataSource.utilis.FakeDataSource
import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesNamesWithSCheapestBananaPricesInteractorTest {
    lateinit var getCitiesNamesWithSCheapestBananaPricesInteractor: GetCitiesNamesWithSCheapestBananaPricesInteractor
    lateinit var fakeDataSource: FakeDataSource

    @BeforeAll
    fun setup() {
        fakeDataSource = FakeDataSource()
        getCitiesNamesWithSCheapestBananaPricesInteractor =
            GetCitiesNamesWithSCheapestBananaPricesInteractor(fakeDataSource)
    }

    // region one city
    @Test
    fun should_ReturnOneCity_when_TheInputIsOneCityIncluded() {
        // given
        val city = "Santiago de Cuba"

        // when the output is list of one city
        val result = getCitiesNamesWithSCheapestBananaPricesInteractor.execute(city)

        // then check
        assertEquals(listOf("Santiago de Cuba"), result)
    }

    @Test
    fun should_ReturnEmptyList_when_TheInputIsOneCityNotIncluded() {
        // given
        val city = "Galaxy"

        // when the output is list of one city
        val result = getCitiesNamesWithSCheapestBananaPricesInteractor.execute(city)

        // then check
        assertEquals(emptyList<String>(), result)
    }
    // endregion

    // region multi city
    @Test
    fun should_ReturnSortedList_when_TheInputIsMultiCityAllIncluded() {
        // given
        val cities = arrayOf("Santiago de Cuba", "Sancti Spiritus")

        // when the output is list of sorted cities by Banana Price
        val result = getCitiesNamesWithSCheapestBananaPricesInteractor
            .execute(citiesNames = cities)

        // then check
        assertEquals(listOf("Santiago de Cuba", "Sancti Spiritus"), result)
    }

    @Test
    fun should_ReturnSortedList_when_TheInputIsMultiCitySomeIncluded() {
        // given
        val cities = arrayOf("Santiago de Cuba", "Sancti Spiritus", "Galaxy")

        // when the output is list of sorted cities by Banana Price
        val result = getCitiesNamesWithSCheapestBananaPricesInteractor
            .execute(citiesNames = cities)

        // then check
        assertEquals(listOf("Santiago de Cuba", "Sancti Spiritus"), result)
    }

    @Test
    fun should_ReturnSortedList_when_TheInputIsMultiCityAllNotIncluded() {
        // given
        val cities = arrayOf("", "Farwala", "Galaxy")

        // when the output is empty list
        val result = getCitiesNamesWithSCheapestBananaPricesInteractor
            .execute(citiesNames = cities)

        // then check
        assertEquals(emptyList<String>(), result)
    }
    // endregion
}
