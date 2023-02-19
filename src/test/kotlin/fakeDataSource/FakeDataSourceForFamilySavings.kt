package fakeDataSource

import interactor.CostOfLivingDataSource
import interactor.GetCityMakesFamilySaveMoreInteractor
import model.*

class FakeDataSourceForFamilySavings {

    fun getMeCity() = city
    fun getMeEmptyCity() = cityEmpty

    private val cityEmpty = object : CostOfLivingDataSource {
        override fun getAllCitiesData(): List<CityEntity> {
            return listOf()
        }
    }
    private val city = object : CostOfLivingDataSource {
        override fun getAllCitiesData(): List<CityEntity> {
            return listOf(CityEntity(
                cityName = "Cairo",
                country = "Egypt",
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
                    loafOfFreshWhiteBread500g = 1.2f,
                    riceWhite1kg = 5.4f,
                    eggsRegular12 = 3.5f,
                    localCheese1kg = 2.1f,
                    chickenFillets1kg = 4.6f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 1.7f
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
                    apartmentOneBedroomOutsideOfCentre =null ,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 18f,
                dataQuality = true
            ))
        /*listOf(
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
                    dataQuality = true
                    )

            )*/

        }
    }

    fun getCityWithNull() = cityWithNull
    private val cityWithNull = object : CostOfLivingDataSource {
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

    fun getEmptyCity() = emptyList<CityEntity>()

    fun getNullFoodPricesCity() = nullFoodPrices
    private val nullFoodPrices = CityEntity(
        cityName = "Cairo",
        country = "Egypt",
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
            loafOfFreshWhiteBread500g = null,
            riceWhite1kg = null,
            eggsRegular12 = null,
            localCheese1kg = null,
            chickenFillets1kg = null,
            beefRound1kgOrEquivalentBackLegRedMeat = null
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
            apartmentOneBedroomOutsideOfCentre =null ,
            apartment3BedroomsInCityCentre = 7000.0f,
            apartment3BedroomsOutsideOfCentre = 100f,
            pricePerSquareMeterToBuyApartmentInCityCentre = null,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
        ),
        averageMonthlyNetSalaryAfterTax = 18f,
        dataQuality = true
    )

    fun nullSalaryCityFakeData() = nullCitySalary
    private val nullCitySalary =  CityEntity(
        cityName = "Cairo",
        country = "Egypt",
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
            loafOfFreshWhiteBread500g = null,
            riceWhite1kg = null,
            eggsRegular12 = null,
            localCheese1kg = null,
            chickenFillets1kg = null,
            beefRound1kgOrEquivalentBackLegRedMeat = null
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
            apartmentOneBedroomOutsideOfCentre =null ,
            apartment3BedroomsInCityCentre = 7000.0f,
            apartment3BedroomsOutsideOfCentre = 100f,
            pricePerSquareMeterToBuyApartmentInCityCentre = null,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
        ),
        averageMonthlyNetSalaryAfterTax = null,
        dataQuality = true
    )
}