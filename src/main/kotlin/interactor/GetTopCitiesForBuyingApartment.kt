package interactor

import model.CityEntity

class GetTopCitiesForBuyingApartment(private val citiesData: CostOfLivingDataSource) {

    fun execute(limit: Int): List<Pair<String, Float>> {
        return citiesData.getAllCitiesData()
            .asSequence()
            .filter(::executeFilteringNullSalariesAndPricePerSquareMeterAndDataQuality)
            .distinctBy { it.cityName }.map {
                Pair(it.cityName, executeYearsNumTakenToBuyApartmentOf100SquareMeter(it))
            }.sortedBy { it.second }.take(limit).toList()
    }

    private fun executeFilteringNullSalariesAndPricePerSquareMeterAndDataQuality(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null && city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }

    private fun executeYearsNumTakenToBuyApartmentOf100SquareMeter(city: CityEntity): Float {
        val pricePerSquareMeter = city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!
        val averageMonthlyNetSalary = city.averageMonthlyNetSalaryAfterTax!!
        return (100 * pricePerSquareMeter) / (12 * averageMonthlyNetSalary)
    }

}