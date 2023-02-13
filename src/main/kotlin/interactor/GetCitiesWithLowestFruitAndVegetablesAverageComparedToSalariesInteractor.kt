package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices

class GetCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor(
    private val dataSource: CostOfLivingDataSource,
){
    fun execute(): List<String>{
        return listOf()
    }

    fun average(fruitAndVegetables: FruitAndVegetablesPrices): Float{
        return 2f
    }
    fun comparingFruitAndVegetablesWithSalaries(salaries: Float?,average: Float): Float{
        return 1f

    }

    fun excludeEmptyCityNameAndLowQualityData(city: CityEntity): Boolean {
        return false
    }
}