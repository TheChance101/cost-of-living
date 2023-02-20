package interactor.addons

import interactor.CostOfLivingDataSource
import model.CityEntity

class GetCityHasLowestCarsPriceInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): String {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullValues)
            .sortedByDescending{
                it.carsPrices.volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar!!.toDouble() +
                it.carsPrices.toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar!!.toDouble()
            }
            .last().cityName
    }


    fun excludeNullValues(city: CityEntity): Boolean {
        return city .run{
                carsPrices.volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar!=null
                &&carsPrices.toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar!=null
                && dataQuality
        }
    }


}