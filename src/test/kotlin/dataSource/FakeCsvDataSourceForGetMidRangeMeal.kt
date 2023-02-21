package dataSource

import interactor.CostOfLivingDataSource
import model.*

class FakeCsvDataSourceForGetMidRangeMeal : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            CityEntity(
                cityName = "Toronto",
                country = "Canada",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 5f,
                    mealFor2PeopleMidRangeRestaurant =9f ,
                    mealAtMcDonaldSOrEquivalent = 4f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = null,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants =null ,
                    milkRegularOneLiter =null ,
                    waterOneAndHalfLiterBottleAtTheMarket = null,
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = null,
                    banana1kg = null,
                    oranges1kg = null,
                    potato1kg = null,
                    tomato1kg = null,
                    onion1kg = null,
                    lettuceOneHead = null
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = null,
                    eggsRegular12 = null,
                    localCheese1kg = null,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = null,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = null,
                    oneSummerDressInAChainStoreZaraHAndM = null,
                    onePairOfNikeRunningShoesMidRange = null,
                    onePairOfMenLeatherBusinessShoes = null
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = null,
                    taxi1hourWaitingNormalTariff = null,
                    taxi1kmNormalTariff = null,
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
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Montreal",
                country = "Canada",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 9f,
                    mealFor2PeopleMidRangeRestaurant =6f ,
                    mealAtMcDonaldSOrEquivalent = 15f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = null,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants =null ,
                    milkRegularOneLiter =null ,
                    waterOneAndHalfLiterBottleAtTheMarket = null,
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = null,
                    banana1kg = null,
                    oranges1kg = null,
                    potato1kg = null,
                    tomato1kg = null,
                    onion1kg = null,
                    lettuceOneHead = null
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = null,
                    eggsRegular12 = null,
                    localCheese1kg = null,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 40f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = null,
                    oneSummerDressInAChainStoreZaraHAndM = null,
                    onePairOfNikeRunningShoesMidRange = null,
                    onePairOfMenLeatherBusinessShoes = null
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = null,
                    taxi1hourWaitingNormalTariff = null,
                    taxi1kmNormalTariff = null,
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
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Network",
                country = "Usa",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 4f,
                    mealFor2PeopleMidRangeRestaurant =null ,
                    mealAtMcDonaldSOrEquivalent = 7f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = null,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants =null ,
                    milkRegularOneLiter =null ,
                    waterOneAndHalfLiterBottleAtTheMarket = null,
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = null,
                    banana1kg = null,
                    oranges1kg = null,
                    potato1kg = null,
                    tomato1kg = null,
                    onion1kg = null,
                    lettuceOneHead = null
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = null,
                    eggsRegular12 = null,
                    localCheese1kg = null,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 50f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = null,
                    oneSummerDressInAChainStoreZaraHAndM = null,
                    onePairOfNikeRunningShoesMidRange = null,
                    onePairOfMenLeatherBusinessShoes = null
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = null,
                    taxi1hourWaitingNormalTariff = null,
                    taxi1kmNormalTariff = null,
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
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Los Angles",
                country = "Usa",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 23f,
                    mealFor2PeopleMidRangeRestaurant =15f ,
                    mealAtMcDonaldSOrEquivalent = 30f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = null,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants =null ,
                    milkRegularOneLiter =null ,
                    waterOneAndHalfLiterBottleAtTheMarket = null,
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = null,
                    banana1kg = null,
                    oranges1kg = null,
                    potato1kg = null,
                    tomato1kg = null,
                    onion1kg = null,
                    lettuceOneHead = null
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = null,
                    eggsRegular12 = null,
                    localCheese1kg = null,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 60f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = null,
                    oneSummerDressInAChainStoreZaraHAndM = null,
                    onePairOfNikeRunningShoesMidRange = null,
                    onePairOfMenLeatherBusinessShoes = null
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = null,
                    taxi1hourWaitingNormalTariff = null,
                    taxi1kmNormalTariff = null,
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
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = true
            ),
            CityEntity(
                cityName = "New Jersey",
                country = "Usa",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 40f,
                    mealFor2PeopleMidRangeRestaurant =35f ,
                    mealAtMcDonaldSOrEquivalent = 42f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = null,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants =null ,
                    milkRegularOneLiter =null ,
                    waterOneAndHalfLiterBottleAtTheMarket = null,
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = null,
                    banana1kg = null,
                    oranges1kg = null,
                    potato1kg = null,
                    tomato1kg = null,
                    onion1kg = null,
                    lettuceOneHead = null
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = null,
                    eggsRegular12 = null,
                    localCheese1kg = null,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 70f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = null,
                    oneSummerDressInAChainStoreZaraHAndM = null,
                    onePairOfNikeRunningShoesMidRange = null,
                    onePairOfMenLeatherBusinessShoes = null
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = null,
                    taxi1hourWaitingNormalTariff = null,
                    taxi1kmNormalTariff = null,
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
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Mexico City",
                country = "Mexico",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 12f,
                    mealFor2PeopleMidRangeRestaurant =10f ,
                    mealAtMcDonaldSOrEquivalent = 5f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = null,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants =null ,
                    milkRegularOneLiter =null ,
                    waterOneAndHalfLiterBottleAtTheMarket = null,
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = null,
                    banana1kg = null,
                    oranges1kg = null,
                    potato1kg = null,
                    tomato1kg = null,
                    onion1kg = null,
                    lettuceOneHead = null
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = null,
                    eggsRegular12 = null,
                    localCheese1kg = null,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 80f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = null,
                    oneSummerDressInAChainStoreZaraHAndM = null,
                    onePairOfNikeRunningShoesMidRange = null,
                    onePairOfMenLeatherBusinessShoes = null
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = null,
                    taxi1hourWaitingNormalTariff = null,
                    taxi1kmNormalTariff = null,
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
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Paris",
                country = "France",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 17f,
                    mealFor2PeopleMidRangeRestaurant =16f ,
                    mealAtMcDonaldSOrEquivalent = 19f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = null,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants =null ,
                    milkRegularOneLiter =null ,
                    waterOneAndHalfLiterBottleAtTheMarket = null,
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = null,
                    banana1kg = null,
                    oranges1kg = null,
                    potato1kg = null,
                    tomato1kg = null,
                    onion1kg = null,
                    lettuceOneHead = null
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = null,
                    eggsRegular12 = null,
                    localCheese1kg = null,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 90f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = null,
                    oneSummerDressInAChainStoreZaraHAndM = null,
                    onePairOfNikeRunningShoesMidRange = null,
                    onePairOfMenLeatherBusinessShoes = null
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = null,
                    taxi1hourWaitingNormalTariff = null,
                    taxi1kmNormalTariff = null,
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
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Berlin",
                country = "Germany",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 14f,
                    mealFor2PeopleMidRangeRestaurant =16f ,
                    mealAtMcDonaldSOrEquivalent = 18f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = null,
                    cokePepsiAThirdOfLiterBottleInRestaurants = null,
                    waterAThirdOfLiterBottleInRestaurants =null ,
                    milkRegularOneLiter =null ,
                    waterOneAndHalfLiterBottleAtTheMarket = null,
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = null,
                    banana1kg = null,
                    oranges1kg = null,
                    potato1kg = null,
                    tomato1kg = null,
                    onion1kg = null,
                    lettuceOneHead = null
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = null,
                    eggsRegular12 = null,
                    localCheese1kg = null,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                    fitnessClubMonthlyFeeForOneAdult = null,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 100f,
                    internationalPrimarySchoolYearlyForOneChild = null
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = null,
                    oneSummerDressInAChainStoreZaraHAndM = null,
                    onePairOfNikeRunningShoesMidRange = null,
                    onePairOfMenLeatherBusinessShoes = null
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = null,
                    taxi1hourWaitingNormalTariff = null,
                    taxi1kmNormalTariff = null,
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
                    pricePerSquareMeterToBuyApartmentInCityCentre = null,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = true
            )
        )
    }
}