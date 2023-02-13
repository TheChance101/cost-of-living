package interactor

import model.CityEntity

open class GetTheRightApartment(private val dataSource: CostOfLivingDataSource) {

// function return top 10 cites has can pay apartment faster
    private fun getTopTenCitesHasCanPayApartmentFaster(): List<CityEntity> {

    }
    // function return name of city and number of years to pay apartment
    fun getListOfDetailsOfApartment(salary: Int): List<Pair<String, Float>> {
       }
    // function return true if price per meter not equal null and the city contain data quality
    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null && city.dataQuality
    }
    // function return true
    private fun numberOfYearsToBuyApartment(salary: Int, city: CityEntity): Float {
        }
}

