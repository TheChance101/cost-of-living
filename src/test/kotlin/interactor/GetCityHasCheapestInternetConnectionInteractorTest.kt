package interactor

import dataSourse.utils.FakeDataSource
import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var cityHasCheapestInternet: GetCityHasCheapestInternetConnectionInteractor
    private lateinit var fakeDataSource: FakeDataSource

    @BeforeEach
    fun setup(){
        fakeDataSource = FakeDataSource()
        cityHasCheapestInternet = GetCityHasCheapestInternetConnectionInteractor(fakeDataSource)
    }


    @Test
    fun should_ReturnTheSameCity_When_GivenOneCityIncluded(){
        // given list of cityEntity of one city
        val cities = fakeDataSource.getAllCitiesData()[9]
        // when the cheapest city in list with given 1 city in list
        val result = cityHasCheapestInternet.execute(listOf(cities))
        // then check the result
        assertEquals(cities.cityName,result?.cityName)
    }



    @Test
    fun should_ReturnNull_WhenCityEntity_IsEmpty(){
        // given an Empty list
        val cities = emptyList<CityEntity>()
        // when the given is an empty list
        val result = cityHasCheapestInternet.execute(cities)
        // then check the result
        assertNull(result)
    }

    @Test
    fun should_Return_CheapestCity_When_GivenListOfCities(){
        // given list of cityEntity
        val cities = fakeDataSource.getAllCitiesData()
        // when check for the cheapest city in the list
        val result = cityHasCheapestInternet.execute(cities)
        // then check the result
        assertEquals(cities[5].cityName,result?.cityName)
    }
}