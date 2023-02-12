package fakeData

import interactor.CostOfLivingDataSource
import model.*

val cityHigh1 by lazy {
    // Cheapest
    CityEntity(
        cityName = "alexandria",
        country = "egypt",
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 10f,
            mealFor2PeopleMidRangeRestaurant = 5f,
            mealAtMcDonaldSOrEquivalent = 3f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 7f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
            waterAThirdOfLiterBottleInRestaurants = 1f,
            milkRegularOneLiter = 2f,
            waterOneAndHalfLiterBottleAtTheMarket = 2.5f
        ),
        fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 0.0001f,
            banana1kg = 0.0002f,
            oranges1kg = 0.0003f,
            tomato1kg = 0.003f,
            potato1kg = 0.0051f,
            onion1kg = 0.0016f,
            lettuceOneHead = 0.0025f
        ),
        foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = 0.05f,
            riceWhite1kg = 0.01f,
            eggsRegular12 = 0.02f,
            localCheese1kg = 0.04f,
            chickenFillets1kg = 0.4f,
            beefRound1kgOrEquivalentBackLegRedMeat = 0.6f
        ),
        servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
            fitnessClubMonthlyFeeForOneAdult = 100f,
            tennisCourtRentOneHourOnWeekend = 100f,
            cinemaInternationalReleaseOneSeat = 10f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
            internationalPrimarySchoolYearlyForOneChild = 1000f
        ),
        clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 60f,
            oneSummerDressInAChainStoreZaraHAndM = 90f,
            onePairOfNikeRunningShoesMidRange = 80f,
            onePairOfMenLeatherBusinessShoes = 300f
        ),
        transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 5f,
            monthlyPassRegularPrice = 60f,
            taxiStartNormalTariff = 20f,
            taxi1kmNormalTariff = 30f,
            taxi1hourWaitingNormalTariff = 60f,
            gasolineOneLiter = 2f
        ),
        carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
        ),
        realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 500000f,
            apartmentOneBedroomOutsideOfCentre = 300000f,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = 400f,
        dataQuality = true
    )
}
val cityHigh2 by lazy {
    CityEntity(
        cityName = "london",
        country = "uk",
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 10f,
            mealFor2PeopleMidRangeRestaurant = 5f,
            mealAtMcDonaldSOrEquivalent = 3f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 7f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
            waterAThirdOfLiterBottleInRestaurants = 1f,
            milkRegularOneLiter = 2f,
            waterOneAndHalfLiterBottleAtTheMarket = 2.5f
        ),
        fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 20f,
            banana1kg = 10f,
            oranges1kg = 11f,
            tomato1kg = 31f,
            potato1kg = 12f,
            onion1kg = 13f,
            lettuceOneHead = 1.25f
        ),
        foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = 0.5f,
            riceWhite1kg = 1f,
            eggsRegular12 = 2f,
            localCheese1kg = 4f,
            chickenFillets1kg = 4f,
            beefRound1kgOrEquivalentBackLegRedMeat = 6f
        ),
        servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
            fitnessClubMonthlyFeeForOneAdult = 100f,
            tennisCourtRentOneHourOnWeekend = 100f,
            cinemaInternationalReleaseOneSeat = 10f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
            internationalPrimarySchoolYearlyForOneChild = 1000f
        ),
        clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 60f,
            oneSummerDressInAChainStoreZaraHAndM = 90f,
            onePairOfNikeRunningShoesMidRange = 80f,
            onePairOfMenLeatherBusinessShoes = 300f
        ),
        transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 5f,
            monthlyPassRegularPrice = 60f,
            taxiStartNormalTariff = 20f,
            taxi1kmNormalTariff = 30f,
            taxi1hourWaitingNormalTariff = 60f,
            gasolineOneLiter = 2f
        ),
        carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
        ),
        realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 500000f,
            apartmentOneBedroomOutsideOfCentre = 300000f,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = 2000f,
        dataQuality = true
    )
}
val cityHigh3 by lazy {
    // priciest
    CityEntity(
        cityName = "new york",
        country = "us",
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 10f,
            mealFor2PeopleMidRangeRestaurant = 5f,
            mealAtMcDonaldSOrEquivalent = 3f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 7f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
            waterAThirdOfLiterBottleInRestaurants = 1f,
            milkRegularOneLiter = 2f,
            waterOneAndHalfLiterBottleAtTheMarket = 2.5f
        ),
        fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 120f,
            banana1kg = 120f,
            oranges1kg = 11f,
            tomato1kg = 35f,
            potato1kg = 17f,
            onion1kg = 150f,
            lettuceOneHead = 8.25f
        ),
        foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = .5f,
            riceWhite1kg = 1f,
            eggsRegular12 = 2f,
            localCheese1kg = 4f,
            chickenFillets1kg = 4f,
            beefRound1kgOrEquivalentBackLegRedMeat = 6f
        ),
        servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
            fitnessClubMonthlyFeeForOneAdult = 100f,
            tennisCourtRentOneHourOnWeekend = 100f,
            cinemaInternationalReleaseOneSeat = 10f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
            internationalPrimarySchoolYearlyForOneChild = 1000f
        ),
        clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 60f,
            oneSummerDressInAChainStoreZaraHAndM = 90f,
            onePairOfNikeRunningShoesMidRange = 80f,
            onePairOfMenLeatherBusinessShoes = 300f
        ),
        transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 5f,
            monthlyPassRegularPrice = 60f,
            taxiStartNormalTariff = 20f,
            taxi1kmNormalTariff = 30f,
            taxi1hourWaitingNormalTariff = 60f,
            gasolineOneLiter = 2f
        ),
        carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
        ),
        realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 500000f,
            apartmentOneBedroomOutsideOfCentre = 300000f,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = 4000f,
        dataQuality = true
    )
}

val cityHigh4 by lazy {
    CityEntity(
        cityName = "ohio",
        country = "us",
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 10f,
            mealFor2PeopleMidRangeRestaurant = 5f,
            mealAtMcDonaldSOrEquivalent = 3f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 7f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
            waterAThirdOfLiterBottleInRestaurants = 1f,
            milkRegularOneLiter = 2f,
            waterOneAndHalfLiterBottleAtTheMarket = 2.5f
        ),
        fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 120f,
            banana1kg = 120f,
            oranges1kg = 11f,
            tomato1kg = 35f,
            potato1kg = 17f,
            onion1kg = 150f,
            lettuceOneHead = 8.25f
        ),
        foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = .5f,
            riceWhite1kg = 1f,
            eggsRegular12 = 2f,
            localCheese1kg = 4f,
            chickenFillets1kg = 4f,
            beefRound1kgOrEquivalentBackLegRedMeat = 6f
        ),
        servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
            fitnessClubMonthlyFeeForOneAdult = 100f,
            tennisCourtRentOneHourOnWeekend = 100f,
            cinemaInternationalReleaseOneSeat = 10f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
            internationalPrimarySchoolYearlyForOneChild = 1000f
        ),
        clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 60f,
            oneSummerDressInAChainStoreZaraHAndM = 90f,
            onePairOfNikeRunningShoesMidRange = 80f,
            onePairOfMenLeatherBusinessShoes = 300f
        ),
        transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 5f,
            monthlyPassRegularPrice = 60f,
            taxiStartNormalTariff = 20f,
            taxi1kmNormalTariff = 30f,
            taxi1hourWaitingNormalTariff = 60f,
            gasolineOneLiter = 2f
        ),
        carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
        ),
        realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 500000f,
            apartmentOneBedroomOutsideOfCentre = 300000f,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = 40000f,
        dataQuality = true
    )
}

val cityHigh5 by lazy {
    // priciest
    CityEntity(
        cityName = "yorkshire",
        country = "uk",
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 10f,
            mealFor2PeopleMidRangeRestaurant = 5f,
            mealAtMcDonaldSOrEquivalent = 3f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 7f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
            waterAThirdOfLiterBottleInRestaurants = 1f,
            milkRegularOneLiter = 2f,
            waterOneAndHalfLiterBottleAtTheMarket = 2.5f
        ),
        fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 120f,
            banana1kg = 120f,
            oranges1kg = 11f,
            tomato1kg = 35f,
            potato1kg = 17f,
            onion1kg = 150f,
            lettuceOneHead = 8.25f
        ),
        foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = .5f,
            riceWhite1kg = 1f,
            eggsRegular12 = 0.2f,
            localCheese1kg = 0.4f,
            chickenFillets1kg = 4f,
            beefRound1kgOrEquivalentBackLegRedMeat = 6f
        ),
        servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
            fitnessClubMonthlyFeeForOneAdult = 100f,
            tennisCourtRentOneHourOnWeekend = 100f,
            cinemaInternationalReleaseOneSeat = 10f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
            internationalPrimarySchoolYearlyForOneChild = 1000f
        ),
        clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 60f,
            oneSummerDressInAChainStoreZaraHAndM = 90f,
            onePairOfNikeRunningShoesMidRange = 80f,
            onePairOfMenLeatherBusinessShoes = 300f
        ),
        transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 5f,
            monthlyPassRegularPrice = 60f,
            taxiStartNormalTariff = 20f,
            taxi1kmNormalTariff = 30f,
            taxi1hourWaitingNormalTariff = 60f,
            gasolineOneLiter = 2f
        ),
        carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
        ),
        realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 500000f,
            apartmentOneBedroomOutsideOfCentre = 300000f,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = 5000f,
        dataQuality = true
    )
}
val cityLow1 by lazy {
    CityEntity(
        cityName = "cairo",
        country = "egypt",
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 10f,
            mealFor2PeopleMidRangeRestaurant = 5f,
            mealAtMcDonaldSOrEquivalent = 3f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 7f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
            waterAThirdOfLiterBottleInRestaurants = 1f,
            milkRegularOneLiter = 2f,
            waterOneAndHalfLiterBottleAtTheMarket = 2.5f
        ),
        fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 2f,
            banana1kg = 1f,
            oranges1kg = 1f,
            tomato1kg = 3f,
            potato1kg = 1f,
            onion1kg = 1f,
            lettuceOneHead = 0.25f
        ),
        foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = .5f,
            riceWhite1kg = 1f,
            eggsRegular12 = 2f,
            localCheese1kg = 4f,
            chickenFillets1kg = 4f,
            beefRound1kgOrEquivalentBackLegRedMeat = 6f
        ),
        servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
            fitnessClubMonthlyFeeForOneAdult = 100f,
            tennisCourtRentOneHourOnWeekend = 100f,
            cinemaInternationalReleaseOneSeat = 10f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
            internationalPrimarySchoolYearlyForOneChild = 1000f
        ),
        clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 60f,
            oneSummerDressInAChainStoreZaraHAndM = 90f,
            onePairOfNikeRunningShoesMidRange = 80f,
            onePairOfMenLeatherBusinessShoes = 300f
        ),
        transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 5f,
            monthlyPassRegularPrice = 60f,
            taxiStartNormalTariff = 20f,
            taxi1kmNormalTariff = 30f,
            taxi1hourWaitingNormalTariff = 60f,
            gasolineOneLiter = 2f
        ),
        carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
        ),
        realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 500000f,
            apartmentOneBedroomOutsideOfCentre = 300000f,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = 6000f,
        dataQuality = false
    )
}
val cityLow2 by lazy {
    CityEntity(
        cityName = "city_name",
        country = "country",
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 10f,
            mealFor2PeopleMidRangeRestaurant = 5f,
            mealAtMcDonaldSOrEquivalent = 3f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 7f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
            waterAThirdOfLiterBottleInRestaurants = 1f,
            milkRegularOneLiter = 2f,
            waterOneAndHalfLiterBottleAtTheMarket = 2.5f
        ),
        fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 2f,
            banana1kg = 1f,
            oranges1kg = 1f,
            tomato1kg = 3f,
            potato1kg = 1f,
            onion1kg = 1f,
            lettuceOneHead = 0.25f
        ),
        foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = .5f,
            riceWhite1kg = 1f,
            eggsRegular12 = 2f,
            localCheese1kg = 4f,
            chickenFillets1kg = 4f,
            beefRound1kgOrEquivalentBackLegRedMeat = 6f
        ),
        servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
            fitnessClubMonthlyFeeForOneAdult = 100f,
            tennisCourtRentOneHourOnWeekend = 100f,
            cinemaInternationalReleaseOneSeat = 10f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
            internationalPrimarySchoolYearlyForOneChild = 1000f
        ),
        clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 60f,
            oneSummerDressInAChainStoreZaraHAndM = 90f,
            onePairOfNikeRunningShoesMidRange = 80f,
            onePairOfMenLeatherBusinessShoes = 300f
        ),
        transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 5f,
            monthlyPassRegularPrice = 60f,
            taxiStartNormalTariff = 20f,
            taxi1kmNormalTariff = 30f,
            taxi1hourWaitingNormalTariff = 60f,
            gasolineOneLiter = 2f
        ),
        carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
        ),
        realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 500000f,
            apartmentOneBedroomOutsideOfCentre = 300000f,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = 6000f,
        dataQuality = false
    )
}
val cityLow3 by lazy {
    CityEntity(
        cityName = "city_name2",
        country = "country",
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 10f,
            mealFor2PeopleMidRangeRestaurant = 5f,
            mealAtMcDonaldSOrEquivalent = 3f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 7f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
            waterAThirdOfLiterBottleInRestaurants = 1f,
            milkRegularOneLiter = 2f,
            waterOneAndHalfLiterBottleAtTheMarket = 2.5f
        ),
        fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 2f,
            banana1kg = 1f,
            oranges1kg = 1f,
            tomato1kg = 3f,
            potato1kg = 1f,
            onion1kg = 1f,
            lettuceOneHead = 0.25f
        ),
        foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = .5f,
            riceWhite1kg = 1f,
            eggsRegular12 = 2f,
            localCheese1kg = 4f,
            chickenFillets1kg = 4f,
            beefRound1kgOrEquivalentBackLegRedMeat = 6f
        ),
        servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
            fitnessClubMonthlyFeeForOneAdult = 100f,
            tennisCourtRentOneHourOnWeekend = 100f,
            cinemaInternationalReleaseOneSeat = 10f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
            internationalPrimarySchoolYearlyForOneChild = 1000f
        ),
        clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 60f,
            oneSummerDressInAChainStoreZaraHAndM = 90f,
            onePairOfNikeRunningShoesMidRange = 80f,
            onePairOfMenLeatherBusinessShoes = 300f
        ),
        transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 5f,
            monthlyPassRegularPrice = 60f,
            taxiStartNormalTariff = 20f,
            taxi1kmNormalTariff = 30f,
            taxi1hourWaitingNormalTariff = 60f,
            gasolineOneLiter = 2f
        ),
        carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
        ),
        realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 500000f,
            apartmentOneBedroomOutsideOfCentre = 300000f,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = 6000f,
        dataQuality = false
    )
}
val cityNull1 by lazy {
    CityEntity(
        cityName = "new delhi",
        country = "india",
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = null,
            mealFor2PeopleMidRangeRestaurant = 5f,
            mealAtMcDonaldSOrEquivalent = 3f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = null,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
            waterAThirdOfLiterBottleInRestaurants = 1f,
            milkRegularOneLiter = 2f,
            waterOneAndHalfLiterBottleAtTheMarket = 2.5f
        ),
        fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = null,
            banana1kg = 1f,
            oranges1kg = 1f,
            tomato1kg = 3f,
            potato1kg = 1f,
            onion1kg = 1f,
            lettuceOneHead = null
        ),
        foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = null,
            riceWhite1kg = 1f,
            eggsRegular12 = 2f,
            localCheese1kg = 4f,
            chickenFillets1kg = 4f,
            beefRound1kgOrEquivalentBackLegRedMeat = 6f
        ),
        servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
            fitnessClubMonthlyFeeForOneAdult = 100f,
            tennisCourtRentOneHourOnWeekend = 100f,
            cinemaInternationalReleaseOneSeat = 10f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
            internationalPrimarySchoolYearlyForOneChild = 1000f
        ),
        clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = null,
            oneSummerDressInAChainStoreZaraHAndM = 90f,
            onePairOfNikeRunningShoesMidRange = 80f,
            onePairOfMenLeatherBusinessShoes = 300f
        ),
        transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = null,
            monthlyPassRegularPrice = 60f,
            taxiStartNormalTariff = 20f,
            taxi1kmNormalTariff = 30f,
            taxi1hourWaitingNormalTariff = 60f,
            gasolineOneLiter = 2f
        ),
        carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = null
        ),
        realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 500000f,
            apartmentOneBedroomOutsideOfCentre = null,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = null,
        dataQuality = true
    )
}
val cityNull2 by lazy {
    CityEntity(
        cityName = "port said",
        country = "egypt",
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = null,
            mealFor2PeopleMidRangeRestaurant = 5f,
            mealAtMcDonaldSOrEquivalent = 3f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = null,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
            waterAThirdOfLiterBottleInRestaurants = 1f,
            milkRegularOneLiter = 2f,
            waterOneAndHalfLiterBottleAtTheMarket = 2.5f
        ),
        fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = null,
            banana1kg = 1f,
            oranges1kg = 1f,
            tomato1kg = 3f,
            potato1kg = 1f,
            onion1kg = 1f,
            lettuceOneHead = null
        ),
        foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = null,
            riceWhite1kg = 1f,
            eggsRegular12 = 2f,
            localCheese1kg = 4f,
            chickenFillets1kg = 4f,
            beefRound1kgOrEquivalentBackLegRedMeat = 6f
        ),
        servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
            fitnessClubMonthlyFeeForOneAdult = 100f,
            tennisCourtRentOneHourOnWeekend = 100f,
            cinemaInternationalReleaseOneSeat = 10f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
            internationalPrimarySchoolYearlyForOneChild = 1000f
        ),
        clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = null,
            oneSummerDressInAChainStoreZaraHAndM = 90f,
            onePairOfNikeRunningShoesMidRange = 80f,
            onePairOfMenLeatherBusinessShoes = 300f
        ),
        transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = null,
            monthlyPassRegularPrice = 60f,
            taxiStartNormalTariff = 20f,
            taxi1kmNormalTariff = 30f,
            taxi1hourWaitingNormalTariff = 60f,
            gasolineOneLiter = 2f
        ),
        carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = null
        ),
        realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 500000f,
            apartmentOneBedroomOutsideOfCentre = null,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = 10f,
        dataQuality = false
    )
}
val cityNull3 by lazy {
    CityEntity(
        cityName = "beirut",
        country = "lebanon",
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = null,
            mealFor2PeopleMidRangeRestaurant = 5f,
            mealAtMcDonaldSOrEquivalent = 3f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = null,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
            waterAThirdOfLiterBottleInRestaurants = 1f,
            milkRegularOneLiter = 2f,
            waterOneAndHalfLiterBottleAtTheMarket = 2.5f
        ),
        fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = null,
            banana1kg = 1f,
            oranges1kg = 1f,
            tomato1kg = 3f,
            potato1kg = 1f,
            onion1kg = 1f,
            lettuceOneHead = null
        ),
        foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = null,
            riceWhite1kg = 1f,
            eggsRegular12 = 2f,
            localCheese1kg = 4f,
            chickenFillets1kg = 4f,
            beefRound1kgOrEquivalentBackLegRedMeat = 6f
        ),
        servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
            fitnessClubMonthlyFeeForOneAdult = 100f,
            tennisCourtRentOneHourOnWeekend = 100f,
            cinemaInternationalReleaseOneSeat = 10f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
            internationalPrimarySchoolYearlyForOneChild = 1000f
        ),
        clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = null,
            oneSummerDressInAChainStoreZaraHAndM = 90f,
            onePairOfNikeRunningShoesMidRange = 80f,
            onePairOfMenLeatherBusinessShoes = 300f
        ),
        transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = null,
            monthlyPassRegularPrice = 60f,
            taxiStartNormalTariff = 20f,
            taxi1kmNormalTariff = 30f,
            taxi1hourWaitingNormalTariff = 60f,
            gasolineOneLiter = 2f
        ),
        carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = null
        ),
        realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 500000f,
            apartmentOneBedroomOutsideOfCentre = null,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = 10f,
        dataQuality = false
    )
}
val cityNull4 by lazy {
    CityEntity(
        cityName = "california",
        country = "us",
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = null,
            mealFor2PeopleMidRangeRestaurant = 1f,
            mealAtMcDonaldSOrEquivalent = 3f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = null,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
            waterAThirdOfLiterBottleInRestaurants = 1f,
            milkRegularOneLiter = 5f,
            waterOneAndHalfLiterBottleAtTheMarket = 7.5f
        ),
        fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = null,
            banana1kg = 2f,
            oranges1kg = null,
            tomato1kg = 3f,
            potato1kg = 1f,
            onion1kg = 1f,
            lettuceOneHead = null
        ),
        foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = null,
            riceWhite1kg = 1f,
            eggsRegular12 = null,
            localCheese1kg = 4f,
            chickenFillets1kg = 4f,
            beefRound1kgOrEquivalentBackLegRedMeat = 6f
        ),
        servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
            fitnessClubMonthlyFeeForOneAdult = 100f,
            tennisCourtRentOneHourOnWeekend = 100f,
            cinemaInternationalReleaseOneSeat = 10f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
            internationalPrimarySchoolYearlyForOneChild = 1000f
        ),
        clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = null,
            oneSummerDressInAChainStoreZaraHAndM = 90f,
            onePairOfNikeRunningShoesMidRange = 80f,
            onePairOfMenLeatherBusinessShoes = 300f
        ),
        transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = null,
            monthlyPassRegularPrice = 60f,
            taxiStartNormalTariff = 20f,
            taxi1kmNormalTariff = 30f,
            taxi1hourWaitingNormalTariff = 60f,
            gasolineOneLiter = 2f
        ),
        carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 3000f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = null
        ),
        realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 50000f,
            apartmentOneBedroomOutsideOfCentre = null,
            apartment3BedroomsInCityCentre = 80000f,
            apartment3BedroomsOutsideOfCentre = 50000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = null,
        dataQuality = false
    )
}

class FakeNormalFruitsAndVegsData : CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(
            cityHigh1,
            cityHigh2,
            cityHigh3,
            cityHigh4,
            cityHigh5,
            cityLow1,
            cityLow2,
            cityLow3,
            cityNull1,
            cityNull2,
            cityNull3,
            cityNull4
        )
}

class FakeNullFruitsAndVegsData : CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(
            cityNull1,
            cityNull2,
            cityNull3,
            cityNull4
        )
}

class FakeDuplicateFruitsAndVegsData : CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(
            cityHigh1,
            cityHigh2,
            cityHigh3,
            cityHigh1,
            cityHigh2,
            cityHigh3
        )
}