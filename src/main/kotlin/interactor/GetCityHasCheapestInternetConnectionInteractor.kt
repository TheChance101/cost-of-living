package interactor

import model.CityEntity



class GetCityHasCheapestInternetConnectionInteractor{




    fun execute(cities:List<CityEntity>): CityEntity? {
        return if (cities.isNotEmpty()) {
            val filter = cities.filter { excludeNullSalariesAndLowQualityDataAndNullInternetPrice(it) }
            if (filter.isEmpty()){
                throw Throwable("List that you entered all of it has bad quality data or null average salary or null internet price")
            }
            val result = filter
                .sortedBy { cityEntity -> (cityEntity.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl
                    ?.div(cityEntity.averageMonthlyNetSalaryAfterTax!!))?.times(
                        100) }.first()
            if ((result.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl
                    ?.div(result.averageMonthlyNetSalaryAfterTax!!))?.times(
                        100)!!>=100.0){
                throw Throwable("The precentage of internet price to salary equal 100.0 percent or above")
            }

            result

        } else {
            null
        }
    }


    /* we have a list we need to loop on it to find
     the cheapest internet in the cities based on average salary and internet price
     we need to check about average salaries in the cities
     And we need to check about internet price
     And we need make operation on average salaries and internet price
     in final return the cheapest city entity
     */


    private fun excludeNullSalariesAndLowQualityDataAndNullInternetPrice(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
                && city.dataQuality
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null
    }

}


