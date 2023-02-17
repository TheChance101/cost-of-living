package fakeDataSource

import interactor.CostOfLivingDataSource
import model.*


class TaxesFakeDataSource {
    fun getTwentyFakeCityData() = object : CostOfLivingDataSource {
        override fun getAllCitiesData(): List<CityEntity> {
            return getTwentyFakeData
        }

    }
    fun getInvalidLengthCity():CityEntity{
        return invalidLengthCity
    }
    fun getCountryNameContainsDigits():CityEntity{
        return countryNameContainsDigits
    }

    fun getCountryNameContainsSymbols():CityEntity{
        return countryNameContainsSymbols
    }

    fun getDataHasDrinkPriceIsNotNull():CityEntity{
        return drinkPriceIsNotNull
    }

    fun checkDataQuality():CityEntity{
        return isDataQualityHigh
    }

    fun getLowQualityAssertion():CityEntity{
        return lowQualityAssertion
    }

    fun getValidCountry():CityEntity{
        return validCountry
    }


    fun createFakeCity(
        countryName: String,
        drinksPrice: Float?,
        dataQuality: Boolean
    ): CityEntity = CityEntity(
        cityName = "Cairo",
        country = countryName,
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 6.5f,
            mealFor2PeopleMidRangeRestaurant = 15.0f,
            mealAtMcDonaldSOrEquivalent = 5.0f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 2.0f,
            cokePepsiAThirdOfLiterBottleInRestaurants = drinksPrice,
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
        dataQuality = dataQuality
    )

    fun getEmptyCountry(): CityEntity {
        return emptyCountry
    }

    fun getNullDrinkPrice(): CityEntity {
        return nullDrinkPrice
    }

    fun getValidPrice(): CityEntity {
        return validPrices
    }

    fun getInvalidDrinkPrices(): CityEntity {
        return invalidDrinkPrices
    }

    private val invalidDrinkPrices = createFakeCity(
        "Qatar",
        -5.15f,
        true
    )

    private val validPrices = createFakeCity(
        "Iraq",
        14f,
        true
    )

    private val nullDrinkPrice = createFakeCity(
        "Iraq", null,
        true
    )

    private val emptyCountry = createFakeCity(
        "      ",
        13f,
        true
    )

    private val validCountry = createFakeCity(
        "Egypt",
        13f,
        true
    )

    private val lowQualityAssertion = createFakeCity(
        "Egypt",
        12f,
        false
    )


    private val isDataQualityHigh = createFakeCity(
        "Egypt",
        12f,
        true
    )

    private val drinkPriceIsNotNull = createFakeCity(
        "Egypt",
        13f,
        true
    )

    private val countryNameContainsSymbols = createFakeCity(
    "Symbols!@#",
    17.5f,
    true
    )

    private val invalidLengthCity = createFakeCity(
        "asd",
        13f,
        true
    )

    private val countryNameContainsDigits = createFakeCity(
    "a123456",
    17.5f,
    true
    )

    val getTwentyFakeData = listOf(
        CityEntity(
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
        ),
        CityEntity(
            cityName = "Solue",
            country = "Koura",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 15.0f,
                mealAtMcDonaldSOrEquivalent = 3.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.5f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2.3f,
                waterAThirdOfLiterBottleInRestaurants = 1.2f,
                milkRegularOneLiter = 4.0f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.2f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 11.02f,
                banana1kg = 4.44f,
                oranges1kg = 1.1f,
                tomato1kg = 1.88f,
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
            averageMonthlyNetSalaryAfterTax = 25f,
            dataQuality = true
        ),
        CityEntity(
            cityName = "LA",
            country = "USA",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 5.0f,
                mealAtMcDonaldSOrEquivalent = 15.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.8f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 1.9f,
                waterAThirdOfLiterBottleInRestaurants = 0.9f,
                milkRegularOneLiter = 3.5f,
                waterOneAndHalfLiterBottleAtTheMarket = 1.8f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 9.02f,
                banana1kg = 2.44f,
                oranges1kg = 3.1f,
                tomato1kg = 6.88f,
                potato1kg = 2.1f,
                onion1kg = 8.2f,
                lettuceOneHead = 10.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 8.1f,
                riceWhite1kg = 2.1f,
                eggsRegular12 = 3.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 8.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 16.0f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = 10.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60.0f,
                oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                onePairOfNikeRunningShoesMidRange = 15.0f,
                onePairOfMenLeatherBusinessShoes = 35.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 10.0f,
                monthlyPassRegularPrice = 15.0f,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 9.25f
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
            averageMonthlyNetSalaryAfterTax = 15.0f,
            dataQuality = true
        ), CityEntity(
            cityName = "NY",
            country = "USA",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 5.0f,
                mealAtMcDonaldSOrEquivalent = 15.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.2f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2.5f,
                waterAThirdOfLiterBottleInRestaurants = 1.1f,
                milkRegularOneLiter = 3.9f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.0f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 9.02f,
                banana1kg = 2.44f,
                oranges1kg = 3.1f,
                tomato1kg = 6.88f,
                potato1kg = 2.1f,
                onion1kg = 8.2f,
                lettuceOneHead = 10.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 8.1f,
                riceWhite1kg = 2.1f,
                eggsRegular12 = 3.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 8.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 16.0f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = 10.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60.0f,
                oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                onePairOfNikeRunningShoesMidRange = 15.0f,
                onePairOfMenLeatherBusinessShoes = 35.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 10.0f,
                monthlyPassRegularPrice = 15.0f,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 9.25f
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
            averageMonthlyNetSalaryAfterTax = 15.0f,
            dataQuality = false
        ),
        CityEntity(
            cityName = "Mexico",
            country = "USA",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 5.0f,
                mealAtMcDonaldSOrEquivalent = 15.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.1f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2.2f,
                waterAThirdOfLiterBottleInRestaurants = 1.0f,
                milkRegularOneLiter = 3.7f,
                waterOneAndHalfLiterBottleAtTheMarket = 1.9f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 9.02f,
                banana1kg = 2.44f,
                oranges1kg = 3.1f,
                tomato1kg = 6.88f,
                potato1kg = 2.1f,
                onion1kg = 8.2f,
                lettuceOneHead = 10.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 8.1f,
                riceWhite1kg = 2.1f,
                eggsRegular12 = 3.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 8.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 16.0f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = 10.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60.0f,
                oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                onePairOfNikeRunningShoesMidRange = 15.0f,
                onePairOfMenLeatherBusinessShoes = 35.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 10.0f,
                monthlyPassRegularPrice = 15.0f,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 9.25f
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
            averageMonthlyNetSalaryAfterTax = 15.0f,
            dataQuality = false
        ),
        CityEntity(
            cityName = "France",
            country = "Paris",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 6.5f,
                mealFor2PeopleMidRangeRestaurant = 15.0f,
                mealAtMcDonaldSOrEquivalent = 5.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.3f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2.4f,
                waterAThirdOfLiterBottleInRestaurants = 1.1f,
                milkRegularOneLiter = 3.8f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.1f
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
            dataQuality = false
        ),
        CityEntity(
            cityName = "Peru",
            country = "Lima",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 15.0f,
                mealAtMcDonaldSOrEquivalent = 3.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.9f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2.1f,
                waterAThirdOfLiterBottleInRestaurants = 0.8f,
                milkRegularOneLiter = 3.6f,
                waterOneAndHalfLiterBottleAtTheMarket = 1.7f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 11.02f,
                banana1kg = 4.44f,
                oranges1kg = 1.1f,
                tomato1kg = 1.88f,
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
            averageMonthlyNetSalaryAfterTax = 25f,
            dataQuality = false
        ),
        CityEntity(
            cityName = "Dublin",
            country = "Ireland",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 5.0f,
                mealAtMcDonaldSOrEquivalent = 15.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.4f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2.6f,
                waterAThirdOfLiterBottleInRestaurants = 1.2f,
                milkRegularOneLiter = 4.0f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.3f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 9.02f,
                banana1kg = 2.44f,
                oranges1kg = 3.1f,
                tomato1kg = 6.88f,
                potato1kg = 2.1f,
                onion1kg = 8.2f,
                lettuceOneHead = 10.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 8.1f,
                riceWhite1kg = 2.1f,
                eggsRegular12 = 3.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 8.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 16.0f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = 10.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60.0f,
                oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                onePairOfNikeRunningShoesMidRange = 15.0f,
                onePairOfMenLeatherBusinessShoes = 35.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 10.0f,
                monthlyPassRegularPrice = 15.0f,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 9.25f
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
            averageMonthlyNetSalaryAfterTax = 15.0f,
            dataQuality = false
        ), CityEntity(
            cityName = "Moscow",
            country = "Russia",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 5.0f,
                mealAtMcDonaldSOrEquivalent = 15.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 1.8f,
                waterAThirdOfLiterBottleInRestaurants = 0.7f,
                milkRegularOneLiter = 3.3f,
                waterOneAndHalfLiterBottleAtTheMarket = 1.6f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 9.02f,
                banana1kg = 2.44f,
                oranges1kg = 3.1f,
                tomato1kg = 6.88f,
                potato1kg = 2.1f,
                onion1kg = 8.2f,
                lettuceOneHead = 10.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 8.1f,
                riceWhite1kg = 2.1f,
                eggsRegular12 = 3.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 8.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 16.0f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = 10.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60.0f,
                oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                onePairOfNikeRunningShoesMidRange = 15.0f,
                onePairOfMenLeatherBusinessShoes = 35.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 10.0f,
                monthlyPassRegularPrice = 15.0f,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 9.25f
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
            averageMonthlyNetSalaryAfterTax = 15.0f,
            dataQuality = true
        ),
        CityEntity(
            cityName = "Rome",
            country = "Italy",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 5.0f,
                mealAtMcDonaldSOrEquivalent = 15.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.6f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2.7f,
                waterAThirdOfLiterBottleInRestaurants = 1.3f,
                milkRegularOneLiter = 4.2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 9.02f,
                banana1kg = 2.44f,
                oranges1kg = 3.1f,
                tomato1kg = 6.88f,
                potato1kg = 2.1f,
                onion1kg = 8.2f,
                lettuceOneHead = 10.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 8.1f,
                riceWhite1kg = 2.1f,
                eggsRegular12 = 3.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 8.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 16.0f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = 10.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60.0f,
                oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                onePairOfNikeRunningShoesMidRange = 15.0f,
                onePairOfMenLeatherBusinessShoes = 35.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 10.0f,
                monthlyPassRegularPrice = 15.0f,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 9.25f
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
            averageMonthlyNetSalaryAfterTax = 15.0f,
            dataQuality = true
        ), CityEntity(
            cityName = "Ankara",
            country = "Turkey",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 6.5f,
                mealFor2PeopleMidRangeRestaurant = 15.0f,
                mealAtMcDonaldSOrEquivalent = 5.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.5f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 1.6f,
                waterAThirdOfLiterBottleInRestaurants = 0.5f,
                milkRegularOneLiter = 3.0f,
                waterOneAndHalfLiterBottleAtTheMarket = 1.4f
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
        ),
        CityEntity(
            cityName = "New delhi",
            country = "India",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 15.0f,
                mealAtMcDonaldSOrEquivalent = 3.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.8f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2.9f,
                waterAThirdOfLiterBottleInRestaurants = 1.5f,
                milkRegularOneLiter = 4.5f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.7f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 11.02f,
                banana1kg = 4.44f,
                oranges1kg = 1.1f,
                tomato1kg = 1.88f,
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
            averageMonthlyNetSalaryAfterTax = 25f,
            dataQuality = true
        ),
        CityEntity(
            cityName = "Stockholm",
            country = "Sweden",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 5.0f,
                mealAtMcDonaldSOrEquivalent = 15.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.6f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 1.7f,
                waterAThirdOfLiterBottleInRestaurants = 0.6f,
                milkRegularOneLiter = 3.1f,
                waterOneAndHalfLiterBottleAtTheMarket = 1.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 9.02f,
                banana1kg = 2.44f,
                oranges1kg = 3.1f,
                tomato1kg = 6.88f,
                potato1kg = 2.1f,
                onion1kg = 8.2f,
                lettuceOneHead = 10.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 8.1f,
                riceWhite1kg = 2.1f,
                eggsRegular12 = 3.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 8.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 16.0f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = 10.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60.0f,
                oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                onePairOfNikeRunningShoesMidRange = 15.0f,
                onePairOfMenLeatherBusinessShoes = 35.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 10.0f,
                monthlyPassRegularPrice = 15.0f,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 9.25f
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
            averageMonthlyNetSalaryAfterTax = 15.0f,
            dataQuality = true
        ), CityEntity(
            cityName = "Beijing",
            country = "China",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 5.0f,
                mealAtMcDonaldSOrEquivalent = 15.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2.8f,
                waterAThirdOfLiterBottleInRestaurants = 1.4f,
                milkRegularOneLiter = 4.3f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.6f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 9.02f,
                banana1kg = 2.44f,
                oranges1kg = 3.1f,
                tomato1kg = 6.88f,
                potato1kg = 2.1f,
                onion1kg = 8.2f,
                lettuceOneHead = 10.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 8.1f,
                riceWhite1kg = 2.1f,
                eggsRegular12 = 3.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 8.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 16.0f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = 10.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60.0f,
                oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                onePairOfNikeRunningShoesMidRange = 15.0f,
                onePairOfMenLeatherBusinessShoes = 35.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 10.0f,
                monthlyPassRegularPrice = 15.0f,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 9.25f
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
            averageMonthlyNetSalaryAfterTax = 15.0f,
            dataQuality = true
        ),
        CityEntity(
            cityName = "Bern",
            country = "Switzerland",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 5.0f,
                mealAtMcDonaldSOrEquivalent = 15.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.4f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 1.5f,
                waterAThirdOfLiterBottleInRestaurants = 0.4f,
                milkRegularOneLiter = 2.8f,
                waterOneAndHalfLiterBottleAtTheMarket = 1.2f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 9.02f,
                banana1kg = 2.44f,
                oranges1kg = 3.1f,
                tomato1kg = 6.88f,
                potato1kg = 2.1f,
                onion1kg = 8.2f,
                lettuceOneHead = 10.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 8.1f,
                riceWhite1kg = 2.1f,
                eggsRegular12 = 3.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 8.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 16.0f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = 10.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60.0f,
                oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                onePairOfNikeRunningShoesMidRange = 15.0f,
                onePairOfMenLeatherBusinessShoes = 35.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 10.0f,
                monthlyPassRegularPrice = 15.0f,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 9.25f
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
            averageMonthlyNetSalaryAfterTax = 15.0f,
            dataQuality = true
        ),
        CityEntity(
            cityName = "Sydney",
            country = "Australia",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 5.0f,
                mealAtMcDonaldSOrEquivalent = 12.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.5f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 1.8f,
                waterAThirdOfLiterBottleInRestaurants = 0.5f,
                milkRegularOneLiter = 3.2f,
                waterOneAndHalfLiterBottleAtTheMarket = 1.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 9.02f,
                banana1kg = 2.44f,
                oranges1kg = 3.1f,
                tomato1kg = 6.88f,
                potato1kg = 2.1f,
                onion1kg = 8.2f,
                lettuceOneHead = 10.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 8.1f,
                riceWhite1kg = 2.1f,
                eggsRegular12 = 3.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 8.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 16.0f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = 10.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60.0f,
                oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                onePairOfNikeRunningShoesMidRange = 15.0f,
                onePairOfMenLeatherBusinessShoes = 35.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 10.0f,
                monthlyPassRegularPrice = 15.0f,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 9.25f
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
            averageMonthlyNetSalaryAfterTax = 15.0f,
            dataQuality = true
        ),
        CityEntity(
            cityName = "Mexico City",
            country = "Mexico",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 5.0f,
                mealAtMcDonaldSOrEquivalent = 20.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.5f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 1.8f,
                waterAThirdOfLiterBottleInRestaurants = 0.5f,
                milkRegularOneLiter = 3.2f,
                waterOneAndHalfLiterBottleAtTheMarket = 1.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 9.02f,
                banana1kg = 2.44f,
                oranges1kg = 3.1f,
                tomato1kg = 6.88f,
                potato1kg = 2.1f,
                onion1kg = 8.2f,
                lettuceOneHead = 10.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 8.1f,
                riceWhite1kg = 2.1f,
                eggsRegular12 = 3.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 8.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 16.0f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = 10.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60.0f,
                oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                onePairOfNikeRunningShoesMidRange = 15.0f,
                onePairOfMenLeatherBusinessShoes = 35.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 10.0f,
                monthlyPassRegularPrice = 15.0f,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 9.25f
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
            averageMonthlyNetSalaryAfterTax = 16.5f,
            dataQuality = true
        ),
        CityEntity(
            cityName = "Berlin",
            country = "Germany",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 5.0f,
                mealAtMcDonaldSOrEquivalent = 15.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = null,
                cokePepsiAThirdOfLiterBottleInRestaurants = null,
                waterAThirdOfLiterBottleInRestaurants = null,
                milkRegularOneLiter = null,
                waterOneAndHalfLiterBottleAtTheMarket = null
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 9.02f,
                banana1kg = 2.44f,
                oranges1kg = 3.1f,
                tomato1kg = 6.88f,
                potato1kg = 2.1f,
                onion1kg = 8.2f,
                lettuceOneHead = 10.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 8.1f,
                riceWhite1kg = 2.1f,
                eggsRegular12 = 3.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 8.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 16.0f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = 10.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60.0f,
                oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                onePairOfNikeRunningShoesMidRange = 15.0f,
                onePairOfMenLeatherBusinessShoes = 35.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 10.0f,
                monthlyPassRegularPrice = 15.0f,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 9.25f
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
            averageMonthlyNetSalaryAfterTax = 19.0f,
            dataQuality = true
        ),
        CityEntity(
            cityName = "Cape Town",
            country = "South Africa",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 5.0f,
                mealAtMcDonaldSOrEquivalent = 15.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.5f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 1.8f,
                waterAThirdOfLiterBottleInRestaurants = 0.5f,
                milkRegularOneLiter = 3.2f,
                waterOneAndHalfLiterBottleAtTheMarket = 1.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 9.02f,
                banana1kg = 2.44f,
                oranges1kg = 3.1f,
                tomato1kg = 6.88f,
                potato1kg = 2.1f,
                onion1kg = 8.2f,
                lettuceOneHead = 10.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 8.1f,
                riceWhite1kg = 2.1f,
                eggsRegular12 = 3.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 8.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 16.0f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = 10.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60.0f,
                oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                onePairOfNikeRunningShoesMidRange = 15.0f,
                onePairOfMenLeatherBusinessShoes = 35.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 10.0f,
                monthlyPassRegularPrice = 15.0f,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 9.25f
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
            averageMonthlyNetSalaryAfterTax = 14.0f,
            dataQuality = true
        ),
        CityEntity(
            cityName = "Toronto",
            country = "Canada",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 9.5f,
                mealFor2PeopleMidRangeRestaurant = 5.0f,
                mealAtMcDonaldSOrEquivalent = 15.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.5f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 1.8f,
                waterAThirdOfLiterBottleInRestaurants = 0.5f,
                milkRegularOneLiter = 3.2f,
                waterOneAndHalfLiterBottleAtTheMarket = 1.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 9.02f,
                banana1kg = 2.44f,
                oranges1kg = 3.1f,
                tomato1kg = 6.88f,
                potato1kg = 2.1f,
                onion1kg = 8.2f,
                lettuceOneHead = 10.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 8.1f,
                riceWhite1kg = 2.1f,
                eggsRegular12 = 3.03f,
                localCheese1kg = 9.0f,
                chickenFillets1kg = 8.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 16.0f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                internationalPrimarySchoolYearlyForOneChild = 10.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60.0f,
                oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                onePairOfNikeRunningShoesMidRange = 15.0f,
                onePairOfMenLeatherBusinessShoes = 35.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 10.0f,
                monthlyPassRegularPrice = 15.0f,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 9.25f
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
            averageMonthlyNetSalaryAfterTax = 17.5f,
            dataQuality = true
        )

    )

}

