package interactor

import model.CityEntity

class GetCitiesNamesSortedByCheapestBananaPriceInteractor {

    fun execute(vararg cities: CityEntity): List<String> {

        return cities.asList()
            .filter(::isBananaPriceNonNull)
            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .map(CityEntity::cityName)

    }

    private fun isBananaPriceNonNull(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null
    }


}