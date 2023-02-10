package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.testng.annotations.Test
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var getCityHasCheapestInternetTest:
            GetCityHasCheapestInternetConnectionInteractor

    @BeforeAll
    fun setup() {
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
        getCityHasCheapestInternetTest = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    }

    @Test
    fun should_returnCheapestCityIndex_when_correctInputs() {
        //given

        //then

        //when
    }
}