package interactor.addons

import interactor.CostOfLivingDataSource
import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasLowestCarsPriceInteractorTest {
    private lateinit var city: GetCityHasLowestCarsPriceInteractor
    @BeforeAll
    fun setup(){
        city= GetCityHasLowestCarsPriceInteractor(object :CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf(
                    CityEntity(
                        cityName = "Baghdad",
                        mealsPrices = MealsPrices(mealInexpensiveRestaurant = null, mealFor2PeopleMidRangeRestaurant = null, mealAtMcDonaldSOrEquivalent = null,
                        ),
                        country = "Iraq",
                        dataQuality = true,
                        drinksPrices = DrinksPrices(cappuccinoRegularInRestaurants = null, cokePepsiAThirdOfLiterBottleInRestaurants = null, waterAThirdOfLiterBottleInRestaurants = null, milkRegularOneLiter = null, waterOneAndHalfLiterBottleAtTheMarket = null
                        ),
                        fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                            apples1kg = null,
                            banana1kg = null,
                            oranges1kg = null,
                            tomato1kg = null,
                            potato1kg = null,
                            onion1kg = null,
                            lettuceOneHead = null
                        ),
                        foodPrices = FoodPrices(
                            loafOfFreshWhiteBread500g = 8f,
                            riceWhite1kg = 6f,
                            eggsRegular12 = 1f,
                            localCheese1kg = 3f,
                            chickenFillets1kg = 4f,
                            beefRound1kgOrEquivalentBackLegRedMeat = 10f
                        ),
                        servicesPrices = ServicesPrices(basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null, oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null, internet60MbpsOrMoreUnlimitedDataCableAdsl = null, fitnessClubMonthlyFeeForOneAdult = null, tennisCourtRentOneHourOnWeekend = null, cinemaInternationalReleaseOneSeat = null, preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null, internationalPrimarySchoolYearlyForOneChild = null

                        ),
                        clothesPrices = ClothesPrices(onePairOfJeansLevis50oneOrSimilar = null, oneSummerDressInAChainStoreZaraHAndM = null, onePairOfNikeRunningShoesMidRange = null, onePairOfMenLeatherBusinessShoes = null
                        ),
                        transportationsPrices = TransportationsPrices(oneWayTicketLocalTransport = null, monthlyPassRegularPrice = null, taxiStartNormalTariff = null, taxi1kmNormalTariff = null, taxi1hourWaitingNormalTariff = null, gasolineOneLiter = null
                        ),
                        carsPrices = CarsPrices(
                            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 500f,
                            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 600f
                        ),
                        realEstatesPrices = RealEstatesPrices(apartmentOneBedroomInCityCentre = null, apartmentOneBedroomOutsideOfCentre = null, apartment3BedroomsInCityCentre = null,
                            apartment3BedroomsOutsideOfCentre = 10f, pricePerSquareMeterToBuyApartmentInCityCentre = null, pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                        ),
                        averageMonthlyNetSalaryAfterTax = 500f,

                        ),
                    CityEntity(
                        cityName = "Amman",
                        mealsPrices = MealsPrices(mealInexpensiveRestaurant = null, mealFor2PeopleMidRangeRestaurant = null, mealAtMcDonaldSOrEquivalent = null,
                        ),
                        country = "Jordan",
                        dataQuality = true,
                        drinksPrices = DrinksPrices(cappuccinoRegularInRestaurants = null, cokePepsiAThirdOfLiterBottleInRestaurants = null, waterAThirdOfLiterBottleInRestaurants = null, milkRegularOneLiter = null, waterOneAndHalfLiterBottleAtTheMarket = null
                        ),
                        fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                            apples1kg = null,
                            banana1kg = null,
                            oranges1kg = null,
                            tomato1kg = null,
                            potato1kg = null,
                            onion1kg = null,
                            lettuceOneHead = null
                        ),
                        foodPrices = FoodPrices(
                            loafOfFreshWhiteBread500g = 8f,
                            riceWhite1kg = 6f,
                            eggsRegular12 = 1f,
                            localCheese1kg = 3f,
                            chickenFillets1kg = 4f,
                            beefRound1kgOrEquivalentBackLegRedMeat = 10f
                        ),
                        servicesPrices = ServicesPrices(basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null, oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null, internet60MbpsOrMoreUnlimitedDataCableAdsl = null, fitnessClubMonthlyFeeForOneAdult = null, tennisCourtRentOneHourOnWeekend = null, cinemaInternationalReleaseOneSeat = null, preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null, internationalPrimarySchoolYearlyForOneChild = null

                        ),
                        clothesPrices = ClothesPrices(onePairOfJeansLevis50oneOrSimilar = null, oneSummerDressInAChainStoreZaraHAndM = null, onePairOfNikeRunningShoesMidRange = null, onePairOfMenLeatherBusinessShoes = null
                        ),
                        transportationsPrices = TransportationsPrices(oneWayTicketLocalTransport = null, monthlyPassRegularPrice = null, taxiStartNormalTariff = null, taxi1kmNormalTariff = null, taxi1hourWaitingNormalTariff = null, gasolineOneLiter = null
                        ),
                        carsPrices = CarsPrices(
                            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 700f,
                            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 900f
                        ),
                        realEstatesPrices = RealEstatesPrices(apartmentOneBedroomInCityCentre = null, apartmentOneBedroomOutsideOfCentre = null, apartment3BedroomsInCityCentre = null,
                            apartment3BedroomsOutsideOfCentre = 10f, pricePerSquareMeterToBuyApartmentInCityCentre = null, pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                        ),
                        averageMonthlyNetSalaryAfterTax = 500f,

                        )
                )

            }
        }
        )

    }


    @Test
    fun should_ReturnOneCity_When_FunctionInvoke() {
        //given
        val expected= "Baghdad"
        //when
        val getCity =city.execute()
        //then
        assertEquals(expected,getCity)
    }
}




