package interactor

import model.CityEntity
import java.util.stream.Stream

class GetCitiesNamesSortedByCheapestBananaPriceInteractor {

    fun execute(vararg cities: CityEntity): List<String> {

        return cities.asList()
            .filter(::isBananaPriceNonNull)
            .map(CityEntity::cityName)
    }

    private fun isBananaPriceNonNull(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null
    }


}