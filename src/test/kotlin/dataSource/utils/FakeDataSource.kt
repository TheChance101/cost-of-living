package dataSource.utils

import interactor.CostOfLivingDataSource
import model.*

class FakeDataSource : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
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
            ), CityEntity(
                cityName = "Roseburg",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 15.0f,
                    mealFor2PeopleMidRangeRestaurant = 60.0f,
                    mealAtMcDonaldSOrEquivalent = 8.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.49f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.22f,
                    waterAThirdOfLiterBottleInRestaurants = 1.26f,
                    milkRegularOneLiter = 0.98f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.0f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 2.3f,
                    banana1kg = 0.99f,
                    oranges1kg = 2.2f,
                    tomato1kg = 1.1f,
                    potato1kg = 1.71f,
                    onion1kg = 1.62f,
                    lettuceOneHead = 1.83f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 3.04f,
                    riceWhite1kg = 2.2f,
                    eggsRegular12 = 1.69f,
                    localCheese1kg = 12.9f,
                    chickenFillets1kg = 16.17f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 12.49f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 100.0f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.25f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 55.0f,
                    fitnessClubMonthlyFeeForOneAdult = 50.0f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 12.5f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 921.42f,
                    internationalPrimarySchoolYearlyForOneChild = 8950.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 41.67f,
                    oneSummerDressInAChainStoreZaraHAndM = 25.0f,
                    onePairOfNikeRunningShoesMidRange = 63.33f,
                    onePairOfMenLeatherBusinessShoes = 50.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 2.0f,
                    monthlyPassRegularPrice = 20.0f,
                    taxiStartNormalTariff = 3.0f,
                    taxi1kmNormalTariff = 1.86f,
                    taxi1hourWaitingNormalTariff = 15.0f,
                    gasolineOneLiter = 1.36f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20000.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 22328.2f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 1300.0f,
                    apartmentOneBedroomOutsideOfCentre = 1475.0f,
                    apartment3BedroomsInCityCentre = 2350.0f,
                    apartment3BedroomsOutsideOfCentre = 2625.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 1883.68f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1614.59f
                ),
                averageMonthlyNetSalaryAfterTax = 1200.0f,
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
            ), CityEntity(
                cityName = "Chetumal",
                country = "Mexico",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 12.56f,
                    mealFor2PeopleMidRangeRestaurant = 23.21f,
                    mealAtMcDonaldSOrEquivalent = 5.06f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 2.84f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.71f,
                    waterAThirdOfLiterBottleInRestaurants = 0.61f,
                    milkRegularOneLiter = 0.89f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.72f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 2.84f,
                    banana1kg = 1.03f,
                    oranges1kg = 1.37f,
                    tomato1kg = 1.55f,
                    potato1kg = 1.42f,
                    onion1kg = 1.03f,
                    lettuceOneHead = 0.93f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.55f,
                    riceWhite1kg = 1.16f,
                    eggsRegular12 = 1.5f,
                    localCheese1kg = 4.13f,
                    chickenFillets1kg = 4.38f,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 99.25f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.26f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 27.21f,
                    fitnessClubMonthlyFeeForOneAdult = 18.05f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 3.09f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 61.88f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 41.26f,
                    oneSummerDressInAChainStoreZaraHAndM = 36.1f,
                    onePairOfNikeRunningShoesMidRange = 77.35f,
                    onePairOfMenLeatherBusinessShoes = 51.57f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.57f,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 1.24f,
                    taxi1kmNormalTariff = 1.29f,
                    taxi1hourWaitingNormalTariff = 3.48f,
                    gasolineOneLiter = 1.11f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 21246.42f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 16759.92f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 198.49f,
                    apartmentOneBedroomOutsideOfCentre = 126.98f,
                    apartment3BedroomsInCityCentre = 398.77f,
                    apartment3BedroomsOutsideOfCentre = 326.44f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 626.31f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 309.41f
                ),
                averageMonthlyNetSalaryAfterTax = 257.84f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Kuysinjaq",
                country = "Iraq",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 2.06f,
                    mealFor2PeopleMidRangeRestaurant = 10.96f,
                    mealAtMcDonaldSOrEquivalent = null
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.37f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.34f,
                    waterAThirdOfLiterBottleInRestaurants = 0.17f,
                    milkRegularOneLiter = 1.03f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.34f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.69f,
                    banana1kg = 1.03f,
                    oranges1kg = 1.03f,
                    tomato1kg = 0.51f,
                    potato1kg = 0.51f,
                    onion1kg = 0.51f,
                    lettuceOneHead = 0.34f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.69f,
                    riceWhite1kg = 1.03f,
                    eggsRegular12 = 1.37f,
                    localCheese1kg = 6.85f,
                    chickenFillets1kg = 3.43f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 8.22f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.06f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 34.26f,
                    fitnessClubMonthlyFeeForOneAdult = 13.7f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 10.28f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 57.1f,
                    internationalPrimarySchoolYearlyForOneChild = 1027.75f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 13.7f,
                    oneSummerDressInAChainStoreZaraHAndM = 17.13f,
                    onePairOfNikeRunningShoesMidRange = null,
                    onePairOfMenLeatherBusinessShoes = 17.13f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 1.37f,
                    taxi1kmNormalTariff = 0.69f,
                    taxi1hourWaitingNormalTariff = 3.43f,
                    gasolineOneLiter = 0.62f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 16444.04f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 137.03f,
                    apartmentOneBedroomOutsideOfCentre = 102.78f,
                    apartment3BedroomsInCityCentre = 205.55f,
                    apartment3BedroomsOutsideOfCentre = 171.29f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 342.58f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 137.03f
                ),
                averageMonthlyNetSalaryAfterTax = 411.1f,
                dataQuality = false
            )
        )
    }
}


class FakeDataSourceM : CostOfLivingDataSource {
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
                averageMonthlyNetSalaryAfterTax = 18f,
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
                averageMonthlyNetSalaryAfterTax = 25.0f,
                dataQuality = false
            )
        )
    }
}
