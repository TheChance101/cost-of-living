import dataSource.FakeDataSource
import interactor.GetMostSuitableCityInteractor
import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetMostSuitableCityTest {

    private lateinit var getMostSuitableCityInteractor: GetMostSuitableCityInteractor
    private lateinit var fakeDataSource: FakeDataSource

    @BeforeEach
    fun setUp() {
        getMostSuitableCityInteractor = GetMostSuitableCityInteractor()
        fakeDataSource = FakeDataSource()
    }

    @Test
    fun should_ReturnCityName_when_GivenListOfCities() {
        val cityList = fakeDataSource.getAllCitiesData()
        val cityNameResult = getMostSuitableCityInteractor.findTheMostSuitableCity(cityList)
        assertEquals("Banjul", cityNameResult)
    }

    @Test
    fun should_ReturnException_when_ListOfCitiesIsEmpty() {

        val cityList = listOf<CityEntity>()
        val cityNameResult = Executable { getMostSuitableCityInteractor.findTheMostSuitableCity(cityList) }
        assertThrows(Exception::class.java, cityNameResult)
    }

    @Test
    fun should_ReturnCityName_when_ListHasOneItem() {
        val cityList = listOf(fakeDataSource.getAllCitiesData().first())
        val cityNameResult = getMostSuitableCityInteractor.findTheMostSuitableCity(cityList)
        assertEquals("Santiago de Cuba", cityNameResult)
    }

    @Test
    fun should_ReturnException_when_CityListEquelNull() {
        val cityList: List<CityEntity>? = null
        val cityNameResult = Executable { getMostSuitableCityInteractor.findTheMostSuitableCity(cityList!!)}
        assertThrows(Exception::class.java, cityNameResult)
    }

}
