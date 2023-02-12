package interactor

import model.CityEntity

class GetFastest10CitiesToBuyAPTInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(): List<Pair<String, Double>> {
        throw Throwable("Not Implemented yet")
    }

    /**
     * Returns `true` if the value of `averageMonthlyNetSalaryAfterTax` is not `null`
     * and `false` if the `averageMonthlyNetSalaryAfterTax` is `null`.
     * @param cityEntity represents a city.
     * @return  if the salary is not equal to `null`.
     * @author Abdurrahman Salah ad-Din
     */
    fun excludeNullSalaries(cityEntity: CityEntity) = false

    /**
     * Returns `true` for high quality data and `false` for low quality data.
     * @param cityEntity represents a city.
     * @return the value of `DataQuality`.
     * @author Abdurrahman Salah ad-Din
     */
    fun excludeLowQualityData(cityEntity: CityEntity) = false

    /**
     * Returns `true` if the value of `pricePerSquareMeterToBuyApartmentOutsideOfCentre` is not `null` and
     * `false` if the `pricePerSquareMeterToBuyApartmentOutsideOfCentre` is `null`.
     * @param cityEntity represents a city.
     * @return  if the `pricePerSquareMeterToBuyApartmentOutsideOfCentre` is not equal to `null`.
     * @author Abdurrahman Salah ad-Din
     */
    fun excludeNullApartmentPrice(cityEntity: CityEntity) = false
}