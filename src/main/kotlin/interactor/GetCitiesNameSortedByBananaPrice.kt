package interactor

import model.CityEntity


fun getCitiesNameSortedByBananaPrice(vararg cities: CityEntity): List<String> {

    return cities.filter { it.fruitAndVegetablesPrices.banana1kg != null && !it.fruitAndVegetablesPrices.banana1kg.isNaN() }
        .map { it.cityName }


}