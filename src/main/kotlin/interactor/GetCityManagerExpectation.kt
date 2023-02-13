package interactor

class GetCityManagerExpectation(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(): String {
        val data = dataSource.getAllCitiesData()

        return ""
    }

    }