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
class GetCityHasTheHighestDifferentInApartmentRentInteractorTest {
    private lateinit var dataInteractor: GetCityHasTheHighestDifferentInApartmentRentInteractor
    private lateinit var emptyDataInteractor: GetCityHasTheHighestDifferentInApartmentRentInteractor
    private lateinit var nullDataInteractor: GetCityHasTheHighestDifferentInApartmentRentInteractor
    private lateinit var fakeDataSource: CostOfLivingDataSource
    private lateinit var fakeNullDataSource: CostOfLivingDataSource
    private lateinit var fakeEmptyDataSource: CostOfLivingDataSource

    @BeforeEach
    fun setup(){
        fakeDataSource = FakeDataSource()
        fakeEmptyDataSource=FakeEmptyDataSource()
        fakeNullDataSource=FakeNullDataSource()
        dataInteractor =  GetCityHasTheHighestDifferentInApartmentRentInteractor(fakeDataSource)
        emptyDataInteractor=GetCityHasTheHighestDifferentInApartmentRentInteractor(fakeEmptyDataSource)
        nullDataInteractor= GetCityHasTheHighestDifferentInApartmentRentInteractor(fakeNullDataSource)
    }

    @Test
    fun `should return city has highest different in apartment rent when given list of cities`(){
        // when the city has the highest different in apartment rent
        val actual = dataInteractor.execute()
        val expected=fakeDataSource.getAllCitiesData()[16]
        // then
        assertEquals(expected,actual)
    }


    @Test
    fun `should throw exception when filtered list is empty`(){
        // when filtered list is empty
        val actual =Executable {nullDataInteractor.execute()}
        val expected= NoSuchElementException::class.java
        // then
        assertThrows(expected,actual)
    }
    @Test
    fun `should throw exception when retrieved data is empty`(){
        // when the list is empty
        val actual =Executable{emptyDataInteractor.execute()}
        val expected=IllegalStateException::class.java
        // then
        assertThrows(expected,actual)
    }

}