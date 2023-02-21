package interactor

import model.CityEntity
import utils.isNotNull
import java.lang.IllegalStateException

class GetCitiesNamesSortedCheapestBananaPrices {

    fun execute(vararg cities:CityEntity):List<String>{
        return cities
            .ifEmpty { throw NoSuchElementException("The list of cities you entered is empty") }
            .filter(::excludeNullBananaPricesAndLowQualityData)
            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .map { it.cityName }
    }
    
    private fun excludeNullBananaPricesAndLowQualityData(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg.isNotNull() && city.dataQuality
    }

}