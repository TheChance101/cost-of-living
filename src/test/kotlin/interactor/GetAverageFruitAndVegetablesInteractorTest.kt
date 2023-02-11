package interactor

import dataSource.utilis.FakeData
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
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
    fun execute() {
    }
}