package data

import interactor.CostOfLivingDataSource
import model.*


class FruitsAndVegetablesFakeData : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(

            // region City 1
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
            ),
            // endregion

            // region City 2
            CityEntity(
                cityName = "Keller",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 30.0f,
                    mealFor2PeopleMidRangeRestaurant = 75.0f,
                    mealAtMcDonaldSOrEquivalent = 7.5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 5.33f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 1.8f,
                    waterAThirdOfLiterBottleInRestaurants = 1.17f,
                    milkRegularOneLiter = 0.88f,
                    waterOneAndHalfLiterBottleAtTheMarket = 3.0f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.13f,
                    banana1kg = 1.33f,
                    oranges1kg = 5.75f,
                    tomato1kg = 6.03f,
                    potato1kg = 4.05f,
                    onion1kg = 3.36f,
                    lettuceOneHead = 1.59f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.84f,
                    riceWhite1kg = 3.98f,
                    eggsRegular12 = 3.0f,
                    localCheese1kg = 15.08f,
                    chickenFillets1kg = 7.61f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 18.7f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 210.09f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 67.8f,
                    fitnessClubMonthlyFeeForOneAdult = 39.0f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 9.5f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 1125.0f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 47.5f,
                    oneSummerDressInAChainStoreZaraHAndM = 26.0f,
                    onePairOfNikeRunningShoesMidRange = 92.5f,
                    onePairOfMenLeatherBusinessShoes = 200.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 3.12f,
                    taxi1kmNormalTariff = 1.12f,
                    taxi1hourWaitingNormalTariff = 18.0f,
                    gasolineOneLiter = 0.99f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 29880.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 20425.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 1521.67f,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = 3200.0f,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 13.5f,
                dataQuality = false
            ),
            // endregion

            // region City 3
            CityEntity(
                cityName = "Malden",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = null,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = 7.5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.5f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants = 2.0f,
                    milkRegularOneLiter = null,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.33f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.92f,
                    banana1kg = 2.0f,
                    oranges1kg = 6.61f,
                    tomato1kg = 5.51f,
                    potato1kg = 5.51f,
                    onion1kg = 4.4f,
                    lettuceOneHead = 2.03f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = 6.17f,
                    eggsRegular12 = null,
                    localCheese1kg = 9.92f,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 221.47f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 67.8f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 12.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    internationalPrimarySchoolYearlyForOneChild = 5000.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 51.66f,
                    oneSummerDressInAChainStoreZaraHAndM = 50.0f,
                    onePairOfNikeRunningShoesMidRange = 69.99f,
                    onePairOfMenLeatherBusinessShoes = 104.67f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 2.5f,
                    monthlyPassRegularPrice = 84.0f,
                    taxiStartNormalTariff = null,
                    taxi1kmNormalTariff = null,
                    taxi1hourWaitingNormalTariff = null,
                    gasolineOneLiter = null
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 20000.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 10763.91f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 6458.35f
                ),
                averageMonthlyNetSalaryAfterTax = 14.9f,
                dataQuality = false
            ),
            // endregion

            // region City 4
            CityEntity(
                cityName = "Pearl",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = null,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = 10.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 5.25f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants = 1.44f,
                    milkRegularOneLiter = 2.38f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.08f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 5.91f,
                    banana1kg = 3.84f,
                    oranges1kg = 7.02f,
                    tomato1kg = 5.94f,
                    potato1kg = 4.95f,
                    onion1kg = 4.44f,
                    lettuceOneHead = 2.74f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 4.41f,
                    riceWhite1kg = 7.33f,
                    eggsRegular12 = null,
                    localCheese1kg = 12.13f,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = 26.46f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 251.16f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 68.12f,
                    fitnessClubMonthlyFeeForOneAdult = 60.0f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = null,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 47.55f,
                    oneSummerDressInAChainStoreZaraHAndM = 35.87f,
                    onePairOfNikeRunningShoesMidRange = 79.29f,
                    onePairOfMenLeatherBusinessShoes = null
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = null,
                    taxi1kmNormalTariff = null,
                    taxi1hourWaitingNormalTariff = null,
                    gasolineOneLiter = null
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 21105.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 2000.0f,
                    apartmentOneBedroomOutsideOfCentre = 1750.0f,
                    apartment3BedroomsInCityCentre = 5000.0f,
                    apartment3BedroomsOutsideOfCentre = 4750.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 12.0f,
                dataQuality = false
            ),

            // endregion

            // region City 5
            CityEntity(
                cityName = "Clayton",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 10.0f,
                    mealFor2PeopleMidRangeRestaurant = 32.0f,
                    mealAtMcDonaldSOrEquivalent = 6.85f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.0f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants = 1.29f,
                    milkRegularOneLiter = 0.86f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.79f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 2.65f,
                    banana1kg = 1.34f,
                    oranges1kg = 1.2f,
                    tomato1kg = 2.43f,
                    potato1kg = 43f,
                    onion1kg = 1.94f,
                    lettuceOneHead = 1.5f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.48f,
                    riceWhite1kg = null,
                    eggsRegular12 = 2.4f,
                    localCheese1kg = null,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = 12.13f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 132.0f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 68.33f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 11.25f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = null,
                    oneSummerDressInAChainStoreZaraHAndM = null,
                    onePairOfNikeRunningShoesMidRange = 70.0f,
                    onePairOfMenLeatherBusinessShoes = null
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = null,
                    taxi1kmNormalTariff = null,
                    taxi1hourWaitingNormalTariff = null,
                    gasolineOneLiter = 1.07f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 22000.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = 1300.0f,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 2690.98f
                ),
                averageMonthlyNetSalaryAfterTax = 500f,
                dataQuality = false
            ),

            // endregion

            // region City 6
            CityEntity(
                cityName = "Brevard",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 15.0f,
                    mealFor2PeopleMidRangeRestaurant = 45.0f,
                    mealAtMcDonaldSOrEquivalent = 7.75f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.79f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 1.5f,
                    waterAThirdOfLiterBottleInRestaurants = 1.79f,
                    milkRegularOneLiter = 2.07f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.92f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 3.72f,
                    banana1kg = 1.26f,
                    oranges1kg = 4.23f,
                    tomato1kg = 5.49f,
                    potato1kg = 4.35f,
                    onion1kg = 3.17f,
                    lettuceOneHead = 2.22f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.6f,
                    riceWhite1kg = 3.56f,
                    eggsRegular12 = 2.59f,
                    localCheese1kg = 14.7f,
                    chickenFillets1kg = 11.02f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 13.0f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 118.5f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 68.33f,
                    fitnessClubMonthlyFeeForOneAdult = 60.0f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 10.69f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 54.5f,
                    oneSummerDressInAChainStoreZaraHAndM = 50.5f,
                    onePairOfNikeRunningShoesMidRange = 78.33f,
                    onePairOfMenLeatherBusinessShoes = 141.67f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = null,
                    taxi1kmNormalTariff = null,
                    taxi1hourWaitingNormalTariff = null,
                    gasolineOneLiter = 1.11f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 23750.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 1300.0f,
                    apartmentOneBedroomOutsideOfCentre = 975.0f,
                    apartment3BedroomsInCityCentre = 1700.0f,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 600f,
                dataQuality = false
            ),
            // endregion

            // region City 7
            CityEntity(
                cityName = "Woodlawn",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 11.0f,
                    mealFor2PeopleMidRangeRestaurant = 60.0f,
                    mealAtMcDonaldSOrEquivalent = 8.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 3.2f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.33f,
                    waterAThirdOfLiterBottleInRestaurants = 1.5f,
                    milkRegularOneLiter = 1.1f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.85f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.03f,
                    banana1kg = 1.57f,
                    oranges1kg = 4.65f,
                    tomato1kg = 3.64f,
                    potato1kg = 2.69f,
                    onion1kg = 2.2f,
                    lettuceOneHead = 1.73f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.74f,
                    riceWhite1kg = 3.38f,
                    eggsRegular12 = 1.79f,
                    localCheese1kg = 7.27f,
                    chickenFillets1kg = 4.39f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 11.02f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 122.31f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.03f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 68.33f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 13.25f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 800.0f,
                    internationalPrimarySchoolYearlyForOneChild = 5000.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 46.5f,
                    oneSummerDressInAChainStoreZaraHAndM = 26.25f,
                    onePairOfNikeRunningShoesMidRange = 59.6f,
                    onePairOfMenLeatherBusinessShoes = 76.67f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 2.0f,
                    taxi1kmNormalTariff = 1.23f,
                    taxi1hourWaitingNormalTariff = 20.0f,
                    gasolineOneLiter = 1.16f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 25500.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 23666.67f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 1000f,
                dataQuality = false
            ),
            // endregion

            // region City 8
            CityEntity(
                cityName = "Brookdale",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = null,
                    mealFor2PeopleMidRangeRestaurant = 50.0f,
                    mealAtMcDonaldSOrEquivalent = 8.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 5.0f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants = 1.27f,
                    milkRegularOneLiter = null,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.87f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.4f,
                    banana1kg = 1.97f,
                    oranges1kg = 2.85f,
                    tomato1kg = 2.58f,
                    potato1kg = 1.42f,
                    onion1kg = 1.96f,
                    lettuceOneHead = 1.5f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = 5.5f,
                    eggsRegular12 = null,
                    localCheese1kg = 12.0f,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 158.47f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 68.33f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 11.75f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 45.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 37.5f,
                    onePairOfNikeRunningShoesMidRange = 65.0f,
                    onePairOfMenLeatherBusinessShoes = 95.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = null,
                    taxi1kmNormalTariff = null,
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
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2690.98f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 2690.98f
                ),
                averageMonthlyNetSalaryAfterTax = 1000f,
                dataQuality = false
            ),

            // endregion

            // region City 9
            CityEntity(
                cityName = "Christiansburg",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 13.0f,
                    mealFor2PeopleMidRangeRestaurant = 45.0f,
                    mealAtMcDonaldSOrEquivalent = 7.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 3.77f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.0f,
                    waterAThirdOfLiterBottleInRestaurants = 1.34f,
                    milkRegularOneLiter = 0.91f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.08f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.55f,
                    banana1kg = 2.7f,
                    oranges1kg = 4.62f,
                    tomato1kg = 3.04f,
                    potato1kg = 1.76f,
                    onion1kg = 2.89f,
                    lettuceOneHead = 1.65f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 3.64f,
                    riceWhite1kg = 4.09f,
                    eggsRegular12 = 2.5f,
                    localCheese1kg = 10.71f,
                    chickenFillets1kg = 11.76f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 13.04f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 162.37f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.22f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 68.37f,
                    fitnessClubMonthlyFeeForOneAdult = 15.0f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 12.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    internationalPrimarySchoolYearlyForOneChild = 35000.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 35.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 31.99f,
                    onePairOfNikeRunningShoesMidRange = 71.25f,
                    onePairOfMenLeatherBusinessShoes = 120.71f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 1.75f,
                    monthlyPassRegularPrice = 28.0f,
                    taxiStartNormalTariff = 2.5f,
                    taxi1kmNormalTariff = 1.09f,
                    taxi1hourWaitingNormalTariff = null,
                    gasolineOneLiter = 1.15f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 23500.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 23000.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = 800.0f,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 3000f,
                dataQuality = false
            ),

            // endregion

            // region City 10
            CityEntity(
                cityName = "Kernersville",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 15.0f,
                    mealFor2PeopleMidRangeRestaurant = 60.0f,
                    mealAtMcDonaldSOrEquivalent = 7.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 3.77f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.0f,
                    waterAThirdOfLiterBottleInRestaurants = 1.34f,
                    milkRegularOneLiter = 0.89f,
                    waterOneAndHalfLiterBottleAtTheMarket = 2.0f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.92f,
                    banana1kg = 1.63f,
                    oranges1kg = 4.62f,
                    tomato1kg = 3.95f,
                    potato1kg = 2.99f,
                    onion1kg = 2.78f,
                    lettuceOneHead = 1.5f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.99f,
                    riceWhite1kg = 4.09f,
                    eggsRegular12 = 2.5f,
                    localCheese1kg = 8.07f,
                    chickenFillets1kg = 11.76f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 13.65f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 149.11f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.22f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 68.37f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 12.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 975.0f,
                    internationalPrimarySchoolYearlyForOneChild = 15125.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 40.75f,
                    oneSummerDressInAChainStoreZaraHAndM = 31.99f,
                    onePairOfNikeRunningShoesMidRange = 71.25f,
                    onePairOfMenLeatherBusinessShoes = 91.0f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 2.5f,
                    taxi1kmNormalTariff = 1.09f,
                    taxi1hourWaitingNormalTariff = 30.0f,
                    gasolineOneLiter = 1.15f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 23500.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 23166.67f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 23f,
                dataQuality = false
            ),
            // endregion

            // region City 11
            CityEntity(
                cityName = "Airway Heights",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 15.0f,
                    mealFor2PeopleMidRangeRestaurant = 77.5f,
                    mealAtMcDonaldSOrEquivalent = 10.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 5.17f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.86f,
                    waterAThirdOfLiterBottleInRestaurants = 2.0f,
                    milkRegularOneLiter = 0.79f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.7f
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
                    loafOfFreshWhiteBread500g = 2.76f,
                    riceWhite1kg = 3.93f,
                    eggsRegular12 = 2.0f,
                    localCheese1kg = 12.61f,
                    chickenFillets1kg = 10.93f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 13.21f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 225.31f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.06f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 68.4f,
                    fitnessClubMonthlyFeeForOneAdult = 65.0f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 13.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 300.0f,
                    internationalPrimarySchoolYearlyForOneChild = 19750.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 47.71f,
                    oneSummerDressInAChainStoreZaraHAndM = 36.67f,
                    onePairOfNikeRunningShoesMidRange = 86.86f,
                    onePairOfMenLeatherBusinessShoes = 94.57f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 3.0f,
                    monthlyPassRegularPrice = 60.0f,
                    taxiStartNormalTariff = 5.0f,
                    taxi1kmNormalTariff = 1.15f,
                    taxi1hourWaitingNormalTariff = 35.0f,
                    gasolineOneLiter = 1.27f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 18597.5f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 17300.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 1300.0f,
                    apartmentOneBedroomOutsideOfCentre = 1300.0f,
                    apartment3BedroomsInCityCentre = 1800.0f,
                    apartment3BedroomsOutsideOfCentre = 1800.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 6070.85f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 4886.82f
                ),
                averageMonthlyNetSalaryAfterTax = 13f,
                dataQuality = false
            ),
            // endregion

            // region City 12
            CityEntity(
                cityName = "Airway Heights",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 15.0f,
                    mealFor2PeopleMidRangeRestaurant = 77.5f,
                    mealAtMcDonaldSOrEquivalent = 10.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 5.17f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.86f,
                    waterAThirdOfLiterBottleInRestaurants = 2.0f,
                    milkRegularOneLiter = 0.79f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.7f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 12.0f,
                    banana1kg = 24f,
                    oranges1kg = 34f,
                    tomato1kg = 23f,
                    potato1kg = 53f,
                    onion1kg = 42f,
                    lettuceOneHead = 53f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.76f,
                    riceWhite1kg = 3.93f,
                    eggsRegular12 = 2.0f,
                    localCheese1kg = 12.61f,
                    chickenFillets1kg = 10.93f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 13.21f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 225.31f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.06f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 68.4f,
                    fitnessClubMonthlyFeeForOneAdult = 65.0f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 13.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 300.0f,
                    internationalPrimarySchoolYearlyForOneChild = 19750.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 47.71f,
                    oneSummerDressInAChainStoreZaraHAndM = 36.67f,
                    onePairOfNikeRunningShoesMidRange = 86.86f,
                    onePairOfMenLeatherBusinessShoes = 94.57f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 3.0f,
                    monthlyPassRegularPrice = 60.0f,
                    taxiStartNormalTariff = 5.0f,
                    taxi1kmNormalTariff = 1.15f,
                    taxi1hourWaitingNormalTariff = 35.0f,
                    gasolineOneLiter = 1.27f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 18597.5f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 17300.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 1300.0f,
                    apartmentOneBedroomOutsideOfCentre = 1300.0f,
                    apartment3BedroomsInCityCentre = 1800.0f,
                    apartment3BedroomsOutsideOfCentre = 1800.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 6070.85f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 4886.82f
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = false
            ),
            // endregion

            // region City 13
            CityEntity(
                cityName = "Airway Heights",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 15.0f,
                    mealFor2PeopleMidRangeRestaurant = 77.5f,
                    mealAtMcDonaldSOrEquivalent = 10.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 5.17f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.86f,
                    waterAThirdOfLiterBottleInRestaurants = 2.0f,
                    milkRegularOneLiter = 0.79f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.7f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0f,
                    banana1kg = 0f,
                    oranges1kg = 0f,
                    tomato1kg = 0f,
                    potato1kg = 0f,
                    onion1kg = 0f,
                    lettuceOneHead = 0f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 2.76f,
                    riceWhite1kg = 3.93f,
                    eggsRegular12 = 2.0f,
                    localCheese1kg = 12.61f,
                    chickenFillets1kg = 10.93f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 13.21f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 225.31f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.06f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 68.4f,
                    fitnessClubMonthlyFeeForOneAdult = 65.0f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 13.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 300.0f,
                    internationalPrimarySchoolYearlyForOneChild = 19750.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 47.71f,
                    oneSummerDressInAChainStoreZaraHAndM = 36.67f,
                    onePairOfNikeRunningShoesMidRange = 86.86f,
                    onePairOfMenLeatherBusinessShoes = 94.57f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 3.0f,
                    monthlyPassRegularPrice = 60.0f,
                    taxiStartNormalTariff = 5.0f,
                    taxi1kmNormalTariff = 1.15f,
                    taxi1hourWaitingNormalTariff = 35.0f,
                    gasolineOneLiter = 1.27f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 18597.5f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 17300.0f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 1300.0f,
                    apartmentOneBedroomOutsideOfCentre = 1300.0f,
                    apartment3BedroomsInCityCentre = 1800.0f,
                    apartment3BedroomsOutsideOfCentre = 1800.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 6070.85f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 4886.82f
                ),
                averageMonthlyNetSalaryAfterTax = 0f,
                dataQuality = false
            )
            // endregion
        )
    }
}








