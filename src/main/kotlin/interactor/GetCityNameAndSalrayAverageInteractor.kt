package interactor

import model.CityEntity
import java.lang.reflect.Executable

class GetCityNameAndSalrayAverageInteractor(private val dataSource: CostOfLivingDataSource) {


   fun execute(country:String):List<Pair<String,Float>>
   {

       return emptyList()
   }

}