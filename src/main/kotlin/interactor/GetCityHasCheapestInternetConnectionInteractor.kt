package interactor

import model.CityEntity



class GetCityHasCheapestInternetConnectionInteractor{




    fun execute(cities:List<CityEntity>): CityEntity? {
       throw Throwable("Not Implemented yet")
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




