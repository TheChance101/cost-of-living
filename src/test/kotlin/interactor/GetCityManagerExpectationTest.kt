package interactor

import dataSource.HardCodedFakeDataSource
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityManagerExpectationTest {
    private lateinit var getCityManagerExpectation: GetCityManagerExpectation
    private lateinit var dataSource: HardCodedFakeDataSource

    @BeforeAll
    fun init() {
        dataSource = HardCodedFakeDataSource()
        getCityManagerExpectation =
            GetCityManagerExpectation(dataSource)

    }

    @Test
    fun should_ReturnNotNull_When_EnterValidData() {
        //Given Valid data
        dataSource = HardCodedFakeDataSource()

        //When list not equal null
        val cityName = getCityManagerExpectation.execute()

        //Then
        assertNotNull(cityName)
    }

    @Test
    fun should_ReturnCorrectCity_When_EnterValidData() {
        //Given Valid data
        dataSource = HardCodedFakeDataSource()

        //When list Enter Valid Data
        val cityName = getCityManagerExpectation.execute()

        //Then
        assertEquals("Mexico", cityName)
    }
}