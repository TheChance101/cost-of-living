package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices

class GetCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter {excludeEmptyCityNameAndLowQualityDataAndNullSalaries(it) && excludeNullFruitsAndVegetables(it.fruitAndVegetablesPrices)}
            .sortedByDescending { comparingFruitAndVegetablesWithSalaries(it.averageMonthlyNetSalaryAfterTax, average(it.fruitAndVegetablesPrices)) }
            .take(10)
            .map { it.cityName }
    }

    fun average(fruitAndVegetables: FruitAndVegetablesPrices): Float {
        val fruitAndVegetablesSum =
            fruitAndVegetables.apples1kg!! + fruitAndVegetables.banana1kg!! + fruitAndVegetables.onion1kg!! +
                    fruitAndVegetables.lettuceOneHead!! + fruitAndVegetables.oranges1kg!! + fruitAndVegetables.potato1kg!! + fruitAndVegetables.tomato1kg!!
        return fruitAndVegetablesSum / 7
    }

    fun comparingFruitAndVegetablesWithSalaries(salary: Float?, average: Float): Float {
            return salary!! / average
        }


    fun excludeEmptyCityNameAndLowQualityDataAndNullSalaries(city: CityEntity): Boolean {
        return city.cityName != "" && city.dataQuality && city.averageMonthlyNetSalaryAfterTax != null
    }
    //fAV = fruitAndVegetables
    fun excludeNullFruitsAndVegetables(fAV: FruitAndVegetablesPrices): Boolean {
       return fAV.apples1kg != null && fAV.banana1kg != null && fAV.onion1kg != null && fAV.lettuceOneHead != null
               && fAV.oranges1kg != null && fAV.potato1kg != null && fAV.tomato1kg != null
    }
}

