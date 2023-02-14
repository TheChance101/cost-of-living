package interactor

class GetTopCitiesForBuyingApartment(private val citiesData: CostOfLivingDataSource) {


    fun findTop10CitiesFor100MeterApartment(): List<Pair<String, Float>> {
        return citiesData.getAllCitiesData().asSequence().filter {
            it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null && it.averageMonthlyNetSalaryAfterTax != null
        }.distinctBy { it.cityName }.map {
            val pricePerSquareMeter = it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!
            val averageMonthlyNetSalary = it.averageMonthlyNetSalaryAfterTax!!
            val years = (100 * pricePerSquareMeter) / (12 * averageMonthlyNetSalary)
            Pair(it.cityName, years)
        }.sortedBy { it.second }.take(10).toList()
    }


}