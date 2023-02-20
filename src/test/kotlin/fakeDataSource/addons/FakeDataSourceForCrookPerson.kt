package fakeDataSource.addons

import interactor.CostOfLivingDataSource
import model.*

class FakeDataSourceForCrookPerson {

    fun testExecuteMethodLogic() = object : CostOfLivingDataSource {
        override fun getAllCitiesData() = listOf(
            createCrookTrueFakeCity("Cairo","Egypt",50.0f,1.0f),
            createCrookTrueFakeCity("Benha","Egypt",40.0f,1.5f),
            createCrookTrueFakeCity("Shobra","Egypt",20.0f,2.1f))
    }

    fun percentLogicTest() = object : CostOfLivingDataSource {
        override fun getAllCitiesData() = listOf(
            createCrookTrueFakeCity("Cairo","Egypt",50.0f,5.0f))
    }


    fun trueFalseCityEntityList() = object : CostOfLivingDataSource {
        override fun getAllCitiesData() = listOf(
        createCrookTrueFakeCity("Cairo","Egypt",50.0f,1.0f),
        createCrookFalseFakeCity("Benha","Egypt",40.0f,1.5f))
    }


    fun getListWithNullSalaryAndNullPrice()  = object: CostOfLivingDataSource{
        override fun getAllCitiesData() = listOf(
            createCrookTrueFakeCity("Maadi","Egypt",null,0.5f),
            createCrookTrueFakeCity("Helwan","Egypt",230.0f,null))
    }


    private fun createCrookTrueFakeCity(
        cityName: String,
        countryName: String,
        salary: Float?,
        minutePrice:Float?,
        dataQuality: Boolean = true
    ) = CityEntity(
        cityName = cityName,
        country = countryName,
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 6.5f,
            mealFor2PeopleMidRangeRestaurant = 15.0f,
            mealAtMcDonaldSOrEquivalent = 5.0f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 2.0f,
            cokePepsiAThirdOfLiterBottleInRestaurants = null,
            waterAThirdOfLiterBottleInRestaurants = 1.0f,
            milkRegularOneLiter = 3.8f,
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
            eggsRegular12 = 2.03f,
            localCheese1kg = 9.0f,
            chickenFillets1kg = 6.61f,
            beefRound1kgOrEquivalentBackLegRedMeat = 6.61f
        ),
        servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = minutePrice,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
            fitnessClubMonthlyFeeForOneAdult = null,
            tennisCourtRentOneHourOnWeekend = null,
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
            taxi1kmNormalTariff = 0.7f,
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
            apartment3BedroomsInCityCentre = 7000.0f,
            apartment3BedroomsOutsideOfCentre = 100f,
            pricePerSquareMeterToBuyApartmentInCityCentre = null,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
        ),
        averageMonthlyNetSalaryAfterTax = salary,
        dataQuality = dataQuality
    )
    private fun createCrookFalseFakeCity(
        cityName: String,
        countryName: String,
        salary: Float?,
        minutePrice:Float?,
        dataQuality: Boolean = false
    ) = CityEntity(
        cityName = cityName,
        country = countryName,
        mealsPrices = MealsPrices(
            mealInexpensiveRestaurant = 6.5f,
            mealFor2PeopleMidRangeRestaurant = 15.0f,
            mealAtMcDonaldSOrEquivalent = 5.0f
        ),
        drinksPrices = DrinksPrices(
            cappuccinoRegularInRestaurants = 2.0f,
            cokePepsiAThirdOfLiterBottleInRestaurants = null,
            waterAThirdOfLiterBottleInRestaurants = 1.0f,
            milkRegularOneLiter = 3.8f,
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
            eggsRegular12 = 2.03f,
            localCheese1kg = 9.0f,
            chickenFillets1kg = 6.61f,
            beefRound1kgOrEquivalentBackLegRedMeat = 6.61f
        ),
        servicesPrices = ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = null,
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = minutePrice,
            internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
            fitnessClubMonthlyFeeForOneAdult = null,
            tennisCourtRentOneHourOnWeekend = null,
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
            taxi1kmNormalTariff = 0.7f,
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
            apartment3BedroomsInCityCentre = 7000.0f,
            apartment3BedroomsOutsideOfCentre = 100f,
            pricePerSquareMeterToBuyApartmentInCityCentre = null,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
        ),
        averageMonthlyNetSalaryAfterTax = salary,
        dataQuality = dataQuality
    )
}