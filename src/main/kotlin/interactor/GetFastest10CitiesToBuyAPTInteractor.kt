package interactor

import model.CityEntity

class GetFastest10CitiesToBuyAPTInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(): List<Pair<String, Double>> {
        return dataSource.getAllCitiesData()
            .filter { excludeInvalidSalaries(it) && excludeInvalidApartmentPrice(it) && excludeLowQualityData(it) }
            .map {
                val numberOfYearsToBuyAPT = calculateNumberOfYearsToBuyAPT(it)
                Pair(it.cityName, numberOfYearsToBuyAPT)
            }
            .take(10)
    }


    /**
     * Returns `true` if the value of `averageMonthlyNetSalaryAfterTax` is valid.
     * @param cityEntity represents a city.
     * @return  if the salary is not equal to `null` and positive value.
     * @author Abdurrahman Salah ad-Din
     */
    fun excludeInvalidSalaries(cityEntity: CityEntity) =
        cityEntity.averageMonthlyNetSalaryAfterTax != null && cityEntity.averageMonthlyNetSalaryAfterTax > 0


    /**
     * Returns `true` for high quality data and `false` for low quality data.
     * @param cityEntity represents a city.
     * @return the value of `DataQuality`.
     * @author Abdurrahman Salah ad-Din
     */
    fun excludeLowQualityData(cityEntity: CityEntity) = cityEntity.dataQuality
    /**
     * Returns `true` if the value of `pricePerSquareMeterToBuyApartmentOutsideOfCentre` is valid.
     * @param cityEntity represents a city.
     * @return  if the `pricePerSquareMeterToBuyApartmentOutsideOfCentre` is not equal to `null` and
     * positive value.
     * @author Abdurrahman Salah ad-Din
     */
    fun excludeInvalidApartmentPrice(cityEntity: CityEntity) =
        cityEntity.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null && cityEntity.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre > 0
}


fun calculateNumberOfYearsToBuyAPT(it: CityEntity): Double {
    val priceForPer100SquareMeterToBuyApartmentOutsideOfCentre =
        100.0 * it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!
    return priceForPer100SquareMeterToBuyApartmentOutsideOfCentre / it.averageMonthlyNetSalaryAfterTax!!
}