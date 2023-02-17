package interactor

import fakedata.FakeDataSource
import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class GetTopFiveCitiesForFashionInteractorTest {
    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var getTopFiveCitiesForFashionInteractor: GetTopFiveCitiesForFashionInteractor

    private lateinit var fakeData: FakeDataSource

    @BeforeEach
    fun setUp() {
        fakeData = FakeDataSource()
        dataSource = fakeData
        getTopFiveCitiesForFashionInteractor = GetTopFiveCitiesForFashionInteractor(dataSource)
    }



    @Test
    fun should_returnListOfFiveCities_whenListOfCitiesNotEmpty() {

       var topFiveCites = getTopFiveCitiesForFashionInteractor.execute(5)

        // then check result
        assertEquals(listOf("Accra", "Abuja", "Abu Dhabi", "Aberdeen", "Abidjan"), topFiveCites)

    }
}