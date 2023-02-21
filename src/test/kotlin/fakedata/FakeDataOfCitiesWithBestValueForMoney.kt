package dataSource

import interactor.CostOfLivingDataSource
import model.*


val cityI by lazy {
    CityEntity(
        cityName = "City 1", country = "Country 1", mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 10.0f,
            mealFor2PeopleMidRangeRestaurant = 60.0f,
            mealAtMcDonaldSOrEquivalent = 10.0f
        ), drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 4.0f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2.5f,
            waterAThirdOfLiterBottleInRestaurants = 1.5f,
            milkRegularOneLiter = 1.0f,
            waterOneAndHalfLiterBottleAtTheMarket = 2f
        ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 2.0f,
            banana1kg = 1.5f,
            oranges1kg = 2.5f,
            tomato1kg = 2.0f,
            potato1kg = 1.0f,
            onion1kg = 1.0f,
            lettuceOneHead = 1.5f
        ), foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = 1.0f,
            riceWhite1kg = 2.0f,
            eggsRegular12 = 1f,
            localCheese1kg = 8.0f,
            chickenFillets1kg = 6.0f,
            beefRound1kgOrEquivalentBackLegRedMeat = 10.0f
        ), servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 100.0f,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.2f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 30.0f,
            fitnessClubMonthlyFeeForOneAdult = 50.0f,
            tennisCourtRentOneHourOnWeekend = 20.0f,
            cinemaInternationalReleaseOneSeat = 10.0f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 500.0f,
            internationalPrimarySchoolYearlyForOneChild = 10000.0f
        ), clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 50.0f,
            oneSummerDressInAChainStoreZaraHAndM = 40.0f,
            onePairOfNikeRunningShoesMidRange = 80.0f,
            onePairOfMenLeatherBusinessShoes = 100.0f
        ), transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 1f,
            monthlyPassRegularPrice = 50.0f,
            taxiStartNormalTariff = 5.0f,
            taxi1kmNormalTariff = 1f,
            taxi1hourWaitingNormalTariff = 20.0f,
            gasolineOneLiter = 1.0f
        ), carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20000.0f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 22000.0f
        ), realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 700f,
            apartmentOneBedroomOutsideOfCentre = 500f,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ), averageMonthlyNetSalaryAfterTax = 2000f, dataQuality = true
    )
}


val cityII by lazy {
    CityEntity(
        cityName = "City 2", country = "Country 1", mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 15.0f,
            mealFor2PeopleMidRangeRestaurant = 60.0f,
            mealAtMcDonaldSOrEquivalent = 10.0f
        ), drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 4.0f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2.5f,
            waterAThirdOfLiterBottleInRestaurants = 1.5f,
            milkRegularOneLiter = 1.0f,
            waterOneAndHalfLiterBottleAtTheMarket = 2f
        ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 2.0f,
            banana1kg = 1.5f,
            oranges1kg = 2.5f,
            tomato1kg = 2.5f,
            potato1kg = 1.0f,
            onion1kg = 1.0f,
            lettuceOneHead = 1.5f
        ), foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = 1.0f,
            riceWhite1kg = 2.0f,
            eggsRegular12 = 1f,
            localCheese1kg = 8.0f,
            chickenFillets1kg = 6.0f,
            beefRound1kgOrEquivalentBackLegRedMeat = 10.0f
        ), servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 100.0f,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.2f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 45.0f,
            fitnessClubMonthlyFeeForOneAdult = 75.0f,
            tennisCourtRentOneHourOnWeekend = 330.0f,
            cinemaInternationalReleaseOneSeat = 15.0f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 500.0f,
            internationalPrimarySchoolYearlyForOneChild = 10000.0f
        ), clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 60.0f,
            oneSummerDressInAChainStoreZaraHAndM = 40.0f,
            onePairOfNikeRunningShoesMidRange = 80.0f,
            onePairOfMenLeatherBusinessShoes = 100.0f
        ), transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 1.5f,
            monthlyPassRegularPrice = 75.0f,
            taxiStartNormalTariff = 5.0f,
            taxi1kmNormalTariff = 1.5f,
            taxi1hourWaitingNormalTariff = 20.0f,
            gasolineOneLiter = 1.0f
        ), carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20000.0f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 22000.0f
        ), realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 1050f,
            apartmentOneBedroomOutsideOfCentre = 750f,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ), averageMonthlyNetSalaryAfterTax = 3000f, dataQuality = true
    )
}
val cityIII by lazy {
    CityEntity(
        cityName = "City 3", country = "Country 1", mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 20.0f,
            mealFor2PeopleMidRangeRestaurant = 60.0f,
            mealAtMcDonaldSOrEquivalent = 10.0f
        ), drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 4.0f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2.5f,
            waterAThirdOfLiterBottleInRestaurants = 1.5f,
            milkRegularOneLiter = 1.0f,
            waterOneAndHalfLiterBottleAtTheMarket = 2.5f
        ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 2.0f,
            banana1kg = 1.5f,
            oranges1kg = 2.5f,
            tomato1kg = 3.0f,
            potato1kg = 1.0f,
            onion1kg = 1.0f,
            lettuceOneHead = 1.5f
        ), foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = 1.0f,
            riceWhite1kg = 2.0f,
            eggsRegular12 = 5f,
            localCheese1kg = 8.0f,
            chickenFillets1kg = 6.0f,
            beefRound1kgOrEquivalentBackLegRedMeat = 10.0f
        ), servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 100.0f,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.2f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 60.0f,
            fitnessClubMonthlyFeeForOneAdult = 100.0f,
            tennisCourtRentOneHourOnWeekend = 40.0f,
            cinemaInternationalReleaseOneSeat = 20.0f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 500.0f,
            internationalPrimarySchoolYearlyForOneChild = 10000.0f
        ), clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 70.0f,
            oneSummerDressInAChainStoreZaraHAndM = 40.0f,
            onePairOfNikeRunningShoesMidRange = null,
            onePairOfMenLeatherBusinessShoes = 100.0f
        ), transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 2f,
            monthlyPassRegularPrice = 100.0f,
            taxiStartNormalTariff = 5.0f,
            taxi1kmNormalTariff = 2f,
            taxi1hourWaitingNormalTariff = 20.0f,
            gasolineOneLiter = 1.0f
        ), carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20000.0f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 22000.0f
        ), realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 1400f,
            apartmentOneBedroomOutsideOfCentre = 1000f,
            apartment3BedroomsInCityCentre = null,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ), averageMonthlyNetSalaryAfterTax = 4000f, dataQuality = true
    )
}
val cityIV by lazy {
    CityEntity(
        cityName = "City 4", country = "Country 1", mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 15.0f,
            mealFor2PeopleMidRangeRestaurant = 60.0f,
            mealAtMcDonaldSOrEquivalent = null
        ), drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 4.0f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2.5f,
            waterAThirdOfLiterBottleInRestaurants = 1.5f,
            milkRegularOneLiter = 1.0f,
            waterOneAndHalfLiterBottleAtTheMarket = 1.0f
        ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 2.0f,
            banana1kg = null,
            oranges1kg = 2.5f,
            tomato1kg = 2.0f,
            potato1kg = 1.0f,
            onion1kg = 1.0f,
            lettuceOneHead = 1.5f
        ), foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = null,
            riceWhite1kg = 2.0f,
            eggsRegular12 = 2.5f,
            localCheese1kg = 8.0f,
            chickenFillets1kg = 6.0f,
            beefRound1kgOrEquivalentBackLegRedMeat = null
        ), servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.2f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 25.0f,
            fitnessClubMonthlyFeeForOneAdult = 40.0f,
            tennisCourtRentOneHourOnWeekend = 20.0f,
            cinemaInternationalReleaseOneSeat = 10.0f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 500.0f,
            internationalPrimarySchoolYearlyForOneChild = 10000.0f
        ), clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 50.0f,
            oneSummerDressInAChainStoreZaraHAndM = 40.0f,
            onePairOfNikeRunningShoesMidRange = 80.0f,
            onePairOfMenLeatherBusinessShoes = 100.0f
        ), transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 1.5f,
            monthlyPassRegularPrice = 50.0f,
            taxiStartNormalTariff = null,
            taxi1kmNormalTariff = 1.5f,
            taxi1hourWaitingNormalTariff = 20.0f,
            gasolineOneLiter = 1.0f
        ), carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20000.0f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 22000.0f
        ), realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 500000f,
            apartmentOneBedroomOutsideOfCentre = 300000f,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ), averageMonthlyNetSalaryAfterTax = null, dataQuality = true
    )
}
val cityV by lazy {
    CityEntity(
        cityName = "", country = "Country 1", mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 15.0f,
            mealFor2PeopleMidRangeRestaurant = 60.0f,
            mealAtMcDonaldSOrEquivalent = null
        ), drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 4.0f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2.5f,
            waterAThirdOfLiterBottleInRestaurants = 1.5f,
            milkRegularOneLiter = 1.0f,
            waterOneAndHalfLiterBottleAtTheMarket = 1.0f
        ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 2.0f,
            banana1kg = null,
            oranges1kg = 2.5f,
            tomato1kg = 2.0f,
            potato1kg = 1.0f,
            onion1kg = 1.0f,
            lettuceOneHead = 1.5f
        ), foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = null,
            riceWhite1kg = 2.0f,
            eggsRegular12 = 2.5f,
            localCheese1kg = 8.0f,
            chickenFillets1kg = 6.0f,
            beefRound1kgOrEquivalentBackLegRedMeat = null
        ), servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.2f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 25.0f,
            fitnessClubMonthlyFeeForOneAdult = 40.0f,
            tennisCourtRentOneHourOnWeekend = 20.0f,
            cinemaInternationalReleaseOneSeat = 10.0f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 500.0f,
            internationalPrimarySchoolYearlyForOneChild = 10000.0f
        ), clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 50.0f,
            oneSummerDressInAChainStoreZaraHAndM = 40.0f,
            onePairOfNikeRunningShoesMidRange = 80.0f,
            onePairOfMenLeatherBusinessShoes = 100.0f
        ), transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 1.5f,
            monthlyPassRegularPrice = 50.0f,
            taxiStartNormalTariff = null,
            taxi1kmNormalTariff = 1.5f,
            taxi1hourWaitingNormalTariff = 20.0f,
            gasolineOneLiter = 1.0f
        ), carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20000.0f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 22000.0f
        ), realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 500000f,
            apartmentOneBedroomOutsideOfCentre = 300000f,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ), averageMonthlyNetSalaryAfterTax = null, dataQuality = true
    )
}

val cityVI by lazy {
    CityEntity(
        cityName = "City 1", country = "Country 1", mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 10.0f,
            mealFor2PeopleMidRangeRestaurant = 60.0f,
            mealAtMcDonaldSOrEquivalent = 10.0f
        ), drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 4.0f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2.5f,
            waterAThirdOfLiterBottleInRestaurants = 1.5f,
            milkRegularOneLiter = 1.0f,
            waterOneAndHalfLiterBottleAtTheMarket = 2f
        ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 2.0f,
            banana1kg = 1.5f,
            oranges1kg = 2.5f,
            tomato1kg = 2.0f,
            potato1kg = 1.0f,
            onion1kg = 1.0f,
            lettuceOneHead = 1.5f
        ), foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = 1.0f,
            riceWhite1kg = 2.0f,
            eggsRegular12 = 1f,
            localCheese1kg = 8.0f,
            chickenFillets1kg = 6.0f,
            beefRound1kgOrEquivalentBackLegRedMeat = 10.0f
        ), servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 100.0f,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.2f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 30.0f,
            fitnessClubMonthlyFeeForOneAdult = 50.0f,
            tennisCourtRentOneHourOnWeekend = 20.0f,
            cinemaInternationalReleaseOneSeat = 10.0f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 500.0f,
            internationalPrimarySchoolYearlyForOneChild = 10000.0f
        ), clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 50.0f,
            oneSummerDressInAChainStoreZaraHAndM = 40.0f,
            onePairOfNikeRunningShoesMidRange = 80.0f,
            onePairOfMenLeatherBusinessShoes = 100.0f
        ), transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 1f,
            monthlyPassRegularPrice = 50.0f,
            taxiStartNormalTariff = 5.0f,
            taxi1kmNormalTariff = 1f,
            taxi1hourWaitingNormalTariff = 20.0f,
            gasolineOneLiter = 1.0f
        ), carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20000.0f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 22000.0f
        ), realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 700f,
            apartmentOneBedroomOutsideOfCentre = 500f,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ), averageMonthlyNetSalaryAfterTax = 2000f, dataQuality = true
    )
}
val cityVII by lazy {
    CityEntity(
        cityName = "City 5", country = "Country 1", mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 15.0f,
            mealFor2PeopleMidRangeRestaurant = 60.0f,
            mealAtMcDonaldSOrEquivalent = null
        ), drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 4.0f,
            cokePepsiAThirdOfLiterBottleInRestaurants = 2.5f,
            waterAThirdOfLiterBottleInRestaurants = 1.5f,
            milkRegularOneLiter = 1.0f,
            waterOneAndHalfLiterBottleAtTheMarket = 1.0f
        ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
            apples1kg = 2.0f,
            banana1kg = null,
            oranges1kg = 2.5f,
            tomato1kg = 2.0f,
            potato1kg = 1.0f,
            onion1kg = 1.0f,
            lettuceOneHead = 1.5f
        ), foodPrices = FoodPrices(
            loafOfFreshWhiteBread500g = null,
            riceWhite1kg = 2.0f,
            eggsRegular12 = 2.5f,
            localCheese1kg = 8.0f,
            chickenFillets1kg = 6.0f,
            beefRound1kgOrEquivalentBackLegRedMeat = null
        ), servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.2f,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = 25.0f,
            fitnessClubMonthlyFeeForOneAdult = 40.0f,
            tennisCourtRentOneHourOnWeekend = 20.0f,
            cinemaInternationalReleaseOneSeat = 10.0f,
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 500.0f,
            internationalPrimarySchoolYearlyForOneChild = 10000.0f
        ), clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 50.0f,
            oneSummerDressInAChainStoreZaraHAndM = 40.0f,
            onePairOfNikeRunningShoesMidRange = 80.0f,
            onePairOfMenLeatherBusinessShoes = 100.0f
        ), transportationsPrices = TransportationsPrices(
            oneWayTicketLocalTransport = 1.5f,
            monthlyPassRegularPrice = 50.0f,
            taxiStartNormalTariff = null,
            taxi1kmNormalTariff = 1.5f,
            taxi1hourWaitingNormalTariff = 20.0f,
            gasolineOneLiter = 1.0f
        ), carsPrices = CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20000.0f,
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 22000.0f
        ), realEstatesPrices = RealEstatesPrices(
            apartmentOneBedroomInCityCentre = 500000f,
            apartmentOneBedroomOutsideOfCentre = 300000f,
            apartment3BedroomsInCityCentre = 800000f,
            apartment3BedroomsOutsideOfCentre = 500000f,
            pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
        ), averageMonthlyNetSalaryAfterTax = null, dataQuality = false
    )
}


class FakeHighQualityDataOfCityWithBestValueForMoney : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(cityI, cityII, cityIII)
    }

}

class FakeNullsDataOfCityWithBestValueForMoney : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(cityIV, cityV)
    }

}

class FakeDuplicateDataOfCityWithBestValueForMoney : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(cityI, cityIV, cityVI)
    }

}

class FakeLowQualityDataOfCityWithBestValueForMoney : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(cityVII, cityI)
    }


}