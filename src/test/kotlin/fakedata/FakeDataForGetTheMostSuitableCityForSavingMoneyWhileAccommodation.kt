package fakedata

import interactor.CostOfLivingDataSource
import model.*

val correctCityCase1 by lazy {
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
            apartmentOneBedroomInCityCentre = 500f,
            apartmentOneBedroomOutsideOfCentre = 300f,
            apartment3BedroomsInCityCentre = 800f,
            apartment3BedroomsOutsideOfCentre = 500f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 20f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 15f
        ),
        averageMonthlyNetSalaryAfterTax = 6000f,
        dataQuality = true
    )
}
val correctCityCase2 by lazy {
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
            apartmentOneBedroomInCityCentre = 500f,
            apartmentOneBedroomOutsideOfCentre = 300f,
            apartment3BedroomsInCityCentre = 820f,
            apartment3BedroomsOutsideOfCentre = 530f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 20f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 15f
        ),
        averageMonthlyNetSalaryAfterTax = 6000f,
        dataQuality = true
    )
}
val correctCityCase3 by lazy {
    CityEntity(
        cityName = "paris",
        country = "france",
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
            apartmentOneBedroomInCityCentre = 500f,
            apartmentOneBedroomOutsideOfCentre = 300f,
            apartment3BedroomsInCityCentre = 890f,
            apartment3BedroomsOutsideOfCentre = 500f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 30f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 15f
        ),
        averageMonthlyNetSalaryAfterTax = 6000f,
        dataQuality = true
    )
}
val cityNullableCase1 by lazy {
    CityEntity(
        cityName = "Hurghada",
        country = "Egypt",
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
            apartment3BedroomsInCityCentre = 8000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = null,
        dataQuality = false
    )
}
val cityNullableCase2 by lazy {
    CityEntity(
        cityName = "Russia",
        country = "Moscow",
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
            apartment3BedroomsInCityCentre = null,
            apartment3BedroomsOutsideOfCentre = null,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = null,
        dataQuality = false
    )
}
val cityNullableCase3 by lazy {
    CityEntity(
        cityName = "Berlin",
        country = "Germany",
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
            apartment3BedroomsInCityCentre = null,
            apartment3BedroomsOutsideOfCentre = 5000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = null,
        dataQuality = false
    )
}
val cityMixedDataCase1 by lazy {
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
            tennisCourtRentOneHourOnWeekend = null,
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
            monthlyPassRegularPrice = null,
            taxiStartNormalTariff = 20f,
            taxi1kmNormalTariff = 30f,
            taxi1hourWaitingNormalTariff = null,
            gasolineOneLiter = 2f
        ),
        carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
        ),
        realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = null,
            apartmentOneBedroomOutsideOfCentre = 300f,
            apartment3BedroomsInCityCentre = 800f,
            apartment3BedroomsOutsideOfCentre = 500f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 20f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 15f
        ),
        averageMonthlyNetSalaryAfterTax = 6000f,
        dataQuality = true
    )
}
val cityMixedDataCase2 by lazy {
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
            apartment3BedroomsInCityCentre = null,
            apartment3BedroomsOutsideOfCentre = null,
            pricePerSquareMeterToBuyApartmentInCityCentre = 20000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = 6000f,
        dataQuality = true
    )
}
val cityMixedDataCase3 by lazy {
    CityEntity(
        cityName = "paris",
        country = "france",
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
            riceWhite1kg = null,
            eggsRegular12 = 2f,
            localCheese1kg = null,
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
            apartmentOneBedroomOutsideOfCentre = null,
            apartment3BedroomsInCityCentre = 300f,
            apartment3BedroomsOutsideOfCentre = null,
            pricePerSquareMeterToBuyApartmentInCityCentre = 3000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = 6000f,
        dataQuality = true
    )
}

