package interactor

import data.BananaCheapestFakeData
import data.BananaCheapestFakeData.Companion.citiesListOf
import data.BananaCheapestFakeData.Companion.makeCity
import data.EmptyFakeData
import data.InvalidFakeData
import model.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesNamesWithCheapestBananaPricesInteractorTest {
    // region init
    private lateinit var getCitiesNamesWithCheapestBananaPrices: GetCitiesNamesWithCheapestBananaPricesInteractor
    private lateinit var fakeData: BananaCheapestFakeData

    @BeforeEach
    fun setup() {
        fakeData = BananaCheapestFakeData()
        getCitiesNamesWithCheapestBananaPrices = GetCitiesNamesWithCheapestBananaPricesInteractor(fakeData)
    }
    // endregion

    // region one city cases
    @Test
    fun should_ReturnEmptyList_When_TheDataIsInvalid() {
        getCitiesNamesWithCheapestBananaPrices = GetCitiesNamesWithCheapestBananaPricesInteractor(InvalidFakeData())

        // given one city included
        val city = makeCity("Santiago de Cuba")

        // when the output is list of one city
        val result = getCitiesNamesWithCheapestBananaPrices(city)

        // then check
        assertEquals(emptyList<String>(), result)
    }
    @Test
    fun should_ReturnEmptyList_When_TheDataIsEmpty() {
        getCitiesNamesWithCheapestBananaPrices = GetCitiesNamesWithCheapestBananaPricesInteractor(EmptyFakeData())

        // given one city included
        val city = makeCity("Santiago de Cuba")

        // when the output is list of one city
        val result = getCitiesNamesWithCheapestBananaPrices(city)

        // then check
        assertEquals(emptyList<String>(), result)
    }

    @Test
    fun should_ReturnOneCity_When_TheInputIsOneCityIncluded() {
        // given one city included
        val city = makeCity("Santiago de Cuba")

        // when the output is list of one city
        val result = getCitiesNamesWithCheapestBananaPrices(city)

        // then check
        assertEquals(listOf("Santiago de Cuba"), result)
    }

    @Test
    fun should_ReturnEmptyList_when_TheInputIsOneCityNotIncluded() {
        // given one city is not included
        val city = makeCity("Galaxy")

        // when the output is empty list of city
        val result = getCitiesNamesWithCheapestBananaPrices(city)

        // then check 
        assertEquals(emptyList<String>(), result)
    }

    @Test
    fun should_ReturnOneCity_When_TheInputIsOneCityIncludedInLowercase() {
        // given one city included
        val city = makeCity("santiago de cuba")

        // when the output is list of one city
        val result = getCitiesNamesWithCheapestBananaPrices(city)

        // then check
        assertEquals(listOf("Santiago de Cuba"), result)
    }

    @Test
    fun should_ReturnOneCity_When_TheInputIsOneCityIncludedInLowercaseAndMoreOuterSpace() {
        // given one city included
        val city = makeCity(" santiago de cuba ")

        // when the output is list of one city
        val result = getCitiesNamesWithCheapestBananaPrices(city)

        // then check
        assertEquals(listOf("Santiago de Cuba"), result)
    }
    // endregion

    // region multi city cases
    @Test
    fun should_ReturnSortedList_When_TheInputIsMultiCityAllIncluded() {
        // given multi city all of this is included
        val cities = citiesListOf("Santiago de Cuba", "Sancti Spiritus")

        // when the output is list of sorted cities by Banana Price
        val result = getCitiesNamesWithCheapestBananaPrices(*cities)

        // then check
        assertEquals(listOf("Santiago de Cuba", "Sancti Spiritus"), result)
    }

    @Test
    fun should_ReturnSortedList_When_TheInputIsMultiCityAllIncludedInDifferentCase() {
        // given multi city all of this is included
        val cities = citiesListOf("SaNtiago de cuba", "sAncti spirItus")

        // when the output is list of sorted cities by Banana Price
        val result = getCitiesNamesWithCheapestBananaPrices(*cities)

        // then check
        assertEquals(listOf("Santiago de Cuba", "Sancti Spiritus"), result)
    }

    @Test
    fun should_ReturnSortedList_When_TheInputIsMultiCitySomeIncluded() {
        // given multi city some of this is included
        val cities = citiesListOf("Santiago de Cuba", "Sancti Spiritus", "Galaxy")

        // when the output is list of sorted cities by Banana Price
        val result = getCitiesNamesWithCheapestBananaPrices(*cities)

        // then check
        assertEquals(listOf("Santiago de Cuba", "Sancti Spiritus"), result)
    }

    @Test
    fun should_ReturnSortedList_When_TheInputIsMultiCitySomeIncludedInDifferentCases() {
        // given multi city some of this is included
        val cities = citiesListOf("santiago de cuba", "Sancti Spiritus", "Galaxy")

        // when the output is list of sorted cities by Banana Price
        val result = getCitiesNamesWithCheapestBananaPrices(*cities)

        // then check
        assertEquals(listOf("Santiago de Cuba", "Sancti Spiritus"), result)
    }

    @Test
    fun should_ReturnSortedList_when_TheInputIsMultiCityAllNotIncluded() {
        // given multi city all of this is not included
        val cities = citiesListOf("", "Farwala", "Galaxy")

        // when the output is empty list
        val result = getCitiesNamesWithCheapestBananaPrices(*cities)

        // then check
        assertEquals(emptyList<String>(), result)
    }
    // endregion


}