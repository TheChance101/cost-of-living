package interactor

import model.CityEntity
import utils.isNotNull

class GetCitiesNamesSortedCheapestBananaPrices {

    fun execute(vararg cities:CityEntity):List<String>{
        return cities
            .filter(::excludeNullBananaPricesAndLowQualityData)
            .let { it.ifEmpty { throw NoReturnedDataException("The list of cities you entered is empty") } }
            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .map { it.cityName }
    }
    
    private fun excludeNullBananaPricesAndLowQualityData(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg.isNotNull() && city.dataQuality
    }

}