package interactor

import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityMakesFamilySaveMoreInteractionTest {
    private lateinit var city: GetCityMakesFamilySaveMoreInteractor
    private lateinit var cityEmpty: GetCityMakesFamilySaveMoreInteractor
    private lateinit var cityWithNull: GetCityMakesFamilySaveMoreInteractor

    @BeforeAll
    fun setup() {
        cityEmpty = GetCityMakesFamilySaveMoreInteractor(object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf()
            }
        })
        city = GetCityMakesFamilySaveMoreInteractor(object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf(
                    CityEntity(
                        cityName = "Baghdad",
                        mealsPrices = MealsPrices(
                            mealInexpensiveRestaurant = null,
                            mealFor2PeopleMidRangeRestaurant = null,
                            mealAtMcDonaldSOrEquivalent = null,
                        ),
                        country = "Iraq",
                        dataQuality = true,
                        drinksPrices = DrinksPrices(
                            cappuccinoRegularInRestaurants = null,
                            cokePepsiAThirdOfLiterBottleInRestaurants = null,
                            waterAThirdOfLiterBottleInRestaurants = null,
                            milkRegularOneLiter = null,
                            waterOneAndHalfLiterBottleAtTheMarket = null
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
                        servicesPrices = ServicesPrices(
                            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                            internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                            fitnessClubMonthlyFeeForOneAdult = null,
                            tennisCourtRentOneHourOnWeekend = null,
                            cinemaInternationalReleaseOneSeat = null,
                            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                            internationalPrimarySchoolYearlyForOneChild = null

                        ),
                        clothesPrices = ClothesPrices(
                            onePairOfJeansLevis50oneOrSimilar = null,
                            oneSummerDressInAChainStoreZaraHAndM = null,
                            onePairOfNikeRunningShoesMidRange = null,
                            onePairOfMenLeatherBusinessShoes = null
                        ),
                        transportationsPrices = TransportationsPrices(
                            oneWayTicketLocalTransport = null,
                            monthlyPassRegularPrice = null,
                            taxiStartNormalTariff = null,
                            taxi1kmNormalTariff = null,
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
                            apartment3BedroomsInCityCentre = null,
                            apartment3BedroomsOutsideOfCentre = 10f,
                            pricePerSquareMeterToBuyApartmentInCityCentre = null,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                        ),
                        averageMonthlyNetSalaryAfterTax = 1500f,

                        ),
                    CityEntity(
                        cityName = "Amman",
                        mealsPrices = MealsPrices(
                            mealInexpensiveRestaurant = null,
                            mealFor2PeopleMidRangeRestaurant = null,
                            mealAtMcDonaldSOrEquivalent = null,
                        ),
                        country = "Jordan",
                        dataQuality = true,
                        drinksPrices = DrinksPrices(
                            cappuccinoRegularInRestaurants = null,
                            cokePepsiAThirdOfLiterBottleInRestaurants = null,
                            waterAThirdOfLiterBottleInRestaurants = null,
                            milkRegularOneLiter = null,
                            waterOneAndHalfLiterBottleAtTheMarket = null
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
                            loafOfFreshWhiteBread500g = 10f,
                            riceWhite1kg = 8f,
                            eggsRegular12 = 2f,
                            localCheese1kg = 4f,
                            chickenFillets1kg = 6f,
                            beefRound1kgOrEquivalentBackLegRedMeat = 12f
                        ),
                        servicesPrices = ServicesPrices(
                            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                            internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                            fitnessClubMonthlyFeeForOneAdult = null,
                            tennisCourtRentOneHourOnWeekend = null,
                            cinemaInternationalReleaseOneSeat = null,
                            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                            internationalPrimarySchoolYearlyForOneChild = null

                        ),
                        clothesPrices = ClothesPrices(
                            onePairOfJeansLevis50oneOrSimilar = null,
                            oneSummerDressInAChainStoreZaraHAndM = null,
                            onePairOfNikeRunningShoesMidRange = null,
                            onePairOfMenLeatherBusinessShoes = null
                        ),
                        transportationsPrices = TransportationsPrices(
                            oneWayTicketLocalTransport = null,
                            monthlyPassRegularPrice = null,
                            taxiStartNormalTariff = null,
                            taxi1kmNormalTariff = null,
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
                            apartment3BedroomsInCityCentre = null,
                            apartment3BedroomsOutsideOfCentre = 10f,
                            pricePerSquareMeterToBuyApartmentInCityCentre = null,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                        ),
                        averageMonthlyNetSalaryAfterTax = 1500f,


                        )

                )

            }
        }
        )

        cityWithNull = GetCityMakesFamilySaveMoreInteractor(object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf(
                    CityEntity(
                        cityName = "Baghdad",
                        mealsPrices = MealsPrices(
                            mealInexpensiveRestaurant = null,
                            mealFor2PeopleMidRangeRestaurant = null,
                            mealAtMcDonaldSOrEquivalent = null,
                        ),
                        country = "Iraq",
                        dataQuality = true,
                        drinksPrices = DrinksPrices(
                            cappuccinoRegularInRestaurants = null,
                            cokePepsiAThirdOfLiterBottleInRestaurants = null,
                            waterAThirdOfLiterBottleInRestaurants = null,
                            milkRegularOneLiter = null,
                            waterOneAndHalfLiterBottleAtTheMarket = null
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
                            loafOfFreshWhiteBread500g = null,
                            riceWhite1kg = null,
                            eggsRegular12 = null,
                            localCheese1kg = null,
                            chickenFillets1kg = null,
                            beefRound1kgOrEquivalentBackLegRedMeat = null
                        ),
                        servicesPrices = ServicesPrices(
                            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                            internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                            fitnessClubMonthlyFeeForOneAdult = null,
                            tennisCourtRentOneHourOnWeekend = null,
                            cinemaInternationalReleaseOneSeat = null,
                            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                            internationalPrimarySchoolYearlyForOneChild = null

                        ),
                        clothesPrices = ClothesPrices(
                            onePairOfJeansLevis50oneOrSimilar = null,
                            oneSummerDressInAChainStoreZaraHAndM = null,
                            onePairOfNikeRunningShoesMidRange = null,
                            onePairOfMenLeatherBusinessShoes = null
                        ),
                        transportationsPrices = TransportationsPrices(
                            oneWayTicketLocalTransport = null,
                            monthlyPassRegularPrice = null,
                            taxiStartNormalTariff = null,
                            taxi1kmNormalTariff = null,
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
                            apartment3BedroomsInCityCentre = null,
                            apartment3BedroomsOutsideOfCentre = 10f,
                            pricePerSquareMeterToBuyApartmentInCityCentre = null,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                        ),
                        averageMonthlyNetSalaryAfterTax = 1500f,

                        ),
                    CityEntity(
                        cityName = "Amman",
                        mealsPrices = MealsPrices(
                            mealInexpensiveRestaurant = null,
                            mealFor2PeopleMidRangeRestaurant = null,
                            mealAtMcDonaldSOrEquivalent = null,
                        ),
                        country = "Jordan",
                        dataQuality = true,
                        drinksPrices = DrinksPrices(
                            cappuccinoRegularInRestaurants = null,
                            cokePepsiAThirdOfLiterBottleInRestaurants = null,
                            waterAThirdOfLiterBottleInRestaurants = null,
                            milkRegularOneLiter = null,
                            waterOneAndHalfLiterBottleAtTheMarket = null
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
                            loafOfFreshWhiteBread500g = null,
                            riceWhite1kg = null,
                            eggsRegular12 = null,
                            localCheese1kg = null,
                            chickenFillets1kg = null,
                            beefRound1kgOrEquivalentBackLegRedMeat = null
                        ),
                        servicesPrices = ServicesPrices(
                            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                            internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                            fitnessClubMonthlyFeeForOneAdult = null,
                            tennisCourtRentOneHourOnWeekend = null,
                            cinemaInternationalReleaseOneSeat = null,
                            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                            internationalPrimarySchoolYearlyForOneChild = null

                        ),
                        clothesPrices = ClothesPrices(
                            onePairOfJeansLevis50oneOrSimilar = null,
                            oneSummerDressInAChainStoreZaraHAndM = null,
                            onePairOfNikeRunningShoesMidRange = null,
                            onePairOfMenLeatherBusinessShoes = null
                        ),
                        transportationsPrices = TransportationsPrices(
                            oneWayTicketLocalTransport = null,
                            monthlyPassRegularPrice = null,
                            taxiStartNormalTariff = null,
                            taxi1kmNormalTariff = null,
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
                            apartment3BedroomsInCityCentre = null,
                            apartment3BedroomsOutsideOfCentre = 10f,
                            pricePerSquareMeterToBuyApartmentInCityCentre = null,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                        ),
                        averageMonthlyNetSalaryAfterTax = 1500f,


                        )

                )

            }
        }
        )

    }

    @Test
    fun should_ReturnOneCity_When_FunctionInvoke() {
        //given
        val expected = "Baghdad"
        //when
        val getCity: String = city.execute()
        //then
        assertEquals(expected, getCity)
    }

    @Test
    fun should_ReturnMessage_When_NOData() {
        // given
        val expected = "There is no Data"
        //when
        val getCity: String = cityEmpty.execute()
        //then
        assertEquals(expected, getCity)
    }

    @Test
    fun Should_ReturnFalse_When_FoodNull(){

    }


}