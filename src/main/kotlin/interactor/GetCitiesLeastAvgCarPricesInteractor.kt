package interactor

import model.CarsPrices
import model.CityEntity

class GetCitiesLeastAvgCarPricesInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(limit: Int): List<Pair<String, Float>> {
        return dataSource
            .getAllCitiesData()
            .filter { isCarPricePositive(it.carsPrices) && isDataQualityHighAndSalaryValid(it) }
            .sortedBy { getAvgCarPrices(it.carsPrices) }
            .distinctBy { it.cityName }
            .take(limit)
            .map {
                Pair(it.cityName, getAvgCarPrices(it.carsPrices))
            }
    }

    private fun getAvgCarPrices(carPrices: CarsPrices): Float {
        var sum = 0f
        var count = 0f
        carPrices.volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar?.let { sum += it; count++ }
        carPrices.toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar?.let { sum += it; count++ }
        return sum / count
    }

    private fun isDataQualityHighAndSalaryValid(cityEntity: CityEntity) = cityEntity.dataQuality &&
            cityEntity.averageMonthlyNetSalaryAfterTax != null &&
            cityEntity.averageMonthlyNetSalaryAfterTax >= 0f

    private fun isCarPricePositive(carPrices: CarsPrices): Boolean {
        carPrices.run {
            return (volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar != null && volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar >= 0) &&
                    (toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar != null && toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar >= 0)

        }
    }
}

