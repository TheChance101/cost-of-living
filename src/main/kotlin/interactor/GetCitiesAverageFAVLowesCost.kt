package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices

class GetCitiesAverageFAVLowesCost (
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String> {
        return listOf("Cairo","Aswan","Luxor","Alexandria","Sharm el sheikh","Hurghada","Helwan","Maadi","Dahb","Edfu","Damanhur").take(limit)
    }



}