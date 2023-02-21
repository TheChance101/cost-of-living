package fakeDataSource

import interactor.CostOfLivingDataSource
import model.*

class FakeData : CostOfLivingDataSource {

    private val fakeData = listOf(
        CityEntity(
            cityName = "Caracas", country = "Venezuela",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 10.0f,
                mealFor2PeopleMidRangeRestaurant = 50.0f,
                mealAtMcDonaldSOrEquivalent = 10.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.74f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 1.12f,
                waterAThirdOfLiterBottleInRestaurants = 0.82f,
                milkRegularOneLiter = 1.84f,
                waterOneAndHalfLiterBottleAtTheMarket = 1.23f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 4.17f,
                banana1kg = 1.09f,
                oranges1kg = 1.52f,
                tomato1kg = 1.41f,
                potato1kg = 1.56f,
                onion1kg = 1.62f,
                lettuceOneHead = 1.03f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 2.35f,
                riceWhite1kg = 1.14f,
                eggsRegular12 = 2.04f,
                localCheese1kg = 5.27f,
                chickenFillets1kg = 5.44f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6.25f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 12.37f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.07f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 49.38f,
                fitnessClubMonthlyFeeForOneAdult = 45.64f,
                tennisCourtRentOneHourOnWeekend = 14.12f,
                cinemaInternationalReleaseOneSeat = 6.0f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 75.0f,
                internationalPrimarySchoolYearlyForOneChild = 6280.0f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 41.43f,
                oneSummerDressInAChainStoreZaraHAndM = 40.0f,
                onePairOfNikeRunningShoesMidRange = 70.83f,
                onePairOfMenLeatherBusinessShoes = 66.08f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 0.35f,
                monthlyPassRegularPrice = 30.0f,
                taxiStartNormalTariff = 4.0f,
                taxi1kmNormalTariff = 2.0f,
                taxi1hourWaitingNormalTariff = 11.0f,
                gasolineOneLiter = 0.5f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 32000.0f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 34714.29f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 383.33f,
                apartmentOneBedroomOutsideOfCentre = 322.22f,
                apartment3BedroomsInCityCentre = 831.25f,
                apartment3BedroomsOutsideOfCentre = 587.5f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 805.57f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1140.96f
            ),
            averageMonthlyNetSalaryAfterTax = 185.12f, dataQuality = true
        ),
        CityEntity(
            cityName = "Accra", country = "Ghana",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 2.5f,
                mealFor2PeopleMidRangeRestaurant = 26.79f,
                mealAtMcDonaldSOrEquivalent = 4.46f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.46f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 0.51f,
                waterAThirdOfLiterBottleInRestaurants = 0.17f,
                milkRegularOneLiter = 1.19f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.28f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 1.45f,
                banana1kg = 0.68f,
                oranges1kg = 0.73f,
                tomato1kg = 1.15f,
                potato1kg = 1.24f,
                onion1kg = 1.01f,
                lettuceOneHead = 0.6f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 0.64f,
                riceWhite1kg = 0.88f,
                eggsRegular12 = 1.01f,
                localCheese1kg = 6.91f,
                chickenFillets1kg = 2.55f,
                beefRound1kgOrEquivalentBackLegRedMeat = 2.66f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 26.75f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.03f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 31.37f,
                fitnessClubMonthlyFeeForOneAdult = 26.61f,
                tennisCourtRentOneHourOnWeekend = 3.29f,
                cinemaInternationalReleaseOneSeat = 3.93f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 51.34f,
                internationalPrimarySchoolYearlyForOneChild = 4665.08f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 8.8f,
                oneSummerDressInAChainStoreZaraHAndM = 7.95f,
                onePairOfNikeRunningShoesMidRange = 18.87f,
                onePairOfMenLeatherBusinessShoes = 22.25f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 0.41f,
                monthlyPassRegularPrice = 18.21f,
                taxiStartNormalTariff = 0.71f,
                taxi1kmNormalTariff = 0.71f,
                taxi1hourWaitingNormalTariff = 2.5f,
                gasolineOneLiter = 0.65f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 5571.43f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 4275.51f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 589.26f,
                apartmentOneBedroomOutsideOfCentre = 41.21f,
                apartment3BedroomsInCityCentre = 1355.52f,
                apartment3BedroomsOutsideOfCentre = 178.93f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 1156.33f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 5016.08f
            ),
            averageMonthlyNetSalaryAfterTax = 183.6f, dataQuality = true
        ),
        CityEntity(
            cityName = "Giza", country = "Egypt",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 4.48f,
                mealFor2PeopleMidRangeRestaurant = 10.17f,
                mealAtMcDonaldSOrEquivalent = 3.26f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.24f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 0.22f,
                waterAThirdOfLiterBottleInRestaurants = 0.15f,
                milkRegularOneLiter = 0.71f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.22f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 1.1f,
                banana1kg = 0.64f,
                oranges1kg = 0.39f,
                tomato1kg = 0.38f,
                potato1kg = 0.3f,
                onion1kg = 0.26f,
                lettuceOneHead = 0.15f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 0.41f,
                riceWhite1kg = 0.57f,
                eggsRegular12 = 1.16f,
                localCheese1kg = 2.33f,
                chickenFillets1kg = 3.65f,
                beefRound1kgOrEquivalentBackLegRedMeat = 7.34f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 41.97f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 14.19f,
                fitnessClubMonthlyFeeForOneAdult = 23.4f,
                tennisCourtRentOneHourOnWeekend = 5.09f,
                cinemaInternationalReleaseOneSeat = 4.68f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 91.16f,
                internationalPrimarySchoolYearlyForOneChild = 3255.83f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 25.23f,
                oneSummerDressInAChainStoreZaraHAndM = 25.58f,
                onePairOfNikeRunningShoesMidRange = 108.72f,
                onePairOfMenLeatherBusinessShoes = 32.92f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 0.2f,
                monthlyPassRegularPrice = 12.21f,
                taxiStartNormalTariff = 0.31f,
                taxi1kmNormalTariff = 0.2f,
                taxi1hourWaitingNormalTariff = 1.22f,
                gasolineOneLiter = 0.38f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 18314.05f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 14500.08f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 118.53f,
                apartmentOneBedroomOutsideOfCentre = 55.96f,
                apartment3BedroomsInCityCentre = 195.35f,
                apartment3BedroomsOutsideOfCentre = 150.58f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 406.98f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 228.93f
            ),
            averageMonthlyNetSalaryAfterTax = 171.51f, dataQuality = true
        ),
        CityEntity(
            cityName = "Rawalpindi", country = "Pakistan",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 1.23f,
                mealFor2PeopleMidRangeRestaurant = 8.94f,
                mealAtMcDonaldSOrEquivalent = 2.68f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.69f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 0.24f,
                waterAThirdOfLiterBottleInRestaurants = 0.19f,
                milkRegularOneLiter = 0.63f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.34f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 0.84f,
                banana1kg = 0.6f,
                oranges1kg = 0.74f,
                tomato1kg = 0.45f,
                potato1kg = 0.26f,
                onion1kg = 0.26f,
                lettuceOneHead = 0.2f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 0.47f,
                riceWhite1kg = 0.84f,
                eggsRegular12 = 0.86f,
                localCheese1kg = 5.25f,
                chickenFillets1kg = 1.92f,
                beefRound1kgOrEquivalentBackLegRedMeat = 3.5f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 35.16f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 16.96f,
                fitnessClubMonthlyFeeForOneAdult = 12.37f,
                tennisCourtRentOneHourOnWeekend = 7.98f,
                cinemaInternationalReleaseOneSeat = 2.57f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 30.66f,
                internationalPrimarySchoolYearlyForOneChild = 1265.09f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 13.34f,
                oneSummerDressInAChainStoreZaraHAndM = 20.12f,
                onePairOfNikeRunningShoesMidRange = 39.79f,
                onePairOfMenLeatherBusinessShoes = 30.78f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 0.13f,
                monthlyPassRegularPrice = 7.38f,
                taxiStartNormalTariff = 0.67f,
                taxi1kmNormalTariff = 0.67f,
                taxi1hourWaitingNormalTariff = 1.34f,
                gasolineOneLiter = 0.7f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 11622.71f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 15745.29f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 94.12f,
                apartmentOneBedroomOutsideOfCentre = 73.2f,
                apartment3BedroomsInCityCentre = 189.32f,
                apartment3BedroomsOutsideOfCentre = 143.3f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 575.34f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 712.4f
            ),
            averageMonthlyNetSalaryAfterTax = 169.23f, dataQuality = true
        ),
        CityEntity(
            cityName = "Karachi", country = "Pakistan",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 2.24f,
                mealFor2PeopleMidRangeRestaurant = 11.18f,
                mealAtMcDonaldSOrEquivalent = 3.8f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.41f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 0.29f,
                waterAThirdOfLiterBottleInRestaurants = 0.19f,
                milkRegularOneLiter = 0.8f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.35f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 1.09f,
                banana1kg = 0.56f,
                oranges1kg = 0.83f,
                tomato1kg = 0.74f,
                potato1kg = 0.31f,
                onion1kg = 0.46f,
                lettuceOneHead = 0.32f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 0.46f,
                riceWhite1kg = 1.09f,
                eggsRegular12 = 1.14f,
                localCheese1kg = 4.88f,
                chickenFillets1kg = 2.83f,
                beefRound1kgOrEquivalentBackLegRedMeat = 4.02f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 66.56f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20.72f,
                fitnessClubMonthlyFeeForOneAdult = 16.52f,
                tennisCourtRentOneHourOnWeekend = 6.05f,
                cinemaInternationalReleaseOneSeat = 4.47f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 51.71f,
                internationalPrimarySchoolYearlyForOneChild = 1183.26f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 14.55f,
                oneSummerDressInAChainStoreZaraHAndM = 24.19f,
                onePairOfNikeRunningShoesMidRange = 32.04f,
                onePairOfMenLeatherBusinessShoes = 27.61f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 0.22f,
                monthlyPassRegularPrice = 11.18f,
                taxiStartNormalTariff = 0.67f,
                taxi1kmNormalTariff = 0.16f,
                taxi1hourWaitingNormalTariff = 1.79f,
                gasolineOneLiter = 1.05f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 13857.85f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 18980.66f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 113.5f,
                apartmentOneBedroomOutsideOfCentre = 76.65f,
                apartment3BedroomsInCityCentre = 268.71f,
                apartment3BedroomsOutsideOfCentre = 170.09f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 760.64f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 412.03f
            ),
            averageMonthlyNetSalaryAfterTax = 166.86f, dataQuality = true
        ),
        CityEntity(
            cityName = "Lahore", country = "Pakistan",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 1.56f,
                mealFor2PeopleMidRangeRestaurant = 17.88f,
                mealAtMcDonaldSOrEquivalent = 3.58f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.81f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 0.23f,
                waterAThirdOfLiterBottleInRestaurants = 0.17f,
                milkRegularOneLiter = 0.69f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.31f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 1.2f,
                banana1kg = 0.68f,
                oranges1kg = 0.71f,
                tomato1kg = 0.67f,
                potato1kg = 0.33f,
                onion1kg = 0.39f,
                lettuceOneHead = 0.27f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 0.67f,
                riceWhite1kg = 0.96f,
                eggsRegular12 = 1.05f,
                localCheese1kg = 5.72f,
                chickenFillets1kg = 2.83f,
                beefRound1kgOrEquivalentBackLegRedMeat = 3.88f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 92.43f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 23.83f,
                fitnessClubMonthlyFeeForOneAdult = 16.09f,
                tennisCourtRentOneHourOnWeekend = 8.26f,
                cinemaInternationalReleaseOneSeat = 4.47f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 56.01f,
                internationalPrimarySchoolYearlyForOneChild = 1207.32f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 14.48f,
                oneSummerDressInAChainStoreZaraHAndM = 25.47f,
                onePairOfNikeRunningShoesMidRange = 54.62f,
                onePairOfMenLeatherBusinessShoes = 37.77f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 0.18f,
                monthlyPassRegularPrice = 6.71f,
                taxiStartNormalTariff = 0.67f,
                taxi1kmNormalTariff = 0.22f,
                taxi1hourWaitingNormalTariff = 2.12f,
                gasolineOneLiter = 1.08f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 13410.82f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 18871.5f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 112.52f,
                apartmentOneBedroomOutsideOfCentre = 70.74f,
                apartment3BedroomsInCityCentre = 244.49f,
                apartment3BedroomsOutsideOfCentre = 187.01f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 465.59f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 306.08f
            ),
            averageMonthlyNetSalaryAfterTax = 164.01f, dataQuality = true
        ),
        CityEntity(
            cityName = "Dushanbe", country = "Tajikistan",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 3.97f,
                mealFor2PeopleMidRangeRestaurant = 11.0f,
                mealAtMcDonaldSOrEquivalent = 4.96f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.2f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 0.41f,
                waterAThirdOfLiterBottleInRestaurants = 0.28f,
                milkRegularOneLiter = 0.72f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.43f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 1.15f,
                banana1kg = 2.24f,
                oranges1kg = 2.3f,
                tomato1kg = 1.19f,
                potato1kg = 0.44f,
                onion1kg = 0.31f,
                lettuceOneHead = 0.42f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 0.41f,
                riceWhite1kg = 1.58f,
                eggsRegular12 = 1.56f,
                localCheese1kg = 5.77f,
                chickenFillets1kg = 3.9f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6.84f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 31.26f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.02f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 22.17f,
                fitnessClubMonthlyFeeForOneAdult = 34.86f,
                tennisCourtRentOneHourOnWeekend = 11.17f,
                cinemaInternationalReleaseOneSeat = 5.21f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 84.39f,
                internationalPrimarySchoolYearlyForOneChild = 4964.41f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 32.26f,
                oneSummerDressInAChainStoreZaraHAndM = 24.07f,
                onePairOfNikeRunningShoesMidRange = 53.36f,
                onePairOfMenLeatherBusinessShoes = 52.12f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 0.25f,
                monthlyPassRegularPrice = 6.95f,
                taxiStartNormalTariff = 0.99f,
                taxi1kmNormalTariff = 0.3f,
                taxi1hourWaitingNormalTariff = 2.38f,
                gasolineOneLiter = 0.94f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 14392.29f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 21839.84f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 376.03f,
                apartmentOneBedroomOutsideOfCentre = 186.15f,
                apartment3BedroomsInCityCentre = 631.14f,
                apartment3BedroomsOutsideOfCentre = 330.47f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 835.59f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 381.24f
            ),
            averageMonthlyNetSalaryAfterTax = 163.81f, dataQuality = true
        ),
        CityEntity(
            cityName = "Alexandria", country = "Egypt",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 4.07f,
                mealFor2PeopleMidRangeRestaurant = 16.28f,
                mealAtMcDonaldSOrEquivalent = 3.66f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.39f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 0.25f,
                waterAThirdOfLiterBottleInRestaurants = 0.15f,
                milkRegularOneLiter = 0.76f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.21f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 1.07f,
                banana1kg = 0.61f,
                oranges1kg = 0.4f,
                tomato1kg = 0.36f,
                potato1kg = 0.34f,
                onion1kg = 0.26f,
                lettuceOneHead = 0.22f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 0.45f,
                riceWhite1kg = 0.64f,
                eggsRegular12 = 1.11f,
                localCheese1kg = 2.69f,
                chickenFillets1kg = 3.64f,
                beefRound1kgOrEquivalentBackLegRedMeat = 7.24f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 21.56f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 12.1f,
                fitnessClubMonthlyFeeForOneAdult = 20.93f,
                tennisCourtRentOneHourOnWeekend = 5.97f,
                cinemaInternationalReleaseOneSeat = 4.07f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 70.05f,
                internationalPrimarySchoolYearlyForOneChild = 2189.93f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 27.17f,
                oneSummerDressInAChainStoreZaraHAndM = 33.63f,
                onePairOfNikeRunningShoesMidRange = 80.67f,
                onePairOfMenLeatherBusinessShoes = 39.98f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 0.2f,
                monthlyPassRegularPrice = 9.77f,
                taxiStartNormalTariff = 0.41f,
                taxi1kmNormalTariff = 0.2f,
                taxi1hourWaitingNormalTariff = 2.03f,
                gasolineOneLiter = 0.37f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 20348.95f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 19766.46f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 142.44f,
                apartmentOneBedroomOutsideOfCentre = 82.85f,
                apartment3BedroomsInCityCentre = 299.58f,
                apartment3BedroomsOutsideOfCentre = 175.24f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 696.65f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 245.54f
            ),
            averageMonthlyNetSalaryAfterTax = 163.76f, dataQuality = true
        ), CityEntity(
            cityName = "Kampala", country = "Uganda",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 1.74f,
                mealFor2PeopleMidRangeRestaurant = 26.79f,
                mealAtMcDonaldSOrEquivalent = 8.57f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.75f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 0.48f,
                waterAThirdOfLiterBottleInRestaurants = 0.31f,
                milkRegularOneLiter = 0.77f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.54f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2.93f,
                banana1kg = 1.2f,
                oranges1kg = 1.63f,
                tomato1kg = 1.1f,
                potato1kg = 1.03f,
                onion1kg = 0.95f,
                lettuceOneHead = 1.05f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 1.1f,
                riceWhite1kg = 1.15f,
                eggsRegular12 = 1.63f,
                localCheese1kg = 4.35f,
                chickenFillets1kg = 4.53f,
                beefRound1kgOrEquivalentBackLegRedMeat = 4.35f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 52.24f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.1f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 57.43f,
                fitnessClubMonthlyFeeForOneAdult = 59.16f,
                tennisCourtRentOneHourOnWeekend = 14.19f,
                cinemaInternationalReleaseOneSeat = 5.36f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 192.01f,
                internationalPrimarySchoolYearlyForOneChild = 5074.13f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 16.99f,
                oneSummerDressInAChainStoreZaraHAndM = 21.21f,
                onePairOfNikeRunningShoesMidRange = 49.24f,
                onePairOfMenLeatherBusinessShoes = 59.78f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 1.07f,
                monthlyPassRegularPrice = 41.53f,
                taxiStartNormalTariff = 1.07f,
                taxi1kmNormalTariff = 0.54f,
                taxi1hourWaitingNormalTariff = 2.68f,
                gasolineOneLiter = 1.4f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 10716.62f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 10165.48f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 326.52f,
                apartmentOneBedroomOutsideOfCentre = 160.75f,
                apartment3BedroomsInCityCentre = 1013.26f,
                apartment3BedroomsOutsideOfCentre = 408.57f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 1264.36f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 4819.16f
            ),
            averageMonthlyNetSalaryAfterTax = 162.31f, dataQuality = true
        ),
        CityEntity(
            cityName = "Hyderabad City", country = "Pakistan",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 1.23f,
                mealFor2PeopleMidRangeRestaurant = 15.65f,
                mealAtMcDonaldSOrEquivalent = 4.02f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 0.97f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 0.28f,
                waterAThirdOfLiterBottleInRestaurants = 0.22f,
                milkRegularOneLiter = 0.63f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.3f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 0.77f,
                banana1kg = 0.47f,
                oranges1kg = 0.93f,
                tomato1kg = 0.68f,
                potato1kg = 0.27f,
                onion1kg = 0.4f,
                lettuceOneHead = 0.55f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 0.38f,
                riceWhite1kg = 0.69f,
                eggsRegular12 = 1.08f,
                localCheese1kg = 6.63f,
                chickenFillets1kg = 2.11f,
                beefRound1kgOrEquivalentBackLegRedMeat = 3.16f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 61.09f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.02f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 15.65f,
                fitnessClubMonthlyFeeForOneAdult = 13.75f,
                tennisCourtRentOneHourOnWeekend = 7.26f,
                cinemaInternationalReleaseOneSeat = 2.24f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 10.73f,
                internationalPrimarySchoolYearlyForOneChild = 670.54f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 25.15f,
                oneSummerDressInAChainStoreZaraHAndM = 16.76f,
                onePairOfNikeRunningShoesMidRange = 34.27f,
                onePairOfMenLeatherBusinessShoes = 35.02f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 0.18f,
                monthlyPassRegularPrice = 2.68f,
                taxiStartNormalTariff = 0.67f,
                taxi1kmNormalTariff = 0.18f,
                taxi1hourWaitingNormalTariff = 1.3f,
                gasolineOneLiter = 0.71f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 10952.17f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 15645.95f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 70.03f,
                apartmentOneBedroomOutsideOfCentre = 43.96f,
                apartment3BedroomsInCityCentre = 149.01f,
                apartment3BedroomsOutsideOfCentre = 80.46f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 181.04f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 206.28f
            ),
            averageMonthlyNetSalaryAfterTax = 161.67f, dataQuality = true
        ),
        CityEntity(
            cityName = "Colombo", country = "Sri Lanka",
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
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1114.33f
            ),
            averageMonthlyNetSalaryAfterTax = 156.15f, dataQuality = true
        ),
        CityEntity(
            cityName = "Jaramana",
            country = "Syria",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 2.99f,
                mealFor2PeopleMidRangeRestaurant = 10.0f,
                mealAtMcDonaldSOrEquivalent = 4.04f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 0.94f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 0.73f,
                waterAThirdOfLiterBottleInRestaurants = 0.41f,
                milkRegularOneLiter = 0.75f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.51f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 0.45f,
                banana1kg = 0.9f,
                oranges1kg = 0.2f,
                tomato1kg = 0.52f,
                potato1kg = 0.2f,
                onion1kg = 0.25f,
                lettuceOneHead = 0.2f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 0.75f,
                riceWhite1kg = 1.46f,
                eggsRegular12 = 1.48f,
                localCheese1kg = 3.97f,
                chickenFillets1kg = 2.66f,
                beefRound1kgOrEquivalentBackLegRedMeat = 7.27f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 13.21f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 50.67f,
                fitnessClubMonthlyFeeForOneAdult = 7.0f,
                tennisCourtRentOneHourOnWeekend = 3.0f,
                cinemaInternationalReleaseOneSeat = 2.36f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 22.5f,
                internationalPrimarySchoolYearlyForOneChild = 816.73f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 18.33f,
                oneSummerDressInAChainStoreZaraHAndM = 14.33f,
                onePairOfNikeRunningShoesMidRange = 57.5f,
                onePairOfMenLeatherBusinessShoes = 53.27f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = null,
                monthlyPassRegularPrice = null,
                taxiStartNormalTariff = 0.6f,
                taxi1kmNormalTariff = 1.59f,
                taxi1hourWaitingNormalTariff = 3.0f,
                gasolineOneLiter = 0.5f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 26000.0f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 33666.67f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = null,
                apartmentOneBedroomOutsideOfCentre = null,
                apartment3BedroomsInCityCentre = null,
                apartment3BedroomsOutsideOfCentre = null,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
            ),
            averageMonthlyNetSalaryAfterTax = 30.0f,
            dataQuality = false
        ),

        CityEntity(
            cityName = "Damascus", country = "Syria",
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
                apartmentOneBedroomInCityCentre = 282.72f,
                apartmentOneBedroomOutsideOfCentre = 182.54f,
                apartment3BedroomsInCityCentre = 476.27f,
                apartment3BedroomsOutsideOfCentre = 266.42f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000.0f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1877.4f
            ),
            averageMonthlyNetSalaryAfterTax = 50.24f,
            dataQuality = true
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

        CityEntity(
            cityName = "Damascus", country = "Syria",
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
                apartmentOneBedroomInCityCentre = 282.72f,
                apartmentOneBedroomOutsideOfCentre = 182.54f,
                apartment3BedroomsInCityCentre = 476.27f,
                apartment3BedroomsOutsideOfCentre = 266.42f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 2000.0f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1877.4f
            ), averageMonthlyNetSalaryAfterTax = 50.24f, dataQuality = true
        ),

        CityEntity(
            cityName = "Tanta", country = "Egypt",
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
                apartmentOneBedroomInCityCentre = 156.01f,
                apartmentOneBedroomOutsideOfCentre = 71.22f,
                apartment3BedroomsInCityCentre = 196.71f,
                apartment3BedroomsOutsideOfCentre = 142.44f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 335.76f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 241.47f
            ), averageMonthlyNetSalaryAfterTax = 101.74f, dataQuality = true
        ),

        CityEntity(
            cityName = "Multan", country = "Pakistan",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 1.34f,
                mealFor2PeopleMidRangeRestaurant = 8.49f,
                mealAtMcDonaldSOrEquivalent = 3.35f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.09f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 0.22f,
                waterAThirdOfLiterBottleInRestaurants = 0.14f,
                milkRegularOneLiter = 0.49f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.27f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 0.83f,
                banana1kg = 0.52f,
                oranges1kg = 0.48f,
                tomato1kg = 0.54f,
                potato1kg = 0.32f,
                onion1kg = 0.34f,
                lettuceOneHead = 0.45f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 0.42f,
                riceWhite1kg = 0.73f,
                eggsRegular12 = 0.89f,
                localCheese1kg = 6.39f,
                chickenFillets1kg = 1.8f,
                beefRound1kgOrEquivalentBackLegRedMeat = 3.32f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 56.04f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 12.85f,
                fitnessClubMonthlyFeeForOneAdult = 12.26f,
                tennisCourtRentOneHourOnWeekend = 3.69f,
                cinemaInternationalReleaseOneSeat = 2.46f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 29.03f,
                internationalPrimarySchoolYearlyForOneChild = 643.72f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 12.67f,
                oneSummerDressInAChainStoreZaraHAndM = 28.58f,
                onePairOfNikeRunningShoesMidRange = 28.27f,
                onePairOfMenLeatherBusinessShoes = 21.92f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 0.12f,
                monthlyPassRegularPrice = 4.47f,
                taxiStartNormalTariff = 0.67f,
                taxi1kmNormalTariff = 0.09f,
                taxi1hourWaitingNormalTariff = 1.34f,
                gasolineOneLiter = 0.69f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 8940.55f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 14640.14f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 54.05f,
                apartmentOneBedroomOutsideOfCentre = 45.44f,
                apartment3BedroomsInCityCentre = 182.47f,
                apartment3BedroomsOutsideOfCentre = 131.87f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 236.34f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 202.81f
            ),
            averageMonthlyNetSalaryAfterTax = 125.87f,
            dataQuality = true
        ),
        CityEntity(
            cityName = "Colombo", country = "Sri Lanka",
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
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1114.33f
            ),
            averageMonthlyNetSalaryAfterTax = 156.15f, dataQuality = true
        ),
        CityEntity(
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
            cityName = "Queensbury",
            country = "United States",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = null,
                mealFor2PeopleMidRangeRestaurant = 65.0f,
                mealAtMcDonaldSOrEquivalent = 9.0f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 5.75f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 3.99f,
                waterAThirdOfLiterBottleInRestaurants = 1.54f,
                milkRegularOneLiter = 0.82f,
                waterOneAndHalfLiterBottleAtTheMarket = 1.38f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 4.55f,
                banana1kg = 1.3f,
                oranges1kg = 5.11f,
                tomato1kg = 6.01f,
                potato1kg = 3.98f,
                onion1kg = 3.19f,
                lettuceOneHead = 1.5f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 2.82f,
                riceWhite1kg = 4.32f,
                eggsRegular12 = 2.84f,
                localCheese1kg = 11.0f,
                chickenFillets1kg = 11.74f,
                beefRound1kgOrEquivalentBackLegRedMeat = 8.8f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 183.92f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 75.0f,
                fitnessClubMonthlyFeeForOneAdult = 24.0f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = 11.0f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 2000.0f,
                internationalPrimarySchoolYearlyForOneChild = null
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 40.0f,
                oneSummerDressInAChainStoreZaraHAndM = 35.0f,
                onePairOfNikeRunningShoesMidRange = 29.99f,
                onePairOfMenLeatherBusinessShoes = 225.0f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = null,
                monthlyPassRegularPrice = null,
                taxiStartNormalTariff = null,
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 1.05f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 32000.0f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 30333.33f
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
            dataQuality = false
        ),
        CityEntity(
            cityName = "Chateauguay",
            country = "Canada",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 8.89f,
                mealFor2PeopleMidRangeRestaurant = 29.65f,
                mealAtMcDonaldSOrEquivalent = 5.56f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.59f,
                cokePepsiAThirdOfLiterBottleInRestaurants = null,
                waterAThirdOfLiterBottleInRestaurants = null,
                milkRegularOneLiter = 1.46f,
                waterOneAndHalfLiterBottleAtTheMarket = 1.62f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 2.44f,
                banana1kg = 1.26f,
                oranges1kg = 4.44f,
                tomato1kg = 4.82f,
                potato1kg = 1.67f,
                onion1kg = 3.7f,
                lettuceOneHead = 1.9f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 2.55f,
                riceWhite1kg = 2.59f,
                eggsRegular12 = 2.22f,
                localCheese1kg = 8.15f,
                chickenFillets1kg = 15.31f,
                beefRound1kgOrEquivalentBackLegRedMeat = null
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = null,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = null,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = null,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = null,
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
                taxi1kmNormalTariff = null,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 1.33f
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
            dataQuality = false
        ),
        CityEntity(
            cityName = "Tapachula",
            country = "Mexico",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 3.61f,
                mealFor2PeopleMidRangeRestaurant = null,
                mealAtMcDonaldSOrEquivalent = 7.86f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.03f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 1.29f,
                waterAThirdOfLiterBottleInRestaurants = 0.62f,
                milkRegularOneLiter = 1.26f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.77f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 1.8f,
                banana1kg = 1.29f,
                oranges1kg = 1.55f,
                tomato1kg = 1.29f,
                potato1kg = 1.55f,
                onion1kg = 1.29f,
                lettuceOneHead = 1.03f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 1.38f,
                riceWhite1kg = 0.93f,
                eggsRegular12 = 1.86f,
                localCheese1kg = 6.19f,
                chickenFillets1kg = 6.19f,
                beefRound1kgOrEquivalentBackLegRedMeat = 14.44f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 73.49f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.1f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 30.94f,
                fitnessClubMonthlyFeeForOneAdult = 23.21f,
                tennisCourtRentOneHourOnWeekend = 10.31f,
                cinemaInternationalReleaseOneSeat = 3.09f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 162.44f,
                internationalPrimarySchoolYearlyForOneChild = 2062.76f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 24.75f,
                oneSummerDressInAChainStoreZaraHAndM = 25.78f,
                onePairOfNikeRunningShoesMidRange = 48.99f,
                onePairOfMenLeatherBusinessShoes = 46.41f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 0.41f,
                monthlyPassRegularPrice = 5.16f,
                taxiStartNormalTariff = 1.93f,
                taxi1kmNormalTariff = 1.6f,
                taxi1hourWaitingNormalTariff = 4.13f,
                gasolineOneLiter = 1.18f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 10313.8f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 18049.15f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = null,
                apartmentOneBedroomOutsideOfCentre = 77.35f,
                apartment3BedroomsInCityCentre = 154.71f,
                apartment3BedroomsOutsideOfCentre = 103.14f,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
            ),
            averageMonthlyNetSalaryAfterTax = 360.98f,
            dataQuality = false
        ),
    )



    override fun getAllCitiesData(): List<CityEntity> {
        return fakeData
    }
}
