package fakeData

import interactor.CostOfLivingDataSource
import model.*

/**
 * Created by Aziza Helmy on 2/12/2023.
 */
class FakeData : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            //region city[0]
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
                    apples1kg = null,
                    banana1kg =null,
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
                    //100
                    apartment3BedroomsInCityCentre = 60.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    //500
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 1580f,
                dataQuality = true
            ),
            //endregion
            //region city[1]
            CityEntity(
                cityName = "Giza",
                country = "Egypt",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.5f,
                    mealFor2PeopleMidRangeRestaurant = 5.0f,
                    mealAtMcDonaldSOrEquivalent = 3.0f
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
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = null,
                    eggsRegular12 = 2.03f,
                    localCheese1kg = null,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
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
                    //100
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    //500
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = true
            ),
            //endregion
            //region city[2]
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
                    //120
                    apartment3BedroomsInCityCentre = 800.0f,
                    apartment3BedroomsOutsideOfCentre = 550.0f,
                    //250
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 20.0f,
                dataQuality = true
            ),
            //endregion
            //region city[3]
            CityEntity(
                cityName = "Santa Clara",
                country = "Cuba",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 10.0f,
                    mealFor2PeopleMidRangeRestaurant = 30.0f,
                    mealAtMcDonaldSOrEquivalent = 5.0f
                ), drinksPrices = DrinksPrices(
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
                    //30
                    apartment3BedroomsInCityCentre = 2567.0f,
                    apartment3BedroomsOutsideOfCentre = 999.0f,
                    //1568
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 25.0f,
                dataQuality = true
            ),
            //endregion
            //region city[4]
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
                    apartmentOneBedroomOutsideOfCentre =100.0f ,
                    //5900
                    apartment3BedroomsInCityCentre = 600.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    //500
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 18f,
                dataQuality = false
            ),
            //endregion
            //region city[5]
            CityEntity(
                cityName = "Solue",
                country = "Koura",
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
                    apples1kg = 11.02f,banana1kg = 0.44f,
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
                    apartmentOneBedroomOutsideOfCentre =null ,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    //6900
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 18f,
                dataQuality = true
            ),
            //endregion
            //region city[6]
            CityEntity(
                cityName = "Fayrouz",
                country = "Lebanon",
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
                    banana1kg = null,
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
                    apartmentOneBedroomOutsideOfCentre =null ,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 18f,
                dataQuality = true
            ),
            //endregion
            //region city[7]
            CityEntity(
                cityName = "Santiago de Cuba",
                country = "Argentina",
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
                    apples1kg = null,
                    banana1kg = null,
                    oranges1kg = null,
                    tomato1kg = null,
                    potato1kg = null,
                    onion1kg = null,
                    lettuceOneHead = null
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
                    apartmentOneBedroomOutsideOfCentre =100.0f ,
                    apartment3BedroomsInCityCentre = 600.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = true
            ),
            //endregion
            //region city[8]
            CityEntity(
                cityName = "cairo blaza",
                country = "Loliput",
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
                    banana1kg = null,
                    oranges1kg = 1.1f,
                    tomato1kg = null,
                    potato1kg = 1.13f,
                    onion1kg = 2.21f,
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
                    apartmentOneBedroomOutsideOfCentre =100.0f ,
                    apartment3BedroomsInCityCentre = 600.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = true
            ),
            //endregion
            //region city[9]
            CityEntity(
                cityName = "Sers Ellyan",
                country = "Albania",
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
                    apples1kg = null,
                    banana1kg = null,
                    oranges1kg = null,
                    tomato1kg = null,
                    potato1kg = null,
                    onion1kg = null,
                    lettuceOneHead = null
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
                    apartmentOneBedroomOutsideOfCentre =100.0f ,
                    apartment3BedroomsInCityCentre = 600.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 13.8f,
                dataQuality = true
            ),
            //endregion
            //region city[10]
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
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre =null ,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 101.74f,
                dataQuality = true
            ),
            //endregion
        //region city[11]
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
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre =null ,
                    apartment3BedroomsInCityCentre = 7000.0f,
                    apartment3BedroomsOutsideOfCentre = 100f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 100f
                ),
                averageMonthlyNetSalaryAfterTax = 50.24f,
                dataQuality = true
            )
        //endregion
        )
    }
}