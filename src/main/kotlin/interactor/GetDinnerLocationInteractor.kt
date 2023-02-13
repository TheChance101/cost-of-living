package interactor

import model.*

class GetDinnerLocationInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(): CityEntity {
        return CityEntity(
            "City1",
            "Country1",
            MealsPrices(55.6f, 963.1f, 31.6f),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            14563f,
            true
        )

    }
}
