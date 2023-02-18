package interactor

import model.CityEntity

class GetCityHasLowestYearsToBuyApartmentInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int): List<Pair<String, Float>> {
        return (dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndNullPricePerSquareApartmentAndLowQualityData)
            .sortedBy { getNumberOfYearsToBuyApartment(it) }
            .takeIf { (limit > 0) } ?: throw Exception("Not valid limit or full time salary "))
            .take(limit)
            .map { Pair(it.cityName, getNumberOfYearsToBuyApartment(it)) }
    }

    fun excludeNullSalariesAndNullPricePerSquareApartmentAndLowQualityData(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null
                && city.dataQuality
                && city.averageMonthlyNetSalaryAfterTax != null
    }

    fun getNumberOfYearsToBuyApartment(city: CityEntity): Float {
        return 100 * (city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!) /
                (city.averageMonthlyNetSalaryAfterTax!! * 12)

    }
}