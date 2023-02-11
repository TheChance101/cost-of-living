package interactor

import model.CityEntity

class GetLowestAveragePricesForFruitsAndVegetablesInteractor (
    private val data: CostOfLivingDataSource
){
    fun execute(limit: Int): List<String> {

        val mapOfCitiesNamesAndPricesRatio =
            createMap(
                data.
                getAllCitiesData().
                filter(::excludeNullSalariesAndLowQualityDataAndNullFruitsAndVegetablesPrices))

        return mapOfCitiesNamesAndPricesRatio.toList().sortedBy { it.second }.map { it.first }.take(limit)
    }


    private fun createMap(city: List<CityEntity>): Map<String, Float>  {
        val mapOfCitiesNamesAndPricesRatio = mutableMapOf<String, Float>()
        for (price in city) {
            val prices =
                price.fruitAndVegetablesPrices.apples1kg!! +
                        price.fruitAndVegetablesPrices.banana1kg!! +
                        price.fruitAndVegetablesPrices.oranges1kg!! +
                        price.fruitAndVegetablesPrices.tomato1kg!! +
                        price.fruitAndVegetablesPrices.potato1kg!! +
                        price.fruitAndVegetablesPrices.onion1kg!! +
                        price.fruitAndVegetablesPrices.lettuceOneHead!!

            mapOfCitiesNamesAndPricesRatio[price.cityName] = price.averageMonthlyNetSalaryAfterTax!! / prices
        }

        return mapOfCitiesNamesAndPricesRatio

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