package interactor

import model.CityEntity

class GetCityHasLowestYearsToBuyApartmentInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int, fullTimeSalary: Int): List<Pair<String, Float>> {

        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndLowQualityData)
            .sortedBy { getNumberOfYearsToBuyApartment(fullTimeSalary, it) }
            .take(limit)
            .map { Pair(it.cityName, getNumberOfYearsToBuyApartment(fullTimeSalary, it)) }
    }

     fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null && city.dataQuality

    }

     fun getNumberOfYearsToBuyApartment(fullTimeSalary: Int, city: CityEntity): Float {
        TODO(" Not implemented yet ")

    }
}