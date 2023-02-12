package interactor

import dataSource.FakeDataSource
import model.CityEntity
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class GetHighestDifferentInApartmentRentTest {
    private lateinit var highestDifferentInApartmentRent: GetHighestDifferentInApartmentRent
    private lateinit var fakeDataSource: FakeDataSource

    @BeforeEach
    fun setup(){
        fakeDataSource = FakeDataSource()
        highestDifferentInApartmentRent =  GetHighestDifferentInApartmentRent(fakeDataSource)
    }

    @Test
    fun should_ReturnNull_When_givenEmptyList(){
        // given Empty list
        val cities = emptyList<CityEntity>()
        // when check what is the highest different in list with giving emptyList
        val result = highestDifferentInApartmentRent.execute(cities)
        // then check the result
        Assertions.assertNull(result)
    }


    @Test
    fun should_Return_City_Has_Highest_different_in_apartment_When_GivenListOfCities(){
        // given list of cityEntity
        val cities = fakeDataSource.getAllCitiesData()
        // when check what is the cities has highest different in apartment rent
        val result = highestDifferentInApartmentRent.execute(cities)
        // then check the result
        Assertions.assertEquals(cities[16].cityName, result)
    }
}
