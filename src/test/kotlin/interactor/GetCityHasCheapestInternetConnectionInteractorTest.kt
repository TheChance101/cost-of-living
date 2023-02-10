package interactor

import dataSource.FakeDataSource
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
        cityHasCheapestInternet = GetCityHasCheapestInternetConnectionInteractor()
    }



    @Test
    fun should_ReturnTheOnlyCity_When_GivenOnly1CityIncluded(){
        // given list of cityEntity
        val cities = fakeDataSource.getAllCitiesData()[10]
        // when check what is the cheapest city in list with giving only 1 city in list
        val result = cityHasCheapestInternet.execute(listOf(cities))
        // then check the result
        assertEquals(cities.cityName,result?.cityName)
    }

    @Test
    fun should_ReturnNull_When_givenEmptyList(){
        // given Empty list
        val cities = emptyList<CityEntity>()
        // when check what is the cheapest city in list with giving emptyList
        val result = cityHasCheapestInternet.execute(cities)
        // then check the result
        assertNull(result)
    }

    @Test
    fun should_Return_CheapestCity_When_GivenListOfCities(){
        // given list of cityEntity
        val cities = fakeDataSource.getAllCitiesData()
        // when check what is the cheapest city in the list
        val result = cityHasCheapestInternet.execute(cities)
        // then check the result
        assertEquals(cities[17].cityName,result?.cityName)
    }
}