package interactor

import dataSource.utilis.FakeData
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetAverageFruitAndVegetablesInteractorTest {

    private lateinit var getAverageFruitAndVegetablesInteractor: GetAverageFruitAndVegetablesInteractor
    private lateinit var fakeData: FakeData

    @BeforeAll
    fun setup(){
        fakeData = FakeData()
        getAverageFruitAndVegetablesInteractor = GetAverageFruitAndVegetablesInteractor(fakeData)
    }

    @Test
    fun should_ReturnListOf10CitiesNames_When_TheDataSourceIsValid() {
        val result = getAverageFruitAndVegetablesInteractor.execute()
        val expected = listOf(
            "Christiansburg",
            "Brookdale",
            "Woodlawn",
            "Vryheid",
            "Clayton",
            "Brevard",
            "Mortsel",
            "Kernersville",
            "Airway Heights",
            "Ridgecrest"
        )
        assertEquals(expected,result)
    }
}