package interactor

import model.CarsPrices
import model.CityEntity

class GetCitiesLeastAvgCarPricesInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter { it.isDataQualityHighAndValidSalary() }
            .sortedBy { it.carsPrices.getAvgCarPrices() }
            .distinctBy { it.cityName }
            .take(limit)
            .map { it.cityName }
    }

    private fun CarsPrices.getAvgCarPrices(): Float {
        var sum = 0f
        var count = 0f
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar?.let { sum += it; count++ }
        toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar?.let { sum += it; count++ }
        return sum / count
    }

    private fun CityEntity.isDataQualityHighAndValidSalary() = dataQuality &&
            averageMonthlyNetSalaryAfterTax != null &&
            averageMonthlyNetSalaryAfterTax >= 0f
}

