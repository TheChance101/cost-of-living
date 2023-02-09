package interactor

import model.CityEntity

enum class Option {
    ONE_BEDROOM,
    THREE_BEDROOM,
}

class GetCostlierCityWithRentingAnApartmentBetweenCityCenterAndOutsideCityCenterInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(option: Option): CityEntity {

        return dataSource.getAllCitiesData().random()
    }


}