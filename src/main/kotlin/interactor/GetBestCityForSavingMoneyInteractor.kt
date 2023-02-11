package interactor

import model.CityEntity

class GetBestCityForSavingMoneyInteractor(private val dataSource: CostOfLivingDataSource) {

    fun execute(isAppartmentInTheCityCentre: Boolean): CityEntity {

        // initialize the city with random city , we can use any city
        val cities = dataSource.getAllCitiesData()
        var bestCity = cities[0]
        var maxSavings = 0.0f

        for (city in cities) {

            if (checkNullFields(city, isAppartmentInTheCityCentre)) {

                val salary = city.averageMonthlyNetSalaryAfterTax!! * 2
                val requireApartment =
                    if (isAppartmentInTheCityCentre) city.realEstatesPrices.apartment3BedroomsInCityCentre!!
                    else city.realEstatesPrices.apartment3BedroomsOutsideOfCentre!!

                val requireBread = city.foodPrices.loafOfFreshWhiteBread500g!! * 30
                val requireCheese = city.foodPrices.localCheese1kg!!
                val requireRedMeat = city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!! * 4
                val requireChickenFillets = city.foodPrices.chickenFillets1kg!! * 10
                val requireRice = city.foodPrices.riceWhite1kg!! * 2
                val otherNeeds = 250.0f

                val savings = salary -
                        requireApartment -
                        requireBread -
                        requireCheese -
                        requireRedMeat -
                        requireChickenFillets -
                        requireRice -
                        otherNeeds

                if (savings > maxSavings) {

                    maxSavings = savings
                    bestCity = city
                }
            }
        }

        return bestCity
    }

    fun checkNullFields(city: CityEntity, isAppartmentInTheCityCentre: Boolean): Boolean {

        var determineApartment = city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
        if (isAppartmentInTheCityCentre) determineApartment =
            city.realEstatesPrices.apartment3BedroomsInCityCentre != null

        return  determineApartment &&
                city.averageMonthlyNetSalaryAfterTax != null &&
                city.foodPrices.loafOfFreshWhiteBread500g != null &&
                city.foodPrices.localCheese1kg != null &&
                city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null &&
                city.foodPrices.chickenFillets1kg != null &&
                city.foodPrices.riceWhite1kg != null
    }
}