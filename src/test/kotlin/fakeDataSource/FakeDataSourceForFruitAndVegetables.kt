package fakeDataSource

import interactor.CostOfLivingDataSource
import model.*

class FakeDataSourceForFruitAndVegetables {
    private val lowQualityDataSource = object : CostOfLivingDataSource {
        override fun getAllCitiesData(): List<CityEntity> {
            return listOf(
                createCustomCity(
                    "",
                    null, null, 10f, 1f, null,5f, null,
                    6700f,
                    false
                ),
                createCustomCity(
                    "City13",
                    -1.0f, -2.10f, -3.10f, 4.10f, null, 6.10f, 7.10f,
                    7400f,
                    false
                ),
                createCustomCity(
                    "City14",
                    -3.0f, null, 3.10f, 4.10f, 5.10f, 6.10f, 7.10f,
                   3600f,
                    false
                ),
                createCustomCity(
                    "City15",
                   -1.9f, 2.10f, 3.10f, 4.10f, 5.10f, 6.10f, null,
                   10000f,
                    false
                ),
                createCustomCity(
                    "City16",
                    -6.0f, 2.10f, 3.10f, null, 5.10f, 6.10f, 7.10f,
                    6900f,
                    false
                ),
                createCustomCity(
                    "City17",
                   -9.0f, -0.10f, null, 4.10f, 5.10f, -6.10f, 7.10f,
                   6300f,
                    false
                ),
                createCustomCity(
                    "City18",
                    -10.8f, 0.14f, 7.10f, -47.10f, null, 6.10f, 7.10f,
                   6100f,
                    false
                ),
                createCustomCity(
                    "City19",
                    -15.0f, 2.10f, 36.10f, null, 5.10f, 6.10f, 7.10f,
                    7400f,
                    false
                ),
                createCustomCity(
                    "",
                   null, null, null, null, null, null, null,
                   8800f,
                    false
                )
            )
        }
    }
    private val fruitAndVegitabelsCleanData = object : CostOfLivingDataSource {
        override fun getAllCitiesData(): List<CityEntity> {
            return listOf(
                crateCustomCityWithFruitAndVegtables(
                    "City1",
                    1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f,
                    5000f,
                ),
                crateCustomCityWithFruitAndVegtables(
                    "City2",
                    1.1f, 2.1f, 3.1f, 4.1f, 5.1f, 6.1f, 7.1f,
                    4000f,
                ),
                crateCustomCityWithFruitAndVegtables(
                    "City3",
                    1.2f, 2.2f, 3.2f, 4.2f, 5.2f, 6.2f, 7.2f,
                    6000f,
                ),
                crateCustomCityWithFruitAndVegtables(
                    "City4",
                    1.3f, 2.3f, 3.3f, 4.3f, 5.3f, 6.3f, 7.3f,
                    5500f,
                ),
                crateCustomCityWithFruitAndVegtables(
                    "City5",
                    1.4f, 2.4f, 3.4f, 4.4f, 5.4f, 6.4f, 7.4f,
                    5400f,
                ),
                crateCustomCityWithFruitAndVegtables(
                    "City6",
                    1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f,
                    5300f,
                ),
                crateCustomCityWithFruitAndVegtables(
                    "City7",
                    1.6f, 2.6f, 3.6f, 4.6f, 5.6f, 6.6f, 7.6f,
                    5200f,
                ),
                crateCustomCityWithFruitAndVegtables(
                    "City8",
                    1.7f, 2.7f, 3.7f, 4.7f, 5.7f, 6.7f, 7.7f,
                    5100f,
                ),
                crateCustomCityWithFruitAndVegtables(
                    "City9",
                    1.8f, 2.8f, 3.8f, 4.8f, 5.8f, 6.8f, 7.8f,
                    4900f,
                ), crateCustomCityWithFruitAndVegtables(
                    "City10",
                    1.9f, 2.9f, 3.9f, 4.9f, 5.9f, 6.9f, 7.9f,
                    4500f,
                ),
                crateCustomCityWithFruitAndVegtables(
                    "City11",
                    1.11f, 2.11f, 3.11f, 4.11f, 5.11f, 6.11f, 7.11f,
                    4700f,
                )
            )


        }

    }


    fun crateCustomCityWithFruitAndVegtables(
        cityName: String,
        apples: Float?,
        banana: Float?,
        oranges: Float?,
        tomato: Float?,
        potato: Float?,
        onion: Float?,
        lettuceOneHead: Float?,
        salary: Float?
    ) = CityEntity(
        cityName,
        "country",
        MealsPrices(null, null, null),
        DrinksPrices(null, null, null, null, null),
        FruitAndVegetablesPrices(apples, banana, oranges, tomato, potato, onion, lettuceOneHead),
        FoodPrices(null, null, null, null, null, null),
        ServicesPrices(null, null, null, null, null, null, null, null),
        ClothesPrices(null, null, null, null),
        TransportationsPrices(null, null, null, null, null, null),
        CarsPrices(null, null),
        RealEstatesPrices(null, null, null, null, null, null),
        salary,
        true
    )

    fun getLowQualityFruitAndVegitabels() = lowQualityDataSource

    fun getFruitAndVegitabelsCleanData() = fruitAndVegitabelsCleanData

    fun createCustomCity(
        cityName: String,
        apples: Float? = null,
        banana: Float? = null,
        oranges: Float? = null,
        tomato: Float? = null,
        potato: Float? = null,
        onion: Float? = null,
        lettuceOneHead: Float? = null,
        salary: Float?,
        dataQuality: Boolean
    ) = CityEntity(
        cityName,
        "country",
        MealsPrices(null, null, null),
        DrinksPrices(null, null, null, null, null),
        FruitAndVegetablesPrices(apples, banana, oranges, tomato, potato, onion, lettuceOneHead),
        FoodPrices(null, null, null, null, null, null),
        ServicesPrices(null, null, null, null, null, null, null, null),
        ClothesPrices(null, null, null, null),
        TransportationsPrices(null, null, null, null, null, null),
        CarsPrices(null, null),
        RealEstatesPrices(null, null, null, null, null, null),
        salary,
        dataQuality
    )

}