package interactor
import dataSource.utils.ColumnIndex
class ReorderCitiesByCheapestBananaPrices(private val dataSource: CostOfLivingDataSource) {

    fun reorderTheGivenList(vararg citiesToLiveIn: String): List<String>{
        return dataSource
            .getAllCitiesData()
            .sortedBy { ColumnIndex.BANANA_1KG }
            .map { it.cityName }
            .intersect(citiesToLiveIn.toList())
            .toList()
    }

}