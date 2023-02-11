package interactor

import model.CityEntity

class GetCheapestApartmentsCitiesNamesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int): List<Pair<String, Float>> {

        val data = dataSource.getAllCitiesData()
            .filter(::excludeNullSalariesAndNullPricesAndLowQualityData)
            .sortingWithBestPrice()
            .take(limit)
            .getNumberOfYears()

        return if (data.isEmpty()) {
            listOf(Pair("No Valid Data Found !", 0.0f))
        } else {
            data
        }
    }

    private fun excludeNullSalariesAndNullPricesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null &&
                city.dataQuality &&
                city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null
    }

    /**
     * Sort the list with the ratio between monthly salary and squareMeter's price.
     * @return sorted List<CityEntity>
     */
    private fun List<CityEntity>.sortingWithBestPrice(): List<CityEntity> {
        return this.sortedByDescending {
            (it.averageMonthlyNetSalaryAfterTax?.div(
                it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!
            ))
        }
    }

    /**
     * Calculate how many years needed to buy 100meter apartment outSide center of the city
     * depending on monthly salary and squareMeter's price.
     * @return new list of <Pair<String, Float>>
     */
    private fun List<CityEntity>.getNumberOfYears(): List<Pair<String, Float>> {
        val newList = mutableListOf<Pair<String, Float>>()
        var numberOfYears: Float
        this.forEach {
            numberOfYears =
                (it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre?.times(100))?.div(
                    (it.averageMonthlyNetSalaryAfterTax!! * 12)
                )!!
            newList.add(Pair(it.cityName, numberOfYears))
        }
        return newList
    }
}