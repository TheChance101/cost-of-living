package fakedata

import interactor.CostOfLivingDataSource
import model.*

class FindHighestDifferenceInRentalPricesFakeData : CostOfLivingDataSource {

    override fun getAllCitiesData() =
        listOf(
            CityEntity(
                cityName = "London",
                country = "country",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 0.5043277f,
                    mealFor2PeopleMidRangeRestaurant = 0.93699586f,
                    mealAtMcDonaldSOrEquivalent = 0.400693f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.05813092f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.89789134f,
                    waterAThirdOfLiterBottleInRestaurants = 0.106904685f,
                    milkRegularOneLiter = 0.81675035f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.31383038f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.12421f,
                    banana1kg = 0.17981124f,
                    oranges1kg = 0.6699619f,
                    tomato1kg = 0.3614365f,
                    potato1kg = 0.9869801f,
                    onion1kg = 0.3869344f,
                    lettuceOneHead = 0.6127747f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.36290765f,
                    riceWhite1kg = 0.9057971f,
                    eggsRegular12 = 0.9808605f,
                    localCheese1kg = 0.12188882f,
                    chickenFillets1kg = 0.67528886f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 0.98726606f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.48178327f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.43593293f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.09486133f,
                    fitnessClubMonthlyFeeForOneAdult = 0.83625376f,
                    tennisCourtRentOneHourOnWeekend = 0.22472149f,
                    cinemaInternationalReleaseOneSeat = 0.04790789f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.43343306f,
                    internationalPrimarySchoolYearlyForOneChild = 0.24782658f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 0.3102873f,
                    oneSummerDressInAChainStoreZaraHAndM = 0.15739381f,
                    onePairOfNikeRunningShoesMidRange = 0.113805056f,
                    onePairOfMenLeatherBusinessShoes = 0.57934695f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.57607394f,
                    monthlyPassRegularPrice = 0.29621673f,
                    taxiStartNormalTariff = 0.04576063f,
                    taxi1kmNormalTariff = 0.19991982f,
                    taxi1hourWaitingNormalTariff = 0.66842085f,
                    gasolineOneLiter = 0.9108857f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.9211924f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.53208596f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 5000.0f,
                    apartmentOneBedroomOutsideOfCentre = 3000.0f,
                    apartment3BedroomsInCityCentre = 8000.0f,
                    apartment3BedroomsOutsideOfCentre = 6500.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 0.117085f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.1268495f
                ),
                averageMonthlyNetSalaryAfterTax = 0.59252334f,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Manchester",
                country = "country",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 0.5043277f,
                    mealFor2PeopleMidRangeRestaurant = 0.93699586f,
                    mealAtMcDonaldSOrEquivalent = 0.400693f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.05813092f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.89789134f,
                    waterAThirdOfLiterBottleInRestaurants = 0.106904685f,
                    milkRegularOneLiter = 0.81675035f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.31383038f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.12421f,
                    banana1kg = 0.17981124f,
                    oranges1kg = 0.6699619f,
                    tomato1kg = 0.3614365f,
                    potato1kg = 0.9869801f,
                    onion1kg = 0.3869344f,
                    lettuceOneHead = 0.6127747f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.36290765f,
                    riceWhite1kg = 0.9057971f,
                    eggsRegular12 = 0.9808605f,
                    localCheese1kg = 0.12188882f,
                    chickenFillets1kg = 0.67528886f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 0.98726606f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.48178327f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.43593293f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.09486133f,
                    fitnessClubMonthlyFeeForOneAdult = 0.83625376f,
                    tennisCourtRentOneHourOnWeekend = 0.22472149f,
                    cinemaInternationalReleaseOneSeat = 0.04790789f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.43343306f,
                    internationalPrimarySchoolYearlyForOneChild = 0.24782658f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 0.3102873f,
                    oneSummerDressInAChainStoreZaraHAndM = 0.15739381f,
                    onePairOfNikeRunningShoesMidRange = 0.113805056f,
                    onePairOfMenLeatherBusinessShoes = 0.57934695f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.57607394f,
                    monthlyPassRegularPrice = 0.29621673f,
                    taxiStartNormalTariff = 0.04576063f,
                    taxi1kmNormalTariff = 0.19991982f,
                    taxi1hourWaitingNormalTariff = 0.66842085f,
                    gasolineOneLiter = 0.9108857f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.9211924f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.53208596f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 6000.0f,
                    apartmentOneBedroomOutsideOfCentre = 2500.0f,
                    apartment3BedroomsInCityCentre = 9000.0f,
                    apartment3BedroomsOutsideOfCentre = 6500.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 0.117052555f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.121388495f
                ),
                averageMonthlyNetSalaryAfterTax = 0.59252334f,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Liverpool",
                country = "country",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 0.5043277f,
                    mealFor2PeopleMidRangeRestaurant = 0.93699586f,
                    mealAtMcDonaldSOrEquivalent = 0.400693f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.05813092f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.89789134f,
                    waterAThirdOfLiterBottleInRestaurants = 0.106904685f,
                    milkRegularOneLiter = 0.81675035f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.31383038f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.12421f,
                    banana1kg = 0.17981124f,
                    oranges1kg = 0.6699619f,
                    tomato1kg = 0.3614365f,
                    potato1kg = 0.9869801f,
                    onion1kg = 0.3869344f,
                    lettuceOneHead = 0.6127747f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.36290765f,
                    riceWhite1kg = 0.9057971f,
                    eggsRegular12 = 0.9808605f,
                    localCheese1kg = 0.12188882f,
                    chickenFillets1kg = 0.67528886f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 0.98726606f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.48178327f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.43593293f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.09486133f,
                    fitnessClubMonthlyFeeForOneAdult = 0.83625376f,
                    tennisCourtRentOneHourOnWeekend = 0.22472149f,
                    cinemaInternationalReleaseOneSeat = 0.04790789f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.43343306f,
                    internationalPrimarySchoolYearlyForOneChild = 0.24782658f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 0.3102873f,
                    oneSummerDressInAChainStoreZaraHAndM = 0.15739381f,
                    onePairOfNikeRunningShoesMidRange = 0.113805056f,
                    onePairOfMenLeatherBusinessShoes = 0.57934695f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.57607394f,
                    monthlyPassRegularPrice = 0.29621673f,
                    taxiStartNormalTariff = 0.04576063f,
                    taxi1kmNormalTariff = 0.19991982f,
                    taxi1hourWaitingNormalTariff = 0.66842085f,
                    gasolineOneLiter = 0.9108857f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.9211924f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.53208596f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 4000.0f,
                    apartmentOneBedroomOutsideOfCentre = 2500.0f,
                    apartment3BedroomsInCityCentre = 5000.0f,
                    apartment3BedroomsOutsideOfCentre = 4000.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 0.1525555f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.1213415f
                ),
                averageMonthlyNetSalaryAfterTax = 0.59252334f,
                dataQuality = true
            )
        )
}

class MixedFakeData : CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(
            CityEntity(
                cityName = "Roma",
                country = "country",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 0.5043277f,
                    mealFor2PeopleMidRangeRestaurant = 0.93699586f,
                    mealAtMcDonaldSOrEquivalent = 0.400693f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.05813092f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.89789134f,
                    waterAThirdOfLiterBottleInRestaurants = 0.106904685f,
                    milkRegularOneLiter = 0.81675035f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.31383038f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.12421f,
                    banana1kg = 0.17981124f,
                    oranges1kg = 0.6699619f,
                    tomato1kg = 0.3614365f,
                    potato1kg = 0.9869801f,
                    onion1kg = 0.3869344f,
                    lettuceOneHead = 0.6127747f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.36290765f,
                    riceWhite1kg = 0.9057971f,
                    eggsRegular12 = 0.9808605f,
                    localCheese1kg = 0.12188882f,
                    chickenFillets1kg = 0.67528886f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 0.98726606f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.48178327f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.43593293f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.09486133f,
                    fitnessClubMonthlyFeeForOneAdult = 0.83625376f,
                    tennisCourtRentOneHourOnWeekend = 0.22472149f,
                    cinemaInternationalReleaseOneSeat = 0.04790789f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.43343306f,
                    internationalPrimarySchoolYearlyForOneChild = 0.24782658f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 0.3102873f,
                    oneSummerDressInAChainStoreZaraHAndM = 0.15739381f,
                    onePairOfNikeRunningShoesMidRange = 0.113805056f,
                    onePairOfMenLeatherBusinessShoes = 0.57934695f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.57607394f,
                    monthlyPassRegularPrice = 0.29621673f,
                    taxiStartNormalTariff = 0.04576063f,
                    taxi1kmNormalTariff = 0.19991982f,
                    taxi1hourWaitingNormalTariff = 0.66842085f,
                    gasolineOneLiter = 0.9108857f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.9211924f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.53208596f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 5000.0f,
                    apartmentOneBedroomOutsideOfCentre = 3000.0f,
                    apartment3BedroomsInCityCentre = 8000.0f,
                    apartment3BedroomsOutsideOfCentre = 6500.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 0.117085f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.1268495f
                ),
                averageMonthlyNetSalaryAfterTax = 0.59252334f,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Torino",
                country = "country",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 0.5043277f,
                    mealFor2PeopleMidRangeRestaurant = 0.93699586f,
                    mealAtMcDonaldSOrEquivalent = 0.400693f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.05813092f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.89789134f,
                    waterAThirdOfLiterBottleInRestaurants = 0.106904685f,
                    milkRegularOneLiter = 0.81675035f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.31383038f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.12421f,
                    banana1kg = 0.17981124f,
                    oranges1kg = 0.6699619f,
                    tomato1kg = 0.3614365f,
                    potato1kg = 0.9869801f,
                    onion1kg = 0.3869344f,
                    lettuceOneHead = 0.6127747f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.36290765f,
                    riceWhite1kg = 0.9057971f,
                    eggsRegular12 = 0.9808605f,
                    localCheese1kg = 0.12188882f,
                    chickenFillets1kg = 0.67528886f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 0.98726606f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.48178327f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.43593293f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.09486133f,
                    fitnessClubMonthlyFeeForOneAdult = 0.83625376f,
                    tennisCourtRentOneHourOnWeekend = 0.22472149f,
                    cinemaInternationalReleaseOneSeat = 0.04790789f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.43343306f,
                    internationalPrimarySchoolYearlyForOneChild = 0.24782658f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 0.3102873f,
                    oneSummerDressInAChainStoreZaraHAndM = 0.15739381f,
                    onePairOfNikeRunningShoesMidRange = 0.113805056f,
                    onePairOfMenLeatherBusinessShoes = 0.57934695f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.57607394f,
                    monthlyPassRegularPrice = 0.29621673f,
                    taxiStartNormalTariff = 0.04576063f,
                    taxi1kmNormalTariff = 0.19991982f,
                    taxi1hourWaitingNormalTariff = 0.66842085f,
                    gasolineOneLiter = 0.9108857f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.9211924f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.53208596f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 6000.0f,
                    apartmentOneBedroomOutsideOfCentre = 2500.0f,
                    apartment3BedroomsInCityCentre = 9000.0f,
                    apartment3BedroomsOutsideOfCentre = 4000.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 0.117052555f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.121388495f
                ),
                averageMonthlyNetSalaryAfterTax = 0.59252334f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Napoli",
                country = "country",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 0.5043277f,
                    mealFor2PeopleMidRangeRestaurant = 0.93699586f,
                    mealAtMcDonaldSOrEquivalent = 0.400693f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.05813092f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.89789134f,
                    waterAThirdOfLiterBottleInRestaurants = 0.106904685f,
                    milkRegularOneLiter = 0.81675035f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.31383038f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.12421f,
                    banana1kg = 0.17981124f,
                    oranges1kg = 0.6699619f,
                    tomato1kg = 0.3614365f,
                    potato1kg = 0.9869801f,
                    onion1kg = 0.3869344f,
                    lettuceOneHead = 0.6127747f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.36290765f,
                    riceWhite1kg = 0.9057971f,
                    eggsRegular12 = 0.9808605f,
                    localCheese1kg = 0.12188882f,
                    chickenFillets1kg = 0.67528886f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 0.98726606f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.48178327f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.43593293f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.09486133f,
                    fitnessClubMonthlyFeeForOneAdult = 0.83625376f,
                    tennisCourtRentOneHourOnWeekend = 0.22472149f,
                    cinemaInternationalReleaseOneSeat = 0.04790789f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.43343306f,
                    internationalPrimarySchoolYearlyForOneChild = 0.24782658f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 0.3102873f,
                    oneSummerDressInAChainStoreZaraHAndM = 0.15739381f,
                    onePairOfNikeRunningShoesMidRange = 0.113805056f,
                    onePairOfMenLeatherBusinessShoes = 0.57934695f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.57607394f,
                    monthlyPassRegularPrice = 0.29621673f,
                    taxiStartNormalTariff = 0.04576063f,
                    taxi1kmNormalTariff = 0.19991982f,
                    taxi1hourWaitingNormalTariff = 0.66842085f,
                    gasolineOneLiter = 0.9108857f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.9211924f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.53208596f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 4000.0f,
                    apartmentOneBedroomOutsideOfCentre = 2500.0f,
                    apartment3BedroomsInCityCentre = 5000.0f,
                    apartment3BedroomsOutsideOfCentre = 4000.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 0.1525555f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.1213415f
                ),
                averageMonthlyNetSalaryAfterTax = 0.59252334f,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Bombay",
                country = "country",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 0.5043277f,
                    mealFor2PeopleMidRangeRestaurant = 0.93699586f,
                    mealAtMcDonaldSOrEquivalent = 0.400693f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.05813092f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.89789134f,
                    waterAThirdOfLiterBottleInRestaurants = 0.106904685f,
                    milkRegularOneLiter = 0.81675035f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.31383038f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.12421f,
                    banana1kg = 0.17981124f,
                    oranges1kg = 0.6699619f,
                    tomato1kg = 0.3614365f,
                    potato1kg = 0.9869801f,
                    onion1kg = 0.3869344f,
                    lettuceOneHead = 0.6127747f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.36290765f,
                    riceWhite1kg = 0.9057971f,
                    eggsRegular12 = 0.9808605f,
                    localCheese1kg = 0.12188882f,
                    chickenFillets1kg = 0.67528886f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 0.98726606f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.48178327f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.43593293f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.09486133f,
                    fitnessClubMonthlyFeeForOneAdult = 0.83625376f,
                    tennisCourtRentOneHourOnWeekend = 0.22472149f,
                    cinemaInternationalReleaseOneSeat = 0.04790789f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.43343306f,
                    internationalPrimarySchoolYearlyForOneChild = 0.24782658f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 0.3102873f,
                    oneSummerDressInAChainStoreZaraHAndM = 0.15739381f,
                    onePairOfNikeRunningShoesMidRange = 0.113805056f,
                    onePairOfMenLeatherBusinessShoes = 0.57934695f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.57607394f,
                    monthlyPassRegularPrice = 0.29621673f,
                    taxiStartNormalTariff = 0.04576063f,
                    taxi1kmNormalTariff = 0.19991982f,
                    taxi1hourWaitingNormalTariff = 0.66842085f,
                    gasolineOneLiter = 0.9108857f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.9211924f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.53208596f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 0.1525555f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.1213415f
                ),
                averageMonthlyNetSalaryAfterTax = 0.59252334f,
                dataQuality = true
            )
        )
}

class LowQualityData : CostOfLivingDataSource {
    override fun getAllCitiesData() =
        listOf(
            CityEntity(
                cityName = "Cairo",
                country = "country",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 0.5043277f,
                    mealFor2PeopleMidRangeRestaurant = 0.93699586f,
                    mealAtMcDonaldSOrEquivalent = 0.400693f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.05813092f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.89789134f,
                    waterAThirdOfLiterBottleInRestaurants = 0.106904685f,
                    milkRegularOneLiter = 0.81675035f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.31383038f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.12421f,
                    banana1kg = 0.17981124f,
                    oranges1kg = 0.6699619f,
                    tomato1kg = 0.3614365f,
                    potato1kg = 0.9869801f,
                    onion1kg = 0.3869344f,
                    lettuceOneHead = 0.6127747f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.36290765f,
                    riceWhite1kg = 0.9057971f,
                    eggsRegular12 = 0.9808605f,
                    localCheese1kg = 0.12188882f,
                    chickenFillets1kg = 0.67528886f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 0.98726606f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.48178327f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.43593293f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.09486133f,
                    fitnessClubMonthlyFeeForOneAdult = 0.83625376f,
                    tennisCourtRentOneHourOnWeekend = 0.22472149f,
                    cinemaInternationalReleaseOneSeat = 0.04790789f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.43343306f,
                    internationalPrimarySchoolYearlyForOneChild = 0.24782658f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 0.3102873f,
                    oneSummerDressInAChainStoreZaraHAndM = 0.15739381f,
                    onePairOfNikeRunningShoesMidRange = 0.113805056f,
                    onePairOfMenLeatherBusinessShoes = 0.57934695f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.57607394f,
                    monthlyPassRegularPrice = 0.29621673f,
                    taxiStartNormalTariff = 0.04576063f,
                    taxi1kmNormalTariff = 0.19991982f,
                    taxi1hourWaitingNormalTariff = 0.66842085f,
                    gasolineOneLiter = 0.9108857f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.9211924f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.53208596f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 5000.0f,
                    apartmentOneBedroomOutsideOfCentre = 3000.0f,
                    apartment3BedroomsInCityCentre = 8000.0f,
                    apartment3BedroomsOutsideOfCentre = 6500.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 0.117085f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.1268495f
                ),
                averageMonthlyNetSalaryAfterTax = 0.59252334f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Alexandria",
                country = "country",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 0.5043277f,
                    mealFor2PeopleMidRangeRestaurant = 0.93699586f,
                    mealAtMcDonaldSOrEquivalent = 0.400693f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.05813092f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.89789134f,
                    waterAThirdOfLiterBottleInRestaurants = 0.106904685f,
                    milkRegularOneLiter = 0.81675035f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.31383038f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.12421f,
                    banana1kg = 0.17981124f,
                    oranges1kg = 0.6699619f,
                    tomato1kg = 0.3614365f,
                    potato1kg = 0.9869801f,
                    onion1kg = 0.3869344f,
                    lettuceOneHead = 0.6127747f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.36290765f,
                    riceWhite1kg = 0.9057971f,
                    eggsRegular12 = 0.9808605f,
                    localCheese1kg = 0.12188882f,
                    chickenFillets1kg = 0.67528886f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 0.98726606f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.48178327f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.43593293f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.09486133f,
                    fitnessClubMonthlyFeeForOneAdult = 0.83625376f,
                    tennisCourtRentOneHourOnWeekend = 0.22472149f,
                    cinemaInternationalReleaseOneSeat = 0.04790789f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.43343306f,
                    internationalPrimarySchoolYearlyForOneChild = 0.24782658f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 0.3102873f,
                    oneSummerDressInAChainStoreZaraHAndM = 0.15739381f,
                    onePairOfNikeRunningShoesMidRange = 0.113805056f,
                    onePairOfMenLeatherBusinessShoes = 0.57934695f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.57607394f,
                    monthlyPassRegularPrice = 0.29621673f,
                    taxiStartNormalTariff = 0.04576063f,
                    taxi1kmNormalTariff = 0.19991982f,
                    taxi1hourWaitingNormalTariff = 0.66842085f,
                    gasolineOneLiter = 0.9108857f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.9211924f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.53208596f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 6000.0f,
                    apartmentOneBedroomOutsideOfCentre = 2500.0f,
                    apartment3BedroomsInCityCentre = 9000.0f,
                    apartment3BedroomsOutsideOfCentre = 6500.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 0.117052555f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.121388495f
                ),
                averageMonthlyNetSalaryAfterTax = 0.59252334f,
                dataQuality = false
            ),
            CityEntity(
                cityName = "Giza",
                country = "country",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 0.5043277f,
                    mealFor2PeopleMidRangeRestaurant = 0.93699586f,
                    mealAtMcDonaldSOrEquivalent = 0.400693f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.05813092f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.89789134f,
                    waterAThirdOfLiterBottleInRestaurants = 0.106904685f,
                    milkRegularOneLiter = 0.81675035f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.31383038f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.12421f,
                    banana1kg = 0.17981124f,
                    oranges1kg = 0.6699619f,
                    tomato1kg = 0.3614365f,
                    potato1kg = 0.9869801f,
                    onion1kg = 0.3869344f,
                    lettuceOneHead = 0.6127747f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.36290765f,
                    riceWhite1kg = 0.9057971f,
                    eggsRegular12 = 0.9808605f,
                    localCheese1kg = 0.12188882f,
                    chickenFillets1kg = 0.67528886f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 0.98726606f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.48178327f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.43593293f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.09486133f,
                    fitnessClubMonthlyFeeForOneAdult = 0.83625376f,
                    tennisCourtRentOneHourOnWeekend = 0.22472149f,
                    cinemaInternationalReleaseOneSeat = 0.04790789f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.43343306f,
                    internationalPrimarySchoolYearlyForOneChild = 0.24782658f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 0.3102873f,
                    oneSummerDressInAChainStoreZaraHAndM = 0.15739381f,
                    onePairOfNikeRunningShoesMidRange = 0.113805056f,
                    onePairOfMenLeatherBusinessShoes = 0.57934695f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.57607394f,
                    monthlyPassRegularPrice = 0.29621673f,
                    taxiStartNormalTariff = 0.04576063f,
                    taxi1kmNormalTariff = 0.19991982f,
                    taxi1hourWaitingNormalTariff = 0.66842085f,
                    gasolineOneLiter = 0.9108857f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.9211924f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.53208596f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 4000.0f,
                    apartmentOneBedroomOutsideOfCentre = 2500.0f,
                    apartment3BedroomsInCityCentre = 5000.0f,
                    apartment3BedroomsOutsideOfCentre = 4000.0f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 0.1525555f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.1213415f
                ),
                averageMonthlyNetSalaryAfterTax = 0.59252334f,
                dataQuality = false
            )
        )
}

class NullData : CostOfLivingDataSource {
    override fun getAllCitiesData() =

        listOf(
            CityEntity(
                cityName = "London",
                country = "country",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 0.5043277f,
                    mealFor2PeopleMidRangeRestaurant = 0.93699586f,
                    mealAtMcDonaldSOrEquivalent = 0.400693f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.05813092f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.89789134f,
                    waterAThirdOfLiterBottleInRestaurants = 0.106904685f,
                    milkRegularOneLiter = 0.81675035f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.31383038f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.12421f,
                    banana1kg = 0.17981124f,
                    oranges1kg = 0.6699619f,
                    tomato1kg = 0.3614365f,
                    potato1kg = 0.9869801f,
                    onion1kg = 0.3869344f,
                    lettuceOneHead = 0.6127747f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.36290765f,
                    riceWhite1kg = 0.9057971f,
                    eggsRegular12 = 0.9808605f,
                    localCheese1kg = 0.12188882f,
                    chickenFillets1kg = 0.67528886f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 0.98726606f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.48178327f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.43593293f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.09486133f,
                    fitnessClubMonthlyFeeForOneAdult = 0.83625376f,
                    tennisCourtRentOneHourOnWeekend = 0.22472149f,
                    cinemaInternationalReleaseOneSeat = 0.04790789f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.43343306f,
                    internationalPrimarySchoolYearlyForOneChild = 0.24782658f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 0.3102873f,
                    oneSummerDressInAChainStoreZaraHAndM = 0.15739381f,
                    onePairOfNikeRunningShoesMidRange = 0.113805056f,
                    onePairOfMenLeatherBusinessShoes = 0.57934695f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.57607394f,
                    monthlyPassRegularPrice = 0.29621673f,
                    taxiStartNormalTariff = 0.04576063f,
                    taxi1kmNormalTariff = 0.19991982f,
                    taxi1hourWaitingNormalTariff = 0.66842085f,
                    gasolineOneLiter = 0.9108857f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.9211924f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.53208596f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 0.117085f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.1268495f
                ),
                averageMonthlyNetSalaryAfterTax = 0.59252334f,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Manchester",
                country = "country",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 0.5043277f,
                    mealFor2PeopleMidRangeRestaurant = 0.93699586f,
                    mealAtMcDonaldSOrEquivalent = 0.400693f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.05813092f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.89789134f,
                    waterAThirdOfLiterBottleInRestaurants = 0.106904685f,
                    milkRegularOneLiter = 0.81675035f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.31383038f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.12421f,
                    banana1kg = 0.17981124f,
                    oranges1kg = 0.6699619f,
                    tomato1kg = 0.3614365f,
                    potato1kg = 0.9869801f,
                    onion1kg = 0.3869344f,
                    lettuceOneHead = 0.6127747f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.36290765f,
                    riceWhite1kg = 0.9057971f,
                    eggsRegular12 = 0.9808605f,
                    localCheese1kg = 0.12188882f,
                    chickenFillets1kg = 0.67528886f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 0.98726606f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.48178327f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.43593293f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.09486133f,
                    fitnessClubMonthlyFeeForOneAdult = 0.83625376f,
                    tennisCourtRentOneHourOnWeekend = 0.22472149f,
                    cinemaInternationalReleaseOneSeat = 0.04790789f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.43343306f,
                    internationalPrimarySchoolYearlyForOneChild = 0.24782658f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 0.3102873f,
                    oneSummerDressInAChainStoreZaraHAndM = 0.15739381f,
                    onePairOfNikeRunningShoesMidRange = 0.113805056f,
                    onePairOfMenLeatherBusinessShoes = 0.57934695f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.57607394f,
                    monthlyPassRegularPrice = 0.29621673f,
                    taxiStartNormalTariff = 0.04576063f,
                    taxi1kmNormalTariff = 0.19991982f,
                    taxi1hourWaitingNormalTariff = 0.66842085f,
                    gasolineOneLiter = 0.9108857f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.9211924f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.53208596f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 0.117052555f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.121388495f
                ),
                averageMonthlyNetSalaryAfterTax = 0.59252334f,
                dataQuality = true
            ),
            CityEntity(
                cityName = "Liverpool",
                country = "country",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 0.5043277f,
                    mealFor2PeopleMidRangeRestaurant = 0.93699586f,
                    mealAtMcDonaldSOrEquivalent = 0.400693f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 0.05813092f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.89789134f,
                    waterAThirdOfLiterBottleInRestaurants = 0.106904685f,
                    milkRegularOneLiter = 0.81675035f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.31383038f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 0.12421f,
                    banana1kg = 0.17981124f,
                    oranges1kg = 0.6699619f,
                    tomato1kg = 0.3614365f,
                    potato1kg = 0.9869801f,
                    onion1kg = 0.3869344f,
                    lettuceOneHead = 0.6127747f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.36290765f,
                    riceWhite1kg = 0.9057971f,
                    eggsRegular12 = 0.9808605f,
                    localCheese1kg = 0.12188882f,
                    chickenFillets1kg = 0.67528886f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 0.98726606f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 0.48178327f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.43593293f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 0.09486133f,
                    fitnessClubMonthlyFeeForOneAdult = 0.83625376f,
                    tennisCourtRentOneHourOnWeekend = 0.22472149f,
                    cinemaInternationalReleaseOneSeat = 0.04790789f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 0.43343306f,
                    internationalPrimarySchoolYearlyForOneChild = 0.24782658f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 0.3102873f,
                    oneSummerDressInAChainStoreZaraHAndM = 0.15739381f,
                    onePairOfNikeRunningShoesMidRange = 0.113805056f,
                    onePairOfMenLeatherBusinessShoes = 0.57934695f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.57607394f,
                    monthlyPassRegularPrice = 0.29621673f,
                    taxiStartNormalTariff = 0.04576063f,
                    taxi1kmNormalTariff = 0.19991982f,
                    taxi1hourWaitingNormalTariff = 0.66842085f,
                    gasolineOneLiter = 0.9108857f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 0.9211924f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 0.53208596f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = null,
                    apartment3BedroomsInCityCentre = null,
                    apartment3BedroomsOutsideOfCentre = null,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 0.1525555f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 0.1213415f
                ),
                averageMonthlyNetSalaryAfterTax = 0.59252334f,
                dataQuality = true
            )
        )

}

class FakeEmptyList : CostOfLivingDataSource {
    override fun getAllCitiesData() = listOf<CityEntity>()
}