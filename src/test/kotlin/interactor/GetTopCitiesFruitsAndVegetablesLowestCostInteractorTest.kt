package interactor

import fake.FakeData
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTopCitiesFruitsAndVegetablesLowestCostInteractorTest {

    private lateinit var interactor: GetTopCitiesFruitsAndVegetablesLowestCostInteractor
    private val fakeData = FakeData()

    @BeforeAll
    fun setup() {
        interactor = GetTopCitiesFruitsAndVegetablesLowestCostInteractor(fakeData)
    }

    @Test
    fun `should return true when cities fruits and vegetables is not null`(){
        // given
        val fakeCity = fakeData.getAllCitiesData()[0]
        // when
        val result = interactor.excludeNullFruitsAndVegetables(fakeCity)
        // then
        assertTrue(result)
    }
    @Test
    fun `should return false when all cities and vegetables is null`(){
        // given
        val fakeCity = fakeData.getAllCitiesData()[1]
        // when
        val result = interactor.excludeNullFruitsAndVegetables(fakeCity)
        // then
        assertFalse(result)
    }
    @Test
    fun `should return true when salaries is not null`(){
        // given
        val fakeCity = fakeData.getAllCitiesData()[0]
        // when
        val result = interactor.excludeNullSalaries(fakeCity)
        // then
        assertTrue(result)
    }
    @Test
    fun `should return false when all salaries is null`(){
        // given
        val fakeCity = fakeData.getAllCitiesData()[1]
        // when
        val result = interactor.excludeNullSalaries(fakeCity)
        // then
        assertFalse(result)
    }

}