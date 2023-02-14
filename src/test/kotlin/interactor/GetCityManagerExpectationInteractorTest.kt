package interactor

import dataSource.HardCodedFakeDataSource
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityManagerExpectationInteractorTest {
    private lateinit var getCityManagerExpectationInteractor: GetCityManagerExpectationInteractor
    private lateinit var dataSource: HardCodedFakeDataSource

    @BeforeAll
    fun init() {
        dataSource = HardCodedFakeDataSource()
        getCityManagerExpectationInteractor =
            GetCityManagerExpectationInteractor(dataSource)

    }

    @Test
    fun should_ReturnNotNull_When_EnterValidData() {
        //Given Valid data
        dataSource = HardCodedFakeDataSource()

        //When list not equal null
        val cityName = getCityManagerExpectationInteractor.execute()

        //Then
        assertNotNull(cityName)
    }

    @Test
    fun should_ReturnCorrectCity_When_EnterValidData() {
        //Given Valid data
        dataSource = HardCodedFakeDataSource()

        //When list Enter Valid Data
        val cityName = getCityManagerExpectationInteractor.execute()

        //Then
        assertEquals("Mexico", cityName)
    }
}