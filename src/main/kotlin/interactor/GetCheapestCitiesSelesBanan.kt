package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices

class GetCheapestCitiesSalesBananas {
    fun execute(vararg cities: CityEntity) = cities.toList()
        .filter { excludeNullBananas(it.fruitAndVegetablesPrices) }
        .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
        .map { it.cityName }
}
fun excludeNullBananas(fruitAndVegetablesPrices: FruitAndVegetablesPrices) = fruitAndVegetablesPrices.banana1kg != null


