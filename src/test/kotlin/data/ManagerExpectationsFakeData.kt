package data

import interactor.CostOfLivingDataSource
import model.*


object ManagerExpectationsFakeData {
    private val validData by lazy {
        listOf(
            CityEntity(
                cityName = "Great Falls",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 15.0f,
                    mealFor2PeopleMidRangeRestaurant = 40.0f,
                    mealAtMcDonaldSOrEquivalent = 9.5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.5f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.02f,
                    waterAThirdOfLiterBottleInRestaurants = 1.71f,
                    milkRegularOneLiter = 1.02f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.86f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.41f,
                    banana1kg = 1.58f,
                    oranges1kg = 3.93f,
                    tomato1kg = 4.41f,
                    potato1kg = 1.65f,
                    onion1kg = 2.08f,
                    lettuceOneHead = 1.25f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.95f,
                    riceWhite1kg = 4.12f,
                    eggsRegular12 = 3.25f,
                    localCheese1kg = 9.92f,
                    chickenFillets1kg = 11.01f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 13.23f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 145.61f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.15f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 65.83f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 10.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 2500.0f,
                    internationalPrimarySchoolYearlyForOneChild = 75000.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 51.25f,
                    oneSummerDressInAChainStoreZaraHAndM = 27.5f,
                    onePairOfNikeRunningShoesMidRange = 70.0f,
                    onePairOfMenLeatherBusinessShoes = 120.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 1.5f,
                    monthlyPassRegularPrice = 55.0f,
                    taxiStartNormalTariff = 9.5f,
                    taxi1kmNormalTariff = 1.46f,
                    taxi1hourWaitingNormalTariff = 25.0f,
                    gasolineOneLiter = 1.44f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 31000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 23000.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 750.0f,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = 1600.0f,
                    apartment3BedroomsOutsideOfCentre = 2250.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2583.34f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 7965.29f
                ),
                averageMonthlyNetSalaryAfterTax = 1000.0f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Moose Jaw",
                country = "Canada",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 14.82f,
                    mealFor2PeopleMidRangeRestaurant = 55.59f,
                    mealAtMcDonaldSOrEquivalent = 8.89f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 3.29f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.16f,
                    waterAThirdOfLiterBottleInRestaurants = 1.65f,
                    milkRegularOneLiter = 1.48f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.98f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 3.15f,
                    banana1kg = 1.06f,
                    oranges1kg = 2.96f,
                    tomato1kg = 2.88f,
                    potato1kg = 1.91f,
                    onion1kg = 1.74f,
                    lettuceOneHead = 2.22f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.91f,
                    riceWhite1kg = 1.63f,
                    eggsRegular12 = 3.19f,
                    localCheese1kg = 10.28f,
                    chickenFillets1kg = 8.17f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 10.93f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 154.9f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.19f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 54.66f,
                    fitnessClubMonthlyFeeForOneAdult = 55.59f,
                    tennisCourtRentOneHourOnWeekend = 48.17f,
                    cinemaInternationalReleaseOneSeat = 7.41f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 567.6f,
                    internationalPrimarySchoolYearlyForOneChild = 7893.24f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 29.65f,
                    oneSummerDressInAChainStoreZaraHAndM = 25.94f,
                    onePairOfNikeRunningShoesMidRange = 79.67f,
                    onePairOfMenLeatherBusinessShoes = 101.91f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.93f,
                    monthlyPassRegularPrice = 29.65f,
                    taxiStartNormalTariff = 2.59f,
                    taxi1kmNormalTariff = 0.56f,
                    taxi1hourWaitingNormalTariff = 22.23f,
                    gasolineOneLiter = 1.35f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20752.19f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 20011.04f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 1185.84f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Chetumal", country = "mexico", mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 12.56f,
                    mealFor2PeopleMidRangeRestaurant = 23.21f,
                    mealAtMcDonaldSOrEquivalent = 5.06f
                ), drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 7f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                    waterAThirdOfLiterBottleInRestaurants = 1f,
                    milkRegularOneLiter = 2f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.5f
                ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 2f,
                    banana1kg = 1f,
                    oranges1kg = 1f,
                    tomato1kg = 3f,
                    potato1kg = 1f,
                    onion1kg = 1f,
                    lettuceOneHead = 0.25f
                ), foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = .5f,
                    riceWhite1kg = 1f,
                    eggsRegular12 = 2f,
                    localCheese1kg = 4f,
                    chickenFillets1kg = 4f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6f
                ), servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                    fitnessClubMonthlyFeeForOneAdult = 100f,
                    tennisCourtRentOneHourOnWeekend = 100f,
                    cinemaInternationalReleaseOneSeat = 10f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                    internationalPrimarySchoolYearlyForOneChild = 1000f
                ), clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 60f,
                    oneSummerDressInAChainStoreZaraHAndM = 90f,
                    onePairOfNikeRunningShoesMidRange = 80f,
                    onePairOfMenLeatherBusinessShoes = 300f
                ), transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 5f,
                    monthlyPassRegularPrice = 60f,
                    taxiStartNormalTariff = 20f,
                    taxi1kmNormalTariff = 30f,
                    taxi1hourWaitingNormalTariff = 60f,
                    gasolineOneLiter = 2f
                ), carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
                ), realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 500000f,
                    apartmentOneBedroomOutsideOfCentre = 300000f,
                    apartment3BedroomsInCityCentre = 800000f,
                    apartment3BedroomsOutsideOfCentre = 500000f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
                ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = false
            )
        )
    }
    private val _validCountriesAndSomePricesOfMealsInvalid by lazy {
        listOf(
            CityEntity(
                cityName = "Great Falls",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 15.0f,
                    mealFor2PeopleMidRangeRestaurant = 40.0f,
                    mealAtMcDonaldSOrEquivalent = 9.5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.5f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.02f,
                    waterAThirdOfLiterBottleInRestaurants = 1.71f,
                    milkRegularOneLiter = 1.02f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.86f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.41f,
                    banana1kg = 1.58f,
                    oranges1kg = 3.93f,
                    tomato1kg = 4.41f,
                    potato1kg = 1.65f,
                    onion1kg = 2.08f,
                    lettuceOneHead = 1.25f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.95f,
                    riceWhite1kg = 4.12f,
                    eggsRegular12 = 3.25f,
                    localCheese1kg = 9.92f,
                    chickenFillets1kg = 11.01f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 13.23f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 145.61f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.15f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 65.83f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 10.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 2500.0f,
                    internationalPrimarySchoolYearlyForOneChild = 75000.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 51.25f,
                    oneSummerDressInAChainStoreZaraHAndM = 27.5f,
                    onePairOfNikeRunningShoesMidRange = 70.0f,
                    onePairOfMenLeatherBusinessShoes = 120.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 1.5f,
                    monthlyPassRegularPrice = 55.0f,
                    taxiStartNormalTariff = 9.5f,
                    taxi1kmNormalTariff = 1.46f,
                    taxi1hourWaitingNormalTariff = 25.0f,
                    gasolineOneLiter = 1.44f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 31000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 23000.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 750.0f,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = 1600.0f,
                    apartment3BedroomsOutsideOfCentre = 2250.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2583.34f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 7965.29f
                ),
                averageMonthlyNetSalaryAfterTax = 1000.0f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Moose Jaw",
                country = "Canada",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = null,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = null
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 3.29f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.16f,
                    waterAThirdOfLiterBottleInRestaurants = 1.65f,
                    milkRegularOneLiter = 1.48f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.98f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 3.15f,
                    banana1kg = 1.06f,
                    oranges1kg = 2.96f,
                    tomato1kg = 2.88f,
                    potato1kg = 1.91f,
                    onion1kg = 1.74f,
                    lettuceOneHead = 2.22f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.91f,
                    riceWhite1kg = 1.63f,
                    eggsRegular12 = 3.19f,
                    localCheese1kg = 10.28f,
                    chickenFillets1kg = 8.17f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 10.93f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 154.9f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.19f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 54.66f,
                    fitnessClubMonthlyFeeForOneAdult = 55.59f,
                    tennisCourtRentOneHourOnWeekend = 48.17f,
                    cinemaInternationalReleaseOneSeat = 7.41f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 567.6f,
                    internationalPrimarySchoolYearlyForOneChild = 7893.24f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 29.65f,
                    oneSummerDressInAChainStoreZaraHAndM = 25.94f,
                    onePairOfNikeRunningShoesMidRange = 79.67f,
                    onePairOfMenLeatherBusinessShoes = 101.91f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.93f,
                    monthlyPassRegularPrice = 29.65f,
                    taxiStartNormalTariff = 2.59f,
                    taxi1kmNormalTariff = 0.56f,
                    taxi1hourWaitingNormalTariff = 22.23f,
                    gasolineOneLiter = 1.35f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20752.19f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 20011.04f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 1185.84f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Chetumal", country = "mexico", mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 12.56f,
                    mealFor2PeopleMidRangeRestaurant = 23.21f,
                    mealAtMcDonaldSOrEquivalent = 5.06f
                ), drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 7f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                    waterAThirdOfLiterBottleInRestaurants = 1f,
                    milkRegularOneLiter = 2f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.5f
                ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 2f,
                    banana1kg = 1f,
                    oranges1kg = 1f,
                    tomato1kg = 3f,
                    potato1kg = 1f,
                    onion1kg = 1f,
                    lettuceOneHead = 0.25f
                ), foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = .5f,
                    riceWhite1kg = 1f,
                    eggsRegular12 = 2f,
                    localCheese1kg = 4f,
                    chickenFillets1kg = 4f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6f
                ), servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                    fitnessClubMonthlyFeeForOneAdult = 100f,
                    tennisCourtRentOneHourOnWeekend = 100f,
                    cinemaInternationalReleaseOneSeat = 10f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                    internationalPrimarySchoolYearlyForOneChild = 1000f
                ), clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 60f,
                    oneSummerDressInAChainStoreZaraHAndM = 90f,
                    onePairOfNikeRunningShoesMidRange = 80f,
                    onePairOfMenLeatherBusinessShoes = 300f
                ), transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 5f,
                    monthlyPassRegularPrice = 60f,
                    taxiStartNormalTariff = 20f,
                    taxi1kmNormalTariff = 30f,
                    taxi1hourWaitingNormalTariff = 60f,
                    gasolineOneLiter = 2f
                ), carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
                ), realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 500000f,
                    apartmentOneBedroomOutsideOfCentre = 300000f,
                    apartment3BedroomsInCityCentre = 800000f,
                    apartment3BedroomsOutsideOfCentre = 500000f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
                ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = false
            ),
        )
    }
    private val _someInvalidCountriesAndPricesOfMealsValid by lazy {
        listOf(
            CityEntity(
                cityName = "Cairo",
                country = "Egypt",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 4.12f,
                    mealFor2PeopleMidRangeRestaurant = 3.25f,
                    mealAtMcDonaldSOrEquivalent = 9.92f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.5f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.02f,
                    waterAThirdOfLiterBottleInRestaurants = 1.71f,
                    milkRegularOneLiter = 1.02f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.86f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.41f,
                    banana1kg = 1.58f,
                    oranges1kg = 3.93f,
                    tomato1kg = 4.41f,
                    potato1kg = 1.65f,
                    onion1kg = 2.08f,
                    lettuceOneHead = 1.25f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.95f,
                    riceWhite1kg = 4.12f,
                    eggsRegular12 = 3.25f,
                    localCheese1kg = 9.92f,
                    chickenFillets1kg = 11.01f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 13.23f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 145.61f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.15f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 65.83f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 10.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 2500.0f,
                    internationalPrimarySchoolYearlyForOneChild = 75000.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 51.25f,
                    oneSummerDressInAChainStoreZaraHAndM = 27.5f,
                    onePairOfNikeRunningShoesMidRange = 70.0f,
                    onePairOfMenLeatherBusinessShoes = 120.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 1.5f,
                    monthlyPassRegularPrice = 55.0f,
                    taxiStartNormalTariff = 9.5f,
                    taxi1kmNormalTariff = 1.46f,
                    taxi1hourWaitingNormalTariff = 25.0f,
                    gasolineOneLiter = 1.44f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 31000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 23000.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 750.0f,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = 1600.0f,
                    apartment3BedroomsOutsideOfCentre = 2250.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2583.34f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 7965.29f
                ),
                averageMonthlyNetSalaryAfterTax = 1000.0f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Great Falls",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 15.0f,
                    mealFor2PeopleMidRangeRestaurant = 40.0f,
                    mealAtMcDonaldSOrEquivalent = 9.5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.5f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.02f,
                    waterAThirdOfLiterBottleInRestaurants = 1.71f,
                    milkRegularOneLiter = 1.02f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.86f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.41f,
                    banana1kg = 1.58f,
                    oranges1kg = 3.93f,
                    tomato1kg = 4.41f,
                    potato1kg = 1.65f,
                    onion1kg = 2.08f,
                    lettuceOneHead = 1.25f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.95f,
                    riceWhite1kg = 4.12f,
                    eggsRegular12 = 3.25f,
                    localCheese1kg = 9.92f,
                    chickenFillets1kg = 11.01f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 13.23f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 145.61f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.15f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 65.83f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 10.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 2500.0f,
                    internationalPrimarySchoolYearlyForOneChild = 75000.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 51.25f,
                    oneSummerDressInAChainStoreZaraHAndM = 27.5f,
                    onePairOfNikeRunningShoesMidRange = 70.0f,
                    onePairOfMenLeatherBusinessShoes = 120.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 1.5f,
                    monthlyPassRegularPrice = 55.0f,
                    taxiStartNormalTariff = 9.5f,
                    taxi1kmNormalTariff = 1.46f,
                    taxi1hourWaitingNormalTariff = 25.0f,
                    gasolineOneLiter = 1.44f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 31000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 23000.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 750.0f,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = 1600.0f,
                    apartment3BedroomsOutsideOfCentre = 2250.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2583.34f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 7965.29f
                ),
                averageMonthlyNetSalaryAfterTax = 1000.0f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Moose Jaw",
                country = "Canada",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 14.82f,
                    mealFor2PeopleMidRangeRestaurant = 55.59f,
                    mealAtMcDonaldSOrEquivalent = 8.89f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 3.29f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.16f,
                    waterAThirdOfLiterBottleInRestaurants = 1.65f,
                    milkRegularOneLiter = 1.48f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.98f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 3.15f,
                    banana1kg = 1.06f,
                    oranges1kg = 2.96f,
                    tomato1kg = 2.88f,
                    potato1kg = 1.91f,
                    onion1kg = 1.74f,
                    lettuceOneHead = 2.22f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.91f,
                    riceWhite1kg = 1.63f,
                    eggsRegular12 = 3.19f,
                    localCheese1kg = 10.28f,
                    chickenFillets1kg = 8.17f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 10.93f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 154.9f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.19f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 54.66f,
                    fitnessClubMonthlyFeeForOneAdult = 55.59f,
                    tennisCourtRentOneHourOnWeekend = 48.17f,
                    cinemaInternationalReleaseOneSeat = 7.41f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 567.6f,
                    internationalPrimarySchoolYearlyForOneChild = 7893.24f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 29.65f,
                    oneSummerDressInAChainStoreZaraHAndM = 25.94f,
                    onePairOfNikeRunningShoesMidRange = 79.67f,
                    onePairOfMenLeatherBusinessShoes = 101.91f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.93f,
                    monthlyPassRegularPrice = 29.65f,
                    taxiStartNormalTariff = 2.59f,
                    taxi1kmNormalTariff = 0.56f,
                    taxi1hourWaitingNormalTariff = 22.23f,
                    gasolineOneLiter = 1.35f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20752.19f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 20011.04f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 1185.84f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Chetumal", country = "mexico", mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 12.56f,
                    mealFor2PeopleMidRangeRestaurant = 23.21f,
                    mealAtMcDonaldSOrEquivalent = 5.06f
                ), drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 7f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                    waterAThirdOfLiterBottleInRestaurants = 1f,
                    milkRegularOneLiter = 2f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.5f
                ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 2f,
                    banana1kg = 1f,
                    oranges1kg = 1f,
                    tomato1kg = 3f,
                    potato1kg = 1f,
                    onion1kg = 1f,
                    lettuceOneHead = 0.25f
                ), foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = .5f,
                    riceWhite1kg = 1f,
                    eggsRegular12 = 2f,
                    localCheese1kg = 4f,
                    chickenFillets1kg = 4f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6f
                ), servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                    fitnessClubMonthlyFeeForOneAdult = 100f,
                    tennisCourtRentOneHourOnWeekend = 100f,
                    cinemaInternationalReleaseOneSeat = 10f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                    internationalPrimarySchoolYearlyForOneChild = 1000f
                ), clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 60f,
                    oneSummerDressInAChainStoreZaraHAndM = 90f,
                    onePairOfNikeRunningShoesMidRange = 80f,
                    onePairOfMenLeatherBusinessShoes = 300f
                ), transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 5f,
                    monthlyPassRegularPrice = 60f,
                    taxiStartNormalTariff = 20f,
                    taxi1kmNormalTariff = 30f,
                    taxi1hourWaitingNormalTariff = 60f,
                    gasolineOneLiter = 2f
                ), carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
                ), realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 500000f,
                    apartmentOneBedroomOutsideOfCentre = 300000f,
                    apartment3BedroomsInCityCentre = 800000f,
                    apartment3BedroomsOutsideOfCentre = 500000f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
                ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = false
            ),
            CityEntity(
                cityName = "New York",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 25.0f,
                    mealFor2PeopleMidRangeRestaurant = 100.0f,
                    mealAtMcDonaldSOrEquivalent = 10.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 5.38f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.72f,
                    waterAThirdOfLiterBottleInRestaurants = 2.32f,
                    milkRegularOneLiter = 1.26f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.51f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 5.62f,
                    banana1kg = 2.59f,
                    oranges1kg = 4.98f,
                    tomato1kg = 6.22f,
                    potato1kg = 4.04f,
                    onion1kg = 3.73f,
                    lettuceOneHead = 2.68f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 4.11f,
                    riceWhite1kg = 8.03f,
                    eggsRegular12 = 3.93f,
                    localCheese1kg = 16.85f,
                    chickenFillets1kg = 17.88f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 20.57f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 180.61f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.1f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 69.77f,
                    fitnessClubMonthlyFeeForOneAdult = 104.82f,
                    tennisCourtRentOneHourOnWeekend = 38.85f,
                    cinemaInternationalReleaseOneSeat = 18.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 2444.17f,
                    internationalPrimarySchoolYearlyForOneChild = 40384.62f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 62.13f,
                    oneSummerDressInAChainStoreZaraHAndM = 57.42f,
                    onePairOfNikeRunningShoesMidRange = 95.29f,
                    onePairOfMenLeatherBusinessShoes = 145.62f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 2.75f,
                    monthlyPassRegularPrice = 129.0f,
                    taxiStartNormalTariff = 4.38f,
                    taxi1kmNormalTariff = 1.86f,
                    taxi1hourWaitingNormalTariff = 30.0f,
                    gasolineOneLiter = 1.29f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 25000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 23754.86f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 3851.51f,
                    apartmentOneBedroomOutsideOfCentre = 2347.1f,
                    apartment3BedroomsInCityCentre = 7146.84f,
                    apartment3BedroomsOutsideOfCentre = 4279.34f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 14784.44f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 9531.27f
                ),
                averageMonthlyNetSalaryAfterTax = 5944.31f,
                dataQuality = true
            )
        )
    }
    private val _invalidSomeCountriesAndSomePricesOfMeals by lazy {
        listOf(
            CityEntity(
                cityName = "Cairo",
                country = "Egypt",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 4.12f,
                    mealFor2PeopleMidRangeRestaurant = 3.25f,
                    mealAtMcDonaldSOrEquivalent = 9.92f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.5f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.02f,
                    waterAThirdOfLiterBottleInRestaurants = 1.71f,
                    milkRegularOneLiter = 1.02f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.86f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.41f,
                    banana1kg = 1.58f,
                    oranges1kg = 3.93f,
                    tomato1kg = 4.41f,
                    potato1kg = 1.65f,
                    onion1kg = 2.08f,
                    lettuceOneHead = 1.25f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.95f,
                    riceWhite1kg = 4.12f,
                    eggsRegular12 = 3.25f,
                    localCheese1kg = 9.92f,
                    chickenFillets1kg = 11.01f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 13.23f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 145.61f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.15f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 65.83f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 10.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 2500.0f,
                    internationalPrimarySchoolYearlyForOneChild = 75000.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 51.25f,
                    oneSummerDressInAChainStoreZaraHAndM = 27.5f,
                    onePairOfNikeRunningShoesMidRange = 70.0f,
                    onePairOfMenLeatherBusinessShoes = 120.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 1.5f,
                    monthlyPassRegularPrice = 55.0f,
                    taxiStartNormalTariff = 9.5f,
                    taxi1kmNormalTariff = 1.46f,
                    taxi1hourWaitingNormalTariff = 25.0f,
                    gasolineOneLiter = 1.44f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 31000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 23000.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 750.0f,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = 1600.0f,
                    apartment3BedroomsOutsideOfCentre = 2250.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2583.34f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 7965.29f
                ),
                averageMonthlyNetSalaryAfterTax = 1000.0f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Moose Jaw",
                country = "Canada",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = null,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = null
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 3.29f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.16f,
                    waterAThirdOfLiterBottleInRestaurants = 1.65f,
                    milkRegularOneLiter = 1.48f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.98f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 3.15f,
                    banana1kg = 1.06f,
                    oranges1kg = 2.96f,
                    tomato1kg = 2.88f,
                    potato1kg = 1.91f,
                    onion1kg = 1.74f,
                    lettuceOneHead = 2.22f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.91f,
                    riceWhite1kg = 1.63f,
                    eggsRegular12 = 3.19f,
                    localCheese1kg = 10.28f,
                    chickenFillets1kg = 8.17f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 10.93f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 154.9f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.19f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 54.66f,
                    fitnessClubMonthlyFeeForOneAdult = 55.59f,
                    tennisCourtRentOneHourOnWeekend = 48.17f,
                    cinemaInternationalReleaseOneSeat = 7.41f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 567.6f,
                    internationalPrimarySchoolYearlyForOneChild = 7893.24f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 29.65f,
                    oneSummerDressInAChainStoreZaraHAndM = 25.94f,
                    onePairOfNikeRunningShoesMidRange = 79.67f,
                    onePairOfMenLeatherBusinessShoes = 101.91f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.93f,
                    monthlyPassRegularPrice = 29.65f,
                    taxiStartNormalTariff = 2.59f,
                    taxi1kmNormalTariff = 0.56f,
                    taxi1hourWaitingNormalTariff = 22.23f,
                    gasolineOneLiter = 1.35f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20752.19f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 20011.04f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 1185.84f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Chetumal", country = "mexico", mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 12.56f,
                    mealFor2PeopleMidRangeRestaurant = 23.21f,
                    mealAtMcDonaldSOrEquivalent = 5.06f
                ), drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 7f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                    waterAThirdOfLiterBottleInRestaurants = 1f,
                    milkRegularOneLiter = 2f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.5f
                ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 2f,
                    banana1kg = 1f,
                    oranges1kg = 1f,
                    tomato1kg = 3f,
                    potato1kg = 1f,
                    onion1kg = 1f,
                    lettuceOneHead = 0.25f
                ), foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = .5f,
                    riceWhite1kg = 1f,
                    eggsRegular12 = 2f,
                    localCheese1kg = 4f,
                    chickenFillets1kg = 4f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6f
                ), servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                    fitnessClubMonthlyFeeForOneAdult = 100f,
                    tennisCourtRentOneHourOnWeekend = 100f,
                    cinemaInternationalReleaseOneSeat = 10f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                    internationalPrimarySchoolYearlyForOneChild = 1000f
                ), clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 60f,
                    oneSummerDressInAChainStoreZaraHAndM = 90f,
                    onePairOfNikeRunningShoesMidRange = 80f,
                    onePairOfMenLeatherBusinessShoes = 300f
                ), transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 5f,
                    monthlyPassRegularPrice = 60f,
                    taxiStartNormalTariff = 20f,
                    taxi1kmNormalTariff = 30f,
                    taxi1hourWaitingNormalTariff = 60f,
                    gasolineOneLiter = 2f
                ), carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
                ), realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 500000f,
                    apartmentOneBedroomOutsideOfCentre = 300000f,
                    apartment3BedroomsInCityCentre = 800000f,
                    apartment3BedroomsOutsideOfCentre = 500000f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
                ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = false
            ),
            CityEntity(
                cityName = "New York",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 25.0f,
                    mealFor2PeopleMidRangeRestaurant = 100.0f,
                    mealAtMcDonaldSOrEquivalent = 10.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 5.38f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.72f,
                    waterAThirdOfLiterBottleInRestaurants = 2.32f,
                    milkRegularOneLiter = 1.26f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.51f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 5.62f,
                    banana1kg = 2.59f,
                    oranges1kg = 4.98f,
                    tomato1kg = 6.22f,
                    potato1kg = 4.04f,
                    onion1kg = 3.73f,
                    lettuceOneHead = 2.68f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 4.11f,
                    riceWhite1kg = 8.03f,
                    eggsRegular12 = 3.93f,
                    localCheese1kg = 16.85f,
                    chickenFillets1kg = 17.88f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 20.57f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 180.61f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.1f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 69.77f,
                    fitnessClubMonthlyFeeForOneAdult = 104.82f,
                    tennisCourtRentOneHourOnWeekend = 38.85f,
                    cinemaInternationalReleaseOneSeat = 18.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 2444.17f,
                    internationalPrimarySchoolYearlyForOneChild = 40384.62f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 62.13f,
                    oneSummerDressInAChainStoreZaraHAndM = 57.42f,
                    onePairOfNikeRunningShoesMidRange = 95.29f,
                    onePairOfMenLeatherBusinessShoes = 145.62f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 2.75f,
                    monthlyPassRegularPrice = 129.0f,
                    taxiStartNormalTariff = 4.38f,
                    taxi1kmNormalTariff = 1.86f,
                    taxi1hourWaitingNormalTariff = 30.0f,
                    gasolineOneLiter = 1.29f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 25000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 23754.86f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 3851.51f,
                    apartmentOneBedroomOutsideOfCentre = 2347.1f,
                    apartment3BedroomsInCityCentre = 7146.84f,
                    apartment3BedroomsOutsideOfCentre = 4279.34f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 14784.44f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 9531.27f
                ),
                averageMonthlyNetSalaryAfterTax = 5944.31f,
                dataQuality = true
            )
        )
    }
    private val _validCountriesAndInvalidPricesOfMeals by lazy {
        listOf(
            CityEntity(
                cityName = "Great Falls",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = null,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = null
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.5f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.02f,
                    waterAThirdOfLiterBottleInRestaurants = 1.71f,
                    milkRegularOneLiter = 1.02f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.86f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.41f,
                    banana1kg = 1.58f,
                    oranges1kg = 3.93f,
                    tomato1kg = 4.41f,
                    potato1kg = 1.65f,
                    onion1kg = 2.08f,
                    lettuceOneHead = 1.25f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.95f,
                    riceWhite1kg = 4.12f,
                    eggsRegular12 = 3.25f,
                    localCheese1kg = 9.92f,
                    chickenFillets1kg = 11.01f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 13.23f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 145.61f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.15f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 65.83f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 10.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 2500.0f,
                    internationalPrimarySchoolYearlyForOneChild = 75000.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 51.25f,
                    oneSummerDressInAChainStoreZaraHAndM = 27.5f,
                    onePairOfNikeRunningShoesMidRange = 70.0f,
                    onePairOfMenLeatherBusinessShoes = 120.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 1.5f,
                    monthlyPassRegularPrice = 55.0f,
                    taxiStartNormalTariff = 9.5f,
                    taxi1kmNormalTariff = 1.46f,
                    taxi1hourWaitingNormalTariff = 25.0f,
                    gasolineOneLiter = 1.44f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 31000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 23000.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 750.0f,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = 1600.0f,
                    apartment3BedroomsOutsideOfCentre = 2250.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2583.34f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 7965.29f
                ),
                averageMonthlyNetSalaryAfterTax = 1000.0f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Moose Jaw",
                country = "Canada",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = null,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = null
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 3.29f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.16f,
                    waterAThirdOfLiterBottleInRestaurants = 1.65f,
                    milkRegularOneLiter = 1.48f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.98f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 3.15f,
                    banana1kg = 1.06f,
                    oranges1kg = 2.96f,
                    tomato1kg = 2.88f,
                    potato1kg = 1.91f,
                    onion1kg = 1.74f,
                    lettuceOneHead = 2.22f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.91f,
                    riceWhite1kg = 1.63f,
                    eggsRegular12 = 3.19f,
                    localCheese1kg = 10.28f,
                    chickenFillets1kg = 8.17f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 10.93f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 154.9f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.19f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 54.66f,
                    fitnessClubMonthlyFeeForOneAdult = 55.59f,
                    tennisCourtRentOneHourOnWeekend = 48.17f,
                    cinemaInternationalReleaseOneSeat = 7.41f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 567.6f,
                    internationalPrimarySchoolYearlyForOneChild = 7893.24f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 29.65f,
                    oneSummerDressInAChainStoreZaraHAndM = 25.94f,
                    onePairOfNikeRunningShoesMidRange = 79.67f,
                    onePairOfMenLeatherBusinessShoes = 101.91f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.93f,
                    monthlyPassRegularPrice = 29.65f,
                    taxiStartNormalTariff = 2.59f,
                    taxi1kmNormalTariff = 0.56f,
                    taxi1hourWaitingNormalTariff = 22.23f,
                    gasolineOneLiter = 1.35f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20752.19f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 20011.04f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 1185.84f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Chetumal", country = "mexico", mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = null,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = null
                ), drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 7f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                    waterAThirdOfLiterBottleInRestaurants = 1f,
                    milkRegularOneLiter = 2f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.5f
                ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 2f,
                    banana1kg = 1f,
                    oranges1kg = 1f,
                    tomato1kg = 3f,
                    potato1kg = 1f,
                    onion1kg = 1f,
                    lettuceOneHead = 0.25f
                ), foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = .5f,
                    riceWhite1kg = 1f,
                    eggsRegular12 = 2f,
                    localCheese1kg = 4f,
                    chickenFillets1kg = 4f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6f
                ), servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                    fitnessClubMonthlyFeeForOneAdult = 100f,
                    tennisCourtRentOneHourOnWeekend = 100f,
                    cinemaInternationalReleaseOneSeat = 10f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                    internationalPrimarySchoolYearlyForOneChild = 1000f
                ), clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 60f,
                    oneSummerDressInAChainStoreZaraHAndM = 90f,
                    onePairOfNikeRunningShoesMidRange = 80f,
                    onePairOfMenLeatherBusinessShoes = 300f
                ), transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 5f,
                    monthlyPassRegularPrice = 60f,
                    taxiStartNormalTariff = 20f,
                    taxi1kmNormalTariff = 30f,
                    taxi1hourWaitingNormalTariff = 60f,
                    gasolineOneLiter = 2f
                ), carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
                ), realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 500000f,
                    apartmentOneBedroomOutsideOfCentre = 300000f,
                    apartment3BedroomsInCityCentre = 800000f,
                    apartment3BedroomsOutsideOfCentre = 500000f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
                ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = false
            )
        )
    }
    private val _invalidData by lazy {
        listOf(
            CityEntity(
                cityName = "Great Falls",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = null,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = null
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.5f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.02f,
                    waterAThirdOfLiterBottleInRestaurants = 1.71f,
                    milkRegularOneLiter = 1.02f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.86f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.41f,
                    banana1kg = 1.58f,
                    oranges1kg = 3.93f,
                    tomato1kg = 4.41f,
                    potato1kg = 1.65f,
                    onion1kg = 2.08f,
                    lettuceOneHead = 1.25f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.95f,
                    riceWhite1kg = 4.12f,
                    eggsRegular12 = 3.25f,
                    localCheese1kg = 9.92f,
                    chickenFillets1kg = 11.01f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 13.23f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 145.61f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.15f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 65.83f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 10.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 2500.0f,
                    internationalPrimarySchoolYearlyForOneChild = 75000.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 51.25f,
                    oneSummerDressInAChainStoreZaraHAndM = 27.5f,
                    onePairOfNikeRunningShoesMidRange = 70.0f,
                    onePairOfMenLeatherBusinessShoes = 120.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 1.5f,
                    monthlyPassRegularPrice = 55.0f,
                    taxiStartNormalTariff = 9.5f,
                    taxi1kmNormalTariff = 1.46f,
                    taxi1hourWaitingNormalTariff = 25.0f,
                    gasolineOneLiter = 1.44f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 31000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 23000.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 750.0f,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = 1600.0f,
                    apartment3BedroomsOutsideOfCentre = 2250.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2583.34f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 7965.29f
                ),
                averageMonthlyNetSalaryAfterTax = 1000.0f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Baghdad",
                country = "Iraq",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = null,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = null
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 3.29f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.16f,
                    waterAThirdOfLiterBottleInRestaurants = 1.65f,
                    milkRegularOneLiter = 1.48f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.98f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 3.15f,
                    banana1kg = 1.06f,
                    oranges1kg = 2.96f,
                    tomato1kg = 2.88f,
                    potato1kg = 1.91f,
                    onion1kg = 1.74f,
                    lettuceOneHead = 2.22f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.91f,
                    riceWhite1kg = 1.63f,
                    eggsRegular12 = 3.19f,
                    localCheese1kg = 10.28f,
                    chickenFillets1kg = 8.17f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 10.93f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 154.9f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.19f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 54.66f,
                    fitnessClubMonthlyFeeForOneAdult = 55.59f,
                    tennisCourtRentOneHourOnWeekend = 48.17f,
                    cinemaInternationalReleaseOneSeat = 7.41f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 567.6f,
                    internationalPrimarySchoolYearlyForOneChild = 7893.24f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 29.65f,
                    oneSummerDressInAChainStoreZaraHAndM = 25.94f,
                    onePairOfNikeRunningShoesMidRange = 79.67f,
                    onePairOfMenLeatherBusinessShoes = 101.91f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.93f,
                    monthlyPassRegularPrice = 29.65f,
                    taxiStartNormalTariff = 2.59f,
                    taxi1kmNormalTariff = 0.56f,
                    taxi1hourWaitingNormalTariff = 22.23f,
                    gasolineOneLiter = 1.35f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20752.19f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 20011.04f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 1185.84f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Damascus", country = "syria", mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = null,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = null
                ), drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 7f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                    waterAThirdOfLiterBottleInRestaurants = 1f,
                    milkRegularOneLiter = 2f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.5f
                ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 2f,
                    banana1kg = 1f,
                    oranges1kg = 1f,
                    tomato1kg = 3f,
                    potato1kg = 1f,
                    onion1kg = 1f,
                    lettuceOneHead = 0.25f
                ), foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = .5f,
                    riceWhite1kg = 1f,
                    eggsRegular12 = 2f,
                    localCheese1kg = 4f,
                    chickenFillets1kg = 4f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6f
                ), servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                    fitnessClubMonthlyFeeForOneAdult = 100f,
                    tennisCourtRentOneHourOnWeekend = 100f,
                    cinemaInternationalReleaseOneSeat = 10f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                    internationalPrimarySchoolYearlyForOneChild = 1000f
                ), clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 60f,
                    oneSummerDressInAChainStoreZaraHAndM = 90f,
                    onePairOfNikeRunningShoesMidRange = 80f,
                    onePairOfMenLeatherBusinessShoes = 300f
                ), transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 5f,
                    monthlyPassRegularPrice = 60f,
                    taxiStartNormalTariff = 20f,
                    taxi1kmNormalTariff = 30f,
                    taxi1hourWaitingNormalTariff = 60f,
                    gasolineOneLiter = 2f
                ), carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
                ), realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 500000f,
                    apartmentOneBedroomOutsideOfCentre = 300000f,
                    apartment3BedroomsInCityCentre = 800000f,
                    apartment3BedroomsOutsideOfCentre = 500000f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
                ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = false
            )
        )
    }

    val validCountriesAndPricesOfMeals by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() = validData
        }
    }
    val validCountriesAndSomeInvalidPricesOfMeals by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() = _validCountriesAndSomePricesOfMealsInvalid
        }
    }
    val someInvalidCountriesAndValidPricesOfMeals by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() = _someInvalidCountriesAndPricesOfMealsValid
        }
    }
    val invalidSomeCountriesAndSomePricesOfMeals by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() = _invalidSomeCountriesAndSomePricesOfMeals
        }
    }
    val validCountriesAndInvalidPricesOfMeals by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() = _validCountriesAndInvalidPricesOfMeals
        }
    }
    val invalidData by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() = _invalidData
        }
    }
    val emptyData by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() = emptyList<CityEntity>()

        }
    }

}









