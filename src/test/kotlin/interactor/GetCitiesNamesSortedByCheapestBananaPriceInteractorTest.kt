package interactor

import model.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GetCitiesNamesSortedByCheapestBananaPriceInteractorTest {

    private val getCitiesNamesSortedByCheapestBananaPriceInteractor =
        GetCitiesNamesSortedByCheapestBananaPriceInteractor()


    @Test
    fun should_ignore_entries_with_null_city_name_or_banana_price() {
        val cities: List<CityEntity> = citiesWithNullBananaPrice()

        val sorted = getCitiesNamesSortedByCheapestBananaPriceInteractor.execute(*cities.toTypedArray())

        assertEquals(1, sorted.size)
    }

    @Test
    fun should_get_cities_names_sorted_by_cheapest_banana_price() {
        val cities: List<CityEntity> = citiesEntities()

        val sorted = getCitiesNamesSortedByCheapestBananaPriceInteractor.execute(*cities.toTypedArray())

        val expected = listOf("B", "A")

        assertEquals(expected, sorted)
    }

    private fun citiesEntities(): List<CityEntity> {
        return listOf(
            cityEntity("A", 20.0f),
            cityEntity("B", 10.25f)
        )
    }
    private fun citiesWithNullBananaPrice(): List<CityEntity> {
        return listOf(
            cityEntity("A", null),
            cityEntity("B", 10.25f)
        )
    }

    private fun cityEntity(cityName: String, bananaPrice: Float?): CityEntity {
        return CityEntity(
            cityName,
            "",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, bananaPrice, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            null,
            true

        )
    }


}