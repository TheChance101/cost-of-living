package interactor

import dataSource.FakeCityItems
import dataSource.FakeDataSource
import dataSource.FakeEmptyDataSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

class GetCityMatchManagerExpectationsInteractorTest {

    private lateinit var interactor: GetCityMatchManagerExpectationsInteractor
    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var fakeDataSourceCities: CostOfLivingDataSource
    private lateinit var fakeEmptyDataSource: CostOfLivingDataSource


    @BeforeEach
    fun setup() {
        dataSource = FakeDataSource()
        fakeDataSourceCities = FakeCityItems()
        fakeEmptyDataSource = FakeEmptyDataSource()
        interactor = GetCityMatchManagerExpectationsInteractor(dataSource)
    }


    @Test
    fun `should throw exception when no data there`() {
        // when there is no data
        interactor = GetCityMatchManagerExpectationsInteractor(fakeEmptyDataSource)

        val actual = Executable { interactor.execute() }
        val expected = Exception::class.java

        // then we should assert exception
        assertThrows(expected, actual)
    }

    @Test
    fun `should return empty list when list has not required country`() {
        // when we check if there is no required countries
        val actual = Executable { interactor.execute() }
        val expected = NoSuchElementException::class.java

        // then we should return false
        assertThrows(expected, actual)
    }

    @Test
    fun `should return correct city name with lowest mid-range meal price when given list of lowest, highest and mid prices`() {
        // given list of lowest, highest and mid prices cities
        interactor = GetCityMatchManagerExpectationsInteractor(fakeDataSourceCities)

        // when making the logic on the list
        val actual = interactor.execute().cityName
        val expected = "Monterey Park"
        // then
        assertEquals(expected, actual)
    }


}