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
    fun should_returnsNull_When_ThereAreNoCities() {
        // Given

        val dataSource = object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf()
            }
        }
        interactor = GetDinnerLocationInteractor(dataSource)

        assertDoesNotThrow("This block should not throw an exception") {
            interactor.execute()
        }


    }


    @Test
    fun should_ReutrnsNull_When_CitiesHaveMissingMealPrices() {
        // Given

        val dataSource = object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf(
                    CityEntity(
                        "City1",
                        "Country1",
                        MealsPrices(58.6f, 913.1f, 34.6f),
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
    fun should_ReturnsNull_When_CitiesAreNotFromUSAOrCanadaOrMexico()
    {
        // Given
        val interactor = GetDinnerLocationInteractor(fakeDataSourceForDinnerLocation.getMeOtherThanSelected())
        //when
        val result = interactor.execute()
        //then
        assertNull(result)
    }

    @Test
    fun should_ReturnsClosestCityName() {
        // Given
        val interactor = GetDinnerLocationInteractor(
            fakeDataSourceForDinnerLocation.getMeCustomDataSource())
        val expected = "Chicago"
        // When
        val result = interactor.execute()!!.cityName
        // Then
        assertEquals(expected, result)
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