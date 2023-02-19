package interactor

import model.CityEntity
import utils.isNotNull

class GetCityNamesToBuyApartmentFasterInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    companion object {
        const val MONTHS_IN_YEAR = 12
    }

    fun execute(
        limit: Int,
        squareMeter: Int
    ): List<Pair<String, Float>> =
        dataSource.getAllCitiesData()
            .ifEmpty { throw IllegalStateException("Something went wrong") }
            .also { if (limit < 0) throw InvalidLimitException("Limit can't be less than one") }
            .asSequence()
            .filter(::excludeNullApartmentPricesAndLowQualityData)
            .filter(::excludeNullSalaryAverages)
            .sortedBy(::findSquareMeterPriceToSalaryAveragePercentage)
            .take(limit)
            .toList()
            .map {
                it.cityName to
                calculateYearsNeededToBuyApartment(
                    it.averageMonthlyNetSalaryAfterTax!!,
                    it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!,
                    squareMeter
                )
            }

    private fun findSquareMeterPriceToSalaryAveragePercentage(it: CityEntity) =
        it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!! /
        it.averageMonthlyNetSalaryAfterTax!!


    private fun excludeNullApartmentPricesAndLowQualityData(
        city: CityEntity
    ) = with(
        city.realEstatesPrices
    ) {
        pricePerSquareMeterToBuyApartmentOutsideOfCentre.isNotNull() &&
        apartmentOneBedroomOutsideOfCentre.isNotNull() &&
        city.dataQuality
    }

    private fun excludeNullSalaryAverages(
        city: CityEntity
    ) = city.averageMonthlyNetSalaryAfterTax.isNotNull()


    private fun calculateYearsNeededToBuyApartment(
        salary: Float,
        pricePerSquareMeter: Float,
        squareMeter: Int
    ): Float {
        if (squareMeter < 1) throw InvalidMetersException("Square meter can't be less than one")
        return pricePerSquareMeter * squareMeter / salary / MONTHS_IN_YEAR
    }

}