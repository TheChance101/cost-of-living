package interactor
import dataSource.FakeDataSource
import dataSource.FakeEmptyDataSource
import dataSource.FakeNullDataSource
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import java.lang.IllegalStateException
import java.util.NoSuchElementException
import kotlin.test.assertEquals

class GetCityHasTheHighestDifferentInApartmentRentTest {
    private lateinit var cityHasTheHighestDifferentInApartmentRent: GetCityHasTheHighestDifferentInApartmentRent
    private lateinit var emptyListOfCityHasTheHighestDifferentInApartmentRent: GetCityHasTheHighestDifferentInApartmentRent
    private lateinit var listOfNullCity: GetCityHasTheHighestDifferentInApartmentRent
    private lateinit var fakeDataSource: CostOfLivingDataSource
    private lateinit var fakeNullDataSource: CostOfLivingDataSource
    private lateinit var fakeEmptyDataSource: CostOfLivingDataSource

    @BeforeEach
    fun setup(){
        fakeDataSource = FakeDataSource()
        fakeEmptyDataSource=FakeEmptyDataSource()
        fakeNullDataSource=FakeNullDataSource()
        cityHasTheHighestDifferentInApartmentRent =  GetCityHasTheHighestDifferentInApartmentRent(fakeDataSource)
        emptyListOfCityHasTheHighestDifferentInApartmentRent=GetCityHasTheHighestDifferentInApartmentRent(fakeEmptyDataSource)
        listOfNullCity= GetCityHasTheHighestDifferentInApartmentRent(fakeNullDataSource)
    }

    @Test
    fun `should return city has highest different in apartment rent when given list of cities and limit equal to one`(){
        // given limit
        val limit=1
        // when the city has highest different in apartment rent
        val actual = cityHasTheHighestDifferentInApartmentRent.execute(limit)
        val expected=fakeDataSource.getAllCitiesData()[16]
        // then
        assertEquals(expected,actual)
    }

    @Test
    fun `should return empty list when limit equal to zero`(){
        // given limit
        val limit=0
        // when limit equal to zero
        val actual =Executable {cityHasTheHighestDifferentInApartmentRent.execute(limit)}
        val expected=InvalidLimitException::class.java
        // then
        assertThrows(expected,actual)
    }

    @Test
    fun `should throw exception when limit is negative`(){
        // given limit
        val limit=-1
        // when the limit is negative
        val actual =Executable {cityHasTheHighestDifferentInApartmentRent.execute(limit)}
        val expected=InvalidLimitException::class.java
        // then
        assertThrows(expected,actual)
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

    @Test
    fun `should return empty city when list after filtering is empty`(){
        // given limit
        val limit=1
        // when the limit is greater than one
        val actual =Executable {listOfNullCity.execute(limit)}
        val expected= NoSuchElementException::class.java
        // then
        assertThrows(expected,actual)
    }
    @Test
    fun `should return empty city when given empty list`(){
        // given limit
        val limit=1
        // when the city has highest different in apartment rent
        val actual =Executable{emptyListOfCityHasTheHighestDifferentInApartmentRent.execute(limit)}
        val expected=IllegalStateException::class.java
        // then
        assertThrows(expected,actual)
    }

}