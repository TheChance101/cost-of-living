package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices

class GetCheapestCitiesSalesBananas {
    fun execute(vararg cities: CityEntity): List<CityEntity> {
        return cities.toList()

    }
}

fun excludeNullBananas(fruitAndVegetablesPrices: FruitAndVegetablesPrices)= fruitAndVegetablesPrices.banana1kg != null




