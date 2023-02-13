package interactor

import dataSource.FakeDataSource
import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetMostSuitableCityInteractorTest {

    private lateinit var getMostSuitableCityInteractor: GetMostSuitableCityInteractor
    private lateinit var fakeDataSource: FakeDataSource

    @BeforeAll
    fun setUp() {
        getMostSuitableCityInteractor = GetMostSuitableCityInteractor()
        fakeDataSource = FakeDataSource()
    }

    @Test
    fun should_ReturnCityName_when_GivenListOfCities() {
        //given
        val cityList = fakeDataSource.getAllCitiesData()
        //when
        val cityNameResult = getMostSuitableCityInteractor.findTheMostSuitableCity(cityList)
        //then
        assertEquals("Banjul", cityNameResult)
    }

    @Test
    fun should_ReturnException_when_ListOfCitiesIsEmpty() {
        //given
        val cityList = emptyList<CityEntity>()
        //when
        val cityNameResult = Executable { getMostSuitableCityInteractor.findTheMostSuitableCity(cityList) }
        //then
        assertThrows(Exception::class.java, cityNameResult)
    }

    @Test
    fun should_ReturnCityName_when_ListHasOneItem() {
        //given
        val cityList = listOf(fakeDataSource.getAllCitiesData().last())
        //when
        val cityNameResult = getMostSuitableCityInteractor.findTheMostSuitableCity(cityList)
        //then
        assertEquals("Sri Jayewardenepura Kotte", cityNameResult)
    }

    @Test
    fun should_ReturnException_when_CityListEquelNull() {
        //given
        val cityList: List<CityEntity>? = null
        //when
        val cityNameResult = Executable { getMostSuitableCityInteractor.findTheMostSuitableCity(cityList!!) }
        //then
        assertThrows(Exception::class.java, cityNameResult)
    }

    @Test
    fun should_ReturnException_when_AllCitiesHasNullData() {
        //given
        val cityList = fakeDataSource.getAllCitiesData().take(3)
        val cityNameResult = Executable { getMostSuitableCityInteractor.findTheMostSuitableCity(cityList) }
        //then
        assertThrows(Exception::class.java, cityNameResult)

    }

}
