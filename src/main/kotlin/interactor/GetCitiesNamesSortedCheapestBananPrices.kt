package interactor

import model.CityEntity

class GetCitiesNamesSortedCheapestBananPrices {

    fun excute(vararg cities:CityEntity):List<String>{
        return cities
            .filter(::excludeNullCityAndLowQualityData)
            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .map { it.cityName }
    }
    
    private fun excludeNullCityAndLowQualityData(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null && city.dataQuality
    }

}