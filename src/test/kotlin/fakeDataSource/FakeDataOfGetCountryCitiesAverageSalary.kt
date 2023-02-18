package fakeDataSource

import interactor.CostOfLivingDataSource
import model.*


class FakeDataOfGetCountryCitiesAverageSalary : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            CityEntity(
                cityName = "Asheville", country = "Sri Lanka",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.36f,
                    mealFor2PeopleMidRangeRestaurant = 10.85f,
                    mealAtMcDonaldSOrEquivalent = 3.25f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.46f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.35f,
                    waterAThirdOfLiterBottleInRestaurants = 0.18f,
                    milkRegularOneLiter = 1.15f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.4f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.27f,
                    banana1kg = 0.76f,
                    oranges1kg = 3.18f,
                    tomato1kg = 1.42f,
                    potato1kg = 1.02f,
                    onion1kg = 0.74f,
                    lettuceOneHead = 0.83f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.64f,
                    riceWhite1kg = 0.66f,
                    eggsRegular12 = 1.77f,
                    localCheese1kg = 7.4f,
                    chickenFillets1kg = 4.03f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 5.89f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 23.56f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 9.61f,
                    fitnessClubMonthlyFeeForOneAdult = 9.43f,
                    tennisCourtRentOneHourOnWeekend = 3.73f,
                    cinemaInternationalReleaseOneSeat = 2.37f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 26.55f,
                    internationalPrimarySchoolYearlyForOneChild = 425.77f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 20.59f,
                    oneSummerDressInAChainStoreZaraHAndM = 12.77f,
                    onePairOfNikeRunningShoesMidRange = 44.42f,
                    onePairOfMenLeatherBusinessShoes = 24.71f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.11f,
                    monthlyPassRegularPrice = 4.07f,
                    taxiStartNormalTariff = 0.27f,
                    taxi1kmNormalTariff = 0.27f,
                    taxi1hourWaitingNormalTariff = 0.49f,
                    gasolineOneLiter = 1.17f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 24406.97f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 28672.95f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 295.76f,
                    apartmentOneBedroomOutsideOfCentre = 109.14f,
                    apartment3BedroomsInCityCentre = 549.78f,
                    apartment3BedroomsOutsideOfCentre = 221.96f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 1734.36f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 430.56f
                ),
                averageMonthlyNetSalaryAfterTax = 3400.0f, dataQuality = true
            ),
            CityEntity(
                cityName = "Augusta", country = "Sri Lanka",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.36f,
                    mealFor2PeopleMidRangeRestaurant = 10.85f,
                    mealAtMcDonaldSOrEquivalent = 3.25f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.46f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.35f,
                    waterAThirdOfLiterBottleInRestaurants = 0.18f,
                    milkRegularOneLiter = 1.15f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.4f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.27f,
                    banana1kg = 0.76f,
                    oranges1kg = 3.18f,
                    tomato1kg = 1.42f,
                    potato1kg = 1.02f,
                    onion1kg = 0.74f,
                    lettuceOneHead = 0.83f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.64f,
                    riceWhite1kg = 0.66f,
                    eggsRegular12 = 1.77f,
                    localCheese1kg = 7.4f,
                    chickenFillets1kg = 4.03f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 5.89f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 23.56f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 9.61f,
                    fitnessClubMonthlyFeeForOneAdult = 9.43f,
                    tennisCourtRentOneHourOnWeekend = 3.73f,
                    cinemaInternationalReleaseOneSeat = 2.37f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 26.55f,
                    internationalPrimarySchoolYearlyForOneChild = 425.77f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 20.59f,
                    oneSummerDressInAChainStoreZaraHAndM = 12.77f,
                    onePairOfNikeRunningShoesMidRange = 44.42f,
                    onePairOfMenLeatherBusinessShoes = 24.71f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.11f,
                    monthlyPassRegularPrice = 4.07f,
                    taxiStartNormalTariff = 0.27f,
                    taxi1kmNormalTariff = 0.27f,
                    taxi1hourWaitingNormalTariff = 0.49f,
                    gasolineOneLiter = 1.17f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 24406.97f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 28672.95f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 295.76f,
                    apartmentOneBedroomOutsideOfCentre = 109.14f,
                    apartment3BedroomsInCityCentre = 549.78f,
                    apartment3BedroomsOutsideOfCentre = 221.96f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 1734.36f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 430.56f
                ),
                averageMonthlyNetSalaryAfterTax = 900.0f, dataQuality = true
            ),
            CityEntity(
                cityName = "Santa Clara", country = "Cuba",
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
                    banana1kg = 1.0f,
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
                ), averageMonthlyNetSalaryAfterTax = 25.0f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Havana", country = "Cuba",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 10.0f,
                    mealFor2PeopleMidRangeRestaurant = 40.0f,
                    mealAtMcDonaldSOrEquivalent = 7.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.91f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.28f,
                    waterAThirdOfLiterBottleInRestaurants = 1.63f,
                    milkRegularOneLiter = 3.52f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.98f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 6.24f,
                    banana1kg = 1.1f,
                    oranges1kg = 1.12f,
                    tomato1kg = 2.05f,
                    potato1kg = 1.82f,
                    onion1kg = 2.34f,
                    lettuceOneHead = 0.86f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.18f,
                    riceWhite1kg = 1.85f,
                    eggsRegular12 = 1.64f,
                    localCheese1kg = 4.85f,
                    chickenFillets1kg = 6.07f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 11.59f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 37.14f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.26f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 165.0f,
                    fitnessClubMonthlyFeeForOneAdult = 16.67f,
                    tennisCourtRentOneHourOnWeekend = 13.75f,
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
                    oneWayTicketLocalTransport = 0.1f,
                    monthlyPassRegularPrice = 20.0f,
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
                    apartmentOneBedroomInCityCentre = 532.86f,
                    apartmentOneBedroomOutsideOfCentre = 222.5f,
                    apartment3BedroomsInCityCentre = 1625.0f,
                    apartment3BedroomsOutsideOfCentre = 730.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 490.89f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 268.23f
                ), averageMonthlyNetSalaryAfterTax = 35.75f, dataQuality = true
            ),

            )

    }

}