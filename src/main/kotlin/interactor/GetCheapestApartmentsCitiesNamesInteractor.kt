package interactor

import model.CityEntity

class GetCheapestApartmentsCitiesNamesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    object Const {
        const val MONTHS_OF_THE_YEAR = 12
    }

    fun execute(limit: Int, meters: Int): List<Pair<String, Float>> {

        return dataSource.getAllCitiesData()
            .excludeNullSalariesNullPricesAndLowQualityData()
            .sortedByDescending {
                it.averageMonthlyNetSalaryAfterTax!! /
                        it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!
            }
            .take(limit)
            .map { Pair(it.cityName, it.calculateNumberOfYears(meters)) }
            .takeIf { it.isNotEmpty() && it.size == limit }
            ?: listOf(
                Pair("Couldn't find Cities that meet your requirements :(", 0.0f)
            )
    }

    private fun List<CityEntity>.excludeNullSalariesNullPricesAndLowQualityData(): List<CityEntity> {
        return this.filter {
            it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null &&
                    it.averageMonthlyNetSalaryAfterTax != null &&
                    it.dataQuality
        }
    }

    /*
    Calculate how many years needed to buy 100meter apartment outSide center of the city
    depending on monthly salary and squareMeter's price.
    */
    private fun CityEntity.calculateNumberOfYears(meters: Int): Float {
        return this.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!! * meters /
                (this.averageMonthlyNetSalaryAfterTax!! * Const.MONTHS_OF_THE_YEAR)
    }
}