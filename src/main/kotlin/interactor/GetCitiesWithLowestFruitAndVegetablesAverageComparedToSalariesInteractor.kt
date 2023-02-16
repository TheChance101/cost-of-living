package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices

class GetCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter {excludeEmptyCityNameAndLowQualityDataAndNullSalaries(it) &&
                    excludeNullFruitsAndVegetables(it.fruitAndVegetablesPrices)}
            .sortedByDescending { comparingFruitAndVegetablesWithSalaries(average(it.fruitAndVegetablesPrices),
                                 it.averageMonthlyNetSalaryAfterTax ) }
            .take(limit)
            .map { it.cityName }
    }

    fun average(fruitAndVegetables: FruitAndVegetablesPrices): Float {
        val fruitAndVegetables = listOfNotNull(
            fruitAndVegetables.apples1kg, fruitAndVegetables.banana1kg, fruitAndVegetables.onion1kg,
                    fruitAndVegetables.lettuceOneHead, fruitAndVegetables.oranges1kg,
            fruitAndVegetables.potato1kg,fruitAndVegetables.tomato1kg)
        return fruitAndVegetables.sum() / fruitAndVegetables.size
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

