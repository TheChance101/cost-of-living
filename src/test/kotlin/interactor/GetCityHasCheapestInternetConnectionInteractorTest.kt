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
        val citiesEntity = fakeDataSource.getAllCitiesData()[4]
        // when the cheapest city in list with given 1 city in list
        val operation = cityHasCheapestInternet.execute(listOf(citiesEntity))
        // then check the result
        assertEquals(citiesEntity.cityName,operation?.cityName)
    }



    @Test
    fun  should_ReturnNull_WhenCityEntityEmpty(){
        // given an Empty list
        val citiesEntity = emptyList<CityEntity>()
        // when the given is an empty list
        val result = cityHasCheapestInternet.execute(citiesEntity)
        // then check the result
        assertNull(result)
    }

    @Test
    fun should_Return_CheapestCity_When_GivenListOfCities(){
        // given list of cityEntity
        val citiesEntity = fakeDataSource.getAllCitiesData()
        // when check for the cheapest city in the list
        val result = cityHasCheapestInternet.execute(citiesEntity)
        // then check the result
        assertEquals(citiesEntity[9].cityName,result?.cityName)
    }
}