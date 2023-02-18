package fakeDataSource

import interactor.CostOfLivingDataSource
import model.*

class FakeDataSourceForDinnerLocation {

    private val emptyDataSource = object : CostOfLivingDataSource {
        override fun getAllCitiesData(): List<CityEntity> {
            return listOf()
        }
    }

    private val dataSourceWithNullInMealPrice = object : CostOfLivingDataSource {
        override fun getAllCitiesData(): List<CityEntity> {
            return listOf(
                createFakeMealsPricesCity("USA", null, 913.1f, 34.6f),
                createFakeMealsPricesCity("Mexico",null, 243.0f, 123.6f)
            )
        }
    }

    fun getDataWithNullInMealPrice() = dataSourceWithNullInMealPrice

    fun getEmptyFakeDataSource() = emptyDataSource









    fun mealTwo() = createFakeMealsPricesCity("China"
        ,45f
        , 243.0f
        , 123.6f)
    fun mealOne() = createFakeMealsPricesCity("Egypt"
    ,245f
    ,45.0f
    ,81.6f)

    private fun createFakeMealsPricesCity(
        countryName: String,
        mealInexpensiveRestaurant: Float?,
        mealFor2PeopleMidRangeRestaurant: Float?,
        mealAtMcDonaldSOrEquivalent: Float?
    ): CityEntity = CityEntity(
        cityName = "Cairo",
        country = countryName,
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = mealInexpensiveRestaurant,
            mealFor2PeopleMidRangeRestaurant = mealFor2PeopleMidRangeRestaurant,
            mealAtMcDonaldSOrEquivalent = mealAtMcDonaldSOrEquivalent
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 2.0f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2.3f,
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
            apartment3BedroomsInCityCentre = 7000.0f,
            apartment3BedroomsOutsideOfCentre = 100f,
            pricePerSquareMeterToBuyApartmentInCityCentre = null,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
        ),
        averageMonthlyNetSalaryAfterTax = 18f,
        dataQuality = true
    )


    fun getMeClosestCity() = closestCity
    private val closestCity = listOf(
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



    fun getMeCustomDataSource() = customDataSource
    private val customDataSource = object : CostOfLivingDataSource {
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

    fun getMeOtherThanSelected() = testOtherThanSelected
    private val testOtherThanSelected = object : CostOfLivingDataSource {
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
}