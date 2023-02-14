package dataSource

import interactor.CostOfLivingDataSource
import model.*

class HardCodedFakeDataSource : CostOfLivingDataSource {

    enum class DataType {
        VALID, EMPTY, NULLABLE
    }

    private var dataType: DataType = DataType.VALID
    fun setDatatype(_dataType: DataType) {
        this.dataType = _dataType
    }

    val cairoHighQuality by lazy {
        CityEntity(
            cityName = "Cairo",
            country = "Egypt",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 2f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 6000f,
            dataQuality = true
        )
    }

    val londonLowQuality by lazy {
        CityEntity(
            cityName = "london",
            country = "england",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 1f,
                riceWhite1kg = 3f,
                eggsRegular12 = 1f,
                localCheese1kg = 6f,
                chickenFillets1kg = 9f,
                beefRound1kgOrEquivalentBackLegRedMeat = 12f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 4000f,
            dataQuality = false
        )
    }

    val parisHighQuality by lazy {
        CityEntity(
            cityName = "paris",
            country = "france",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 4f,
                riceWhite1kg = 12f,
                eggsRegular12 = 24f,
                localCheese1kg = 9f,
                chickenFillets1kg = 16f,
                beefRound1kgOrEquivalentBackLegRedMeat = 20f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 9000f,
            dataQuality = true
        )
    }

    val baghdadHighQualityNull by lazy {
        CityEntity(
            cityName = "baghdad",
            country = "iraq",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 9f,
                riceWhite1kg = 4f,
                eggsRegular12 = null,
                localCheese1kg = null,
                chickenFillets1kg = 12f,
                beefRound1kgOrEquivalentBackLegRedMeat = null
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = null,
            dataQuality = true
        )
    }

    val rabatLowQualityNull by lazy {
        CityEntity(
            cityName = "rabat",
            country = "morocco",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 9f,
                riceWhite1kg = 4f,
                eggsRegular12 = 3f,
                localCheese1kg = 1f,
                chickenFillets1kg = 12f,
                beefRound1kgOrEquivalentBackLegRedMeat = null
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = null,
            dataQuality = false
        )
    }

    val berlinHighQualityNull by lazy {
        CityEntity(
            cityName = "berlin",
            country = "germany",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 9f,
                riceWhite1kg = 4f,
                eggsRegular12 = 3f,
                localCheese1kg = 1f,
                chickenFillets1kg = 12f,
                beefRound1kgOrEquivalentBackLegRedMeat = 20f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = null,
            dataQuality = true
        )
    }

    val canadaHighQuality by lazy {
        CityEntity(
            cityName = "Ottawa",
            country = "Canada",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 40f,
                mealFor2PeopleMidRangeRestaurant = 35f,
                mealAtMcDonaldSOrEquivalent = 10f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 9f,
                riceWhite1kg = 4f,
                eggsRegular12 = 3f,
                localCheese1kg = 1f,
                chickenFillets1kg = 12f,
                beefRound1kgOrEquivalentBackLegRedMeat = 20f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = null,
            dataQuality = true
        )
    }

    val unitedStateHighQuality by lazy {
        CityEntity(
            cityName = "Washington",
            country = "United States",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 100f,
                mealFor2PeopleMidRangeRestaurant = 60f,
                mealAtMcDonaldSOrEquivalent = 30f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 9f,
                riceWhite1kg = 4f,
                eggsRegular12 = 3f,
                localCheese1kg = 1f,
                chickenFillets1kg = 12f,
                beefRound1kgOrEquivalentBackLegRedMeat = 20f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = null,
            dataQuality = true
        )
    }

    val mexicoHighQuality by lazy {
        CityEntity(
            cityName = "Mexico",
            country = "Mexico",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 70f,
                mealFor2PeopleMidRangeRestaurant = 35f,
                mealAtMcDonaldSOrEquivalent = 25f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 9f,
                riceWhite1kg = 4f,
                eggsRegular12 = 3f,
                localCheese1kg = 1f,
                chickenFillets1kg = 12f,
                beefRound1kgOrEquivalentBackLegRedMeat = 20f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = null,
            dataQuality = true
        )
    }
    private val cityList = mutableListOf<CityEntity>()
    private val nullableCityList = mutableListOf<CityEntity>()

    override fun getAllCitiesData(): List<CityEntity> {
        cityList.add(cairoHighQuality)
        cityList.add(londonLowQuality)
        cityList.add(parisHighQuality)
        cityList.add(unitedStateHighQuality)
        cityList.add(mexicoHighQuality)
        cityList.add(canadaHighQuality)
        nullableCityList.add(baghdadHighQualityNull)
        nullableCityList.add(rabatLowQualityNull)
        nullableCityList.add(berlinHighQualityNull)
        return when (dataType) {
            DataType.VALID -> {
                cityList
            }
            DataType.EMPTY -> {
                emptyList<CityEntity>()
            }
            DataType.NULLABLE -> {
                nullableCityList
            }
        }
    }
}