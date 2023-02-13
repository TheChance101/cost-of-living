package interactor

import FakeData
import model.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.NullAndEmptySource
import org.junit.jupiter.params.provider.NullSource
import java.lang.Exception
import java.util.stream.Stream
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    lateinit var getCityHasCheapestInternetConnection: GetCityHasCheapestInternetConnectionInteractor


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

    @BeforeAll
    fun setup() {
        getCityHasCheapestInternetConnection = GetCityHasCheapestInternetConnectionInteractor()
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

    @ParameterizedTest
    @MethodSource("valuesForInternetPriceAndSalary")
    fun should_ReturnNull_when_HaveAIncorrectData(internetPrice: Float?, salary: Float?) {
        //given city with incorrec value for internet
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

        //when scan is the city have a correct values for internet and salary
        val result = getCityHasCheapestInternetConnection.calculatingThePercentageOfTheInternetPriceFromTheSalary(city)
        //then
        assertNull(result)
    }

    @Test
    fun should_ReturnThePercentageOfInternetFromSalary_when_HaveCorrectInput() {
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
    fun should_ReturnNull_When_NoCityHasCheapInternet() {
        //given empty list
        val emptyList = emptyList<CityEntity>()
        //when get city that has the cheapest internet
        val result = getCityHasCheapestInternetConnection.execute(emptyList)
        //then
        assertNull(result)
    }

    @Test
    fun should_ReturnNull_When_HaveNullListOfCityEntity() {
        //given empty list
        val emptyList: List<CityEntity>? = null
        //when get city that has the cheapest internet
        val result = getCityHasCheapestInternetConnection.execute(emptyList)
        //then
        assertNull(result)
    }

    @Test
    fun should_ReturnCity_When_HaveCitiesWhichHaveCheapInternet() {
        //given list of city
        val list= listOf(CityEntity(cityName="Tanta", country="Egypt",
            mealsPrices=MealsPrices(mealInexpensiveRestaurant=4.07f, mealFor2PeopleMidRangeRestaurant=14.24f, mealAtMcDonaldSOrEquivalent=2.85f),
            drinksPrices=DrinksPrices(cappuccinoRegularInRestaurants=1.15f, cokePepsiAThirdOfLiterBottleInRestaurants=0.27f, waterAThirdOfLiterBottleInRestaurants=0.16f, milkRegularOneLiter=0.73f, waterOneAndHalfLiterBottleAtTheMarket=0.23f),
            fruitAndVegetablesPrices=FruitAndVegetablesPrices(apples1kg=0.75f, banana1kg=0.5f, oranges1kg=0.26f, tomato1kg=0.53f, potato1kg=0.37f, onion1kg=0.37f, lettuceOneHead=0.16f),
            foodPrices=FoodPrices(loafOfFreshWhiteBread500g=0.33f, riceWhite1kg=0.5f, eggsRegular12=1.08f, localCheese1kg=2.4f, chickenFillets1kg=2.65f, beefRound1kgOrEquivalentBackLegRedMeat=6.31f),
            servicesPrices=ServicesPrices(basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment=20.35f, oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans=0.01f, internet60MbpsOrMoreUnlimitedDataCableAdsl=9.77f, fitnessClubMonthlyFeeForOneAdult=10.17f, tennisCourtRentOneHourOnWeekend=5.6f, cinemaInternationalReleaseOneSeat=3.66f, preschoolOrKindergartenFullDayPrivateMonthlyForOneChild=50.87f, internationalPrimarySchoolYearlyForOneChild=1078.49f),
            clothesPrices=ClothesPrices(onePairOfJeansLevis50oneOrSimilar=14.24f, oneSummerDressInAChainStoreZaraHAndM=32.05f, onePairOfNikeRunningShoesMidRange=89.54f, onePairOfMenLeatherBusinessShoes=28.49f),
            transportationsPrices=TransportationsPrices(oneWayTicketLocalTransport=0.12f, monthlyPassRegularPrice=1.02f, taxiStartNormalTariff=0.41f, taxi1kmNormalTariff=0.2f, taxi1hourWaitingNormalTariff=0.73f, gasolineOneLiter=0.38f),
            carsPrices=CarsPrices(volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar=20348.95f, toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar=16228.29f),
            realEstatesPrices=RealEstatesPrices(apartmentOneBedroomInCityCentre=22500.01f, apartmentOneBedroomOutsideOfCentre=71.22f, apartment3BedroomsInCityCentre=196.71f, apartment3BedroomsOutsideOfCentre=142.44f, pricePerSquareMeterToBuyApartmentInCityCentre=335.76f, pricePerSquareMeterToBuyApartmentOutsideOfCentre=241.47f), averageMonthlyNetSalaryAfterTax=101.74f, dataQuality=true),
            CityEntity(cityName="Havana", country="Cuba",
                mealsPrices=MealsPrices(mealInexpensiveRestaurant=10.0f, mealFor2PeopleMidRangeRestaurant=40.0f, mealAtMcDonaldSOrEquivalent=7.0f),
                drinksPrices=DrinksPrices(cappuccinoRegularInRestaurants=1.91f, cokePepsiAThirdOfLiterBottleInRestaurants=2.28f, waterAThirdOfLiterBottleInRestaurants=1.63f, milkRegularOneLiter=3.52f, waterOneAndHalfLiterBottleAtTheMarket=0.98f),
                fruitAndVegetablesPrices=FruitAndVegetablesPrices(apples1kg=6.24f, banana1kg=1.1f, oranges1kg=1.12f, tomato1kg=2.05f, potato1kg=1.82f, onion1kg=2.34f, lettuceOneHead=0.86f),
                foodPrices=FoodPrices(loafOfFreshWhiteBread500g=1.18f, riceWhite1kg=1.85f, eggsRegular12=1.64f, localCheese1kg=4.85f, chickenFillets1kg=6.07f, beefRound1kgOrEquivalentBackLegRedMeat=11.59f),
                servicesPrices=ServicesPrices(basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment=37.14f, oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans=0.26f, internet60MbpsOrMoreUnlimitedDataCableAdsl=165.0f, fitnessClubMonthlyFeeForOneAdult=16.67f, tennisCourtRentOneHourOnWeekend=13.75f, cinemaInternationalReleaseOneSeat=1.12f, preschoolOrKindergartenFullDayPrivateMonthlyForOneChild=70.0f, internationalPrimarySchoolYearlyForOneChild=15166.67f),
                clothesPrices=ClothesPrices(onePairOfJeansLevis50oneOrSimilar=55.5f, oneSummerDressInAChainStoreZaraHAndM=44.33f, onePairOfNikeRunningShoesMidRange=79.17f, onePairOfMenLeatherBusinessShoes=78.0f),
                transportationsPrices=TransportationsPrices(oneWayTicketLocalTransport=0.1f, monthlyPassRegularPrice=20.0f, taxiStartNormalTariff=1.0f, taxi1kmNormalTariff=0.5f, taxi1hourWaitingNormalTariff=15.0f, gasolineOneLiter=1.14f),
                carsPrices=CarsPrices(volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar=80000.0f, toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar=81500.0f),
                realEstatesPrices=RealEstatesPrices(apartmentOneBedroomInCityCentre=532.86f, apartmentOneBedroomOutsideOfCentre=222.5f, apartment3BedroomsInCityCentre=1625.0f, apartment3BedroomsOutsideOfCentre=730.0f, pricePerSquareMeterToBuyApartmentInCityCentre=490.89f, pricePerSquareMeterToBuyApartmentOutsideOfCentre=268.23f), averageMonthlyNetSalaryAfterTax=35987.75f, dataQuality=true),

            )

        //when get city which has the cheapest internet
        val result = getCityHasCheapestInternetConnection.execute(list)
        println(result)
        //then
        assertEquals(list[1],result)
    }
}