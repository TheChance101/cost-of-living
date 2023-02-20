package interactor
class ReorderCitiesByCheapestBananaPrices(private val dataSource: CostOfLivingDataSource) {

    fun reorderTheGivenList(vararg citiesToLiveIn: String): List<String>{
        return dataSource
            .getAllCitiesData()
            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .map { it.cityName }
            .intersect(citiesToLiveIn.toList().toSet())
            .toList()
    }

}