package interactor

import model.CityEntity

class FindTheCheapestTenCitiesApartments(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): List<Pair<String, Double>>? {
        val cities = dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesOrNullAppartmentsCosts)
            .filter(::excludeNegativeSalariesOrNegativeInternetCosts)
            .sortedBy {
                it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!.times(100)
                    .div(it.averageMonthlyNetSalaryAfterTax!!)
            }
            .take(10)

        if (cities.isEmpty()) return null

        val citiesNamesWithYearsNeeded = mutableListOf<Pair<String,Double>>()

        for (city in cities){
            val costOf100mAppartment=city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!.times(100)
            val yearSalary=city.averageMonthlyNetSalaryAfterTax!!*12
            val numberOfYears=costOf100mAppartment/yearSalary.toDouble()
            citiesNamesWithYearsNeeded.add(Pair(city.cityName,numberOfYears))
        }

        return citiesNamesWithYearsNeeded
    }


    private fun excludeNullSalariesOrNullAppartmentsCosts(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null
                && city.averageMonthlyNetSalaryAfterTax != null
    }

    private fun excludeNegativeSalariesOrNegativeInternetCosts(city: CityEntity): Boolean {

        return city.averageMonthlyNetSalaryAfterTax!! >= 0
                && city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!! >= 0
    }

}