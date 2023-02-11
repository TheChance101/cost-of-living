package interactor

import model.CityEntity

class GetBestCityForSavingMoneyInteractor(private val dataSource: CostOfLivingDataSource) {

    fun execute(isAppartmentInTheCityCentre: Boolean): CityEntity {

        isAppartmentInCenter = isAppartmentInTheCityCentre

        val cities = dataSource.getAllCitiesData()
        var bestCity = cities[0]

        for (city in cities) {

            if (checkNullFields(city)) {

                val savings = calculateSavings(city)

                if (savings > maxSavings) {

                    maxSavings = savings
                    bestCity = city
                }
            }
        }

        return bestCity
    }

    fun calculateSavings(city: CityEntity) : Float{

        val requireApartment =
            if (isAppartmentInCenter) city.realEstatesPrices.apartment3BedroomsInCityCentre!!
            else city.realEstatesPrices.apartment3BedroomsOutsideOfCentre!!

        return  (city.averageMonthlyNetSalaryAfterTax!! * 2) -
                (city.foodPrices.loafOfFreshWhiteBread500g!! * 30) -
                (city.foodPrices.localCheese1kg!!) -
                (city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!! * 4) -
                (city.foodPrices.chickenFillets1kg!! * 10) -
                (city.foodPrices.riceWhite1kg!! * 2) - 250.0f - requireApartment
    }

    private fun checkNullFields(city: CityEntity): Boolean {

        var determineApartment = city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
        if (isAppartmentInCenter) determineApartment =
            city.realEstatesPrices.apartment3BedroomsInCityCentre != null

        return  determineApartment &&
                city.averageMonthlyNetSalaryAfterTax != null &&
                city.foodPrices.loafOfFreshWhiteBread500g != null &&
                city.foodPrices.localCheese1kg != null &&
                city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null &&
                city.foodPrices.chickenFillets1kg != null &&
                city.foodPrices.riceWhite1kg != null
    }

    companion object{

        private var isAppartmentInCenter = true
        private var city = true
        private var maxSavings = 0.0f
    }
}