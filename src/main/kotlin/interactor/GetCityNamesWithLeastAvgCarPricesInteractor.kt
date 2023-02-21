package interactor

import model.CarsPrices

//additional task
class GetCityNamesWithLeastAvgCarPricesInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(limit: Int): List<Pair<String, Float>> {
        return dataSource
            .getAllCitiesData()
            .filter { isCarPriceNotNullAndPositive(it.carsPrices) }
            .sortedBy { getAvgCarPrices(it.carsPrices) }
            .map { Pair(it.cityName, getAvgCarPrices(it.carsPrices)) }
            .takeIf { limit >= 0 }
            ?.take(limit) ?: emptyList()
    }

    private fun getAvgCarPrices(carPrices: CarsPrices): Float {
        var sum = 0f
        var count = 0f
        carPrices.volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar?.let { sum += it; count++ }
        carPrices.toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar?.let { sum += it; count++ }
        return sum / count
    }

    private fun isCarPriceNotNullAndPositive(carPrices: CarsPrices): Boolean {
        carPrices.run {
            return (volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar != null && volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar >= 0) &&
                    (toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar != null && toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar >= 0)

        }
    }
}

