package interactor
import model.CityEntity
import model.DetailsOfApartment

open class GetTheRightApartment(private val dataSource: CostOfLivingDataSource) {



    private fun getTopTenCitesHasCanPayApartmentFaster(dataSource:List<CityEntity>) :List<CityEntity>{
        return dataSource.sortedBy {
            it.averageMonthlyNetSalaryAfterTax?.div(it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!.toInt())
        }.take(10)

    }
//    fun getListOfDetailsOfApartment(salary:Int):List<DetailsOfApartment> {
//        val dataSource = getTopTenCitesHasCanPayApartmentFaster(dataSource.getAllCitiesData())
//    return dataSource
//
//    }
    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }}

