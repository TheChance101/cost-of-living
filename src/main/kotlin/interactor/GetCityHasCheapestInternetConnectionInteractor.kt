package interactor

import model.CityEntity



class GetCityHasCheapestInternetConnectionInteractor{

    fun execute(cities:List<CityEntity>): CityEntity? {
        return if (cities.isNotEmpty()) {
            val filter = cities.filter { excludeNullSalariesAndLowQualityDataAndNullInternetPrice(it) }
            checkWhatIsReturnAfterFiltration(filter)
            val result = filter.sortedBy(::findTheRatioOfInternetPriceToSalaryAverage).first()
            checkIfThePercentageOfInternetPriceToSalaryEqual100OrAbove(result)
            result
        } else {
            null
        }
    }

    private fun checkIfThePercentageOfInternetPriceToSalaryEqual100OrAbove(result: CityEntity) {
        if ((result.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl
                ?.div(result.averageMonthlyNetSalaryAfterTax!!))?.times(
                    100
                )!! >= 100.0
        ) {
            throw Throwable("The precentage of internet price to salary equal 100.0 percent or above")
        }
    }

    private fun checkWhatIsReturnAfterFiltration(filter: List<CityEntity>) {
        if (filter.isEmpty()) {
            throw Throwable("List that you entered all of it has bad quality data or null average salary or null internet price")
        }
    }


    private fun excludeNullSalariesAndLowQualityDataAndNullInternetPrice(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
                && city.dataQuality
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null
    }

    private fun findTheRatioOfInternetPriceToSalaryAverage(city: CityEntity) : Float {
        return (city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl
            ?.div(city.averageMonthlyNetSalaryAfterTax!!))
            ?.times(100)!!

    }

}




