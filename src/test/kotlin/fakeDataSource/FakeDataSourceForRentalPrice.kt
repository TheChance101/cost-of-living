package fakeDataSource

import interactor.CostOfLivingDataSource
import model.*


open class FakeDataSourceForRentalPrice :CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
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
                    apartmentOneBedroomInCityCentre = 300.0f,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 6456.9f,
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
                    cappuccinoRegularInRestaurants = 1.50f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.0f,
                    waterAThirdOfLiterBottleInRestaurants = 0.5f,
                    milkRegularOneLiter = 3.8f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.0f
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
                    apartmentOneBedroomInCityCentre = 100.0f,
                    apartmentOneBedroomOutsideOfCentre = 200.3f,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 400.5f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 6964.4f
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
                    cappuccinoRegularInRestaurants = 3.0f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 6.0f,
                    waterAThirdOfLiterBottleInRestaurants = 2.0f,
                    milkRegularOneLiter = 7.8f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.0f
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
                    apartmentOneBedroomInCityCentre = 455.984f,
                    apartmentOneBedroomOutsideOfCentre = 464.94f,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 534.9f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 454.84f
                ),
                averageMonthlyNetSalaryAfterTax = 15.0f,
                dataQuality = true
            ), CityEntity(
                cityName = "LA",
                country = "USA",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 9.5f,
                    mealFor2PeopleMidRangeRestaurant = 5.0f,
                    mealAtMcDonaldSOrEquivalent = 15.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 3.0f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 6.0f,
                    waterAThirdOfLiterBottleInRestaurants = 2.0f,
                    milkRegularOneLiter = 7.8f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.0f
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
                    apartmentOneBedroomInCityCentre = 342.56f,
                    apartmentOneBedroomOutsideOfCentre = 343.87f,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 34.38f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 423.64f
                ),
                averageMonthlyNetSalaryAfterTax = 15.0f,
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
                    cappuccinoRegularInRestaurants = 3.0f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 6.0f,
                    waterAThirdOfLiterBottleInRestaurants = 2.0f,
                    milkRegularOneLiter = 7.8f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.0f
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
                    apartmentOneBedroomInCityCentre = 334.7f,
                    apartmentOneBedroomOutsideOfCentre = 4324.67f,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 534.34f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 300.0f
                ),
                averageMonthlyNetSalaryAfterTax = 15.0f,
                dataQuality = true
            ),
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
                    apartmentOneBedroomInCityCentre = 534.86f,
                    apartmentOneBedroomOutsideOfCentre = 432.76f,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 34.4f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 3424.34f
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
                    cappuccinoRegularInRestaurants = 1.50f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.0f,
                    waterAThirdOfLiterBottleInRestaurants = 0.5f,
                    milkRegularOneLiter = 3.8f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.0f
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
                    cappuccinoRegularInRestaurants = 3.0f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 6.0f,
                    waterAThirdOfLiterBottleInRestaurants = 2.0f,
                    milkRegularOneLiter = 7.8f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.0f
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
                    apartmentOneBedroomInCityCentre = 213.64f,
                    apartmentOneBedroomOutsideOfCentre = 123.53f,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 123.7f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 3423.56f
                ),
                averageMonthlyNetSalaryAfterTax = 15.0f,
                dataQuality = true
            ), CityEntity(
                cityName = "LA",
                country = "USA",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 9.5f,
                    mealFor2PeopleMidRangeRestaurant = 5.0f,
                    mealAtMcDonaldSOrEquivalent = 15.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 3.0f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 6.0f,
                    waterAThirdOfLiterBottleInRestaurants = 2.0f,
                    milkRegularOneLiter = 7.8f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.0f
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
                    apartmentOneBedroomInCityCentre = 123.348f,
                    apartmentOneBedroomOutsideOfCentre = 234.435f,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 342.564f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 342.756f
                ),
                averageMonthlyNetSalaryAfterTax = 15.0f,
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
                    cappuccinoRegularInRestaurants = 3.0f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 6.0f,
                    waterAThirdOfLiterBottleInRestaurants = 2.0f,
                    milkRegularOneLiter = 7.8f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.0f
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
                    apartmentOneBedroomInCityCentre = 342.5687f,
                    apartmentOneBedroomOutsideOfCentre = 364.35f,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 235.354f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 482.564f
                ),
                averageMonthlyNetSalaryAfterTax = 15.0f,
                dataQuality = true
            ), CityEntity(
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
                    apartmentOneBedroomInCityCentre = 8935.35f,
                    apartmentOneBedroomOutsideOfCentre = 324.34f,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 342.99f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 523.23f
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
                    cappuccinoRegularInRestaurants = 1.50f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.0f,
                    waterAThirdOfLiterBottleInRestaurants = 0.5f,
                    milkRegularOneLiter = 3.8f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.0f
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
                    apartmentOneBedroomInCityCentre = 245.656f,
                    apartmentOneBedroomOutsideOfCentre = 342.354f,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 34.54f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 3424.35f
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
                    cappuccinoRegularInRestaurants = 3.0f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 6.0f,
                    waterAThirdOfLiterBottleInRestaurants = 2.0f,
                    milkRegularOneLiter = 7.8f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.0f
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
                    apartmentOneBedroomInCityCentre = 342.678f,
                    apartmentOneBedroomOutsideOfCentre = 2345.678f,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 342.8435f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 424.734f
                ),
                averageMonthlyNetSalaryAfterTax = 15.0f,
                dataQuality = true
            ), CityEntity(
                cityName = "LA",
                country = "USA",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 9.5f,
                    mealFor2PeopleMidRangeRestaurant = 5.0f,
                    mealAtMcDonaldSOrEquivalent = 15.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 3.0f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 6.0f,
                    waterAThirdOfLiterBottleInRestaurants = 2.0f,
                    milkRegularOneLiter = 7.8f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.0f
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
                    apartmentOneBedroomInCityCentre = 843.6354f,
                    apartmentOneBedroomOutsideOfCentre = 324.867f,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 955.345f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 534.435f
                ),
                averageMonthlyNetSalaryAfterTax = 15.0f,
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
                    cappuccinoRegularInRestaurants = 3.0f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 6.0f,
                    waterAThirdOfLiterBottleInRestaurants = 2.0f,
                    milkRegularOneLiter = 7.8f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.0f
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
                    apartmentOneBedroomInCityCentre = 343.85f,
                    apartmentOneBedroomOutsideOfCentre = 324.78f,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 8000.243f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 9000.9f
                ),
                averageMonthlyNetSalaryAfterTax = 15.0f,
                dataQuality = true
            )
        )
    }
}