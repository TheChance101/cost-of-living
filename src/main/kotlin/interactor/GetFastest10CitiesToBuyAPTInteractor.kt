package interactor

class GetFastest10CitiesToBuyAPTInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(): List<Pair<String, Double>> {
        throw Throwable("Not Implemented yet")
    }
}