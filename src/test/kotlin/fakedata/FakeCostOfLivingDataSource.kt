package fakedata
import interactor.CostOfLivingDataSource
import model.*

//Related to GetTopCitiesForBuyingApartment Class Test
class FakeCostOfLivingDataSource :CostOfLivingDataSource {
    // data source implementation
    /*
     Fake Cost of Living data source with two cities data
    ​
     City A data:
      cityName: null.toString()
      country: "egypt"
      averageMonthlyNetSalaryAfterTax: 5000F
      pricePerSquareMeterToBuyApartmentOutsideOfCentre: 100f

     City B data:
      cityName: "City B"
      country: "egypt"
      averageMonthlyNetSalaryAfterTax: [value not specified]
      pricePerSquareMeterToBuyApartmentOutsideOfCentre: [value not specified]

     City C data:
      cityName: "City C"
      country: "egypt"
      averageMonthlyNetSalaryAfterTax: [value not specified]
      pricePerSquareMeterToBuyApartmentOutsideOfCentre: 300f
     City D data:
      cityName: "City D"
      country: "egypt"
      averageMonthlyNetSalaryAfterTax: 8000F
      pricePerSquareMeterToBuyApartmentOutsideOfCentre: [value not specified]



    */
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            CityEntity(
                cityName = null.toString(),
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
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 100f
                ),
                averageMonthlyNetSalaryAfterTax = 5000F,
                dataQuality = true
            ),
            CityEntity(
                cityName = "City B",
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
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = true
            ),
            CityEntity(
                cityName = "City C",
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
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 300f
                ),
                averageMonthlyNetSalaryAfterTax = null,
                dataQuality = true
            ),
            CityEntity(
                cityName = "City D",
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
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                ),
                averageMonthlyNetSalaryAfterTax = 8000f,
                dataQuality = true
            )
        )
    }
}