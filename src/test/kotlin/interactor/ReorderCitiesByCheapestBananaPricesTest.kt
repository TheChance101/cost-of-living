package interactor

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertNull

class ReorderCitiesByCheapestBananaPricesTest {

    private lateinit var fakeData: CostOfLivingDataSource
    private lateinit var newListOfCities: ReorderCitiesByCheapestBananaPrices

    @BeforeEach
    fun setUp() {
        fakeData.getAllCitiesData().take(5)
        newListOfCities = ReorderCitiesByCheapestBananaPrices(fakeData)
    }

    @Test
    fun should_ReorderCitiesList_When_AllGivenCitiesAreInTheList() {
        // given a list of citie as vararg
        var firstCity = "Havana"
        var secondCity = "Jaramana"
        var thirdCity = "Sancti Spiritus"
        // when Reorder cities
        val reorderedList: List<String> = newListOfCities.reorderTheGivenList(firstCity, secondCity, thirdCity)
        // then find the cheapest banana prices cities
        assertArrayEquals("Sancti Spiritus ", "Jaramana  ", "Havana ", reorderedList)
    }

    @Test
    fun should_ReorderCitiesList_When_AGivenCitiesAreNotInTheList() {
        // given a list of citie as vararg
        var firstCity = "Batna"
        var secondCity = "Jaramana"
        var thirdCity = "Sancti Spiritus"
        // when Reorder cities
        val reorderedList: List<String> = newListOfCities.reorderTheGivenList(firstCity, secondCity, thirdCity)
        // then find the cheapest banana prices cities
        assertArrayEquals("Sancti Spiritus ", "Jaramana  ", reorderedList)
    }

    @Test
    fun should_RetournEmptyLis_When_AllGivenCitiesAreNotInTheList() {
        // given a list of citie as vararg
        var firstCity = "Batna"
        var secondCity = "Mila"
        var thirdCity = "Friha"
        // when Reorder cities
        val reorderedList: List<String> = newListOfCities.reorderTheGivenList(firstCity, secondCity, thirdCity)
        // then return an empty list
        assertNull( reorderedList)
    }


}