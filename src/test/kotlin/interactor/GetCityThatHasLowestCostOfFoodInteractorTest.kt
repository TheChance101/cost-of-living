package interactor
import dataSource.FakeDataSource
import dataSource.FakeDataWithEmptyList
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

class GetCityThatHasLowestCostOfFoodInteractorTest {

    private lateinit var fakeData : CostOfLivingDataSource
    private lateinit var interactor :GetCityThatHasLowestCostOfFoodInteractor
    private lateinit var emptyDataInteractor :GetCityThatHasLowestCostOfFoodInteractor

    @BeforeEach
    fun setUp(){
        fakeData= FakeDataSource()
        interactor = GetCityThatHasLowestCostOfFoodInteractor(fakeData)
        emptyDataInteractor = GetCityThatHasLowestCostOfFoodInteractor(FakeDataWithEmptyList())
    }

    @Test
    fun `should return exception when list of cities is empty`() {
        //when
        val actual = Executable { emptyDataInteractor.execute() }
        //then
        assertThrows(IllegalStateException::class.java, actual)
    }
    @Test
    fun `should return city name when given list 0f cities`() {
        //when
        val actual = interactor.execute().cityName
        val expected = "Narayanganj"
        //then
        assertEquals(expected, actual)
    }
}