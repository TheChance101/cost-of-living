package dataSource

import interactor.CostOfLivingDataSource
import model.*

enum class TestCase {
    AverageFruitAndVegetables, ManagerExpectations, BananaCheapest, CostlierCity
}


class FakeDataSource : CostOfLivingDataSource {


    fun changeDataSource(state: TestCase) {
        dataSource = when (state) {
            TestCase.ManagerExpectations -> managerExpectations
            TestCase.AverageFruitAndVegetables -> averageFruitAndVegetables
            TestCase.BananaCheapest -> bananaCheapest
            TestCase.CostlierCity -> costlierCity
        }
    }

    override fun getAllCitiesData(): List<CityEntity> {
        return dataSource
    }

    private companion object {
        val fake = listOf(

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
            ),
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
        private var dataSource = fake
        val managerExpectations = listOf(
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

        val averageFruitAndVegetables = listOf(
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

        val bananaCheapest = listOf(
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

        var costlierCity = listOf(
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
                    apartmentOneBedroomInCityCentre = 200.0f,
                    apartmentOneBedroomOutsideOfCentre = 100.0f,
                    apartment3BedroomsInCityCentre = 600.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 18f,
                dataQuality = true
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
                    apartmentOneBedroomInCityCentre = 300.0f,
                    apartmentOneBedroomOutsideOfCentre = 180.0f,
                    apartment3BedroomsInCityCentre = 800.0f,
                    apartment3BedroomsOutsideOfCentre = 550.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 20.0f,
                dataQuality = true
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
                    apartmentOneBedroomInCityCentre = 1000.0f,
                    apartmentOneBedroomOutsideOfCentre = 970.0f,
                    apartment3BedroomsInCityCentre = 2567.0f,
                    apartment3BedroomsOutsideOfCentre = 999.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 25.0f,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Masin",
                country = "Iraq",
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
                    apartmentOneBedroomInCityCentre = 6000.0f,
                    apartmentOneBedroomOutsideOfCentre = 100.0f,
                    apartment3BedroomsInCityCentre = 600.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 18f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Seoul",
                country = "Korean",
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
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 18f,
                dataQuality = true
            ),
        )
    }
}

