package interactor

import model.CityEntity

class GetTopCitiesFasterToBuyApartmentAndTheNumberOfYearToBuyIt(private val dataSource: CostOfLivingDataSource) {
    fun execute(): List<Pair<String, Float>> {
        return dataSource.getAllCitiesData()
            .filter(::excludeLowDataQualityAndWitiesWithNoMeterPrice)
            .sortedBy(::averageBetweenMeterSquarePriceAndAverageSalary)
            .take(10)
            .map { (Pair(it.cityName, averageBetweenMeterSquarePriceAndAverageSalary(it))) }
    }

    private fun excludeLowDataQualityAndWitiesWithNoMeterPrice(city: CityEntity): Boolean {
        return city.dataQuality &&
                city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null
                && city.averageMonthlyNetSalaryAfterTax != null
    }

    private fun averageBetweenMeterSquarePriceAndAverageSalary(city: CityEntity): Float {
        return (city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!! * 100) / (city.averageMonthlyNetSalaryAfterTax!! * 12)
    }
}