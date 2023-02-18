package dataSource

import interactor.CostOfLivingDataSource
import model.*


class FakeDataSource : CostOfLivingDataSource {
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
                averageMonthlyNetSalaryAfterTax = 18.0f,
                dataQuality = false
            ), CityEntity(
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
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
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
            ), CityEntity(
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
                    banana1kg = 1.0f,
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
                averageMonthlyNetSalaryAfterTax = 25.0f,
                dataQuality = false
            ), CityEntity(
                cityName = "Jaramana",
                country = "Syria",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 2.99f,
                    mealFor2PeopleMidRangeRestaurant = 10.0f,
                    mealAtMcDonaldSOrEquivalent = 4.04f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.94f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.73f,
                    waterAThirdOfLiterBottleInRestaurants = 0.41f,
                    milkRegularOneLiter = 0.75f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.51f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.45f,
                    banana1kg = 0.9f,
                    oranges1kg = 0.2f,
                    tomato1kg = 0.52f,
                    potato1kg = 0.2f,
                    onion1kg = 0.25f,
                    lettuceOneHead = 0.2f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.75f,
                    riceWhite1kg = 1.46f,
                    eggsRegular12 = 1.48f,
                    localCheese1kg = 3.97f,
                    chickenFillets1kg = 2.66f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 7.27f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 13.21f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 50.67f,
                    fitnessClubMonthlyFeeForOneAdult = 7.0f,
                    tennisCourtRentOneHourOnWeekend = 3.0f,
                    cinemaInternationalReleaseOneSeat = 2.36f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 22.5f,
                    internationalPrimarySchoolYearlyForOneChild = 816.73f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 18.33f,
                    oneSummerDressInAChainStoreZaraHAndM = 14.33f,
                    onePairOfNikeRunningShoesMidRange = 57.5f,
                    onePairOfMenLeatherBusinessShoes = 53.27f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 0.6f,
                    taxi1kmNormalTariff = 1.59f,
                    taxi1hourWaitingNormalTariff = 3.0f,
                    gasolineOneLiter = 0.5f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 26000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 33666.67f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 30.0f,
                dataQuality = false
            ), CityEntity(
                cityName = "Havana",
                country = "Cuba",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 10.0f,
                    mealFor2PeopleMidRangeRestaurant = 40.0f,
                    mealAtMcDonaldSOrEquivalent = 7.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.91f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.28f,
                    waterAThirdOfLiterBottleInRestaurants = 1.63f,
                    milkRegularOneLiter = 3.52f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.98f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 6.24f,
                    banana1kg = 1.1f,
                    oranges1kg = 1.12f,
                    tomato1kg = 2.05f,
                    potato1kg = 1.82f,
                    onion1kg = 2.34f,
                    lettuceOneHead = 0.86f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.18f,
                    riceWhite1kg = 1.85f,
                    eggsRegular12 = 1.64f,
                    localCheese1kg = 4.85f,
                    chickenFillets1kg = 6.07f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 11.59f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 37.14f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.26f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 165.0f,
                    fitnessClubMonthlyFeeForOneAdult = 16.67f,
                    tennisCourtRentOneHourOnWeekend = 13.75f,
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
                    oneWayTicketLocalTransport = 0.1f,
                    monthlyPassRegularPrice = 20.0f,
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
                    apartmentOneBedroomInCityCentre = 532.86f,
                    apartmentOneBedroomOutsideOfCentre = 222.5f,
                    apartment3BedroomsInCityCentre = 1625.0f,
                    apartment3BedroomsOutsideOfCentre = 730.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 490.89f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 268.23f
                ),
                averageMonthlyNetSalaryAfterTax = 35.75f,
                dataQuality = true
            ), CityEntity(
                cityName = "Moratuwa",
                country = "Sri Lanka",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.36f,
                    mealFor2PeopleMidRangeRestaurant = 3.25f,
                    mealAtMcDonaldSOrEquivalent = 1.98f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.27f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.19f,
                    waterAThirdOfLiterBottleInRestaurants = 0.14f,
                    milkRegularOneLiter = 0.73f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.19f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 2.03f,
                    banana1kg = 0.35f,
                    oranges1kg = 1.63f,
                    tomato1kg = 0.49f,
                    potato1kg = 0.47f,
                    onion1kg = 0.43f,
                    lettuceOneHead = 0.62f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.19f,
                    riceWhite1kg = 0.34f,
                    eggsRegular12 = 0.65f,
                    localCheese1kg = 9.76f,
                    chickenFillets1kg = 2.71f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 3.53f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 27.12f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 2.44f,
                    fitnessClubMonthlyFeeForOneAdult = 4.07f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 2.17f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 40.68f,
                    internationalPrimarySchoolYearlyForOneChild = 677.97f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 21.7f,
                    oneSummerDressInAChainStoreZaraHAndM = 9.49f,
                    onePairOfNikeRunningShoesMidRange = 27.12f,
                    onePairOfMenLeatherBusinessShoes = 40.68f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 0.22f,
                    taxi1kmNormalTariff = 0.14f,
                    taxi1hourWaitingNormalTariff = 0.16f,
                    gasolineOneLiter = 0.53f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 16271.32f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 35254.52f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = 12.2f,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = 27.12f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 36.61f,
                dataQuality = false
            ), CityEntity(
                cityName = "Las Tunas",
                country = "Cuba",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 3.0f,
                    mealFor2PeopleMidRangeRestaurant = 14.0f,
                    mealAtMcDonaldSOrEquivalent = null
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.0f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 1.25f,
                    waterAThirdOfLiterBottleInRestaurants = 1.0f,
                    milkRegularOneLiter = null,
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
                    eggsRegular12 = 2.4f,
                    localCheese1kg = 4.41f,
                    chickenFillets1kg = 6.61f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6.61f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.1f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                    fitnessClubMonthlyFeeForOneAdult = 15.0f,
                    tennisCourtRentOneHourOnWeekend = 5.0f,
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
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 40.0f,
                dataQuality = false
            ), CityEntity(
                cityName = "Latakia",
                country = "Syria",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 2.99f,
                    mealFor2PeopleMidRangeRestaurant = 10.0f,
                    mealAtMcDonaldSOrEquivalent = 4.04f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.94f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.73f,
                    waterAThirdOfLiterBottleInRestaurants = 0.41f,
                    milkRegularOneLiter = 0.75f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.51f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.45f,
                    banana1kg = 0.9f,
                    oranges1kg = 0.2f,
                    tomato1kg = 0.52f,
                    potato1kg = 0.2f,
                    onion1kg = 0.25f,
                    lettuceOneHead = 0.2f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.75f,
                    riceWhite1kg = 1.46f,
                    eggsRegular12 = 1.48f,
                    localCheese1kg = 3.97f,
                    chickenFillets1kg = 2.66f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 7.27f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 13.21f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 50.67f,
                    fitnessClubMonthlyFeeForOneAdult = 10.97f,
                    tennisCourtRentOneHourOnWeekend = 2.0f,
                    cinemaInternationalReleaseOneSeat = 2.36f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 22.5f,
                    internationalPrimarySchoolYearlyForOneChild = 816.73f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 18.33f,
                    oneSummerDressInAChainStoreZaraHAndM = 14.33f,
                    onePairOfNikeRunningShoesMidRange = 57.5f,
                    onePairOfMenLeatherBusinessShoes = 53.27f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.1f,
                    monthlyPassRegularPrice = 14.23f,
                    taxiStartNormalTariff = 0.6f,
                    taxi1kmNormalTariff = 1.59f,
                    taxi1hourWaitingNormalTariff = 3.0f,
                    gasolineOneLiter = 0.5f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 26000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 33666.67f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 147.5f,
                    apartmentOneBedroomOutsideOfCentre = 76.78f,
                    apartment3BedroomsInCityCentre = 253.75f,
                    apartment3BedroomsOutsideOfCentre = 187.5f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 755.0f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 316.67f
                ),
                averageMonthlyNetSalaryAfterTax = 41.25f,
                dataQuality = false
            ), CityEntity(
                cityName = "Homs",
                country = "Syria",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 5.98f,
                    mealFor2PeopleMidRangeRestaurant = 37.35f,
                    mealAtMcDonaldSOrEquivalent = null
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.75f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 1.15f,
                    waterAThirdOfLiterBottleInRestaurants = 0.55f,
                    milkRegularOneLiter = 0.6f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.48f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 1.33f,
                    banana1kg = 1.5f,
                    oranges1kg = 0.38f,
                    tomato1kg = 0.93f,
                    potato1kg = 0.33f,
                    onion1kg = 0.38f,
                    lettuceOneHead = 0.52f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.8f,
                    riceWhite1kg = 0.82f,
                    eggsRegular12 = 1.2f,
                    localCheese1kg = 3.32f,
                    chickenFillets1kg = 5.15f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 10.97f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 200.0f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.0f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                    fitnessClubMonthlyFeeForOneAdult = 9.0f,
                    tennisCourtRentOneHourOnWeekend = 3.5f,
                    cinemaInternationalReleaseOneSeat = 3.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 66.67f,
                    internationalPrimarySchoolYearlyForOneChild = 1950.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 25.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 15.0f,
                    onePairOfNikeRunningShoesMidRange = 150.0f,
                    onePairOfMenLeatherBusinessShoes = 150.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.05f,
                    monthlyPassRegularPrice = 4.0f,
                    taxiStartNormalTariff = 0.8f,
                    taxi1kmNormalTariff = 0.65f,
                    taxi1hourWaitingNormalTariff = 1.5f,
                    gasolineOneLiter = 1.07f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = null
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 76.67f,
                    apartmentOneBedroomOutsideOfCentre = 40.0f,
                    apartment3BedroomsInCityCentre = 306.67f,
                    apartment3BedroomsOutsideOfCentre = 100.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 1000.0f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 350.0f
                ),
                averageMonthlyNetSalaryAfterTax = 46.33f,
                dataQuality = false
            ), CityEntity(
                cityName = "Hamah",
                country = "Syria",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 3.5f,
                    mealFor2PeopleMidRangeRestaurant = 12.0f,
                    mealAtMcDonaldSOrEquivalent = 2.5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.75f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.9f,
                    waterAThirdOfLiterBottleInRestaurants = 0.5f,
                    milkRegularOneLiter = 0.5f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.75f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 1.0f,
                    banana1kg = 3.25f,
                    oranges1kg = 1.25f,
                    tomato1kg = 0.5f,
                    potato1kg = 0.55f,
                    onion1kg = 0.45f,
                    lettuceOneHead = 0.25f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.75f,
                    riceWhite1kg = 1.25f,
                    eggsRegular12 = 2.1f,
                    localCheese1kg = 3.0f,
                    chickenFillets1kg = 3.75f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6.0f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.1f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                    fitnessClubMonthlyFeeForOneAdult = 3.5f,
                    tennisCourtRentOneHourOnWeekend = 3.5f,
                    cinemaInternationalReleaseOneSeat = 3.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 35.0f,
                    internationalPrimarySchoolYearlyForOneChild = 500.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 10.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                    onePairOfNikeRunningShoesMidRange = null,
                    onePairOfMenLeatherBusinessShoes = 20.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.2f,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 0.5f,
                    taxi1kmNormalTariff = 0.5f,
                    taxi1hourWaitingNormalTariff = 10.0f,
                    gasolineOneLiter = 1.5f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = null
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = 90.0f,
                    apartment3BedroomsOutsideOfCentre = 65.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 1000.0f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 600.0f
                ),
                averageMonthlyNetSalaryAfterTax = 50.0f,
                dataQuality = false
            ), CityEntity(
                cityName = "Damascus",
                country = "Syria",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 4.0f,
                    mealFor2PeopleMidRangeRestaurant = 22.0f,
                    mealAtMcDonaldSOrEquivalent = 4.5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.01f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.82f,
                    waterAThirdOfLiterBottleInRestaurants = 0.46f,
                    milkRegularOneLiter = 1.15f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.56f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 1.01f,
                    banana1kg = 2.32f,
                    oranges1kg = 0.64f,
                    tomato1kg = 0.79f,
                    potato1kg = 0.63f,
                    onion1kg = 0.39f,
                    lettuceOneHead = 0.32f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.17f,
                    riceWhite1kg = 1.46f,
                    eggsRegular12 = 1.48f,
                    localCheese1kg = 3.97f,
                    chickenFillets1kg = 6.25f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 10.25f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 18.48f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 50.67f,
                    fitnessClubMonthlyFeeForOneAdult = 14.47f,
                    tennisCourtRentOneHourOnWeekend = 10.0f,
                    cinemaInternationalReleaseOneSeat = 3.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 133.06f,
                    internationalPrimarySchoolYearlyForOneChild = 2676.54f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 36.19f,
                    oneSummerDressInAChainStoreZaraHAndM = 29.5f,
                    onePairOfNikeRunningShoesMidRange = 116.22f,
                    onePairOfMenLeatherBusinessShoes = 64.64f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.1f,
                    monthlyPassRegularPrice = 17.0f,
                    taxiStartNormalTariff = 1.19f,
                    taxi1kmNormalTariff = 1.59f,
                    taxi1hourWaitingNormalTariff = 7.93f,
                    gasolineOneLiter = 1.16f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 26000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 33666.67f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 282.72f,
                    apartmentOneBedroomOutsideOfCentre = 182.54f,
                    apartment3BedroomsInCityCentre = 476.27f,
                    apartment3BedroomsOutsideOfCentre = 266.42f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2000.0f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1877.4f
                ),
                averageMonthlyNetSalaryAfterTax = 50.24f,
                dataQuality = true
            ), CityEntity(
                cityName = "Uyo",
                country = "Nigeria",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.13f,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = 4.5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = null,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.3f,
                    waterAThirdOfLiterBottleInRestaurants = 0.23f,
                    milkRegularOneLiter = null,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.45f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = null,
                    banana1kg = null,
                    oranges1kg = null,
                    tomato1kg = null,
                    potato1kg = 0.45f,
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
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 11.26f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.03f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 33.77f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 3.38f,
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
                    gasolineOneLiter = 0.36f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = null
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 675.42f,
                    apartmentOneBedroomOutsideOfCentre = 450.28f,
                    apartment3BedroomsInCityCentre = 1125.7f,
                    apartment3BedroomsOutsideOfCentre = 675.42f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 50.66f,
                dataQuality = false
            ), CityEntity(
                cityName = "Tamale",
                country = "Ghana",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.79f,
                    mealFor2PeopleMidRangeRestaurant = 4.29f,
                    mealAtMcDonaldSOrEquivalent = 4.11f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.45f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.33f,
                    waterAThirdOfLiterBottleInRestaurants = 0.17f,
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
                    eggsRegular12 = 0.86f,
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
                    internationalPrimarySchoolYearlyForOneChild = 7142.86f
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
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 461.31f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 461.31f
                ),
                averageMonthlyNetSalaryAfterTax = 56.43f,
                dataQuality = false
            ), CityEntity(
                cityName = "Kasese",
                country = "Uganda",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.34f,
                    mealFor2PeopleMidRangeRestaurant = 13.4f,
                    mealAtMcDonaldSOrEquivalent = 10.72f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.34f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.27f,
                    waterAThirdOfLiterBottleInRestaurants = 0.27f,
                    milkRegularOneLiter = 0.48f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.54f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.02f,
                    banana1kg = 1.07f,
                    oranges1kg = 0.94f,
                    tomato1kg = 1.0f,
                    potato1kg = 0.67f,
                    onion1kg = 0.8f,
                    lettuceOneHead = 0.8f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.94f,
                    riceWhite1kg = 1.14f,
                    eggsRegular12 = 1.45f,
                    localCheese1kg = 3.75f,
                    chickenFillets1kg = 8.71f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 3.21f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 40.19f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.11f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 50.9f,
                    fitnessClubMonthlyFeeForOneAdult = 25.45f,
                    tennisCourtRentOneHourOnWeekend = 2.68f,
                    cinemaInternationalReleaseOneSeat = 2.68f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 40.19f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 16.07f,
                    oneSummerDressInAChainStoreZaraHAndM = 16.07f,
                    onePairOfNikeRunningShoesMidRange = 40.19f,
                    onePairOfMenLeatherBusinessShoes = 40.19f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.54f,
                    monthlyPassRegularPrice = 13.4f,
                    taxiStartNormalTariff = 0.94f,
                    taxi1kmNormalTariff = 1.34f,
                    taxi1hourWaitingNormalTariff = 2.01f,
                    gasolineOneLiter = 1.42f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 16074.93f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 13395.78f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 80.37f,
                    apartmentOneBedroomOutsideOfCentre = 53.58f,
                    apartment3BedroomsInCityCentre = 187.54f,
                    apartment3BedroomsOutsideOfCentre = 120.56f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 401.87f
                ),
                averageMonthlyNetSalaryAfterTax = 66.98f,
                dataQuality = true
            ), CityEntity(
                cityName = "Aleppo",
                country = "Syria",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 4.0f,
                    mealFor2PeopleMidRangeRestaurant = 17.96f,
                    mealAtMcDonaldSOrEquivalent = 4.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.87f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.8f,
                    waterAThirdOfLiterBottleInRestaurants = 0.33f,
                    milkRegularOneLiter = 0.74f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.7f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.83f,
                    banana1kg = 1.9f,
                    oranges1kg = 0.38f,
                    tomato1kg = 0.71f,
                    potato1kg = 0.82f,
                    onion1kg = 0.47f,
                    lettuceOneHead = 0.3f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.47f,
                    riceWhite1kg = 1.46f,
                    eggsRegular12 = 2.3f,
                    localCheese1kg = 4.92f,
                    chickenFillets1kg = 4.85f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 7.91f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 20.0f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 49.33f,
                    fitnessClubMonthlyFeeForOneAdult = 24.26f,
                    tennisCourtRentOneHourOnWeekend = 7.97f,
                    cinemaInternationalReleaseOneSeat = 3.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 49.84f,
                    internationalPrimarySchoolYearlyForOneChild = 4497.7f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 17.98f,
                    oneSummerDressInAChainStoreZaraHAndM = 5.0f,
                    onePairOfNikeRunningShoesMidRange = 150.0f,
                    onePairOfMenLeatherBusinessShoes = 42.96f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.1f,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 1.0f,
                    taxi1kmNormalTariff = 0.52f,
                    taxi1hourWaitingNormalTariff = 5.97f,
                    gasolineOneLiter = 1.0f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 31847.13f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 47770.7f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 132.34f,
                    apartmentOneBedroomOutsideOfCentre = 74.0f,
                    apartment3BedroomsInCityCentre = 262.68f,
                    apartment3BedroomsOutsideOfCentre = 186.18f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 875.0f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 475.0f
                ),
                averageMonthlyNetSalaryAfterTax = 72.8f,
                dataQuality = true
            ), CityEntity(
                cityName = "Banjul",
                country = "Gambia",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.21f,
                    mealFor2PeopleMidRangeRestaurant = 16.13f,
                    mealAtMcDonaldSOrEquivalent = 5.24f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.51f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.73f,
                    waterAThirdOfLiterBottleInRestaurants = 0.34f,
                    milkRegularOneLiter = 1.21f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.35f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 1.67f,
                    banana1kg = 1.45f,
                    oranges1kg = 1.32f,
                    tomato1kg = 1.13f,
                    potato1kg = 0.94f,
                    onion1kg = 0.67f,
                    lettuceOneHead = 0.32f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.27f,
                    riceWhite1kg = 0.86f,
                    eggsRegular12 = 1.97f,
                    localCheese1kg = 5.98f,
                    chickenFillets1kg = 3.02f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 4.57f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 41.94f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.05f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 92.74f,
                    fitnessClubMonthlyFeeForOneAdult = 16.94f,
                    tennisCourtRentOneHourOnWeekend = 5.65f,
                    cinemaInternationalReleaseOneSeat = 4.84f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 24.19f,
                    internationalPrimarySchoolYearlyForOneChild = 362.9f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 8.06f,
                    oneSummerDressInAChainStoreZaraHAndM = 11.29f,
                    onePairOfNikeRunningShoesMidRange = 48.39f,
                    onePairOfMenLeatherBusinessShoes = 19.35f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.15f,
                    monthlyPassRegularPrice = 8.06f,
                    taxiStartNormalTariff = 0.81f,
                    taxi1kmNormalTariff = 0.81f,
                    taxi1hourWaitingNormalTariff = 4.84f,
                    gasolineOneLiter = 0.85f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 2096.77f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = null
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 120.97f,
                    apartmentOneBedroomOutsideOfCentre = 17.56f,
                    apartment3BedroomsInCityCentre = 104.84f,
                    apartment3BedroomsOutsideOfCentre = 43.01f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 4838.71f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 2419.35f
                ),
                averageMonthlyNetSalaryAfterTax = 75.27f,
                dataQuality = true
            ), CityEntity(
                cityName = "Warri",
                country = "Nigeria",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.13f,
                    mealFor2PeopleMidRangeRestaurant = 11.26f,
                    mealAtMcDonaldSOrEquivalent = 9.01f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 2.25f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.55f,
                    waterAThirdOfLiterBottleInRestaurants = 0.38f,
                    milkRegularOneLiter = 2.48f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.45f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 3.94f,
                    banana1kg = 1.49f,
                    oranges1kg = 1.13f,
                    tomato1kg = 1.13f,
                    potato1kg = 0.99f,
                    onion1kg = 2.25f,
                    lettuceOneHead = null
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.51f,
                    riceWhite1kg = 4.5f,
                    eggsRegular12 = 2.48f,
                    localCheese1kg = null,
                    chickenFillets1kg = 2.7f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 3.49f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 27.02f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.05f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 20.0f,
                    fitnessClubMonthlyFeeForOneAdult = 28.14f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 9.01f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 182.36f,
                    internationalPrimarySchoolYearlyForOneChild = 675.42f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 13.51f,
                    oneSummerDressInAChainStoreZaraHAndM = 45.03f,
                    onePairOfNikeRunningShoesMidRange = 33.77f,
                    onePairOfMenLeatherBusinessShoes = 101.31f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.23f,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 0.45f,
                    taxi1kmNormalTariff = 0.23f,
                    taxi1hourWaitingNormalTariff = null,
                    gasolineOneLiter = 0.35f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = null
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 585.36f,
                    apartmentOneBedroomOutsideOfCentre = 326.45f,
                    apartment3BedroomsInCityCentre = 1913.68f,
                    apartment3BedroomsOutsideOfCentre = 900.56f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 202.63f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1013.13f
                ),
                averageMonthlyNetSalaryAfterTax = 75.42f,
                dataQuality = true
            ), CityEntity(
                cityName = "Dhangadhi",
                country = "Nepal",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.15f,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = null
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = null,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.38f,
                    waterAThirdOfLiterBottleInRestaurants = 0.19f,
                    milkRegularOneLiter = 0.54f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.19f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.77f,
                    banana1kg = 0.77f,
                    oranges1kg = 0.38f,
                    tomato1kg = 0.62f,
                    potato1kg = 0.46f,
                    onion1kg = 0.62f,
                    lettuceOneHead = null
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.31f,
                    riceWhite1kg = 0.62f,
                    eggsRegular12 = 1.38f,
                    localCheese1kg = 4.61f,
                    chickenFillets1kg = 2.31f,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.04f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 12.15f,
                    fitnessClubMonthlyFeeForOneAdult = 7.69f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 2.31f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 15.38f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 11.53f,
                    oneSummerDressInAChainStoreZaraHAndM = 11.53f,
                    onePairOfNikeRunningShoesMidRange = 13.84f,
                    onePairOfMenLeatherBusinessShoes = 15.38f
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
                    apartmentOneBedroomInCityCentre = 38.44f,
                    apartmentOneBedroomOutsideOfCentre = 23.07f,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 76.89f,
                dataQuality = true
            ), CityEntity(
                cityName = "Narayanganj",
                country = "Bangladesh",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.71f,
                    mealFor2PeopleMidRangeRestaurant = 9.27f,
                    mealAtMcDonaldSOrEquivalent = 3.9f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 2.19f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.25f,
                    waterAThirdOfLiterBottleInRestaurants = 0.15f,
                    milkRegularOneLiter = 0.75f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.23f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 1.27f,
                    banana1kg = 0.46f,
                    oranges1kg = 1.15f,
                    tomato1kg = 0.29f,
                    potato1kg = 0.2f,
                    onion1kg = 0.62f,
                    lettuceOneHead = 0.29f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.32f,
                    riceWhite1kg = 0.41f,
                    eggsRegular12 = 0.82f,
                    localCheese1kg = 4.39f,
                    chickenFillets1kg = 2.68f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 4.06f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 29.26f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 48.77f,
                    fitnessClubMonthlyFeeForOneAdult = 13.17f,
                    tennisCourtRentOneHourOnWeekend = 2.93f,
                    cinemaInternationalReleaseOneSeat = 4.88f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 24.39f,
                    internationalPrimarySchoolYearlyForOneChild = 1170.53f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 17.07f,
                    oneSummerDressInAChainStoreZaraHAndM = 9.75f,
                    onePairOfNikeRunningShoesMidRange = 24.39f,
                    onePairOfMenLeatherBusinessShoes = 24.39f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.42f,
                    monthlyPassRegularPrice = 0.0f,
                    taxiStartNormalTariff = 0.39f,
                    taxi1kmNormalTariff = 0.2f,
                    taxi1hourWaitingNormalTariff = null,
                    gasolineOneLiter = 0.84f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 39017.69f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 17557.96f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 146.32f,
                    apartmentOneBedroomOutsideOfCentre = 97.54f,
                    apartment3BedroomsInCityCentre = 243.86f,
                    apartment3BedroomsOutsideOfCentre = 170.7f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 524.98f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 78.04f,
                dataQuality = true
            ), CityEntity(
                cityName = "Sri Jayewardenepura Kotte",
                country = "Sri Lanka",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.08f,
                    mealFor2PeopleMidRangeRestaurant = 6.78f,
                    mealAtMcDonaldSOrEquivalent = 4.34f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.99f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.27f,
                    waterAThirdOfLiterBottleInRestaurants = 0.21f,
                    milkRegularOneLiter = 0.91f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.34f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 1.8f,
                    banana1kg = 0.6f,
                    oranges1kg = 1.75f,
                    tomato1kg = 0.63f,
                    potato1kg = 0.81f,
                    onion1kg = 0.66f,
                    lettuceOneHead = 0.68f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.41f,
                    riceWhite1kg = 0.56f,
                    eggsRegular12 = 1.15f,
                    localCheese1kg = 6.07f,
                    chickenFillets1kg = 2.54f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 4.72f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 40.68f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 16.27f,
                    fitnessClubMonthlyFeeForOneAdult = 8.59f,
                    tennisCourtRentOneHourOnWeekend = 2.71f,
                    cinemaInternationalReleaseOneSeat = 2.44f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 14.92f,
                    internationalPrimarySchoolYearlyForOneChild = 903.96f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 26.1f,
                    oneSummerDressInAChainStoreZaraHAndM = 8.59f,
                    onePairOfNikeRunningShoesMidRange = 48.81f,
                    onePairOfMenLeatherBusinessShoes = 62.37f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.08f,
                    monthlyPassRegularPrice = 2.44f,
                    taxiStartNormalTariff = 0.27f,
                    taxi1kmNormalTariff = 0.2f,
                    taxi1hourWaitingNormalTariff = 0.46f,
                    gasolineOneLiter = 0.78f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 36610.46f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 26847.67f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 77.97f,
                    apartmentOneBedroomOutsideOfCentre = 33.45f,
                    apartment3BedroomsInCityCentre = 267.8f,
                    apartment3BedroomsOutsideOfCentre = 89.49f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 81.36f,
                dataQuality = true
            )


        )
    }

}

class CitiesHasNullFakeDataSource : CostOfLivingDataSource {
    override fun getAllCitiesData() = listOf(
        CityEntity(
            cityName = "Sri Jayewardenepura Kotte",
            country = "Sri Lanka",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = null,
                mealFor2PeopleMidRangeRestaurant = null,
                mealAtMcDonaldSOrEquivalent = null
            ),
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
                apartment3BedroomsOutsideOfCentre = null,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
            ),
            averageMonthlyNetSalaryAfterTax = null,
            dataQuality = true
        ),
        CityEntity(
            cityName = "Mansoura",
            country = "Egypt",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = null,
                mealFor2PeopleMidRangeRestaurant = null,
                mealAtMcDonaldSOrEquivalent = null
            ),
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
                apartment3BedroomsOutsideOfCentre = null,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
            ),
            averageMonthlyNetSalaryAfterTax = null,
            dataQuality = true
        )

    )
}

class CitiesEmptyList : CostOfLivingDataSource {
    override fun getAllCitiesData() = listOf<CityEntity>()

}

class MostSuitableCity {
    private val fakeDataSource = FakeDataSource()
    val mostSuitableCityEntity = fakeDataSource.getAllCitiesData()[15]
}







