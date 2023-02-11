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
        // Given
        val countryName = "CUBA"
        // When
        val actualPairList = getSalaryAverageForCitiesInCountryInteractor.execute(countryName)
        // Then
        assertEquals(listOf(Pair("Santiago de Cuba", 18.0f)), actualPairList)

    }

    @Test
    fun should_ReturnCitiesNameAndSalariesAverage_When_CountryNameIsLowercase() {
        // Given
        val countryName = "egypt"
        // When
        val actualPairList = getSalaryAverageForCitiesInCountryInteractor.execute(countryName)
        // Then
        assertEquals(listOf(Pair("Tanta", 101.74f)), actualPairList)
    }

    @Test
    fun should_ReturnCitiesNameAndSalariesAverage_When_CountryNameIsMixed() {
        // Given
        val countryName = "SyRia"
        // When
        val actualPairList = getSalaryAverageForCitiesInCountryInteractor.execute(countryName)
        // Then
        assertEquals(listOf(Pair("Damascus", 50.24f)), actualPairList)
    }

    @Test
    fun should_ReturnException_When_CountryNameIsEmpty() {
        val countryName = ""
        val salary:Executable = Executable { getSalaryAverageForCitiesInCountryInteractor.execute(countryName) }
        assertThrows(Exception::class.java, salary)
    }

    @Test
    fun should_ReturnFalse_When_SalariesNotEqualNullAndDoNotAvoidLowQualityData() {
        // Given
        val cityName = CityEntity(
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
        // When
        val result = getSalaryAverageForCitiesInCountryInteractor.excludeNullSalariesAndLowQualityData(cityName)

        // Then
        assertFalse(result)
    }


}