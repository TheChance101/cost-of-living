package interactor
import dataSource.FakeDataSource
import model.CityEntity
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.function.Executable

class GetCityThatHasLowestCostOfFoodInteractorTest {

    private lateinit var fakeData : CostOfLivingDataSource
    private lateinit var GetCityThatHasLowestCostOfFood :GetCityThatHasLowestCostOfFoodInteractor

    @BeforeEach
    fun setUp(){
        fakeData= FakeDataSource()
        GetCityThatHasLowestCostOfFood = GetCityThatHasLowestCostOfFoodInteractor(fakeData)
    }

    @Test
    fun `should return exception when list of cities is empty`() {
        //given
        val cityList = emptyList<CityEntity>()
        //when
        val cityNameResult = Executable { GetCityThatHasLowestCostOfFood.execute() }
        //then
        Assertions.assertThrows(Exception::class.java, cityNameResult)
    }
    @Test
    fun `should return city name when given list 0f cities`() {
        //given
        val cityList = fakeData.getAllCitiesData()
        //when
        val cityNameResult = GetCityThatHasLowestCostOfFood.execute()
        //then
        Assertions.assertEquals(" ", cityNameResult)
    }
}