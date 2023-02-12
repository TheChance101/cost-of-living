package interactor

import dataSource.utils.FakeDataSourceM
import jdk.jfr.Name
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesNamesWithCheapestBananaPricesInteractorTest {
    // region init
    private lateinit var getCitiesNamesWithCheapestBananaPricesInteractor: GetCitiesNamesWithCheapestBananaPricesInteractor
    @Name("FakeDataSource")
    private lateinit var fakeDataSource: FakeDataSourceM

    @BeforeAll
    fun setup() {
        fakeDataSource = FakeDataSourceM()
        getCitiesNamesWithCheapestBananaPricesInteractor =
            GetCitiesNamesWithCheapestBananaPricesInteractor(fakeDataSource)
    }
    // endregion

    // region one city cases
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

    @Test
    fun should_ReturnOneCity_When_TheInputIsOneCityIncludedInLowercase() {
        // given one city included
        val city = "santiago de cuba"

        // when the output is list of one city
        val result = getCitiesNamesWithCheapestBananaPricesInteractor.execute(city)

        // then check
        assertEquals(listOf("Santiago de Cuba"), result)
    }

    @Test
    fun should_ReturnOneCity_When_TheInputIsOneCityIncludedInLowercaseAndMoreOuterSpace() {
        // given one city included
        val city = " santiago de cuba "

        // when the output is list of one city
        val result = getCitiesNamesWithCheapestBananaPricesInteractor.execute(city)

        // then check
        assertEquals(listOf("Santiago de Cuba"), result)
    }
    // endregion

    // region multi city cases
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
    fun should_ReturnSortedList_When_TheInputIsMultiCityAllIncludedInDifferentCase() {
        // given multi city all of this is included
        val cities = arrayOf("SaNtiago de cuba", "sAncti spirItus")

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
    fun should_ReturnSortedList_When_TheInputIsMultiCitySomeIncludedInDifferentCases() {
        // given multi city some of this is included
        val cities = arrayOf("santiago de cuba", "Sancti Spiritus", "Galaxy")

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