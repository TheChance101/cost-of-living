package interactor

import fakeData.FakeData
import model.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

/**
 * Created by Mohamed Elgohary on 2/9/2023.
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetSalaryAverageForCitiesInCountryInteractorTest(
) {

    lateinit var getSalaryAverageForCitiesInCountryInteractor: GetSalaryAverageForCitiesInCountryInteractor
    lateinit var fakeData: FakeData

    @BeforeAll
    fun setup() {
        fakeData = FakeData()
        getSalaryAverageForCitiesInCountryInteractor = GetSalaryAverageForCitiesInCountryInteractor(fakeData)

    }

    @Test
    fun should_ReturnCitiesNameAndSalariesAverage_When_CountryNameIsUppercase() {
        // Given country name Uppercase
        val countryName = "CUBA"
        // When averageSalary not null and high dataQuality
        val actualPairList = getSalaryAverageForCitiesInCountryInteractor.execute(countryName)
        // Then return a list of pair of city name and average salary
        assertEquals(listOf(Pair("Santiago de Cuba", 18.0f)), actualPairList)
    }

    @Test
    fun should_ReturnCitiesNameAndSalariesAverage_When_CountryNameIsLowercase() {
        // Given country name Lowercase
        val countryName = "egypt"
        // When averageSalary not null and high dataQuality
        val actualPairList = getSalaryAverageForCitiesInCountryInteractor.execute(countryName)
         // Then return a list of pair of city name and average salary
        assertEquals(listOf(Pair("Tanta", 101.74f)), actualPairList)
    }

    @Test
    fun should_ReturnCitiesNameAndSalariesAverage_When_CountryNameIsMixed() {
        // Given country name Mix of Uppercase and Lowercase
        val countryName = "SyRia"
        // When averageSalary not null and high dataQuality
        val actualPairList = getSalaryAverageForCitiesInCountryInteractor.execute(countryName)
        // Then return a list of pair of city name and average salary
        assertEquals(listOf(Pair("Damascus", 50.24f)), actualPairList)
    }

    @Test
    fun should_ReturnException_When_CountryNameIsEmpty() {
        // Given empty country name
        val countryName = ""
        // When country name is empty
        val salary: Executable = Executable { getSalaryAverageForCitiesInCountryInteractor.execute(countryName) }
        // Then return Throw Exception
        assertThrows(Exception::class.java, salary)
    }

    @Test
    fun should_ReturnFalse_When_SalariesNotEqualNullOrNotAvoidLowQualityData() {
        // Given cityEntity
        val city = CityEntity(
            cityName = "Santiago de Cuba",
            country = "Cuba",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 6.5f,
                mealFor2PeopleMidRangeRestaurant = 15.0f,
                mealAtMcDonaldSOrEquivalent = 5.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.0f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2.0f,
                waterAThirdOfLiterBottleInRestaurants = 1.0f,
                milkRegularOneLiter = 3.8f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.0f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 11.02f,
                banana1kg = 0.44f,
                oranges1kg = 1.1f,
                tomato1kg = 0.88f,
                potato1kg = 1.1f,
                onion1kg = 2.2f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 1.1f,
                riceWhite1kg = 1.1f,
                eggsRegular12 = 2.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 6.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.1f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = null,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = 1.0f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = null
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 40.0f,
                oneSummerDressInAChainStoreZaraHAndM = 40.0f,
                onePairOfNikeRunningShoesMidRange = 60.0f,
                onePairOfMenLeatherBusinessShoes = 50.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = null,
                monthlyPassRegularPrice = null,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = 0.7f,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = null
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = null
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = null,
                apartmentOneBedroomOutsideOfCentre = null,
                apartment3BedroomsInCityCentre = 600.0f,
                pricePerSquareMeterToBuyApartmentInCityCentre = null
            ),
            averageMonthlyNetSalaryAfterTax = 18.0f,
            dataQuality = false
        )
        // When averageSalary not null and low dataQuality
        val result = getSalaryAverageForCitiesInCountryInteractor.excludeNullSalariesAndLowQualityData(city)

        // Then return false
        assertFalse(result)
    }

    @Test
    fun should_ReturnTrue_When_SalariesNotEqualNullAndAvoidLowQualityData() {
        // Given cityEntity
        val city = CityEntity(
            cityName = "Tanta",
            country = "Egypt",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 4.07f,
                mealFor2PeopleMidRangeRestaurant = 14.24f,
                mealAtMcDonaldSOrEquivalent = 2.85f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.15f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 0.27f,
                waterAThirdOfLiterBottleInRestaurants = 0.16f,
                milkRegularOneLiter = 0.73f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.23f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 0.75f,
                banana1kg = 0.5f,
                oranges1kg = 0.26f,
                tomato1kg = 0.53f,
                potato1kg = 0.37f,
                onion1kg = 0.37f,
                lettuceOneHead = 0.16f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 0.33f,
                riceWhite1kg = 0.5f,
                eggsRegular12 = 1.08f,
                localCheese1kg = 2.4f,
                chickenFillets1kg = 2.65f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6.31f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 20.35f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 9.77f,
                fitnessClubMonthlyFeeForOneAdult = 10.17f,
                tennisCourtRentOneHourOnWeekend = 5.6f,
                cinemaInternationalReleaseOneSeat = 3.66f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 50.87f,
                internationalPrimarySchoolYearlyForOneChild = 1078.49f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 14.24f,
                oneSummerDressInAChainStoreZaraHAndM = 32.05f,
                onePairOfNikeRunningShoesMidRange = 89.54f,
                onePairOfMenLeatherBusinessShoes = 28.49f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 0.12f,
                monthlyPassRegularPrice = 1.02f,
                taxiStartNormalTariff = 0.41f,
                taxi1kmNormalTariff = 0.2f,
                taxi1hourWaitingNormalTariff = 0.73f,
                gasolineOneLiter = 0.38f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20348.95f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 16228.29f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 156.01f,
                apartmentOneBedroomOutsideOfCentre = 71.22f,
                apartment3BedroomsInCityCentre = 196.71f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 335.76f
            ),
            averageMonthlyNetSalaryAfterTax = 101.74f,
            dataQuality = true
        )

        // When averageSalary not null and high dataQuality
        val result = getSalaryAverageForCitiesInCountryInteractor.excludeNullSalariesAndLowQualityData(city)

        // Then return true
        assertTrue(result)
    }


}