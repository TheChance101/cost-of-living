package interactor

import fakedata.FakeDataSource
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasHighestRentingBetweenApartmentsInteractorTest {

    private lateinit var dataSource: FakeDataSource
    private lateinit var getDifferentBetweenApartmentRenting: GetCityHasHighestRentingBetweenApartmentsInteractor
    @BeforeAll
    fun setup() {

        dataSource = FakeDataSource()
        getDifferentBetweenApartmentRenting= GetCityHasHighestRentingBetweenApartmentsInteractor(dataSource)

    }
    @Test
    fun should_ReturnCorrectDifferent_when_HaveCorrectInput(){
        //given valid city
        val expectedCity = dataSource.alexHighQuality
        // when calculate the best city to rent based on the rental price.
        val cityEntity = getDifferentBetweenApartmentRenting.getHighestQualityCityForRenting()
        // then check the result
        assertEquals(expectedCity, cityEntity)
    }
    @Test
    fun should_ReturnCityEntity_When_InCorrectResult() {
        //given the not correct city

        val expectedCity = dataSource.newYorkLowQuality
        // when  calculate the best city to rent based on the rental price.
        val cityEntity = getDifferentBetweenApartmentRenting.getHighestQualityCityForRenting()

        // then check the result
        assertNotEquals(expectedCity, cityEntity)
    }
}