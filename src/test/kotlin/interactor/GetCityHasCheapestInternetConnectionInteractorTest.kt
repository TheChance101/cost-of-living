package interactor

import dataSource.FakeDataSource
import model.CityEntity
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable


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
    fun should_ReturnTheOnlyCity_When_GivenOnly1CityInHighQualityData(){
        // given list of cityEntity
        val cities = fakeDataSource.getAllCitiesData()[16]
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

    @Test
    fun should_ReturnException_When_ThePrecentageOfInternetToSalaryEqualTo100OrAbove(){
        // given list has precentage of internet to salary equal 80 or above
        val cities = fakeDataSource.getAllCitiesData()[15]
        // when check what is the cheapest city in the list
        val result = Executable{cityHasCheapestInternet.execute(listOf(cities))}
        // then check the result
        assertThrows(Throwable::class.java,result)
    }


    @Test
    fun should_ReturnException_When_AllElementsInTheListThatEnteredIsBadQualityOrInternetPriceIsNullOrAverageSalaryIsNull(){
        // given list has bad quality data or null internet price or null average salary
        val cities = fakeDataSource.getAllCitiesData()[2]
        // when check what is the cheapest city in the list
        val result = Executable{cityHasCheapestInternet.execute(listOf(cities))}
        // then check the result
        assertThrows(Throwable::class.java,result)
    }
}