package interactor

import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.function.Executable


class GetDinnerLocationInteractorTest {

    @Test
    fun `execute returns null when there are no cities`() {
        // Given
        val dataSource = object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf()
            }
        }
        val interactor = GetDinnerLocationInteractor(dataSource)
        val exepct = null

        assertDoesNotThrow("This block should not throw an exception") {
            interactor.execute()
        }


    }


    @Test
    fun `execute returns null when cities have missing meal prices`() {
        // Given
        val dataSource = object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf(
                    CityEntity(
                        "City1",
                        "Country1",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        14563f,
                        true
                    ),
                )
            }
        }

        val interactor = GetDinnerLocationInteractor(dataSource)

        //when
        val result: Executable = org.junit.jupiter.api.function.Executable { interactor.execute() }
        //then
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `execute returns null when cities are from countries other than USA, Canada, or Mexico`() {
        // Given
        val dataSource = object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf(
                    CityEntity(
                        "City1",
                        "Country1",
                        MealsPrices(55.6f, 963.1f, 31.6f),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        14563f,
                        true
                    ),
                )
            }
        }

        val interactor = GetDinnerLocationInteractor(dataSource)


        //when
        val result: Executable = org.junit.jupiter.api.function.Executable { interactor.execute() }
        //then
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `execute returns closest city name`() {
        // Given
        val dataSource = object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf(
                    CityEntity(
                        "Alberta",
                        "Canada",
                        MealsPrices(960f, 320.3f, 13.6f),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        14563f,
                        true
                    ),
                    CityEntity(
                        "Edmonton ",
                        "Canada",
                        MealsPrices(805.6f, 34.3f, 83.6f),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        14563f,
                        true
                    ),
                    CityEntity(
                        "Montreal ,",
                        "Canada",
                        MealsPrices(740f, 56.8f, 86f),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        14563f,
                        true
                    ),
                    CityEntity(
                        "Chicago",
                        "USA",
                        MealsPrices(602.5f, 43.0f, 11.77f),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        14563f,
                        true
                    ),
                    CityEntity(
                        "Los Angeles",
                        "USA",
                        MealsPrices(409f, 87.0f, 76f),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        14563f,
                        true
                    ),
                    CityEntity(
                        "New York",
                        "USA",
                        MealsPrices(392f, 33.0f, 54f),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        14563f,
                        true
                    ),
                    CityEntity(
                        "Ecatepec",
                        "Mexico",
                        MealsPrices(330f, 53.0f, 11.6f),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        14563f,
                        true
                    ),
                    CityEntity(
                        "Tijuana",
                        "Mexico",
                        MealsPrices(260f, 63.0f, 8.6f),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        14563f,
                        true
                    ),
                    CityEntity(
                        "Mexico City",
                        "Mexico",
                        MealsPrices(245f, 43.0f, 81.6f),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        14563f,
                        true
                    ),
                )
            }
        }

        val interactor = GetDinnerLocationInteractor(dataSource)
        val expected = "Chicago"
        // When
        val result = interactor.execute()

        // Then
        assertEquals(expected, result!!.cityName)
    }


}


