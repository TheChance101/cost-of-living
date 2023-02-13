package interactor

import model.CityEntity

class GetTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor (
  private val dataSource: CostOfLivingDataSource,) {

  fun execute(): List<String> {
    return dataSource
      .getAllCitiesData()
      .filter(::excludeNullSalariesAndFruitAndVegetablesPrices)
      .sortedBy(::sortTheAverageOfFruitAndVegetablesPricesHaveLowestCost)
      .take(10)
      .map { it.cityName }
  }


  private fun excludeNullSalariesAndFruitAndVegetablesPrices(city: CityEntity): Boolean {
    return city.averageMonthlyNetSalaryAfterTax != null &&
            city.fruitAndVegetablesPrices.apples1kg != null &&
            city.fruitAndVegetablesPrices.banana1kg!= null&&
            city.fruitAndVegetablesPrices.lettuceOneHead!= null &&
            city.fruitAndVegetablesPrices.onion1kg != null &&
            city.fruitAndVegetablesPrices.oranges1kg != null&&
            city.fruitAndVegetablesPrices.potato1kg != null &&
            city.fruitAndVegetablesPrices.tomato1kg!= null

  }
  private fun sortTheAverageOfFruitAndVegetablesPricesHaveLowestCost(city: CityEntity):Float{

    return (city.fruitAndVegetablesPrices.apples1kg!! +
            city.fruitAndVegetablesPrices.banana1kg!! +
            city.fruitAndVegetablesPrices.lettuceOneHead!! +
            city.fruitAndVegetablesPrices.onion1kg!! +
            city.fruitAndVegetablesPrices.oranges1kg!! +
            city.fruitAndVegetablesPrices.potato1kg!! +
            city.fruitAndVegetablesPrices.tomato1kg!!) / (2*city.averageMonthlyNetSalaryAfterTax!! )


  }


}