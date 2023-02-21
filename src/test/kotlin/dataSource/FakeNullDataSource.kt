package dataSource

import interactor.CostOfLivingDataSource
import model.*

class FakeNullDataSource:CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
       return listOf(CityEntity(
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
            ),
            averageMonthlyNetSalaryAfterTax = 25.0f,
            dataQuality = false
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
            cityName = "Las Tunas",
            country = "Cuba",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 3.0f,
                mealFor2PeopleMidRangeRestaurant = 14.0f,
                mealAtMcDonaldSOrEquivalent = null
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.0f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 1.25f,
                waterAThirdOfLiterBottleInRestaurants = 1.0f,
                milkRegularOneLiter = null,
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
                eggsRegular12 = 2.4f,
                localCheese1kg = 4.41f,
                chickenFillets1kg = 6.61f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6.61f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.1f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
                fitnessClubMonthlyFeeForOneAdult = 15.0f,
                tennisCourtRentOneHourOnWeekend = 5.0f,
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
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
            ),
            averageMonthlyNetSalaryAfterTax = 40.0f,
            dataQuality = false
        ))
    }
}