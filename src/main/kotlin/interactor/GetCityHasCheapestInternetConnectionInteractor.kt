package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): String {
        val list = dataSource
            .getAllCitiesData()
            .filter(::excludeNullAverageSalaryAndServicesPrices)
            .sortingWithBestInterentPrice()
            .take(limit)
            .map { it.cityName }
        return if (list.isEmpty())
            ""
        else
            list[0]
    }

    private fun excludeNullAverageSalaryAndServicesPrices(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null
    }


    private fun List<CityEntity>.sortingWithBestInternetPrice(): List<CityEntity> {
        return this.sortedByDescending {
            (it.averageMonthlyNetSalaryAfterTax?.div(
                it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!!
            ))
        }
    }
}
