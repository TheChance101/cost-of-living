package dataSource.utilis

import interactor.CostOfLivingDataSource
import model.*

class FakeData : CostOfLivingDataSource {
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
                averageMonthlyNetSalaryAfterTax = Float.NaN,
                dataQuality = false
            ),


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


            CityEntity(
                cityName = "Pearl City",
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
                    oranges1kg = null,
                    tomato1kg = 2.43f,
                    potato1kg = null,
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
                    apples1kg = 4.86f,
                    banana1kg = 1.64f,
                    oranges1kg = 4.32f,
                    tomato1kg = 4.36f,
                    potato1kg = 2.17f,
                    onion1kg = 2.4f,
                    lettuceOneHead = 1.67f
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


            CityEntity(
                cityName = "Vryheid",
                country = "South Africa",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = null,
                    mealFor2PeopleMidRangeRestaurant = null,
                    mealAtMcDonaldSOrEquivalent = null
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = null,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants = null,
                    milkRegularOneLiter = 1.94f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.03f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 1.14f,
                    banana1kg = 1.71f,
                    oranges1kg = 0.97f,
                    tomato1kg = 1.31f,
                    potato1kg = 0.91f,
                    onion1kg = 1.08f,
                    lettuceOneHead = 1.08f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.93f,
                    riceWhite1kg = 3.71f,
                    eggsRegular12 = 2.51f,
                    localCheese1kg = 8.05f,
                    chickenFillets1kg = 3.82f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 5.7f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 114.05f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 68.43f,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = null,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 256.62f,
                    internationalPrimarySchoolYearlyForOneChild = 1140.54f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 56.97f,
                    oneSummerDressInAChainStoreZaraHAndM = 42.71f,
                    onePairOfNikeRunningShoesMidRange = 102.65f,
                    onePairOfMenLeatherBusinessShoes = 116.28f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 0.6f,
                    taxi1kmNormalTariff = null,
                    taxi1hourWaitingNormalTariff = 3.99f,
                    gasolineOneLiter = 1.49f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 17672.6f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 23586.27f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 324f,
                dataQuality = false
            ),


            CityEntity(
                cityName = "Mortsel",
                country = "Belgium",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 23.18f,
                    mealFor2PeopleMidRangeRestaurant = 73.76f,
                    mealAtMcDonaldSOrEquivalent = 11.85f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 2.74f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.11f,
                    waterAThirdOfLiterBottleInRestaurants = 2.46f,
                    milkRegularOneLiter = 0.83f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.46f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 2.02f,
                    banana1kg = 1.55f,
                    oranges1kg = 1.48f,
                    tomato1kg = 2.51f,
                    potato1kg = 0.95f,
                    onion1kg = 1.58f,
                    lettuceOneHead = 0.95f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.88f,
                    riceWhite1kg = 1.48f,
                    eggsRegular12 = 2.25f,
                    localCheese1kg = 10.71f,
                    chickenFillets1kg = 7.38f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 14.01f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 180.01f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.26f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 68.49f,
                    fitnessClubMonthlyFeeForOneAdult = 31.6f,
                    tennisCourtRentOneHourOnWeekend = 15.81f,
                    cinemaInternationalReleaseOneSeat = 13.01f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 1580.62f,
                    internationalPrimarySchoolYearlyForOneChild = 13171.82f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 79.03f,
                    oneSummerDressInAChainStoreZaraHAndM = 36.88f,
                    onePairOfNikeRunningShoesMidRange = 94.84f,
                    onePairOfMenLeatherBusinessShoes = 105.37f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 2.63f,
                    monthlyPassRegularPrice = 51.63f,
                    taxiStartNormalTariff = 5.27f,
                    taxi1kmNormalTariff = 2.37f,
                    taxi1hourWaitingNormalTariff = 31.61f,
                    gasolineOneLiter = 2.08f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 15279.31f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 15279.31f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 790.31f,
                    apartmentOneBedroomOutsideOfCentre = 737.62f,
                    apartment3BedroomsInCityCentre = 1475.24f,
                    apartment3BedroomsOutsideOfCentre = 1159.12f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 2528.99f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 2212.86f
                ),
                averageMonthlyNetSalaryAfterTax = 31f,
                dataQuality = false
            ),


            CityEntity(
                cityName = "Ridgecrest",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 20.0f,
                    mealFor2PeopleMidRangeRestaurant = 40.0f,
                    mealAtMcDonaldSOrEquivalent = 8.0f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 4.67f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.67f,
                    waterAThirdOfLiterBottleInRestaurants = 1.47f,
                    milkRegularOneLiter = 1.11f,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.5f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 5.0f,
                    banana1kg = 1.8f,
                    oranges1kg = 4.29f,
                    tomato1kg = 5.68f,
                    potato1kg = 2.64f,
                    onion1kg = 2.16f,
                    lettuceOneHead = 1.81f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 3.37f,
                    riceWhite1kg = 4.41f,
                    eggsRegular12 = 3.22f,
                    localCheese1kg = 6.61f,
                    chickenFillets1kg = 10.28f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 15.98f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 157.63f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.26f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 68.6f,
                    fitnessClubMonthlyFeeForOneAdult = 30.0f,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 18.0f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 1466.67f,
                    internationalPrimarySchoolYearlyForOneChild = 27500.0f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 51.85f,
                    oneSummerDressInAChainStoreZaraHAndM = 33.33f,
                    onePairOfNikeRunningShoesMidRange = 87.5f,
                    onePairOfMenLeatherBusinessShoes = 134.29f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 3.5f,
                    taxi1kmNormalTariff = 1.71f,
                    taxi1hourWaitingNormalTariff = 65.0f,
                    gasolineOneLiter = 1.68f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 23292.0f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 22741.5f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 1000.0f,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 14f,
                dataQuality = false
            )

        )
    }
}
