package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(cities: List<CityEntity>): CityEntity{
        return dataSource.getAllCitiesData()[0]

    }
//        val citiesData = dataSource.getAllCitiesData()
//        val citiesWithInternetData = citiesData.filter {
//            it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null &&
//                    it.averageMonthlyNetSalaryAfterTax != null
//        }
//
//        return citiesWithInternetData.minByOrNull {
//            (it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! / it.averageMonthlyNetSalaryAfterTax!!)
//        }
//    }

}