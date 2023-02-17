package interactor
import dataSource.FakeDataSource
import model.CityEntity
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

class GetCityHasTheHighestDifferentInApartmentRentTest {
    private lateinit var cityHasTheHighestDifferentInApartmentRent: GetCityHasTheHighestDifferentInApartmentRent
    private lateinit var dataSource: FakeDataSource
    private lateinit var cities : List<CityEntity>

    @BeforeEach
    fun setup(){
        dataSource = FakeDataSource()
        cityHasTheHighestDifferentInApartmentRent =  GetCityHasTheHighestDifferentInApartmentRent(dataSource)
        cities=dataSource.getAllCitiesData()

    }

    @Test
    fun `should return city has highest different in apartment rent when given list of cities and limit equal to one`(){
        // given limit
        val limit=1
        // when the city has highest different in apartment rent
        val result = cityHasTheHighestDifferentInApartmentRent.execute(limit)
        val expected=cities[16]
        // then
        Assertions.assertEquals(expected, result)
    }

    @Test
    fun `should return empty list when limit equal to zero`(){
        // given limit
        val limit=0
        // when limit equal to zero
        val actual =Executable {cityHasTheHighestDifferentInApartmentRent.execute(limit)}
        val expected=InvalidLimitException::class.java
        // then
        assertThrows(expected, actual)
    }

    @Test
    fun `should throw exception when limit is negative`(){
        // given limit
        val limit=-1
        // when the limit is negative
        val actual =Executable {cityHasTheHighestDifferentInApartmentRent.execute(limit)}
        val expected=InvalidLimitException::class.java
        // then
        assertThrows(expected, actual)
    }

    @Test
    fun `should throw exception when limit is greater than one `(){
        // given limit
        val limit=2
        // when the limit is greater than one
        val actual =Executable {cityHasTheHighestDifferentInApartmentRent.execute(limit)}
        val expected=InvalidLimitException::class.java
        // then
        assertThrows(expected, actual)
    }
}