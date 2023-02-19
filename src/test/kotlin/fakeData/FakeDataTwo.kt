package fakeData

import interactor.CostOfLivingDataSource
import model.*

class FakeDataTwo : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            //region city[0]
            CityEntity(
                cityName = "Fairfield",
                country = "United States",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 22.5F,
                    mealFor2PeopleMidRangeRestaurant = 95.0F,
                    mealAtMcDonaldSOrEquivalent = 10.0F
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 5.08f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 2.79F,
                    waterAThirdOfLiterBottleInRestaurants = 1.88F,
                    milkRegularOneLiter = 1.16F,
                    waterOneAndHalfLiterBottleAtTheMarket = 1.5F
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 3.91F,
                    banana1kg = 1.47F,
                    oranges1kg = 3.38F,
                    tomato1kg = 2.88F,
                    potato1kg = 1.76F,
                    onion1kg = 3.17F,
                    lettuceOneHead = 1.92F
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 4.04F,
                    riceWhite1kg = 2.19F,
                    eggsRegular12 = 4.29F,
                    localCheese1kg = 10.1F,
                    chickenFillets1kg = 9.57F,
                    beefRound1kgOrEquivalentBackLegRedMeat = 15.43F
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 202.29F,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.25F,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 82.5F,
                    fitnessClubMonthlyFeeForOneAdult = 44.5F,
                    tennisCourtRentOneHourOnWeekend = null,
                    cinemaInternationalReleaseOneSeat = 11.75F,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 475.0F,
                    internationalPrimarySchoolYearlyForOneChild = 14400.0F
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 46.0F,
                    oneSummerDressInAChainStoreZaraHAndM = 35.0F,
                    onePairOfNikeRunningShoesMidRange = 78.17F,
                    onePairOfMenLeatherBusinessShoes = 99.67F
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = null,
                    monthlyPassRegularPrice = null,
                    taxiStartNormalTariff = 3.62F,
                    taxi1kmNormalTariff = 0.93F,
                    taxi1hourWaitingNormalTariff = 10.0F,
                    gasolineOneLiter = 1.49F
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 23349.5F,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 22178.8F
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 1700.0F,
                    apartmentOneBedroomOutsideOfCentre = 1800.0F,
                    apartment3BedroomsInCityCentre = 2250.0F,
                    apartment3BedroomsOutsideOfCentre = 6000.0F,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 1345.49F,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 4112.0F,
                dataQuality = false
            )
            //endregion
        )
    }
}