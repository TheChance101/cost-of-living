package fakedata

import interactor.CostOfLivingDataSource
import model.*

object LowestPricePerMeterSquareInCityCenterFakeData {

    val highQualityCase1 by lazy {
        CityEntity(
            cityName = "Cairo",
            country = "egypt",
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
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 5f,
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
                pricePerSquareMeterToBuyApartmentInCityCentre = 20f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 2000f,
            dataQuality = true
        )
    }
    val highQualityCase2 by lazy {
        CityEntity(
            cityName = "Giza",
            country = "egypt",
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
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 10f,
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
            averageMonthlyNetSalaryAfterTax = 50f,
            dataQuality = true
        )
    }
    val highQualityCase3 by lazy {
        CityEntity(
            cityName = "Port-Said",
            country = "egypt",
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
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 40f,
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
                pricePerSquareMeterToBuyApartmentInCityCentre = 8000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 500f,
            dataQuality = true
        )
    }

    val lowQualityCase1 by lazy {
        CityEntity(
            cityName = "Giza",
            country = "egypt",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = null,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = null,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = null,
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
                oneSummerDressInAChainStoreZaraHAndM = null,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = null,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 5000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 2000f,
            dataQuality = false
        )
    }
    val lowQualityCase2 by lazy {
        CityEntity(
            cityName = "Suez",
            country = "egypt",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = null,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = null,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 200f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = null,
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
                monthlyPassRegularPrice = null,
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
                apartmentOneBedroomInCityCentre = null,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 5000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 20f,
            dataQuality = false
        )
    }
    val lowQualityCase3 by lazy {
        CityEntity(
            cityName = "Alexandria",
            country = "egypt",
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
                banana1kg = null,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 30f,
                fitnessClubMonthlyFeeForOneAdult = null,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = null,
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
                pricePerSquareMeterToBuyApartmentInCityCentre = 7000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 2000f,
            dataQuality = false
        )
    }

    val negativePrice by lazy {
        CityEntity(
            cityName = "Sohag",
            country = "egypt",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = null,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = null,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = null,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = -1f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = null,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = null,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = -200f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 20f,
            dataQuality = false
        )
    }

    val zeroPrice by lazy {
        CityEntity(
            cityName = "Damietta",
            country = "egypt",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = null,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = null,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 200f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 100f,
                fitnessClubMonthlyFeeForOneAdult = null,
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
                monthlyPassRegularPrice = null,
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
                apartmentOneBedroomInCityCentre = null,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 0f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 0f,
            dataQuality = false
        )
    }

    val nullCase1 by lazy {
        CityEntity(
            cityName = "Asyut",
            country = "Egypt",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = null,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = null,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = null,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = null
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = null,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = null,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = null,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = null
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = null,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = 2000f,
            dataQuality = false
        )
    }
    val nullCase2 by lazy {
        CityEntity(
            cityName = "Banha",
            country = "Egypt",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = null,
                mealFor2PeopleMidRangeRestaurant = 5f,
                mealAtMcDonaldSOrEquivalent = 3f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = null,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = null,
                banana1kg = 1f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = null
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = null,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = null,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = null,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = null
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = null,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ),
            averageMonthlyNetSalaryAfterTax = null,
            dataQuality = true
        )
    }


    val fakeNormalData by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() =
                listOf(
                    highQualityCase2,
                    nullCase1,
                    highQualityCase3,
                    nullCase2,
                    lowQualityCase2,
                    highQualityCase1,
                    lowQualityCase1,
                    lowQualityCase3,
                )
        }
    }

    val fakeLowQualityData by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() =
                listOf(
                    lowQualityCase3,
                    lowQualityCase2,
                    lowQualityCase1,
                )
        }
    }

    val fakeNullData by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() =
                listOf(
                    nullCase2,
                    nullCase1,
                )
        }
    }

    val fakeDataWithZeroPrice by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() =
                listOf(
                    zeroPrice,
                )
        }
    }

    val fakeDataWithNegativePrice by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() =
                listOf(
                    negativePrice
                )
        }
    }

    val fakeDataWithDuplicates by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() =
                listOf(
                    highQualityCase1,
                    highQualityCase3,
                    highQualityCase1,
                    highQualityCase2,
                    highQualityCase3,
                    highQualityCase2,
                    highQualityCase2,
                )
        }
    }

    val emptyDataSource = object : CostOfLivingDataSource {
        override fun getAllCitiesData() =
            listOf<CityEntity>()
    }

}
