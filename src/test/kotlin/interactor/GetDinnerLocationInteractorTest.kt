package interactor

import fakeDataSource.FakeDataSourceForDinnerLocation
import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.assertDoesNotThrow


class GetDinnerLocationInteractorTest {

    private lateinit var fakeDataSourceForDinnerLocation: FakeDataSourceForDinnerLocation
    private lateinit var interactor: GetDinnerLocationInteractor

    @BeforeEach
    fun setUp() {
        fakeDataSourceForDinnerLocation = FakeDataSourceForDinnerLocation()
    }


    @Test
    fun should_ReturnNull_When_ThereAreNoCities() {
        // given
        interactor = GetDinnerLocationInteractor(
            fakeDataSourceForDinnerLocation.getEmptyFakeDataSource())
        // when
        val result = interactor.execute()
        //then
        assertDoesNotThrow("This block should not throw an exception") {
            result
        }
    }

    @Test
    fun should_ReturnNull_When_CitiesHaveMissingMealPrices() {
        // Given
        interactor = GetDinnerLocationInteractor(fakeDataSourceForDinnerLocation.
            getDataWithNullInMealPrice())

        //when
        val result = interactor.execute()
        //then
        assertNull(result)
    }

    @Test
    fun should_ReturnsNull_When_CitiesAreNotFromUSAOrCanadaOrMexico() {
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
        val result = interactor.execute()
        //then
        assertNull(result)
    }

    @Test
    fun should_ReturnsClosestCityName() {
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
                        "Montreal",
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

    @Test
    fun should_Get_Average_Returns_TheCorrect_Average() {
        // Given
        val mealsPrices1 = fakeDataSourceForDinnerLocation.mealOne()
        val mealsPrices2 = fakeDataSourceForDinnerLocation.mealTwo()
        //when
        val avg = getAverage(mealsPrices1.mealsPrices, mealsPrices2.mealsPrices)
        //then
        assertEquals(145f, avg)
    }


    @Test
    fun should_ReturnsClosestCity_And_Avg(){
        //Given
        val cityList = fakeDataSourceForDinnerLocation.getMeClosestCity()
        val avg = 310f
        //when
        val closestCity = getClosestCity(cityList,avg)?.cityName
        val expected = "Ecatepec"
        //then
        assertEquals(expected, closestCity)
    }
}