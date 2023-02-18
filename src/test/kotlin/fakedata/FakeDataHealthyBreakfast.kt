package fakedata



import interactor.CostOfLivingDataSource
import model.*

val cityHighQualityCase11 by lazy {
    CityEntity(
        cityName = "H1",
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
            milkRegularOneLiter = 36f,
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
            eggsRegular12 = 108f,
            localCheese1kg = 36f,
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
            onePairOfJeansLevis50oneOrSimilar = 98f,
            oneSummerDressInAChainStoreZaraHAndM = 102f,
            onePairOfNikeRunningShoesMidRange = 99f,
            onePairOfMenLeatherBusinessShoes = 101f
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
        dataQuality = true
    )
}
val cityHighQualityCase21 by lazy {
    CityEntity(
        cityName = "H2",
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
            milkRegularOneLiter = 32f,
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
            eggsRegular12 = 96f,
            localCheese1kg = 32f,
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
            onePairOfJeansLevis50oneOrSimilar = 91f,
            oneSummerDressInAChainStoreZaraHAndM = 92f,
            onePairOfNikeRunningShoesMidRange = 88f,
            onePairOfMenLeatherBusinessShoes = 89f
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
        dataQuality = true
    )
}
val cityHighQualityCase31 by lazy {
    CityEntity(
        cityName = "H3",
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
            milkRegularOneLiter = 28f,
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
            eggsRegular12 = 84f,
            localCheese1kg = 28f,
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
            oneSummerDressInAChainStoreZaraHAndM = 100f,
            onePairOfNikeRunningShoesMidRange = 80f,
            onePairOfMenLeatherBusinessShoes = 80f
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
        dataQuality = true
    )
}
val cityLowQualityCase11 by lazy {
    CityEntity(
        cityName = "L1",
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
            milkRegularOneLiter = 24f,
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
            eggsRegular12 = 72f,
            localCheese1kg = 24f,
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
            onePairOfJeansLevis50oneOrSimilar = 80f,
            oneSummerDressInAChainStoreZaraHAndM = 60f,
            onePairOfNikeRunningShoesMidRange = 71f,
            onePairOfMenLeatherBusinessShoes = 69f
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
val cityLowQualityCase21 by lazy {
    CityEntity(
        cityName = "L2",
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
            milkRegularOneLiter = 20f,
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
            eggsRegular12 = 60f,
            localCheese1kg = 20f,
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
            oneSummerDressInAChainStoreZaraHAndM = 60f,
            onePairOfNikeRunningShoesMidRange = 75f,
            onePairOfMenLeatherBusinessShoes = 45f
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
val cityLowQualityCase31 by lazy {
    CityEntity(
        cityName = "L3",
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
            milkRegularOneLiter = 16f,
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
            eggsRegular12 = 48f,
            localCheese1kg = 16f,
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
            onePairOfJeansLevis50oneOrSimilar = 45f,
            oneSummerDressInAChainStoreZaraHAndM = 55f,
            onePairOfNikeRunningShoesMidRange = 99f,
            onePairOfMenLeatherBusinessShoes = 1f
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
val cityNullCase11 by lazy {
    CityEntity(
        cityName = "N1",
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
            milkRegularOneLiter = null,
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
            oneSummerDressInAChainStoreZaraHAndM = 48f,
            onePairOfNikeRunningShoesMidRange = 37f,
            onePairOfMenLeatherBusinessShoes = 35f
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
val cityNullCase21 by lazy {
    CityEntity(
        cityName = "N2",
        country = "country",
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
            oneSummerDressInAChainStoreZaraHAndM = null,
            onePairOfNikeRunningShoesMidRange = null,
            onePairOfMenLeatherBusinessShoes = 30f
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
        dataQuality = false
    )
}
val cityNullCase31 by lazy {
    CityEntity(
        cityName = "N3",
        country = "country",
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
            localCheese1kg = null,
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
            oneSummerDressInAChainStoreZaraHAndM = null,
            onePairOfNikeRunningShoesMidRange = null,
            onePairOfMenLeatherBusinessShoes = null
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
        dataQuality = false
    )
}


class FakeNormalData1 : CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(cityLowQualityCase1, cityHighQualityCase1, cityNullCase1)
}

class FakeHighQualityData1 : CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(cityHighQualityCase1, cityHighQualityCase2, cityHighQualityCase3)
}

class FakeLowQualityData1 : CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(cityLowQualityCase1, cityLowQualityCase2, cityLowQualityCase3)
}

class FakeDuplicatedData1 : CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(cityHighQualityCase1, cityHighQualityCase1, cityHighQualityCase2, cityHighQualityCase3)
}
class MyFakeData : CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(cityNullCase31,cityLowQualityCase11,cityNullCase21,
            cityHighQualityCase11, cityLowQualityCase21,  cityLowQualityCase31,cityHighQualityCase31,
            cityNullCase11,cityHighQualityCase21)
}
class FakeWithNoNull : CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(cityLowQualityCase11,
            cityHighQualityCase11, cityLowQualityCase21,  cityLowQualityCase31,cityHighQualityCase31,
            cityHighQualityCase21)
}
class FakewithNull : CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(cityNullCase31,cityNullCase21, cityNullCase11)
}