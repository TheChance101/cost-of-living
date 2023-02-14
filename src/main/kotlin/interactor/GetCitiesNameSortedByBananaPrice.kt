package interactor

import model.CityEntity


fun getCitiesNameSortedByBananaPrice(vararg cities: CityEntity) =
    cities.filter { it.fruitAndVegetablesPrices.banana1kg != null && !it.fruitAndVegetablesPrices.banana1kg.isNaN() }
        .sortedBy { it.fruitAndVegetablesPrices.banana1kg }.map { it.cityName }
