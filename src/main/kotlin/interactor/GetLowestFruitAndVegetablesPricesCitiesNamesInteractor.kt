package interactor

class GetLowestFruitAndVegetablesPricesCitiesNamesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int) :List<Pair<String,Pair<Float,Float?>>> {
        val listOfFruitAndVegetablesPrices = ArrayList<Float>()
        dataSource.getAllCitiesData().filter {
            it.averageMonthlyNetSalaryAfterTax != null
                    && it.fruitAndVegetablesPrices.apples1kg != null
                    && it.fruitAndVegetablesPrices.onion1kg != null
                    && it.fruitAndVegetablesPrices.oranges1kg != null
                    && it.fruitAndVegetablesPrices.banana1kg != null
                    && it.fruitAndVegetablesPrices.lettuceOneHead != null
                    && it.fruitAndVegetablesPrices.potato1kg != null
                    && it.fruitAndVegetablesPrices.tomato1kg != null
        }.map { it.fruitAndVegetablesPrices }
            .forEach {
                listOfFruitAndVegetablesPrices.add(
                    it.apples1kg!! + it.banana1kg!! + it.lettuceOneHead!!
                            + it.onion1kg!! +
                            it.oranges1kg!!
                            + it.potato1kg!! + it.tomato1kg!!
                )
            }

        val cities = dataSource.getAllCitiesData().filter {
            it.averageMonthlyNetSalaryAfterTax != null
                    && it.fruitAndVegetablesPrices.apples1kg != null
                    && it.fruitAndVegetablesPrices.onion1kg != null
                    && it.fruitAndVegetablesPrices.oranges1kg != null
                    && it.fruitAndVegetablesPrices.banana1kg != null
                    && it.fruitAndVegetablesPrices.lettuceOneHead != null
                    && it.fruitAndVegetablesPrices.potato1kg != null
                    && it.fruitAndVegetablesPrices.tomato1kg != null
        }.map { it.cityName }
        val salaries = dataSource.getAllCitiesData().filter {
            it.averageMonthlyNetSalaryAfterTax != null
                    && it.fruitAndVegetablesPrices.apples1kg != null
                    && it.fruitAndVegetablesPrices.onion1kg != null
                    && it.fruitAndVegetablesPrices.oranges1kg != null
                    && it.fruitAndVegetablesPrices.banana1kg != null
                    && it.fruitAndVegetablesPrices.lettuceOneHead != null
                    && it.fruitAndVegetablesPrices.potato1kg != null
                    && it.fruitAndVegetablesPrices.tomato1kg != null
        }.map { it.averageMonthlyNetSalaryAfterTax }

        return cities.zip(listOfFruitAndVegetablesPrices.zip(salaries))
            .map { (cityName: String, pair: Pair<Float, Float?>) ->
                cityName to pair
            }


    }}