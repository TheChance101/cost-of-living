package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor() {

    private var highestPercentageOfInternetCheapness = 5f // 5%
        set(value) {
            if (value > 0f) field = value
        }

    fun execute(listOfCity: List<CityEntity>?): CityEntity? {
       return null
    }


    // exclude null and negative and zero
    fun excludeNullAndIncorrectInternetPriceAndSalary(city: CityEntity): Boolean {
       return false

    }

    fun calculatingThePercentageOfTheInternetPriceFromTheSalary(city: CityEntity): Float? {
       return null
    }

}