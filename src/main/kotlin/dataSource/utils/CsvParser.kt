package dataSource.utils

import model.*

class CsvParser {

    fun parseLine(csvLine: String): CityEntity{
        val tokenizedList: List<String> = csvLine.split(",")
        return CityEntity(
            cityName = tokenizedList[ColumnIndex.CITY],
            country = tokenizedList[ColumnIndex.COUNTRY],
            mealsPrices = constructMealsPricesFromTokens(tokenizedList),
            drinksPrices = constructDrinksPricesFromTokens(tokenizedList),
            fruitAndVegetablesPrices = constructFruitAndVegetablesPricesFromTokens(tokenizedList),
            foodPrices = constructFoodPricesFromTokens(tokenizedList),
            servicesPrices = constructServicesPricesFromTokens(tokenizedList),
            clothesPrices = constructClothesPricesFromTokens(tokenizedList),
            transportationsPrices = constructTransportationsPricesFromTokens(tokenizedList),
            carsPrices = constructCarsPricesFromTokens(tokenizedList),
            realEstatesPrices = constructRealStatesPricesFromTokens(tokenizedList),
            averageMonthlyNetSalaryAfterTax = tokenizedList[ColumnIndex.AVERAGE_MONTHLY_NET_SALARY_AFTER_TAX].toFloatOrNull(),
            dataQuality = tokenizedList[ColumnIndex.DATA_QUALITY].toIntOrNull() == 1,
        )
    }

    private fun constructMealsPricesFromTokens(tokenizedList: List<String>): MealsPrices{
        return MealsPrices(
            mealAtMcDonaldSOrEquivalent = tokenizedList.getFloat(ColumnIndex.MEAL_AT_MC_DONALD_S_OR_EQUIVALENT),
            mealInexpensiveRestaurant = tokenizedList.getFloat(ColumnIndex.MEAL_INEXPENSIVE_RESTAURANT),
            mealFor2PeopleMidRangeRestaurant = tokenizedList.getFloat(ColumnIndex.MEAL_FOR_2_PEOPLE_MID_RANGE_RESTAURANT),
        )
    }

    private fun constructDrinksPricesFromTokens(tokenizedList: List<String>): DrinksPrices{
        return DrinksPrices(
            cappuccinoRegularInRestaurants = tokenizedList.getFloat(ColumnIndex.CAPPUCCINO_REGULAR_IN_RESTAURANTS),
            cokePepsiAThirdOfLiterBottleInRestaurants = tokenizedList.getFloat(ColumnIndex.COKE_PEPSI_A_THIRD_OF_LITER_BOTTLE_IN_RESTAURANTS),
            milkRegularOneLiter = tokenizedList.getFloat(ColumnIndex.MILK_REGULAR_ONE_LITER),
            waterAThirdOfLiterBottleInRestaurants = tokenizedList.getFloat(ColumnIndex.WATER_A_THIRD_OF_LITER_BOTTLE_IN_RESTAURANTS),
            waterOneAndHalfLiterBottleAtTheMarket = tokenizedList.getFloat(ColumnIndex.WATER_ONE_AND_HALF_LITER_BOTTLE_AT_THE_MARKET),
        )
    }

    private fun constructFruitAndVegetablesPricesFromTokens(tokenizedList: List<String>): FruitAndVegetablesPrices{
        return FruitAndVegetablesPrices(
            apples1kg = tokenizedList.getFloat(ColumnIndex.APPLES_1KG),
            banana1kg = tokenizedList.getFloat(ColumnIndex.BANANA_1KG),
            oranges1kg = tokenizedList.getFloat(ColumnIndex.ORANGES_1KG),
            tomato1kg = tokenizedList.getFloat(ColumnIndex.TOMATO_1KG),
            onion1kg = tokenizedList.getFloat(ColumnIndex.ONION_1KG),
            potato1kg = tokenizedList.getFloat(ColumnIndex.POTATO_1KG),
            lettuceOneHead = tokenizedList.getFloat(ColumnIndex.LETTUCE_ONE_HEAD)
        )
    }

    private fun constructFoodPricesFromTokens(tokenizedList: List<String>): FoodPrices{
        return FoodPrices(
            loafOfFreshWhiteBread500g = tokenizedList.getFloat(ColumnIndex.LOAF_OF_FRESH_WHITE_BREAD_500G),
            riceWhite1kg = tokenizedList.getFloat(ColumnIndex.RICE_WHITE_1KG),
            eggsRegular12 = tokenizedList.getFloat(ColumnIndex.EGGS_REGULAR_12),
            localCheese1kg = tokenizedList.getFloat(ColumnIndex.LOCAL_CHEESE_1KG),
            chickenFillets1kg = tokenizedList.getFloat(ColumnIndex.CHICKEN_FILLETS_1KG),
            beefRound1kgOrEquivalentBackLegRedMeat = tokenizedList.getFloat(ColumnIndex.BEEF_ROUND_1KG_OR_EQUIVALENT_BACK_LEG_RED_MEAT),
        )
    }

    private fun constructServicesPricesFromTokens(tokenizedList: List<String>): ServicesPrices{
        return ServicesPrices(
            basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = tokenizedList.getFloat(ColumnIndex.BASIC_ELECTRICITY_HEATING_COOLING_WATER_GARBAGE_FOR_85M2_APARTMENT),
            cinemaInternationalReleaseOneSeat = tokenizedList.getFloat(ColumnIndex.CINEMA_INTERNATIONAL_RELEASE_ONE_SEAT),
            internet60MbpsOrMoreUnlimitedDataCableAdsl = tokenizedList.getFloat(ColumnIndex.INTERNET_60_MBPS_OR_MORE_UNLIMITED_DATA_CABLE_ADSL),
            fitnessClubMonthlyFeeForOneAdult = tokenizedList.getFloat(ColumnIndex.FITNESS_CLUB_MONTHLY_FEE_FOR_ONE_ADULT),
            tennisCourtRentOneHourOnWeekend = tokenizedList.getFloat(ColumnIndex.TENNIS_COURT_RENT_ONE_HOUR_ON_WEEKEND),
            oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = tokenizedList.getFloat(ColumnIndex.ONE_MIN_OF_PREPAID_MOBILE_TARIFF_LOCAL_NO_DISCOUNTS_OR_PLANS),
            internationalPrimarySchoolYearlyForOneChild = tokenizedList.getFloat(ColumnIndex.INTERNATIONAL_PRIMARY_SCHOOL_YEARLY_FOR_ONE_CHILD),
            preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = tokenizedList.getFloat(ColumnIndex.PRESCHOOL_OR_KINDERGARTEN_FULL_DAY_PRIVATE_MONTHLY_FOR_ONE_CHILD),
        )
    }

    private fun constructClothesPricesFromTokens(tokenizedList: List<String>): ClothesPrices{
        return ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = tokenizedList.getFloat(ColumnIndex.ONE_PAIR_OF_JEANS_LEVIS_50ONE_OR_SIMILAR),
            oneSummerDressInAChainStoreZaraHAndM = tokenizedList.getFloat(ColumnIndex.ONE_SUMMER_DRESS_IN_A_CHAIN_STORE_ZARA_H_AND_M),
            onePairOfNikeRunningShoesMidRange = tokenizedList.getFloat(ColumnIndex.ONE_PAIR_OF_NIKE_RUNNING_SHOES_MID_RANGE),
            onePairOfMenLeatherBusinessShoes = tokenizedList.getFloat(ColumnIndex.ONE_PAIR_OF_MEN_LEATHER_BUSINESS_SHOES),
        )
    }

    private fun constructTransportationsPricesFromTokens(tokenizedList: List<String>): TransportationsPrices{
        return TransportationsPrices(
            gasolineOneLiter = tokenizedList.getFloat(ColumnIndex.GASOLINE_ONE_LITER),
            taxi1hourWaitingNormalTariff = tokenizedList.getFloat(ColumnIndex.TAXI_1HOUR_WAITING_NORMAL_TARIFF),
            taxi1kmNormalTariff = tokenizedList.getFloat(ColumnIndex.TAXI_1KM_NORMAL_TARIFF),
            monthlyPassRegularPrice = tokenizedList.getFloat(ColumnIndex.MONTHLY_PASS_REGULAR_PRICE),
            oneWayTicketLocalTransport = tokenizedList.getFloat(ColumnIndex.ONE_WAY_TICKET_LOCAL_TRANSPORT),
            taxiStartNormalTariff = tokenizedList.getFloat(ColumnIndex.TAXI_START_NORMAL_TARIFF)
        )
    }

    private fun constructCarsPricesFromTokens(tokenizedList: List<String>): CarsPrices{
        return CarsPrices(
            volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = tokenizedList.getFloat(ColumnIndex.VOLKSWAGEN_GOLF_1_4_90KW_TREND_LINE_OR_EQUIVALENT_NEW_CAR),
            toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = tokenizedList.getFloat(ColumnIndex.TOYOTA_COROLLA_SEDAN_1_6L_97KW_COMFORT_OR_EQUIVALENT_NEW_CAR),
        )
    }

    private fun constructRealStatesPricesFromTokens(tokenizedList: List<String>): RealEstatesPrices{
        return RealEstatesPrices(
            apartmentOneBedroomInCityCentre = tokenizedList.getFloat(ColumnIndex.APARTMENT_ONE_BEDROOM_IN_CITY_CENTRE),
            apartmentOneBedroomOutsideOfCentre = tokenizedList.getFloat(ColumnIndex.APARTMENT_ONE_BEDROOM_OUTSIDE_OF_CENTRE),
            apartment3BedroomsInCityCentre = tokenizedList.getFloat(ColumnIndex.APARTMENT_3_BEDROOMS_IN_CITY_CENTRE),
            apartment3BedroomsOutsideOfCentre = tokenizedList.getFloat(ColumnIndex.APARTMENT_3_BEDROOMS_OUTSIDE_OF_CENTRE),
            pricePerSquareMeterToBuyApartmentInCityCentre = tokenizedList.getFloat(ColumnIndex.PRICE_PER_SQUARE_METER_TO_BUY_APARTMENT_IN_CITY_CENTRE),
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = tokenizedList.getFloat(ColumnIndex.PRICE_PER_SQUARE_METER_TO_BUY_APARTMENT_OUTSIDE_OF_CENTRE),
        )
    }

    private fun List<String>.getFloat(index: Int): Float?{
        return this[index].toFloatOrNull()
    }
}