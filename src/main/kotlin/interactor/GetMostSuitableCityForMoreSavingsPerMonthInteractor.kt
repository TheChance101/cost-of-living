package interactor

import model.CityEntity

class GetMostSuitableCityForMoreSavingsPerMonthInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndNotHasAllPrimaryNeeds)
            .getListOfCityPairs()
            .sortedByDescending { it.second }[0].first
    }


    private fun List<CityEntity>.getListOfCityPairs(): List<Pair<CityEntity,Float>> {
        val listOfCityPairs = mutableListOf<Pair<CityEntity,Float>>()
        forEach { city ->
            val salary = 2f * city.averageMonthlyNetSalaryAfterTax!!
            val savings = salary - (foodCosts(city) + 250f)
            val cityAndSavingsPair = Pair(city,savings)
            listOfCityPairs.add(cityAndSavingsPair)
        }
        return listOfCityPairs
    }

    private fun foodCosts(city: CityEntity): Float {
        val foodPrices = city.foodPrices
        val foodCosts = foodPrices.loafOfFreshWhiteBread500g!! * 30f
        + foodPrices.localCheese1kg!! * 1f
        + foodPrices.chickenFillets1kg!! * 10f
        + foodPrices.riceWhite1kg!! * 2f + foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!! * 4f
        return foodCosts
    }

    private fun excludeNullSalariesAndNotHasAllPrimaryNeeds(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
                && city.foodPrices.loafOfFreshWhiteBread500g != null
                && city.foodPrices.localCheese1kg != null
                && city.foodPrices.chickenFillets1kg != null
                && city.foodPrices.riceWhite1kg != null
                && city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null
    }



}