package dataSource

import interactor.CostOfLivingDataSource
import model.*

class FakeDataWithItemInHighQuality : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(CityEntity(
            cityName = "Warri",
            country = "Nigeria",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 1.13f,
                mealFor2PeopleMidRangeRestaurant = 11.26f,
                mealAtMcDonaldSOrEquivalent = 9.01f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 2.25f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 0.55f,
                waterAThirdOfLiterBottleInRestaurants = 0.38f,
                milkRegularOneLiter = 2.48f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.45f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 3.94f,
                banana1kg = 1.49f,
                oranges1kg = 1.13f,
                tomato1kg = 1.13f,
                potato1kg = 0.99f,
                onion1kg = 2.25f,
                lettuceOneHead = null
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 0.51f,
                riceWhite1kg = 4.5f,
                eggsRegular12 = 2.48f,
                localCheese1kg = null,
                chickenFillets1kg = 2.7f,
                beefRound1kgOrEquivalentBackLegRedMeat = 3.49f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 27.02f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.05f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 20.0f,
                fitnessClubMonthlyFeeForOneAdult = 28.14f,
                tennisCourtRentOneHourOnWeekend = null,
                cinemaInternationalReleaseOneSeat = 9.01f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 182.36f,
                internationalPrimarySchoolYearlyForOneChild = 675.42f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 13.51f,
                oneSummerDressInAChainStoreZaraHAndM = 45.03f,
                onePairOfNikeRunningShoesMidRange = 33.77f,
                onePairOfMenLeatherBusinessShoes = 101.31f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 0.23f,
                monthlyPassRegularPrice = null,
                taxiStartNormalTariff = 0.45f,
                taxi1kmNormalTariff = 0.23f,
                taxi1hourWaitingNormalTariff = null,
                gasolineOneLiter = 0.35f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = null,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = null
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 585.36f,
                apartmentOneBedroomOutsideOfCentre = 326.45f,
                apartment3BedroomsInCityCentre = 1913.68f,
                apartment3BedroomsOutsideOfCentre = 900.56f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 202.63f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1013.13f
            ),
            averageMonthlyNetSalaryAfterTax = 75.42f,
            dataQuality = true))
    }
}