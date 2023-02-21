package interactor

import model.CityEntity
//task 6
class GetTopCitiesForBuyingApartment(private val citiesData: CostOfLivingDataSource) {

    fun execute(limit: Int): List<Pair<String, Float>> {
        return citiesData.getAllCitiesData()
            .asSequence()
            .filter(::isDataQualityAndNotNullSalaryAndApartmentPerMeter)
            .distinctBy { it.cityName }
            .map {Pair(it.cityName, getTotalYearsToBuyApartmentOf100SquareMeter(it))
            }.sortedBy { it.second }.take(limit).toList()
    }

    private fun isDataQualityAndNotNullSalaryAndApartmentPerMeter(city: CityEntity)=
         city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!= null
                 && city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality


    private fun getTotalYearsToBuyApartmentOf100SquareMeter(city: CityEntity): Float {
        val pricePerSquareMeter = city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!
        val averageMonthlyNetSalary = city.averageMonthlyNetSalaryAfterTax!!
        return (100 * pricePerSquareMeter) / (12 * averageMonthlyNetSalary)
    }

}