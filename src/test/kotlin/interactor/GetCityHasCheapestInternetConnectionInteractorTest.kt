package interactor

import FakeData
import model.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
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

    lateinit var getCityHasCheapestInternetConnection: GetCityHasCheapestInternetConnectionInteractor

    companion object {
        @JvmStatic
        private fun numberToInternetPriceAndSalary(): Stream<Arguments> {
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

    @BeforeAll
    fun setup() {
        val fakeData = FakeData()
        getCityHasCheapestInternetConnection = GetCityHasCheapestInternetConnectionInteractor(fakeData)
    }

    @Test
    fun should_ReturnTrue_when_CityInstanceHaveACorrectValueForInternetAndSalary() {
        //given city instance with not null value for internet and salary
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
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 49.38f,
                    null, null, null,
                    null, null
                ),
                clothesPrices = ClothesPrices(null, null, null, null),
                transportationsPrices = TransportationsPrices(null, null, null, null, null, null),
                carsPrices = CarsPrices(null, null),
                realEstatesPrices = RealEstatesPrices(null, null, null, null, null, null),
                averageMonthlyNetSalaryAfterTax = 185.12f, dataQuality = true
            )

        //when scan the city instance have a correct values for internet and salary
        val result = getCityHasCheapestInternetConnection.excludeNullAndIncorrectInternetPriceAndSalary(city)
        //then
        assertTrue(result)

    }


    @ParameterizedTest
    @MethodSource("numberToInternetPriceAndSalary")
    fun should_ReturnFalse_when_CityInstanceHaveAIncorrectData(internetPrice: Float?, salary: Float?) {
        //given city instance with null value for internet
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

        //when scan the city instance have a correct values for internet and salary
        val result = getCityHasCheapestInternetConnection.excludeNullAndIncorrectInternetPriceAndSalary(city)
        //then
        assertFalse(result)
    }

    @ParameterizedTest
    @MethodSource("numberToInternetPriceAndSalary")
    fun should_ReturnNull_when_HaveAIncorrectData(internetPrice: Float?, salary: Float?) {
        //given city instance with null value for internet
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

        //when scan the city instance have a correct values for internet and salary
        val result = getCityHasCheapestInternetConnection.excludeNullAndIncorrectInternetPriceAndSalary(city)
        //then
        assertFalse(result)
    }

    @Test
    fun should_ReturnThePercentageOfInternetFromSalary_when_HaveCorrectInput() {
        //given correct Input
        val internetPrice = 50.0f
        val salary = 500.0f

        //when get a percentage of internet from salary
        val result = getCityHasCheapestInternetConnection.calculatingThePercentageOfTheInternetPriceFromTheSalary(internetPrice, salary)
        //then
        assertEquals(0.1f, result)

    }


}