package interactor

import FakeData
import model.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var getCityHasCheapestInternetConnection: GetCityHasCheapestInternetConnectionInteractor
    private lateinit var fakeData: FakeData


    @BeforeAll
    fun setup() {
        fakeData = FakeData()
        getCityHasCheapestInternetConnection = GetCityHasCheapestInternetConnectionInteractor(fakeData)
    }

    companion object {
        @JvmStatic
        private fun valuesForInternetPriceAndSalary(): Stream<Arguments> {
            return Stream.of(
                Arguments {
                    arrayOf(-50.0f, -2500.0f)
                },
                Arguments {
                    arrayOf(-50.0f, 2500.0f)
                },
                Arguments {
                    arrayOf(0.0f, 2500.0f)
                },
                Arguments {
                    arrayOf(50.0f, 0.0f)
                },
                Arguments {
                    arrayOf(0.0f, 0.0f)
                },
                Arguments {
                    arrayOf(null, 50.0f)
                },
                Arguments {
                    arrayOf(500.0f, null)
                },
                Arguments {
                    arrayOf(null, null)
                },
            )
        }
    }

    @Test
    fun should_ReturnTrue_when_CityInstanceHaveACorrectValueForInternetAndSalary() {
        //given city instance with not null value for internet and salary
        val city = fakeData.getAllCitiesData()[0]

        //when scan the city instance have a correct values for internet and salary
        val result = getCityHasCheapestInternetConnection.excludeNullAndIncorrectInternetPriceAndSalary(city)
        //then
        assertTrue(result)

    }


    @ParameterizedTest
    @MethodSource("valuesForInternetPriceAndSalary")
    fun should_ReturnFalse_when_CityInstanceHaveAIncorrectData(internetPrice: Float?, salary: Float?) {
        //given city with instance value for internet
        val city =
            CityEntity(
                cityName = "Caracas", country = "Venezuela",
                mealsPrices = MealsPrices(null, null, null),
                drinksPrices = DrinksPrices(null, null, null, null, null),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                foodPrices = FoodPrices(null, null, null, null, null, null),
                servicesPrices = ServicesPrices(
                    null,
                    null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = internetPrice,
                    null, null, null,
                    null, null
                ),
                clothesPrices = ClothesPrices(null, null, null, null),
                transportationsPrices = TransportationsPrices(null, null, null, null, null, null),
                carsPrices = CarsPrices(null, null),
                realEstatesPrices = RealEstatesPrices(null, null, null, null, null, null),
                averageMonthlyNetSalaryAfterTax = salary, dataQuality = true
            )

        //when scan the city have a correct values for internet and salary
        val result = getCityHasCheapestInternetConnection.excludeNullAndIncorrectInternetPriceAndSalary(city)
        //then
        assertFalse(result)
    }


    @Test
    fun should_ReturnThePercentageOfInternetFromSalary_when_HaveCityWithCorrectInput() {
        //given correct Input
        val city =
            CityEntity(
                cityName = "Caracas", country = "Venezuela",
                mealsPrices = MealsPrices(null, null, null),
                drinksPrices = DrinksPrices(null, null, null, null, null),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                foodPrices = FoodPrices(null, null, null, null, null, null),
                servicesPrices = ServicesPrices(
                    null,
                    null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 50f,
                    null, null, null,
                    null, null
                ),
                clothesPrices = ClothesPrices(null, null, null, null),
                transportationsPrices = TransportationsPrices(null, null, null, null, null, null),
                carsPrices = CarsPrices(null, null),
                realEstatesPrices = RealEstatesPrices(null, null, null, null, null, null),
                averageMonthlyNetSalaryAfterTax = 500f, dataQuality = true
            )


        //when get a percentage of internet from salary
        val result = getCityHasCheapestInternetConnection.calculatingThePercentageOfTheInternetPriceFromTheSalary(city)
        //then
        assertEquals(10f, result)

    }

    @Test
    fun should_ReturnCity_When_HaveAListOfCity() {
        //when get city which has the cheapest internet
        val result = getCityHasCheapestInternetConnection.execute()
        //then
        assertEquals(fakeData.getAllCitiesData()[10], result)
    }

}