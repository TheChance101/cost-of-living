package interactor

import fake.FakeData
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTop10CitiesFruitsAndVegetablesLowestCostInteractorTest {

    private lateinit var interactor: GetTop10CitiesFruitsAndVegetablesLowestCostInteractor
    private val fakeData = FakeData()

    @BeforeAll
    fun setup() {
        interactor = GetTop10CitiesFruitsAndVegetablesLowestCostInteractor(fakeData)
    }

}