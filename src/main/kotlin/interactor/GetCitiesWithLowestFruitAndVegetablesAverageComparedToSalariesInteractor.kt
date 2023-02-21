package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices

class GetCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .also { require(limit >= 1) { "Invalid Argument!" } }
            .filter {excludeEmptyCityNameAndLowQualityDataAndNullSalaries(it) &&
                    excludeNullFruitsAndVegetables(it.fruitAndVegetablesPrices)}
            .sortedBy { comparingFruitAndVegetablesWithSalaries(it.fruitAndVegetablesPrices.getAvreage(),
                                 it.averageMonthlyNetSalaryAfterTax ) }
            .take(limit)
            .map { it.cityName }
    }

    fun comparingFruitAndVegetablesWithSalaries(average: Float, salary: Float?): Float {
            return  average / salary!!
    }


    fun excludeEmptyCityNameAndLowQualityDataAndNullSalaries(city: CityEntity): Boolean {
        return city.cityName != "" &&
                city.dataQuality &&
                city.averageMonthlyNetSalaryAfterTax != null
    }

    fun excludeNullFruitsAndVegetables(fruitAndVegetables: FruitAndVegetablesPrices): Boolean {
       return fruitAndVegetables.apples1kg != null && fruitAndVegetables.banana1kg != null &&
               fruitAndVegetables.onion1kg != null && fruitAndVegetables.lettuceOneHead != null
               && fruitAndVegetables.oranges1kg != null && fruitAndVegetables.potato1kg != null &&
               fruitAndVegetables.tomato1kg != null
    }
}

