package fakedata

import interactor.CostOfLivingDataSource
import model.*


val cityEntity1 = CityEntity(
    cityName = "Cairo",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.1777968f,
        banana1kg = 0.082787275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity2 = CityEntity(
    cityName = "Dahab",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.18883968f,
        banana1kg = 0.082787275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity3 = CityEntity(
    cityName = "Deir Mawas",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.159968f,
        banana1kg = 0.082787275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity4 = CityEntity(
    cityName = "Dairut",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.159968f,
        banana1kg = 0.082787275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity5 = CityEntity(
    cityName = "Dekernes",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.15999968f,
        banana1kg = 0.082787275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity6 = CityEntity(
    cityName = "Dendera",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.153968f,
        banana1kg = 0.082787275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity7 = CityEntity(
    cityName = "Damanhur",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.1999968f,
        banana1kg = 0.082787275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity8 = CityEntity(
    cityName = "Desouk",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.1899968f,
        banana1kg = 0.082787275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    )
    ,
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity9 = CityEntity(
    cityName = "Dar El Salam",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.1599968f,
        banana1kg = 0.08287275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity10 = CityEntity(
    cityName = "Dishna",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.15933968f,
        banana1kg = 0.089787275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity11 = CityEntity(
    cityName = "Daraw",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.15333968f,
        banana1kg = 0.08987275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity12 = CityEntity(
    cityName = "Edfu",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.08987275f,
        banana1kg = 0.08987275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.52903533f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity1NullCase = CityEntity(
    cityName = "Cairo",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.1777968f,
        banana1kg = null,
        oranges1kg = 0.8980027f,
        tomato1kg = null,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity2NullCase = CityEntity(
    cityName = "Dahab",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.18883968f,
        banana1kg = null,
        oranges1kg = null,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity3NullCase = CityEntity(
    cityName = "Deir Mawas",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.159968f,
        banana1kg = null,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = null,
    dataQuality = true
)


val cityEntity4NullCase = CityEntity(
    cityName = "Dairut",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.159968f,
        banana1kg = 0.082787275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity5NullCase = CityEntity(
    cityName = "Dekernes",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
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
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity6NullCase = CityEntity(
    cityName = "Dendera",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.153968f,
        banana1kg = 0.082787275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = null,
    dataQuality = true
)


val cityEntity7NullCase = CityEntity(
    cityName = "Damanhur",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
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
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = null,
    dataQuality = true
)


val cityEntity8NullCase = CityEntity(
    cityName = "Desouk",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.1899968f,
        banana1kg = null,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    )
    ,
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity9NullCase = CityEntity(
    cityName = "Dar El Salam",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.1599968f,
        banana1kg = 0.08287275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = null,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity10NullCase = CityEntity(
    cityName = "Dishna",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.15933968f,
        banana1kg = 0.089787275f,
        oranges1kg = null,
        tomato1kg = null,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity11NullCase = CityEntity(
    cityName = "Daraw",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = null,
        banana1kg = null,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.111264884f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)


val cityEntity12NullCase = CityEntity(
    cityName = "Edfu",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.08987275f,
        banana1kg = 0.08987275f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = null,
        onion1kg = null,
        lettuceOneHead = null
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = 0.33605975f,
    dataQuality = true
)



val cityEntityNullSalaryCase = CityEntity(
    cityName = "Maadi",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
    ),
    fruitAndVegetablesPrices = FruitAndVegetablesPrices(
        apples1kg = 0.19333968f,
        banana1kg = 0.19333968f,
        oranges1kg = 0.8980027f,
        tomato1kg = 0.52903533f,
        potato1kg = 0.52903533f,
        onion1kg = 0.86749166f,
        lettuceOneHead = 0.85031855f
    ),
    foodPrices = FoodPrices(
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = null,
    dataQuality = true
)

val cityEntityNullPricesOfFruitsAndVegetables = CityEntity(
    cityName = "Maadi",
    country = "Egypt",
    mealsPrices = MealsPrices(
        mealInexpensiveRestaurant = 0.003508389f,
        mealFor2PeopleMidRangeRestaurant = 0.8504958f,
        mealAtMcDonaldSOrEquivalent = 0.43748146f
    ),
    drinksPrices = DrinksPrices(
        cappuccinoRegularInRestaurants = 0.3725413f,
        cokePepsiAThirdOfLiterBottleInRestaurants = 0.060514092f,
        waterAThirdOfLiterBottleInRestaurants = 0.9937517f,
        milkRegularOneLiter = 0.4665318f,
        waterOneAndHalfLiterBottleAtTheMarket = 0.37900132f
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
        loafOfFreshWhiteBread500g = 0.29785246f,
        riceWhite1kg = 0.45743948f,
        eggsRegular12 = 0.9716136f,
        localCheese1kg = 0.4514578f,
        chickenFillets1kg = 0.80108315f,
        beefRound1kgOrEquivalentBackLegRedMeat = 0.9058857f
    ),
    servicesPrices = ServicesPrices(
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.13390046f,
        oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.33553046f,
        internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.8815264f,
        fitnessClubMonthlyFeeForOneAdult = 0.38422865f,
        tennisCourtRentOneHourOnWeekend = 0.08498275f,
        cinemaInternationalReleaseOneSeat = 0.2857951f,
        preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.36363274f,
        internationalPrimarySchoolYearlyForOneChild = 0.20583391f
    ),
    clothesPrices = ClothesPrices(
        onePairOfJeansLevis50oneOrSimilar = 0.90791756f,
        oneSummerDressInAChainStoreZaraHAndM = 0.96194005f,
        onePairOfNikeRunningShoesMidRange = 0.7833085f,
        onePairOfMenLeatherBusinessShoes = 0.77626765f
    ),
    transportationsPrices = TransportationsPrices(
        oneWayTicketLocalTransport = 0.87749606f,
        monthlyPassRegularPrice = 0.6815238f,
        taxiStartNormalTariff = 0.14079994f,
        taxi1kmNormalTariff = 0.9131123f,
        taxi1hourWaitingNormalTariff = 0.66122454f,
        gasolineOneLiter = 0.5843301f
    ),
    carsPrices = CarsPrices(
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.084864914f,
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.294919f
    ),
    realEstatesPrices = RealEstatesPrices(
        apartmentOneBedroomInCityCentre = 0.9811102f,
        apartmentOneBedroomOutsideOfCentre = 0.41683757f,
        apartment3BedroomsInCityCentre = 0.9421046f,
        apartment3BedroomsOutsideOfCentre = 0.24127579f,
        pricePerSquareMeterToBuyApartmentInCityCentre = 0.5035773f,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.87201583f
    ),
    averageMonthlyNetSalaryAfterTax = null,
    dataQuality = true
)

class FakeDataGetCitiesHaveNotNullSalariesAndNotNullFruitsAndVegetablesPrices: CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(cityEntity1, cityEntity2, cityEntity3,cityEntity4, cityEntity5, cityEntity6,cityEntity7, cityEntity8, cityEntity9,cityEntity10, cityEntity11, cityEntity12)
}

class FakeDataGetCitiesHaveSomeNullSalariesAndSomeNullFruitsAndVegetablesPrices: CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(cityEntity1NullCase, cityEntity2NullCase, cityEntity3NullCase,cityEntity4NullCase, cityEntity5NullCase, cityEntity6NullCase,cityEntity7NullCase, cityEntity8NullCase, cityEntity9NullCase,cityEntity10NullCase, cityEntity11NullCase, cityEntity12NullCase)
}

class FakeDataAllCitiesHaveNullSalary : CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(cityEntityNullSalaryCase,cityEntityNullSalaryCase, cityEntityNullSalaryCase, cityEntityNullSalaryCase,cityEntityNullSalaryCase, cityEntityNullSalaryCase, cityEntityNullSalaryCase,cityEntityNullSalaryCase, cityEntityNullSalaryCase, cityEntityNullSalaryCase,cityEntityNullSalaryCase, cityEntityNullSalaryCase, cityEntityNullSalaryCase)
}

class FakeDataAllCitiesHaveNullFruitsAndVegetablesPrices : CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(cityEntityNullPricesOfFruitsAndVegetables,cityEntityNullPricesOfFruitsAndVegetables, cityEntityNullPricesOfFruitsAndVegetables, cityEntityNullPricesOfFruitsAndVegetables,cityEntityNullPricesOfFruitsAndVegetables, cityEntityNullPricesOfFruitsAndVegetables, cityEntityNullPricesOfFruitsAndVegetables,cityEntityNullPricesOfFruitsAndVegetables, cityEntityNullPricesOfFruitsAndVegetables, cityEntityNullPricesOfFruitsAndVegetables,cityEntityNullPricesOfFruitsAndVegetables, cityEntityNullPricesOfFruitsAndVegetables, cityEntityNullPricesOfFruitsAndVegetables)
}

