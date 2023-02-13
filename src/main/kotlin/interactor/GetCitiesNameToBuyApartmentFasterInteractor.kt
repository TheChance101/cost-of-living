package interactor

import model.CityEntity

class GetCitiesNameToBuyApartmentFasterInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(
        salary: Int,
        limit: Int,
        squareMeter: Int
    ): List<Pair<String, Double>> {

        return dataSource.getAllCitiesData()
            .asSequence()
            .filter(::excludeNullApartmentPriceAndLowQualityData)
            .take(limit)
            .toList()
            .sortedBy { it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre }
            .map {
                Pair(
                    it.cityName,
                    calculateYearsNeededToBuyApartment(
                        salary,
                        it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!,
                        squareMeter
                    )
                )
            }

    }

    private fun excludeNullApartmentPriceAndLowQualityData(
        city: CityEntity
    ): Boolean {

        return with(
            city.realEstatesPrices
        ) {
            this.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null &&
                    this.apartmentOneBedroomOutsideOfCentre != null &&
                    city.dataQuality
        }

    }

    private fun calculateYearsNeededToBuyApartment(
        salary: Int,
        pricePerSquareMeter: Float,
        squareMeter: Int
    ): Double {
        if (salary < 1) throw ArithmeticException("Salary can't be less than one")
        if (squareMeter < 1) throw ArithmeticException("Square meter can't be less than one")
        val pricePerMonth = (pricePerSquareMeter * squareMeter).toDouble() / salary
        return pricePerMonth / 12
    }

}