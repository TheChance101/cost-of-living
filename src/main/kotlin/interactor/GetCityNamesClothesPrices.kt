package interactor

import model.CityEntity
import model.CityNameClothesPrices

class GetCityNamesClothesPrices(
    private val dataSource: List<CityEntity>,
) {

    fun execute( ): List<CityNameClothesPrices> {

        if(dataSource.size == 0  ) throw  Exception (" the data you pass hasn't city ")

        return dataSource.map (gitCityNamesClothesPrices )
    }

    private val gitCityNamesClothesPrices = { city : CityEntity ->
        val cityNameClothesPrices = CityNameClothesPrices(
            cityName = city.cityName ,
            onePairOfJeansLevis50oneOrSimilar = city.clothesPrices.onePairOfJeansLevis50oneOrSimilar,
            oneSummerDressInAChainStoreZaraHAndM =city.clothesPrices.oneSummerDressInAChainStoreZaraHAndM,
            onePairOfMenLeatherBusinessShoes= city.clothesPrices.onePairOfMenLeatherBusinessShoes,
            onePairOfNikeRunningShoesMidRange = city.clothesPrices.onePairOfNikeRunningShoesMidRange
        )
        cityNameClothesPrices
    }
}