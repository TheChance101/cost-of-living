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
    fun `should return city has highest different in apartment rent when given list of cities`(){
        // when the city has highest different in apartment rent
        val actual = cityHasTheHighestDifferentInApartmentRent.execute()
        val expected=fakeDataSource.getAllCitiesData()[16]
        // then
        assertEquals(expected,actual)
    }


    @Test
    fun `should throw exception when the filtered list is empty`(){
        // when the limit is greater than one
        val actual =Executable {listOfNullCity.execute()}
        val expected= NoSuchElementException::class.java
        // then
        assertThrows(expected,actual)
    }
    @Test
    fun `should return empty city when given empty list`(){
        // when the city has highest different in apartment rent
        val actual =Executable{emptyListOfCityHasTheHighestDifferentInApartmentRent.execute()}
        val expected=IllegalStateException::class.java
        // then
        assertThrows(expected,actual)
    }

}