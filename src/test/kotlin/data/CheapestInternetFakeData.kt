package data

import interactor.CostOfLivingDataSource
import model.*


class CheapestInternetFakeData : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            CityEntity(
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
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Sancti Spiritus",
                country = "Cuba",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 7.0f,
                    mealFor2PeopleMidRangeRestaurant = 25.0f,
                    mealAtMcDonaldSOrEquivalent = 5.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = null,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 1.0f,
                    waterAThirdOfLiterBottleInRestaurants = 0.75f,
                    milkRegularOneLiter = null,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.0f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 3.0f,
                    banana1kg = 0.5f,
                    oranges1kg = 0.5f,
                    tomato1kg = 1.0f,
                    potato1kg = 2.0f,
                    onion1kg = 2.0f,
                    lettuceOneHead = null
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = 1.0f,
                    eggsRegular12 = 2.4f,
                    localCheese1kg = 4.0f,
                    chickenFillets1kg = 5.0f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 10.0f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 30.0f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 15.0f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = null,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 25.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 15.0f,
                    onePairOfNikeRunningShoesMidRange = 40.0f,
                    onePairOfMenLeatherBusinessShoes = 30.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 1.0f,
                    taxi1kmNormalTariff = 1.0f,
                    taxi1hourWaitingNormalTariff = null,
                    gasolineOneLiter = 2.0f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 50000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 70000.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 20.0f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Santa Clara",
                country = "Cuba",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 10.0f,
                    mealFor2PeopleMidRangeRestaurant = 30.0f,
                    mealAtMcDonaldSOrEquivalent = 5.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.91f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.0f,
                    waterAThirdOfLiterBottleInRestaurants = 0.5f,
                    milkRegularOneLiter = 3.52f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.98f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 6.24f,
                    banana1kg = null,
                    oranges1kg = 1.12f,
                    tomato1kg = 1.0f,
                    potato1kg = 1.82f,
                    onion1kg = 2.0f,
                    lettuceOneHead = 0.86f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.0f,
                    riceWhite1kg = 1.0f,
                    eggsRegular12 = 1.64f,
                    localCheese1kg = 4.0f,
                    chickenFillets1kg = 6.07f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 10.0f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 11.5f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.26f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 80.0f,
                    fitnessClubMonthlyFeeForOneAdult = 6.0f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 1.12f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 70.0f,
                    internationalPrimarySchoolYearlyForOneChild = 15166.67f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 55.5f,
                    oneSummerDressInAChainStoreZaraHAndM = 44.33f,
                    onePairOfNikeRunningShoesMidRange = 79.17f,
                    onePairOfMenLeatherBusinessShoes = 78.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.5f,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 1.0f,
                    taxi1kmNormalTariff = 0.5f,
                    taxi1hourWaitingNormalTariff = 15.0f,
                    gasolineOneLiter = 1.14f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 80000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 81500.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 120.0f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Damanhur",
                country = "Egypt",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 3.05f,
                    mealFor2PeopleMidRangeRestaurant = 23.4f,
                    mealAtMcDonaldSOrEquivalent = 4.07f,
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.19f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.35f,
                    waterAThirdOfLiterBottleInRestaurants = 0.2f,
                    milkRegularOneLiter = 0.51f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.27f,
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.79f,
                    banana1kg = 0.61f,
                    oranges1kg = 0.41f,
                    tomato1kg = 0.24f,
                    potato1kg = 0.27f,
                    onion1kg = 0.18f,
                    lettuceOneHead = 0.09f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.54f,
                    riceWhite1kg = 0.52f,
                    eggsRegular12 = 0.98f,
                    localCheese1kg = 1.42f,
                    chickenFillets1kg = 2.92f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 7.33f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 47.48f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.02f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 12.21f,
                    fitnessClubMonthlyFeeForOneAdult = 16.28f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 3.26f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 40.7f,
                    internationalPrimarySchoolYearlyForOneChild = 915.7f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 12.21f,
                    oneSummerDressInAChainStoreZaraHAndM = 10.17f,
                    onePairOfNikeRunningShoesMidRange = 122.09f,
                    onePairOfMenLeatherBusinessShoes = 24.42f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.08f,
                    monthlyPassRegularPrice = 8.14f,
                    taxiStartNormalTariff = 0.35f,
                    taxi1kmNormalTariff = 0.16f,
                    taxi1hourWaitingNormalTariff = 1.63f,
                    gasolineOneLiter = 0.36f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 15261.71f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 17296.61f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 1017.45f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 203.49f
                ),
                averageMonthlyNetSalaryAfterTax = 81.4f,
                dataQuality = true
            ),
            CityEntity(
                cityName = "cairo",
                country = "Egypt",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 5.05f,
                    mealFor2PeopleMidRangeRestaurant = 23.4f,
                    mealAtMcDonaldSOrEquivalent = 6.07f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 7.19f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 8.35f,
                    waterAThirdOfLiterBottleInRestaurants = 0.2f,
                    milkRegularOneLiter = 0.51f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.27f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.79f,
                    banana1kg = 0.61f,
                    oranges1kg = 0.41f,
                    tomato1kg = 0.24f,
                    potato1kg = 0.27f,
                    onion1kg = 0.18f,
                    lettuceOneHead = 0.09f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.54f,
                    riceWhite1kg = 0.52f,
                    eggsRegular12 = 0.98f,
                    localCheese1kg = 1.42f,
                    chickenFillets1kg = 2.92f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 7.33f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 47.48f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.02f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 52.21f,
                    fitnessClubMonthlyFeeForOneAdult = 16.28f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 3.26f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 40.7f,
                    internationalPrimarySchoolYearlyForOneChild = 915.7f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 12.21f,
                    oneSummerDressInAChainStoreZaraHAndM = 10.17f,
                    onePairOfNikeRunningShoesMidRange = 122.09f,
                    onePairOfMenLeatherBusinessShoes = 24.42f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.08f,
                    monthlyPassRegularPrice = 8.14f,
                    taxiStartNormalTariff = 0.35f,
                    taxi1kmNormalTariff = 0.16f,
                    taxi1hourWaitingNormalTariff = 1.63f,
                    gasolineOneLiter = 0.36f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 15261.71f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 17296.61f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 1017.45f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 203.49f
                ),
                averageMonthlyNetSalaryAfterTax = 81.4f,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Dushanbe",
                country = "Tajikistan",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 3.97f,
                    mealFor2PeopleMidRangeRestaurant = 11.0f,
                    mealAtMcDonaldSOrEquivalent = 4.96f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.2f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.41f,
                    waterAThirdOfLiterBottleInRestaurants = 0.28f,
                    milkRegularOneLiter = 0.72f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.43f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 1.15f,
                    banana1kg = 2.24f,
                    oranges1kg = 2.3f,
                    tomato1kg = 1.19f,
                    potato1kg = 0.44f,
                    onion1kg = 0.31f,
                    lettuceOneHead = 0.42f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.41f,
                    riceWhite1kg = 1.58f,
                    eggsRegular12 = 1.56f,
                    localCheese1kg = 5.77f,
                    chickenFillets1kg = 3.9f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6.84f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 31.26f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.02f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 22.17f,
                    fitnessClubMonthlyFeeForOneAdult = 34.86f,
                    tennisCourtRentOneHourOnWeekend = 11.17f,
                    cinemaInternationalReleaseOneSeat = 5.21f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 84.39f,
                    internationalPrimarySchoolYearlyForOneChild = 4964.41f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 32.26f,
                    oneSummerDressInAChainStoreZaraHAndM = 24.07f,
                    onePairOfNikeRunningShoesMidRange = 53.36f,
                    onePairOfMenLeatherBusinessShoes = 52.12f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.25f,
                    monthlyPassRegularPrice = 6.95f,
                    taxiStartNormalTariff = 0.99f,
                    taxi1kmNormalTariff = 0.3f,
                    taxi1hourWaitingNormalTariff = 2.38f,
                    gasolineOneLiter = 0.94f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 14392.29f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 21839.84f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 376.03f,
                    apartmentOneBedroomOutsideOfCentre = 186.15f,
                    apartment3BedroomsInCityCentre = 631.14f,
                    apartment3BedroomsOutsideOfCentre = 330.47f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 835.59f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 381.24f
                ),
                averageMonthlyNetSalaryAfterTax = 163.81f,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Vila Real de Santo Antonio",
                country = "Portugal",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 10.54f,
                    mealFor2PeopleMidRangeRestaurant = 52.69f,
                    mealAtMcDonaldSOrEquivalent = 7.11f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.3f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 1.48f,
                    waterAThirdOfLiterBottleInRestaurants = 1.06f,
                    milkRegularOneLiter = 0.79f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.53f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 1.44f,
                    banana1kg = 1.07f,
                    oranges1kg = 1.36f,
                    tomato1kg = 1.92f,
                    potato1kg = 1.05f,
                    onion1kg = 0.93f,
                    lettuceOneHead = 0.95f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.35f,
                    riceWhite1kg = 1.1f,
                    eggsRegular12 = 1.93f,
                    localCheese1kg = 11.24f,
                    chickenFillets1kg = 6.4f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 10.89f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 106.81f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.04f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 33.72f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 7.17f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 189.67f,
                    internationalPrimarySchoolYearlyForOneChild = 6322.47f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 72.71f,
                    oneSummerDressInAChainStoreZaraHAndM = 15.81f,
                    onePairOfNikeRunningShoesMidRange = 74.93f,
                    onePairOfMenLeatherBusinessShoes = 47.42f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.95f,
                    monthlyPassRegularPrice = 24.24f,
                    taxiStartNormalTariff = 3.42f,
                    taxi1kmNormalTariff = 0.47f,
                    taxi1hourWaitingNormalTariff = 15.81f,
                    gasolineOneLiter = 2.02f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 28977.99f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 27397.38f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2634.36f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 843.0f
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Samarkand",
                country = "Uzbekistan",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 5.0f,
                    mealFor2PeopleMidRangeRestaurant = 19.44f,
                    mealAtMcDonaldSOrEquivalent = 3.5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.55f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.6f,
                    waterAThirdOfLiterBottleInRestaurants = 0.29f,
                    milkRegularOneLiter = 0.99f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.3f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 1.42f,
                    banana1kg = 1.71f,
                    oranges1kg = 2.28f,
                    tomato1kg = 1.48f,
                    potato1kg = 0.48f,
                    onion1kg = 0.36f,
                    lettuceOneHead = 0.3f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.27f,
                    riceWhite1kg = 1.2f,
                    eggsRegular12 = 1.49f,
                    localCheese1kg = 6.08f,
                    chickenFillets1kg = 3.64f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 7.26f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 32.5f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.02f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 15.0f,
                    fitnessClubMonthlyFeeForOneAdult = 36.67f,
                    tennisCourtRentOneHourOnWeekend = 11.0f,
                    cinemaInternationalReleaseOneSeat = 1.5f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 200.0f,
                    internationalPrimarySchoolYearlyForOneChild = 5622.48f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 25.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 50.0f,
                    onePairOfNikeRunningShoesMidRange = 80.0f,
                    onePairOfMenLeatherBusinessShoes = 99.12f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.15f,
                    monthlyPassRegularPrice = 10.0f,
                    taxiStartNormalTariff = 0.5f,
                    taxi1kmNormalTariff = 0.27f,
                    taxi1hourWaitingNormalTariff = 3.0f,
                    gasolineOneLiter = 0.91f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 13508.25f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 19690.73f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 275.0f,
                    apartmentOneBedroomOutsideOfCentre = 206.67f,
                    apartment3BedroomsInCityCentre = 500.0f,
                    apartment3BedroomsOutsideOfCentre = 383.33f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 730.67f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 482.64f
                ),
                averageMonthlyNetSalaryAfterTax = 253.33f,
                dataQuality = false
            ), CityEntity(
                cityName = "Malabo",
                country = "Equatorial Guinea",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 12.85f,
                    mealFor2PeopleMidRangeRestaurant = 40.16f,
                    mealAtMcDonaldSOrEquivalent = 20.08f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 6.43f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 1.07f,
                    waterAThirdOfLiterBottleInRestaurants = 1.2f,
                    milkRegularOneLiter = 2.25f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.91f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 5.62f,
                    banana1kg = 2.81f,
                    oranges1kg = 4.02f,
                    tomato1kg = 2.81f,
                    potato1kg = 4.26f,
                    onion1kg = 4.02f,
                    lettuceOneHead = 0.91f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 3.2f,
                    riceWhite1kg = 1.61f,
                    eggsRegular12 = 1.93f,
                    localCheese1kg = null,
                    chickenFillets1kg = 4.82f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 4.02f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 46.59f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.27f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 160.64f,
                    fitnessClubMonthlyFeeForOneAdult = 54.89f,
                    tennisCourtRentOneHourOnWeekend = 28.02f,
                    cinemaInternationalReleaseOneSeat = 7.26f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 68.27f,
                    internationalPrimarySchoolYearlyForOneChild = 1743.37f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 24.1f,
                    oneSummerDressInAChainStoreZaraHAndM = 77.64f,
                    onePairOfNikeRunningShoesMidRange = 240.96f,
                    onePairOfMenLeatherBusinessShoes = 72.29f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 1.61f,
                    monthlyPassRegularPrice = 44.3f,
                    taxiStartNormalTariff = 0.8f,
                    taxi1kmNormalTariff = 0.8f,
                    taxi1hourWaitingNormalTariff = 6.43f,
                    gasolineOneLiter = 0.78f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 22048.18f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 32218.45f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 200.8f,
                    apartmentOneBedroomOutsideOfCentre = 112.45f,
                    apartment3BedroomsInCityCentre = 722.89f,
                    apartment3BedroomsOutsideOfCentre = 361.45f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 321.28f,
                dataQuality = true
            ), CityEntity(
                cityName = "Dehra Dun",
                country = "India",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.84f,
                    mealFor2PeopleMidRangeRestaurant = 18.42f,
                    mealAtMcDonaldSOrEquivalent = 5.22f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.41f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.37f,
                    waterAThirdOfLiterBottleInRestaurants = 0.19f,
                    milkRegularOneLiter = 0.71f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.37f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 1.45f,
                    banana1kg = 0.67f,
                    oranges1kg = 0.93f,
                    tomato1kg = 0.54f,
                    potato1kg = 0.32f,
                    onion1kg = 0.43f,
                    lettuceOneHead = 0.52f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.44f,
                    riceWhite1kg = 0.56f,
                    eggsRegular12 = 0.88f,
                    localCheese1kg = 4.38f,
                    chickenFillets1kg = 3.19f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 3.93f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 58.34f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 8.75f,
                    fitnessClubMonthlyFeeForOneAdult = 17.69f,
                    tennisCourtRentOneHourOnWeekend = 11.05f,
                    cinemaInternationalReleaseOneSeat = 4.3f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 51.28f,
                    internationalPrimarySchoolYearlyForOneChild = 1321.52f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 28.66f,
                    oneSummerDressInAChainStoreZaraHAndM = 31.63f,
                    onePairOfNikeRunningShoesMidRange = 63.87f,
                    onePairOfMenLeatherBusinessShoes = 51.58f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.43f,
                    monthlyPassRegularPrice = 4.91f,
                    taxiStartNormalTariff = 0.61f,
                    taxi1kmNormalTariff = 0.2f,
                    taxi1hourWaitingNormalTariff = 1.84f,
                    gasolineOneLiter = 1.21f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 18422.64f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 145.85f,
                    apartmentOneBedroomOutsideOfCentre = 74.92f,
                    apartment3BedroomsInCityCentre = 331.61f,
                    apartment3BedroomsOutsideOfCentre = 186.68f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2897.58f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 615.45f
                ),
                averageMonthlyNetSalaryAfterTax = 358.14f,
                dataQuality = true
            )
        )

    }
}








