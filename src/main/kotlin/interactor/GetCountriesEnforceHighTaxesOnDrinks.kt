package interactor

import model.CityEntity

class GetCountriesEnforceHighTaxesOnDrinks(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): List<Pair<String, Float?>> {
        val cities = dataSource.getAllCitiesData()

        val mList = ArrayList<Pair<String, Float?>>()

        cities.filter(::isCityHaveHighQuality)
            .filter(::isCityEnforceHighTaxesOnCokeCarbonatedDrinks)
            .sortedByDescending{ it.drinksPrices.cappuccinoRegularInRestaurants }
            .take(10)
            .map {
                val countriesName = it.country
                val pricesAverage = calcPriceAverage(it)

                val mPair = Pair(countriesName, pricesAverage)
                mList.add(mPair)
            }
        return mList
    }

    private fun isCityHaveHighQuality(city: CityEntity): Boolean {
        return city.dataQuality
    }

    private fun isCityEnforceHighTaxesOnCokeCarbonatedDrinks(city: CityEntity): Boolean {
        val prices = city.drinksPrices

        val codePrice = prices.cokePepsiAThirdOfLiterBottleInRestaurants
        val cappuccinoPrice = prices.cappuccinoRegularInRestaurants
        val waterAThirdOfLiterPrice = prices.waterAThirdOfLiterBottleInRestaurants
        val milkPrice = prices.milkRegularOneLiter
        val waterOneAndHalfLiterPrice = prices.waterOneAndHalfLiterBottleAtTheMarket

        val validation = validationForPrices(city)

        return if (validation) {
            (codePrice!! > cappuccinoPrice!!) &&
                    (codePrice > waterAThirdOfLiterPrice!!) &&
                    (codePrice > milkPrice!!) &&
                    (codePrice > waterOneAndHalfLiterPrice!!)
        } else {
            false
        }
    }

    private fun calcPriceAverage(city: CityEntity): Float? {
        val prices = city.drinksPrices

        val codePrice = prices.cokePepsiAThirdOfLiterBottleInRestaurants
        val cappuccinoPrice = prices.cappuccinoRegularInRestaurants
        val waterAThirdOfLiterPrice = prices.waterAThirdOfLiterBottleInRestaurants
        val milkPrice = prices.milkRegularOneLiter
        val waterOneAndHalfLiterPrice = prices.waterOneAndHalfLiterBottleAtTheMarket

        val validation = validationForPrices(city)

        return if (validation) {
            (codePrice!! + cappuccinoPrice!! + waterAThirdOfLiterPrice!! + milkPrice!! + waterOneAndHalfLiterPrice!!) / 5
        } else {
            null
        }
    }

    private fun validationForPrices(city: CityEntity): Boolean {
        val prices = city.drinksPrices

        val codePrice = prices.cokePepsiAThirdOfLiterBottleInRestaurants
        val cappuccinoPrice = prices.cappuccinoRegularInRestaurants
        val waterAThirdOfLiterPrice = prices.waterAThirdOfLiterBottleInRestaurants
        val milkPrice = prices.milkRegularOneLiter
        val waterOneAndHalfLiterPrice = prices.waterOneAndHalfLiterBottleAtTheMarket

        return codePrice != null &&
                cappuccinoPrice != null &&
                waterAThirdOfLiterPrice != null &&
                milkPrice != null &&
                waterOneAndHalfLiterPrice != null
    }
}