package fakeDataSource

import interactor.CostOfLivingDataSource
import model.*

class SearchForSalariesFakeDataSource : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            CityEntity(
                "City1", "Country1", MealsPrices(null, null, null),
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
                "City2", "Country2", MealsPrices(null, null, null),
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
                "City3", "Country3", MealsPrices(null, null, null),
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
                "City4", "Country4", MealsPrices(null, null, null),
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
                "City5", "Country5", MealsPrices(null, null, null),
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
                "City6", "Country6", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                null,
                true
            ),
            CityEntity(
                "City7", "Country7", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                null,
                true
            ),
            CityEntity(
                "City8", "Country8", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                null,
                true
            ),
            CityEntity(
                "City9", "Country9", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                null,
                true
            ),
            CityEntity(
                "City10", "Country10", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                null,
                true
            ),
            CityEntity(
                "Cairo", "Egypt", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                3000f,
                true
            ),
            CityEntity(
                "Alexandria", "Egypt", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                4000f,
                true
            ),
            CityEntity(
                "Mansoura", "Egypt", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                2000f,
                true
            ),
            CityEntity(
                "Suis", "Egypt", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                2500f,
                true
            ),
            CityEntity(
                "Riyadh", "Saudi Arabia", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5500f,
                true
            ),
            CityEntity(
                "Jeddah", "Saudi Arabia", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                4500f,
                true
            ),
            CityEntity(
                "Dammam", "Saudi Arabia", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                2000f,
                true
            ),
            CityEntity(
                "Abha", "Saudi Arabia", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                3000f,
                true
            ),
            CityEntity(
                "London", "UK", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                7000f,
                true
            ),
            CityEntity(
                "Manchester", "UK", MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5000f,
                true
            ),
        )
    }

    fun getHighQualityCityEntity() = CityEntity(
        "City7", "Country7", MealsPrices(null, null, null),
        DrinksPrices(null, null, null, null, null),
        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
        FoodPrices(null, null, null, null, null, null),
        ServicesPrices(null, null, null, null, null, null, null, null),
        ClothesPrices(null, null, null, null),
        TransportationsPrices(null, null, null, null, null, null),
        CarsPrices(null, null),
        RealEstatesPrices(null, null, null, null, null, null),
        null,
        true
    )

    fun getLowQualityCityEntity() = CityEntity(
        "City3", "Country3", MealsPrices(null, null, null),
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
    )

    fun getNullSalaries() = CityEntity(
        "City6", "Country6", MealsPrices(null, null, null),
        DrinksPrices(null, null, null, null, null),
        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
        FoodPrices(null, null, null, null, null, null),
        ServicesPrices(null, null, null, null, null, null, null, null),
        ClothesPrices(null, null, null, null),
        TransportationsPrices(null, null, null, null, null, null),
        CarsPrices(null, null),
        RealEstatesPrices(null, null, null, null, null, null),
        null,
        true
    )

    fun getNotNullAverageSalaries() = CityEntity(
        "City6", "Country6", MealsPrices(null, null, null),
        DrinksPrices(null, null, null, null, null),
        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
        FoodPrices(null, null, null, null, null, null),
        ServicesPrices(null, null, null, null, null, null, null, null),
        ClothesPrices(null, null, null, null),
        TransportationsPrices(null, null, null, null, null, null),
        CarsPrices(null, null),
        RealEstatesPrices(null, null, null, null, null, null),
        5000f,
        true
    )

    fun getExpectedCities() = listOf(Pair("Cairo", 3000f), Pair("Alexandria", 4000f), Pair("Mansoura", 2000f), Pair("Suis", 2500f))
}




