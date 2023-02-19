package interactor

import model.CityEntity

class GetTheMostExpensiveCitiesNamesIntTermOfCinemaTickets(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit :Int ): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter (::excludeNullCinemaTicketsPricesAndLowQualityData)
            .sortedByDescending { it.servicesPrices.cinemaInternationalReleaseOneSeat }
            .take(limit)
            .map {it.cityName }


    }

    private fun excludeNullCinemaTicketsPricesAndLowQualityData(city: CityEntity) :Boolean {
        return  city.servicesPrices.cinemaInternationalReleaseOneSeat != null && city.dataQuality
    }

}