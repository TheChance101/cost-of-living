package data

import interactor.CostOfLivingDataSource
import model.*


class AverageMonthlyNetSalaryFakeData : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            CityEntity(
                cityName = "Moncks Corner",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 14.5f,
                    mealFor2PeopleMidRangeRestaurant = 40.0f,
                    mealAtMcDonaldSOrEquivalent = 7.5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.33f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 1.0f,
                    waterAThirdOfLiterBottleInRestaurants = 1.0f,
                    milkRegularOneLiter = 0.91f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.75f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.1f,
                    banana1kg = 0.1f,
                    oranges1kg = 0.1f,
                    tomato1kg = 0.1f,
                    potato1kg = 0.1f,
                    onion1kg = 0.1f,
                    lettuceOneHead = 0.1f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.2f,
                    riceWhite1kg = 2.62f,
                    eggsRegular12 = 2.17f,
                    localCheese1kg = 11.02f,
                    chickenFillets1kg = 8.8f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 15.76f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 144.92f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.0f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 67.78f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 9.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 1500.0f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 52.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 46.33f,
                    onePairOfNikeRunningShoesMidRange = 94.67f,
                    onePairOfMenLeatherBusinessShoes = 90.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 2.1f,
                    taxi1kmNormalTariff = 1.49f,
                    taxi1hourWaitingNormalTariff = 15.0f,
                    gasolineOneLiter = 0.92f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 28500.0f
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
                dataQuality = false
            ),
            CityEntity(
                cityName = "Moncks Corner",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 14.5f,
                    mealFor2PeopleMidRangeRestaurant = 40.0f,
                    mealAtMcDonaldSOrEquivalent = 7.5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.33f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 1.0f,
                    waterAThirdOfLiterBottleInRestaurants = 1.0f,
                    milkRegularOneLiter = 0.91f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.75f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.1f,
                    banana1kg = 0.1f,
                    oranges1kg = 0.1f,
                    tomato1kg = 0.1f,
                    potato1kg = 0.1f,
                    onion1kg = 0.1f,
                    lettuceOneHead = 0.1f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.2f,
                    riceWhite1kg = 2.62f,
                    eggsRegular12 = 2.17f,
                    localCheese1kg = 11.02f,
                    chickenFillets1kg = 8.8f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 15.76f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 144.92f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.0f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 67.78f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 9.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 1500.0f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 52.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 46.33f,
                    onePairOfNikeRunningShoesMidRange = 94.67f,
                    onePairOfMenLeatherBusinessShoes = 90.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 2.1f,
                    taxi1kmNormalTariff = 1.49f,
                    taxi1hourWaitingNormalTariff = 15.0f,
                    gasolineOneLiter = 0.92f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 28500.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = Float.NaN,
                dataQuality = false
            )
        )

    }
}








