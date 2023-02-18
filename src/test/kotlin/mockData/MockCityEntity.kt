package mockdata

import model.*

object MockCityEntity {

    // region for GetCityHasCheapestInternetConnectionInteractor (Problem 1)
    fun createMockCity(cityName: String, averageMonthlyNetSalaryAfterTax: Float?, internetPrice: Float?): CityEntity {
        return CityEntity(
            cityName,
            "Egypt",
            MealsPrices(
                null,
                null,
                null
            ),
            DrinksPrices(
                null,
                null,
                null,
                null,
                null
            ),
            FruitAndVegetablesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            FoodPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ServicesPrices(
                null,
                null,
                internetPrice,
                null,
                null,
                null,
                null,
                null
            ),
            ClothesPrices(
                null,
                null,
                null,
                null
            ),
            TransportationsPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            CarsPrices(
                null,
                null
            ),
            RealEstatesPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            averageMonthlyNetSalaryAfterTax,
            true
        )

    }
    //endregion for GetCityHasCheapestInternetConnectionInteractor (Problem 1)

    // region for GetTopCitiesFruitsAndVegetablesLowestCostInteractor (Problem 2)
    fun createMockCity(
        cityName: String,
        fruitAndVegetablesPrices: FruitAndVegetablesPrices,
        averageMonthlyNetSalaryAfterTax: Float?
    ): CityEntity {
        return CityEntity(
            cityName,
            "England",
            MealsPrices(
                null,
                null,
                null
            ),
            DrinksPrices(
                null,
                null,
                null,
                null,
                null
            ),
            fruitAndVegetablesPrices,
            FoodPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ServicesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ClothesPrices(
                null,
                null,
                null,
                null
            ),
            TransportationsPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            CarsPrices(
                null,
                null
            ),
            RealEstatesPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            averageMonthlyNetSalaryAfterTax,
            true
        )

    }
    // endregion for GetTopCitiesFruitsAndVegetablesLowestCostInteractor (Problem 2)

    // region for GetSalaryAverageForCitiesInCountryInteractor (Problem 3)
    fun createMockCity(
        countryName: String,
        cityName: String,
        averageMonthlyNetSalaryAfterTax: Float?,
        dataQuality: Boolean
    ): CityEntity {
        return CityEntity(
            cityName,
            countryName,
            MealsPrices(
                null,
                null,
                null
            ),
            DrinksPrices(
                null,
                null,
                null,
                null,
                null
            ),
            FruitAndVegetablesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            FoodPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ServicesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ClothesPrices(
                null,
                null,
                null,
                null
            ),
            TransportationsPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            CarsPrices(
                null,
                null
            ),
            RealEstatesPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            averageMonthlyNetSalaryAfterTax,
            dataQuality,
        )

    }
    //endregion for GetSalaryAverageForCitiesInCountryInteractor (Problem 3)

    // region for GetCityHasHighestDifferentRentBetweenCityCenterAndOutsideInteractor (Problem 4)
    fun createMockCity(
        apartmentOneBedroomInCityCentre: Float?,
        apartmentOneBedroomOutsideOfCentre: Float?,
        apartment3BedroomsInCityCentre: Float?,
        apartment3BedroomsOutsideOfCentre: Float?,
        dataQuality: Boolean
    ): CityEntity {
        return CityEntity(
            "Paris",
            "France",
            MealsPrices(
                null,
                null,
                null
            ),
            DrinksPrices(
                null,
                null,
                null,
                null,
                null
            ),
            FruitAndVegetablesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            FoodPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ServicesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ClothesPrices(
                null,
                null,
                null,
                null
            ),
            TransportationsPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            CarsPrices(
                null,
                null
            ),
            RealEstatesPrices(
                apartmentOneBedroomInCityCentre,
                apartmentOneBedroomOutsideOfCentre,
                apartment3BedroomsInCityCentre,
                apartment3BedroomsOutsideOfCentre,
                null,
                null
            ),
            null,
            dataQuality,
        )

    }
    // endregion for GetCityHasHighestDifferentRentBetweenCityCenterAndOutsideInteractor (Problem 4)

    // region for GetTop5CitiesNameHasSuitableClothesPricesInteractor (Problem 5)
    fun createMockCity(
        cityName: String,
        clothesPrices: ClothesPrices
    ): CityEntity {
        return CityEntity(
            cityName,
            "Netherlands",
            MealsPrices(
                null,
                null,
                null
            ),
            DrinksPrices(
                null,
                null,
                null,
                null,
                null
            ),
            FruitAndVegetablesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            FoodPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ServicesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            clothesPrices,
            TransportationsPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            CarsPrices(
                null,
                null
            ),
            RealEstatesPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            null,
            true,
        )

    }
    //endregion for GetTop5CitiesNameHasSuitableClothesPricesInteractor (Problem 5)

    // region for GetCityHasLowestYearsToBuyApartmentInteractor (Problem 6)
    fun createMockCity(
        cityName: String,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre: Float?,
        dataQuality: Boolean,
        averageMonthlyNetSalaryAfterTax :Float?
    ): CityEntity {
        return CityEntity(
            cityName,
            "Columbia",
            MealsPrices(
                null,
                null,
                null
            ),
            DrinksPrices(
                null,
                null,
                null,
                null,
                null
            ),
            FruitAndVegetablesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            FoodPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ServicesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ClothesPrices(
                null,
                null,
                null,
                null
            ),
            TransportationsPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            CarsPrices(
                null,
                null
            ),
            RealEstatesPrices(
                null,
                null,
                null,
                null,
                null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre,
            ), averageMonthlyNetSalaryAfterTax ,
            dataQuality,
        )

    }
    // endregion for GetCityHasLowestYearsToBuyApartmentInteractor (Problem 6)

    // region for GetCheapestBananaCitiesNamesInteractor (Problem 7)
    fun createMockCity(cityName: String, bananaPrice: Float?): CityEntity {
        return CityEntity(
            cityName,
            "Iraq",
            MealsPrices(
                null,
                null,
                null
            ),
            DrinksPrices(
                null,
                null,
                null,
                null,
                null
            ),
            FruitAndVegetablesPrices(
                null,
                bananaPrice,
                null,
                null,
                null,
                null,
                null
            ),
            FoodPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ServicesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ClothesPrices(
                null,
                null,
                null,
                null
            ),
            TransportationsPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            CarsPrices(
                null,
                null
            ),
            RealEstatesPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            null,
            true
        )

    }
    // endregion for GetCheapestBananaCitiesNamesInteractor(Problem 7)

    // region for GetCityHasCheapestMealPricesInteractor (Problem 8)
    fun createMockCity(countryName: String, cityName: String, mealsPrices: MealsPrices): CityEntity {
        return CityEntity(
            cityName,
            countryName,
            mealsPrices,
            DrinksPrices(
                null,
                null,
                null,
                null,
                null
            ),
            FruitAndVegetablesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            FoodPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ServicesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ClothesPrices(
                null,
                null,
                null,
                null
            ),
            TransportationsPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            CarsPrices(
                null,
                null
            ),
            RealEstatesPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            null,
            true
        )

    }
    // endregion for GetCityHasCheapestMealPricesInteractor (Problem 8)

    // region for GetTopTenCountryEnforceHighTaxesOnCarbonatedDrinksInteractor (Problem 9)
    fun createMockCity(
        countryName: String,
        cocaPepsiPrice: Float,
        dataQuality: Boolean,
    ): CityEntity {
        return CityEntity(
            "Honey City",
            countryName,
            MealsPrices(
                null,
                null,
                null
            ),
            DrinksPrices(
                null,
                cocaPepsiPrice,
                null,
                null,
                null
            ),
            FruitAndVegetablesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            FoodPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ServicesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ClothesPrices(
                null,
                null,
                null,
                null
            ),
            TransportationsPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            CarsPrices(
                null,
                null
            ),
            RealEstatesPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            null,
            dataQuality
        )

    }
    // endregion for GetTopTenCountryEnforceHighTaxesOnCarbonatedDrinksInteractor (Problem 9)

    // region for GetSuitableCityMoreSavingPerMonthInteractor (Problem 10)
    fun createMockCity(
        foodPrices: FoodPrices,
        averageMonthlyNetSalaryAfterTax: Float?,
        apartment3BedroomsInCityCentre: Float?
    ): CityEntity {
        return CityEntity(
            "Cairo",
            "Egypt",
            MealsPrices(
                null,
                null,
                null
            ),
            DrinksPrices(
                null,
                null,
                null,
                null,
                null
            ),
            FruitAndVegetablesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            foodPrices,
            ServicesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ClothesPrices(
                null,
                null,
                null,
                null
            ),
            TransportationsPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            CarsPrices(
                null,
                null
            ),
            RealEstatesPrices(
                null,
                null,
                apartment3BedroomsInCityCentre,
                null,
                null,
                null
            ),
            averageMonthlyNetSalaryAfterTax,
            true
        )

    }
    // endregion for GetSuitableCityMoreSavingPerMonthInteractor (Problem 10)

    // region for SearchCheapestCarInCountryInteractor (Problem 11)
    fun createMockCity(
        countryName: String,
        cityName: String,
        carsPrices: CarsPrices,
        averageMonthlyNetSalaryAfterTax: Float?
    ): CityEntity {
        return CityEntity(
            cityName,
            countryName,
            MealsPrices(
                null,
                null,
                null
            ),
            DrinksPrices(
                null,
                null,
                null,
                null,
                null
            ),
            FruitAndVegetablesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            FoodPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ServicesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ClothesPrices(
                null,
                null,
                null,
                null
            ),
            TransportationsPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            carsPrices,
            RealEstatesPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            averageMonthlyNetSalaryAfterTax,
            true,
        )

    }
    // endregion for SearchCheapestCarInCountryInteractor (Problem 11)

    fun createMockCity(
        countryName: String,
        averageMonthlyNetSalaryAfterTax: Float?,
        apartmentOneBedroomInCityCentre: Float?,
        basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment : Float? ,
        monthlyPassRegularPrice : Float?
    ): CityEntity {
        return CityEntity(
            "cityName",
            countryName,
            MealsPrices(
                null,
                null,
                null
            ),
            DrinksPrices(
                null,
                null,
                null,
                null,
                null
            ),
            FruitAndVegetablesPrices(
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            FoodPrices(
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment,
                null,
                null,
                null,
                null,
                null,
                null,
                null
            ),
            ClothesPrices(
                null,
                null,
                null,
                null
            ),
            TransportationsPrices(
                null,
                monthlyPassRegularPrice,
                null,
                null,
                null,
                null
            ),
            CarsPrices(
                null,
                null
            ),
            RealEstatesPrices(
                apartmentOneBedroomInCityCentre,
                null,
                null,
                null,
                null,
                null
            ),
            averageMonthlyNetSalaryAfterTax,
            true
        )

    }

}