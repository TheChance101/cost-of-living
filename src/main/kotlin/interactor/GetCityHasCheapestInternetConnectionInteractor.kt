package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): String {
        val listOfData = mutableListOf<CityByAverage>()

        dataSource.getAllCitiesData().filter(::excludeNullSalaries).filter(::excludeNullPrice)
            .forEach {
                val percentage =
                    it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! * 1.0 / it.averageMonthlyNetSalaryAfterTax!! * 1.0
                listOfData.add(CityByAverage(it.cityName, percentage))
            }


        listOfData.sortBy { it.percentage }

        return listOfData[0].nameCity


    }

    fun excludeNullSalaries(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null
    }

    fun excludeNullPrice(city: CityEntity): Boolean {
        return city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null
    }


}

data class CityByAverage(var nameCity: String, var percentage: Double)
