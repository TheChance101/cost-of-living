package somepackage
import interactor.CostOfLivingDataSource
import model.CityEntity

class GetDifferentBetweenApartmentRenting(private val dataSource:CostOfLivingDataSource) {

    fun getCityWithHighestApartmentRentDifference(dataSource: CostOfLivingDataSource): CityEntity? {
       return null
    }

     fun getApartmentRentDifference(centerPrice: Float?, outsidePrice: Float?): Float {
      return 0f
    }
}