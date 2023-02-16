package interactor

import model.CityEntity

class GetLowestAveragePricesForFruitsAndVegetablesInteractor (
    private val data: CostOfLivingDataSource
){
    fun execute(limit: Int): List<String> {
        return  data
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndLowQualityDataAndNullFruitsAndVegetablesPrices)
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
                city.averageMonthlyNetSalaryAfterTax != null &&
                city.dataQuality &&
                city.fruitAndVegetablesPrices.apples1kg != null &&
                city.fruitAndVegetablesPrices.banana1kg != null &&
                city.fruitAndVegetablesPrices.oranges1kg != null &&
                city.fruitAndVegetablesPrices.tomato1kg != null &&
                city.fruitAndVegetablesPrices.potato1kg != null &&
                city.fruitAndVegetablesPrices.onion1kg != null &&
                city.fruitAndVegetablesPrices.lettuceOneHead != null

}
