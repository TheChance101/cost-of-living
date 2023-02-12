package interactor

import model.CityEntity

class GetLowestAveragePricesForFruitsAndVegetablesInteractor (
    private val data: CostOfLivingDataSource
){
    fun execute(limit: Int): List<String> {
        return  data
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndLowQualityDataAndNullFruitsAndVegetablesPrices)
            .sortedBy {getRatio(it)}
            .map { it.cityName }
            .take(limit)
    }

    private fun getRatio(city: CityEntity):Float{

        return (city.fruitAndVegetablesPrices.apples1kg!! +
                city.fruitAndVegetablesPrices.banana1kg!! +
                city.fruitAndVegetablesPrices.oranges1kg!! +
                city.fruitAndVegetablesPrices.tomato1kg!! +
                city.fruitAndVegetablesPrices.potato1kg!! +
                city.fruitAndVegetablesPrices.onion1kg!! +
                city.fruitAndVegetablesPrices.lettuceOneHead!!
                )/city.averageMonthlyNetSalaryAfterTax!!
    }

    private fun excludeNullSalariesAndLowQualityDataAndNullFruitsAndVegetablesPrices(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null &&
                city.dataQuality &&
                city.fruitAndVegetablesPrices.apples1kg != null &&
                city.fruitAndVegetablesPrices.banana1kg != null &&
                city.fruitAndVegetablesPrices.oranges1kg != null &&
                city.fruitAndVegetablesPrices.tomato1kg != null &&
                city.fruitAndVegetablesPrices.potato1kg != null &&
                city.fruitAndVegetablesPrices.onion1kg != null &&
                city.fruitAndVegetablesPrices.lettuceOneHead != null
        }
}
