package fakedata

import interactor.CostOfLivingDataSource
import model.*

object GetCitiesNameSortedByBananaPriceFakeData {
    val cityHighQuality1 by lazy {
        CityEntity(
            cityName = "high quality city in usa", country = "USA", mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 3f,
                mealFor2PeopleMidRangeRestaurant = 10f,
                mealAtMcDonaldSOrEquivalent = 20f
            ), drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 10f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ), foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ), servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ), clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ), transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ), carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ), realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = true
        )
    }//10
    val cityHighQuality2 by lazy {
        CityEntity(
            cityName = "high quality city in canada", country = "Canada", mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 5f,
                mealFor2PeopleMidRangeRestaurant = 30f,
                mealAtMcDonaldSOrEquivalent = 20f
            ), drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 100f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ), foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ), servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ), clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ), transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ), carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ), realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = true
        )
    }//100
    val cityHighQuality3 by lazy {
        CityEntity(
            cityName = "high quality city in mexico", country = "Mexico", mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 1f,
                mealFor2PeopleMidRangeRestaurant = 12f,
                mealAtMcDonaldSOrEquivalent = 30f
            ), drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 20f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ), foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ), servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ), clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ), transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ), carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ), realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = true
        )
    }//20
    val cityLowQuality1 by lazy {
        CityEntity(
            cityName = "low quality city in usa", country = "Usa", mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = null,
                mealFor2PeopleMidRangeRestaurant = 9f,
                mealAtMcDonaldSOrEquivalent = null
            ), drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = null,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ), foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ), servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ), clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ), transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ), carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ), realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = false
        )
    }//null
    val cityLowQuality2 by lazy {
        CityEntity(
            cityName = "low quality city in canada", country = "canada", mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 15.5f,
                mealFor2PeopleMidRangeRestaurant = null,
                mealAtMcDonaldSOrEquivalent = 30f
            ), drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 15f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ), foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ), servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ), clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ), transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ), carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ), realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = false
        )
    }//15
    val cityLowQuality3 by lazy {
        CityEntity(
            cityName = "low quality city in mexico", country = "mexico", mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10f,
                mealFor2PeopleMidRangeRestaurant = null,
                mealAtMcDonaldSOrEquivalent = 3f
            ), drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = 150f,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ), foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ), servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ), clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ), transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ), carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ), realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = false
        )
    }//150
    val cityExtremeLowQuality1 by lazy {
        CityEntity(
            cityName = "extreme low quality city in usa", country = "usa", mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = null,
                mealFor2PeopleMidRangeRestaurant = null,
                mealAtMcDonaldSOrEquivalent = null
            ), drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = null,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ), foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ), servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ), clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ), transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ), carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ), realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = false
        )
    }
    val cityExtremeLowQuality2 by lazy {
        CityEntity(
            cityName = "extreme low quality city in canada", country = "canada", mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = null,
                mealFor2PeopleMidRangeRestaurant = null,
                mealAtMcDonaldSOrEquivalent = null
            ), drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = null,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ), foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ), servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ), clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ), transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ), carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ), realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = false
        )
    }
    val cityExtremeLowQuality3 by lazy {
        CityEntity(
            cityName = "low quality city in mexico", country = "mexico", mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = null,
                mealFor2PeopleMidRangeRestaurant = null,
                mealAtMcDonaldSOrEquivalent = null
            ), drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 7f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 2f,
                waterAThirdOfLiterBottleInRestaurants = 1f,
                milkRegularOneLiter = 2f,
                waterOneAndHalfLiterBottleAtTheMarket = 2.5f
            ), fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2f,
                banana1kg = null,
                oranges1kg = 1f,
                tomato1kg = 3f,
                potato1kg = 1f,
                onion1kg = 1f,
                lettuceOneHead = 0.25f
            ), foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = .5f,
                riceWhite1kg = 1f,
                eggsRegular12 = 2f,
                localCheese1kg = 4f,
                chickenFillets1kg = 4f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6f
            ), servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 25f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 30f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20f,
                fitnessClubMonthlyFeeForOneAdult = 100f,
                tennisCourtRentOneHourOnWeekend = 100f,
                cinemaInternationalReleaseOneSeat = 10f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 100f,
                internationalPrimarySchoolYearlyForOneChild = 1000f
            ), clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 60f,
                oneSummerDressInAChainStoreZaraHAndM = 90f,
                onePairOfNikeRunningShoesMidRange = 80f,
                onePairOfMenLeatherBusinessShoes = 300f
            ), transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 5f,
                monthlyPassRegularPrice = 60f,
                taxiStartNormalTariff = 20f,
                taxi1kmNormalTariff = 30f,
                taxi1hourWaitingNormalTariff = 60f,
                gasolineOneLiter = 2f
            ), carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 300000f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 250000f
            ), realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 500000f,
                apartmentOneBedroomOutsideOfCentre = 300000f,
                apartment3BedroomsInCityCentre = 800000f,
                apartment3BedroomsOutsideOfCentre = 500000f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1500f
            ), averageMonthlyNetSalaryAfterTax = 6000f, dataQuality = false
        )
    }
    val emptyCities = object : CostOfLivingDataSource {
        override fun getAllCitiesData() = listOf<CityEntity>()
    }
    val allCities by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() = listOf(
                cityHighQuality1,
                cityHighQuality2,
                cityHighQuality3,
                cityLowQuality1,
                cityLowQuality2,
                cityLowQuality3,
                cityExtremeLowQuality1,
                cityExtremeLowQuality2,
                cityExtremeLowQuality3
            )
        }
    }
    val highQualityCities by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() = listOf(
                cityHighQuality1, cityHighQuality2, cityHighQuality3
            )
        }
    }
    val lowQualityCities by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() = listOf(cityLowQuality1, cityLowQuality2, cityLowQuality3)
        }
    }
    val extremeLowQualityCities by lazy {
        object : CostOfLivingDataSource {
            override fun getAllCitiesData() =
                listOf(cityExtremeLowQuality1, cityExtremeLowQuality2, cityExtremeLowQuality3)
        }
    }
}