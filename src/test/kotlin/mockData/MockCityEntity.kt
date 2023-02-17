package mockdata

import model.*

object MockCityEntity {

    //region for GetCityHasCheapestInternetConnectionInteractor (Problem 1)
    fun createMockCity(cityName: String, averageMonthlyNetSalaryAfterTax: Float, internetPrice: Float?): CityEntity {
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
    // endregion for GetCityHasCheapestInternetConnectionInteractor (Problem 1)

    //region for GetTopCitiesFruitsAndVegetablesLowestCostInteractor (Problem 2)
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

    // Start region for GetSalaryAverageForCitiesInCountryInteractor (Problem 3)
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
    // End region for GetSalaryAverageForCitiesInCountryInteractor (Problem 3)

    // Start region for GetCityHasHighestDifferentRentBetweenCityCenterAndOutsideInteractor (Problem 4)
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
    // End region for GetCityHasHighestDifferentRentBetweenCityCenterAndOutsideInteractor (Problem 4)

    // Start region for GetTop5CitiesNameHasSuitableClothesPricesInteractor (Problem 5)
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
    // End region for GetTop5CitiesNameHasSuitableClothesPricesInteractor (Problem 5)

    // Start region for GetCityHasLowestYearsToBuyApartmentInteractor (Problem 6)
    fun createMockCity(
        cityName: String,
        pricePerSquareMeterToBuyApartmentOutsideOfCentre: Float?,
        dataQuality: Boolean
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
            ),
            null,
            dataQuality,
        )

    }
    // End region for GetCityHasLowestYearsToBuyApartmentInteractor (Problem 6)

    // Start region for GetCheapestBananaCitiesNamesInteractor (Problem 7)
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
    // End region for GetCheapestBananaCitiesNamesInteractor(Problem 7)

    // Start region for GetCityHasCheapestMealPricesInteractor (Problem 8)
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
    // End region for GetCityHasCheapestMealPricesInteractor (Problem 8)

    // Start region for GetTopTenCountryEnforceHighTaxesOnCarbonatedDrinksInteractor (Problem 9)
    fun createMockCity(
        countryName: String,
        drinksPrices: DrinksPrices,
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
            drinksPrices,
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
    // End region for GetTopTenCountryEnforceHighTaxesOnCarbonatedDrinksInteractor (Problem 9)

    // Start region for GetSuitableCityMoreSavingPerMonthInteractor (Problem 10)
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
    // End region for GetSuitableCityMoreSavingPerMonthInteractor (Problem 10)
}