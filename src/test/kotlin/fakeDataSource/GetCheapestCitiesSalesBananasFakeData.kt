package fakeDataSource

import model.*

class GetCheapestCitiesSalesBananasFakeData {
    private val validData = arrayOf(
        CityEntity(
            "City1",
            "Country1",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, 50f, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            5000f,
            false
        ),
        CityEntity(
            "City2",
            "Country1",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, 80f, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            5000f,
            false
        ),
        CityEntity(
            "City4",
            "Country1",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, 300f, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            5000f,
            false
        ),
        CityEntity(
            "City6",
            "Country4",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, 10f, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            5000f,
            false
        ),
    )
    private val resultOfValidData = listOf("City6", "City1", "City2", "City4")

    private val variousCitiesData =  arrayOf(
        CityEntity(
            "City1",
            "Country1",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, 50f, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            5000f,
            false
        ),
        CityEntity(
            "City2",
            "Country1",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, 80f, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            5000f,
            false
        ),
        CityEntity(
            "City4",
            "Country1",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, 300f, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            5000f,
            false
        ),
        CityEntity(
            "City6",
            "Country4",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, 10f, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            5000f,
            false
        ),
        CityEntity(
            "City20",
            "Country4",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            5000f,
            false
        ),
        CityEntity(
            "City64",
            "Country4",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            5000f,
            false
        ),
    )

    fun getCorrectValidData() = validData
    fun getResultForValidData() = resultOfValidData

    fun getVariousCitiesData() = variousCitiesData
    fun getResultForVariousCitiesData() = listOf("City6", "City1", "City2", "City4")

}