package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertNotNull
import kotlin.test.assertNull

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityManagerExpectationTest {
    private lateinit var fakeData: FakeDataSource
    private lateinit var getCityManagerExpectation: GetCityManagerExpectation

    @BeforeAll
    fun init() {
        fakeData = FakeDataSource()
        getCityManagerExpectation =
            GetCityManagerExpectation(fakeData)
    }
    @Test
    fun should_ReturnCorrectCity_When_EnterValidData() {
        //Given fake data source
        fakeData.setDataType(FakeDataSource.DataType.VALID)

        //When list not equal null
        val list = getCityManagerExpectation.execute()

        //Then
        assertNotNull(list)
    }

    @Test
    fun should_ReturnNoValidList_When_EnterNull() {
        //Given fake data source
        fakeData.setDataType(FakeDataSource.DataType.NULLABLE)

        //When list equal null
        val list = getCityManagerExpectation.execute()

        //Then
        assertNull(list)
    }
}