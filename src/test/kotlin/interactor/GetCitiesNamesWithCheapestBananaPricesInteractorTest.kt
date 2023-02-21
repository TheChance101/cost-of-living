package interactor

import data.BananaCheapestFakeData
import data.BananaCheapestFakeData.citiesListOf
import data.BananaCheapestFakeData.makeCity
import data.EmptyFakeData
import data.InvalidFakeData
import model.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesNamesWithCheapestBananaPricesInteractorTest {
    // region init
    private lateinit var getCitiesNamesWithCheapestBananaPrices: GetCitiesNamesWithCheapestBananaPricesInteractor

    @BeforeEach
    fun setup() {
        getCitiesNamesWithCheapestBananaPrices = GetCitiesNamesWithCheapestBananaPricesInteractor(BananaCheapestFakeData)
    }
    // endregion

    // region one city cases
    @Test
    fun `should throw illegal state exception when the data is invalid`() {
        // change source of fake data to invalid data
        getCitiesNamesWithCheapestBananaPrices = GetCitiesNamesWithCheapestBananaPricesInteractor(InvalidFakeData)

        // given one city included
        val city = makeCity("Santiago de Cuba")

        // when the output is list of one city
        val result = Executable { getCitiesNamesWithCheapestBananaPrices(city) }

        // then check
        assertThrows(IllegalStateException::class.java, result)
    }
    @Test
    fun `should throw illegal state exception when the data is empty`() {
        // change source of fake data to empty data
        getCitiesNamesWithCheapestBananaPrices = GetCitiesNamesWithCheapestBananaPricesInteractor(EmptyFakeData)

        // given one city included
        val city = makeCity("Santiago de Cuba")

        // when the output is list of one city
        val result = Executable { getCitiesNamesWithCheapestBananaPrices(city) }

        // then check
        assertThrows(IllegalStateException::class.java, result)
    }

    @Test
    fun `should return one city when the input is one city included`() {
        // given one city included
        val city = makeCity("Santiago de Cuba")

        // when the output is list of one city
        val result = getCitiesNamesWithCheapestBananaPrices(city)

        // then check
        assertEquals(listOf("Santiago de Cuba"), result)
    }

    @Test
    fun `should throw illegal state exception when the input is one city not included`() {
        // given one city is not included
        val city = makeCity("Galaxy")

        // when the output is empty list of city
        val result =  Executable { getCitiesNamesWithCheapestBananaPrices(city) }

        // then check 
        assertThrows(IllegalStateException::class.java, result)
    }

    @Test
    fun `should return one city when the input is one city included in lowercase`() {
        // given one city included
        val city = makeCity("santiago de cuba")

        // when the output is list of one city
        val result = getCitiesNamesWithCheapestBananaPrices(city)

        // then check
        assertEquals(listOf("Santiago de Cuba"), result)
    }

    @Test
    fun `should return one city when the input is one city included in lowercase and more outer spaces`() {
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
    fun `should return sorted list when the input is multi city all included`() {
        // given multi city all of this is included
        val cities = citiesListOf("Santiago de Cuba", "Sancti Spiritus")

        // when the output is list of sorted cities by Banana Price
        val result = getCitiesNamesWithCheapestBananaPrices(*cities)

        // then check
        assertEquals(listOf("Santiago de Cuba", "Sancti Spiritus"), result)
    }

    @Test
    fun `should return sorted list when the input is multi city all included in different cases`() {
        // given multi city all of this is included
        val cities = citiesListOf("SaNtiago de cuba", "sAncti spirItus")

        // when the output is list of sorted cities by Banana Price
        val result = getCitiesNamesWithCheapestBananaPrices(*cities)

        // then check
        assertEquals(listOf("Santiago de Cuba", "Sancti Spiritus"), result)
    }

    @Test
    fun `should return sorted list when the input is multi city some included`() {
        // given multi city some of this is included
        val cities = citiesListOf("Santiago de Cuba", "Sancti Spiritus", "Galaxy")

        // when the output is list of sorted cities by Banana Price
        val result = getCitiesNamesWithCheapestBananaPrices(*cities)

        // then check
        assertEquals(listOf("Santiago de Cuba", "Sancti Spiritus"), result)
    }

    @Test
    fun `should return sorted list when the input is multi city some included in different cases`() {
        // given multi city some of this is included
        val cities = citiesListOf("santiago de cuba", "Sancti Spiritus", "Galaxy")

        // when the output is list of sorted cities by Banana Price
        val result = getCitiesNamesWithCheapestBananaPrices(*cities)

        // then check
        assertEquals(listOf("Santiago de Cuba", "Sancti Spiritus"), result)
    }

    @Test
    fun `should throw illegal state exception when the input is multi city all not included`() {
        // given multi city all of this is not included
        val cities = citiesListOf("", "Farwala", "Galaxy")

        // when the output is empty list
        val result =  Executable { getCitiesNamesWithCheapestBananaPrices(*cities) }

        // then check
        assertThrows(IllegalStateException::class.java, result)
    }
    // endregion
}