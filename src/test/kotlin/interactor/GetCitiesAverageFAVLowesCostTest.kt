package interactor

import fakedata.FakeDataGetCitiesAverageFAVLowesCost
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesAverageFAVLowesCostTest {

    private lateinit var fakeNormalData: FakeDataGetCitiesAverageFAVLowesCost
    @BeforeAll
    fun setUp() {
        fakeNormalData = FakeDataGetCitiesAverageFAVLowesCost()
    }
    @Test
    fun should_ReturnTenCitiesNames_WhenGetAverageOfFruitsAndVegetablesLowestCost() {
        //Given FakeDataOfCityEntities
        val fakeDataOfCityEntities = fakeNormalData
        //When execute to get Cities Names That Average Fruits And Vegetables Lowest Cost
        val citiesNames = GetCitiesAverageFAVLowesCost(fakeDataOfCityEntities).execute(10)
        //Then Get 10 Names Of Cities
        assertEquals(listOf("Desouk","Dendera","Deir Mawas","Dairut","Dekernes","Dar El Salam","Daraw","Dishna","Cairo","Dahab"),citiesNames)

    }
}