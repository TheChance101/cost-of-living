package interactor

import model.CityEntity
import utils.isNotNull
import java.lang.Exception

class GetMostSuitableCityInteractor
    (private val dataSource: CostOfLivingDataSource) {
    fun execute() =
        dataSource.getAllCitiesData()
            .also {
                if (it.isEmpty()) throw IllegalStateException("Something wrong")
            }
            .filter(::excludeNullValuesInCityEntity)
            .maxByOrNull(::getTotalSavings)
            .also {
                if (it == null) throw NoSuchElementException("Error with data")
            }


    private fun excludeNullValuesInCityEntity(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax.isNotNull()
                && city.foodPrices.chickenFillets1kg.isNotNull()
                && city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat.isNotNull()
                && city.realEstatesPrices.apartment3BedroomsInCityCentre.isNotNull()
                && city.foodPrices.localCheese1kg.isNotNull()
                && city.foodPrices.riceWhite1kg.isNotNull()
                && city.foodPrices.loafOfFreshWhiteBread500g.isNotNull()

    }

    private fun getTotalSavings(city: CityEntity) =
        city.averageMonthlyNetSalaryAfterTax!! * AMOUNT_OF_SALARY_INCREASEMENT -
                city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!! * NUMBERS_OF_BEEF_KILOS -
                city.foodPrices.loafOfFreshWhiteBread500g!! * NUMBERS_OF_BREAD_KILOS -
                city.foodPrices.chickenFillets1kg!! * NUMBERS_OF_CHICKEN_KILOS -
                city.realEstatesPrices.apartment3BedroomsInCityCentre!! -
                city.foodPrices.riceWhite1kg!! * NUMBERS_OF_RICE_KILOS -
                city.foodPrices.localCheese1kg!! -
                COST_OF_OTHER_NEEDS


    companion object {
        private const val NUMBERS_OF_BEEF_KILOS = 4
        private const val NUMBERS_OF_RICE_KILOS = 2
        private const val COST_OF_OTHER_NEEDS = 250
        private const val NUMBERS_OF_BREAD_KILOS = 30
        private const val NUMBERS_OF_CHICKEN_KILOS = 10
        private const val AMOUNT_OF_SALARY_INCREASEMENT = 2
    }


}