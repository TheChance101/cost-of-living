package interactor

import model.CityEntity

open class GetTheTopCitiesWhereYouCanGetAnApartmentFaster(private val dataSource: CostOfLivingDataSource) {

    // function return top 10 cites has can pay apartment faster
    private fun getTopTenCitesHasCanPayApartmentFaster(): List<CityEntity> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullPricePerSquareMeterAndLowQualityData)
            .sortedBy {
                it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre
            }
            .take(10)

    }

    // function return name of city and number of years to pay apartment
    fun getListOfDetailsOfApartment(salary: Int): List<Pair<String, Float>> {
        if (salary == 0){
             throw Exception()}
        return getTopTenCitesHasCanPayApartmentFaster()
            .map { Pair(it.cityName, numberOfYearsToBuyApartment(salary, it)) }
    }

    // function return true if price per meter not equal null and the city contain data quality
    private fun excludeNullPricePerSquareMeterAndLowQualityData(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null && city.dataQuality
    }

    // function return number of years to buy apartment
    private fun numberOfYearsToBuyApartment(salary: Int, city: CityEntity): Float {

        return (100 * city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!) / (salary * 12)

    }
}
