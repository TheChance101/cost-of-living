package interactor

import dataSource.utilis.FakeDataSource
import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesNamesWithCheapestBananaPricesInteractorTest {
    private lateinit var getCitiesNamesWithCheapestBananaPricesInteractor: GetCitiesNamesWithCheapestBananaPricesInteractor
    private lateinit var fakeDataSource: FakeDataSource

    @BeforeAll
    fun setup() {
        fakeDataSource = FakeDataSource()
        getCitiesNamesWithCheapestBananaPricesInteractor =
            GetCitiesNamesWithCheapestBananaPricesInteractor(fakeDataSource)
    }

    // region one city
    @Test
    fun should_ReturnOneCity_When_TheInputIsOneCityIncluded() {
        // given one city included
        val city = "Santiago de Cuba"

        // when the output is list of one city
        val result = getCitiesNamesWithCheapestBananaPricesInteractor.execute(city)

        // then check
        assertEquals(listOf("Santiago de Cuba"), result)
    }

    @Test
    fun should_ReturnEmptyList_when_TheInputIsOneCityNotIncluded() {
        // given one city is not included
        val city = "Galaxy"

        // when the output is empty list of city
        val result = getCitiesNamesWithCheapestBananaPricesInteractor.execute(city)

        // then check 
        assertEquals(emptyList<String>(), result)
    }
    // endregion

    // region multi city
    @Test
    fun should_ReturnSortedList_When_TheInputIsMultiCityAllIncluded() {
        // given multi city all of this is included
        val cities = arrayOf("Santiago de Cuba", "Sancti Spiritus")

        // when the output is list of sorted cities by Banana Price
        val result = getCitiesNamesWithCheapestBananaPricesInteractor
            .execute(*cities)

        // then check
        assertEquals(listOf("Santiago de Cuba", "Sancti Spiritus"), result)
    }

    @Test
    fun should_ReturnSortedList_When_TheInputIsMultiCitySomeIncluded() {
        // given multi city some of this is included
        val cities = arrayOf("Santiago de Cuba", "Sancti Spiritus", "Galaxy")

        // when the output is list of sorted cities by Banana Price
        val result = getCitiesNamesWithCheapestBananaPricesInteractor
            .execute(*cities)

        // then check
        assertEquals(listOf("Santiago de Cuba", "Sancti Spiritus"), result)
    }

    @Test
    fun should_ReturnSortedList_when_TheInputIsMultiCityAllNotIncluded() {
        // given multi city all of this is not included
        val cities = arrayOf("", "Farwala", "Galaxy")

        // when the output is empty list
        val result = getCitiesNamesWithCheapestBananaPricesInteractor
            .execute(*cities)

        // then check
        assertEquals(emptyList<String>(), result)
    }
    // endregion
}
