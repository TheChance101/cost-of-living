package fakedata

import interactor.CostOfLivingDataSource
import model.*

val city1 by lazy {
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
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 10f,
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
        averageMonthlyNetSalaryAfterTax = 50f,
        dataQuality = true
    )
}
val city2 by lazy {
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
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 40f,
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
val city3 by lazy {
    CityEntity(
        cityName = "matrouh",
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
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = 2000f,
        dataQuality = true
    )
}
val city4 by lazy {
    CityEntity(
        cityName = "aswan",
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
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = 2000f,
        dataQuality = true
    )
}
val city5 by lazy {
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
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 10f,
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
        averageMonthlyNetSalaryAfterTax = 50f,
        dataQuality = true
    )
}
val city6 by lazy {
    CityEntity(
        cityName = "aswan",
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
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 10f,
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
        averageMonthlyNetSalaryAfterTax = 50f,
        dataQuality = true
    )
}
/*****************************/
val city7 by lazy {
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
            internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
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
        averageMonthlyNetSalaryAfterTax = 50f,
        dataQuality = true
    )
}
val city8 by lazy {
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
            internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
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
val city9 by lazy {
    CityEntity(
        cityName = "matrouh",
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
            internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
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
        averageMonthlyNetSalaryAfterTax = 2000f,
        dataQuality = true
    )
}
/************************/
val city10 by lazy {
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
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 10f,
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
        averageMonthlyNetSalaryAfterTax = null,
        dataQuality = true
    )
}
val city11 by lazy {
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
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 40f,
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
        averageMonthlyNetSalaryAfterTax = null,
        dataQuality = true
    )
}
val city12 by lazy {
    CityEntity(
        cityName = "matrouh",
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
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ),
        averageMonthlyNetSalaryAfterTax = null,
        dataQuality = true
    )
}
class CheapInternetFakeData : CostOfLivingDataSource {
    override fun getAllCitiesData() = listOf(city1, city2, city3)
}
class FakeDataWithSameCheap : CostOfLivingDataSource {
    override fun getAllCitiesData() = listOf(city4,city1, city2, city3)
}
class FakeDataWithLessThenCheapValueAllow : CostOfLivingDataSource {
    override fun getAllCitiesData() = listOf(city1, city5, city6)
}
class InternetServiceProviderFakeData : CostOfLivingDataSource {
    override fun getAllCitiesData() = listOf(city7, city8, city9)
}
class SalaryServiceProviderFakeData : CostOfLivingDataSource {
    override fun getAllCitiesData() = listOf(city10, city11, city12)
}
class SalaryServiceProviderAndInternetServiceProviderFakeData: CostOfLivingDataSource {
    override fun getAllCitiesData() = listOf(city10, city11, city8, city9)
}
