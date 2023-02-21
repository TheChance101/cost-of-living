package interactor

import model.CityEntity
import utils.isNotNull

class GetLowestAveragePricesForFruitsAndVegetablesInteractor(
    private val data: CostOfLivingDataSource
) {
    fun execute(limit: Int): List<String> {

        if (limit < 0) throw InvalidLimitException("Limit cannot be negative")

        return data
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndLowQualityDataAndNullFruitsAndVegetablesPrices)
            .ifEmpty { throw IllegalStateException("Something went wrong, no valid data") }
            .sortedBy(::getPricesToSalaryAverage)
            .take(limit)
            .map { it.cityName }

    }

    private fun getPricesToSalaryAverage(city: CityEntity) =
        city.fruitAndVegetablesPrices.let {
            (it.apples1kg!! +
                    it.tomato1kg!! +
                    it.oranges1kg!! +
                    it.banana1kg!! +
                    it.potato1kg!! +
                    it.onion1kg!! +
                    it.lettuceOneHead!!) /
                    city.averageMonthlyNetSalaryAfterTax!!
        }


    private fun excludeNullSalariesAndLowQualityDataAndNullFruitsAndVegetablesPrices(city: CityEntity) =
        city.dataQuality &&
                city.averageMonthlyNetSalaryAfterTax.isNotNull() &&
                city.fruitAndVegetablesPrices.apples1kg.isNotNull() &&
                city.fruitAndVegetablesPrices.banana1kg.isNotNull() &&
                city.fruitAndVegetablesPrices.oranges1kg.isNotNull() &&
                city.fruitAndVegetablesPrices.tomato1kg.isNotNull() &&
                city.fruitAndVegetablesPrices.potato1kg.isNotNull() &&
                city.fruitAndVegetablesPrices.onion1kg.isNotNull() &&
                city.fruitAndVegetablesPrices.lettuceOneHead.isNotNull()

}
