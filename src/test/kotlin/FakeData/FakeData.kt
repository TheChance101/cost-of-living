package FakeData

import interactor.CostOfLivingDataSource
import model.*
class FakeData : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        val listData = mutableListOf<CityEntity>()
        listData.add(
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
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = 180.2f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 320.76f,
                ),
                averageMonthlyNetSalaryAfterTax = 18.0f,
                dataQuality = true
            )
        )
        listData.add(
            CityEntity(
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
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2000.0f,
                    apartment3BedroomsOutsideOfCentre = 170.2f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 365.76f,
                ),
                averageMonthlyNetSalaryAfterTax = 50.24f,
                dataQuality = false
            )
        )
        listData.add(
            CityEntity(
                cityName = "Tanta",
                country = "Egypt",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 4.07f,
                    mealFor2PeopleMidRangeRestaurant = 14.24f,
                    mealAtMcDonaldSOrEquivalent = 2.85f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.15f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.27f,
                    waterAThirdOfLiterBottleInRestaurants = 0.16f,
                    milkRegularOneLiter = 0.73f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.23f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.75f,
                    banana1kg = 0.5f,
                    oranges1kg = 0.26f,
                    tomato1kg = 0.53f,
                    potato1kg = 0.37f,
                    onion1kg = 0.37f,
                    lettuceOneHead = 0.16f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.33f,
                    riceWhite1kg = 0.5f,
                    eggsRegular12 = 1.08f,
                    localCheese1kg = 2.4f,
                    chickenFillets1kg = 2.65f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6.31f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 20.35f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 9.77f,
                    fitnessClubMonthlyFeeForOneAdult = 10.17f,
                    tennisCourtRentOneHourOnWeekend = 5.6f,
                    cinemaInternationalReleaseOneSeat = 3.66f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 50.87f,
                    internationalPrimarySchoolYearlyForOneChild = 1078.49f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 14.24f,
                    oneSummerDressInAChainStoreZaraHAndM = 32.05f,
                    onePairOfNikeRunningShoesMidRange = 89.54f,
                    onePairOfMenLeatherBusinessShoes = 28.49f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.12f,
                    monthlyPassRegularPrice = 1.02f,
                    taxiStartNormalTariff = 0.41f,
                    taxi1kmNormalTariff = 0.2f,
                    taxi1hourWaitingNormalTariff = 0.73f,
                    gasolineOneLiter = 0.38f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20348.95f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 16228.29f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 156.01f,
                    apartmentOneBedroomOutsideOfCentre = 71.22f,
                    apartment3BedroomsInCityCentre = 196.71f,
                    apartment3BedroomsOutsideOfCentre = 150.2f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 335.76f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 335.76f
                ),
                averageMonthlyNetSalaryAfterTax = 101.74f,
                dataQuality = true
            )
        )
        return listData
    }
}
