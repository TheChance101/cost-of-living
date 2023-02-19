package dataSource

import interactor.CostOfLivingDataSource
import model.*

class FakeDataForLowQualityData: CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return  listOf(CityEntity(
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
            dataQuality = false))
    }


}