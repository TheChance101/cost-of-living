package interactor

import fakedata.FakeDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var getCityHasCheapestInternetConnectionTest: GetCityHasCheapestInternetConnectionInteractor

    private lateinit var dataSource: CostOfLivingDataSource

    private lateinit var fakeData: FakeDataSource

    @BeforeAll
    private fun setUp() {
        fakeData = FakeDataSource()
        dataSource = fakeData
        getCityHasCheapestInternetConnectionTest = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    }
}