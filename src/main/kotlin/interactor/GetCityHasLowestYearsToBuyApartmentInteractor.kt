package interactor

import model.CityEntity

class GetCityHasLowestYearsToBuyApartmentInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int, fullTimeSalary: Int): List<Pair<String, Float>> {
        if(fullTimeSalary<=0 || limit<0) {
            throw Exception("Not valid full time salary")
        }else {
            return dataSource
                .getAllCitiesData()
                .filter(::excludeNullSalariesAndLowQualityData)
                .sortedBy { getNumberOfYearsToBuyApartment(fullTimeSalary, it) }
                .take(limit)
                .map { Pair(it.cityName, getNumberOfYearsToBuyApartment(fullTimeSalary, it)) }
        } }

     fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null && city.dataQuality

    }

     fun getNumberOfYearsToBuyApartment(fullTimeSalary: Int, city: CityEntity): Float {
         if(fullTimeSalary<=0) {
             throw Exception("Not valid full time salary")
         }
         val numberOfYears =  city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!/(fullTimeSalary*12)
         return numberOfYears
     }
}