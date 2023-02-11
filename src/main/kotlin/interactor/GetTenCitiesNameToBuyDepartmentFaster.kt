package interactor

class GetTenCitiesNameToBuyDepartmentFaster(
    private val dataSource: CostOfLivingDataSource,
    ) {
    fun execute(salary:Int ,limit:Int ,squareMeter:Int): List<Pair<String, Double>> {
        throw Throwable("Not Implemented yet")
    }
}