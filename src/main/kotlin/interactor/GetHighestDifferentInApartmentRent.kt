package interactor

import model.CityEntity

class GetHighestDifferentInApartmentRent (  private val dataSource: CostOfLivingDataSource,
) {

    fun execute(cities: List<CityEntity>): String? {
        return cities.toString()
    }
}