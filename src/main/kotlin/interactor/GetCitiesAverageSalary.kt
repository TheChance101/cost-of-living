package interactor

class GetCitiesAverageSalary( private val dataSource: CostOfLivingDataSource)
{
    fun execute(country:String):List<Pair<String,Double>>
    {
        return emptyList()
    }
}