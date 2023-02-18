package interactor

import dataSource.FakeCityItems
import dataSource.FakeDataSource
import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.function.Executable
import utils.Constants

class GetCityMatchManagerExpectationsInteractorTest {

    private lateinit var interactor: GetCityMatchManagerExpectationsInteractor
    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var fakeDataSourceCities: CostOfLivingDataSource


    @BeforeEach
    fun setup() {
        dataSource = FakeDataSource()
        fakeDataSourceCities = FakeCityItems()
        interactor = GetCityMatchManagerExpectationsInteractor(dataSource)
    }


    @Test
    fun `should throw exception when no data there`() {
        // when we check if it is one of the required countries
        val actual = Executable { interactor.execute() }
        val expected = Exception::class.java

        // then we should assert exception
        assertThrows(expected, actual)
    }

    @Test
    fun `should return empty list when list has not required country`() {
        // when we check if there is no required countries
        val actual = interactor.execute()
        val expected = actual == null

        // then we should return false
        assertFalse(expected)
    }

    @Test
    fun `should return correct city name with lowest mid-range meal price when given list of lowest, highest and mid prices`() {
        // given list of lowest, highest and mid prices cities
        interactor = GetCityMatchManagerExpectationsInteractor(fakeDataSourceCities)

        // when making the logic on the list
        val actual = interactor.execute()?.cityName
        val expected = "Monterey Park"
        // then
        assertEquals(expected, actual)
    }


}