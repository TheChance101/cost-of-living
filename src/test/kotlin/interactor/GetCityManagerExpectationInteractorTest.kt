package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertNull

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityManagerExpectationInteractorTest {
    private lateinit var getCityManagerExpectationInteractor : GetCityManagerExpectationInteractor
    private lateinit var dataSource: FakeDataSource

    @BeforeEach
    fun init() {
        dataSource = FakeDataSource()
        getCityManagerExpectationInteractor =
            GetCityManagerExpectationInteractor(dataSource)

    }

    @Test
    fun should_ReturnNull_When_EnterInvalidData() {
        //Given Valid data
        dataSource.setDataType(FakeDataSource.DataType.NULLABLE)

        //When list not equal null
        val cityName = getCityManagerExpectationInteractor.execute("United States" ,  "Canada","Mexico")

        //Then
        assertNull(cityName)
    }

    @Test
    fun should_ReturnCorrectCity_When_EnterValidData() {
        //Given Valid data
        dataSource.setDataType(FakeDataSource.DataType.VALID)

        //When list Enter Valid Data
        val cityName = getCityManagerExpectationInteractor.execute("United States" , "Canada","Mexico")

        //Then
        assertEquals("New York", cityName)
    }

    @Test
    fun should_ReturnNull_When_EnterNonExitsCountries() {
        //Given Valid data
        dataSource.setDataType(FakeDataSource.DataType.VALID)

        //When list Enter Valid Data
        val cityName = getCityManagerExpectationInteractor.execute("Polanda" , "nour","ahmed")

        //Then
        assertNull(cityName)
    }
}