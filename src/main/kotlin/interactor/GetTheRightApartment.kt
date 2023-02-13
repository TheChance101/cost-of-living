package interactor

import model.CityEntity
import model.DetailsOfApartment

open class GetTheRightApartment(private val dataSource: CostOfLivingDataSource) {

// function return top 10 cites has can pay apartment faster
    private fun getTopTenCitesHasCanPayApartmentFaster(): List<CityEntity> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndLowQualityData)
            .sortedBy {
                it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre
            }
            .take(10)
    }
    // function return name of city and number of years to pay apartment
    fun getListOfDetailsOfApartment(salary: Int): List<Pair<String, Float>> {
        return getTopTenCitesHasCanPayApartmentFaster()
            .map { Pair(it.cityName, numberOfYearsToBuyApartment(salary, it)) }
    }
    // function return true if price per meter not equal null and the city contain data quality
    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null && city.dataQuality
    }
    // function return true
    private fun numberOfYearsToBuyApartment(salary: Int, city: CityEntity): Float {
        return (100 * city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!) / (salary * 12)
    }
}

