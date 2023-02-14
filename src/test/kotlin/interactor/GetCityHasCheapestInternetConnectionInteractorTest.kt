package interactor

import data.FakeDataSource
import data.TestCase
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var cityHasCheapestInternet: GetCityHasCheapestInternetConnectionInteractor
    private lateinit var fakeData: FakeDataSource

    @BeforeAll
    fun setup() {
        fakeData = FakeDataSource()
        cityHasCheapestInternet = GetCityHasCheapestInternetConnectionInteractor(fakeData)
        fakeData.changeDataSource(TestCase.CheapestInternet)
    }

    @Test
    fun should_Return_CheapestCity_When_GivenListOfCities() {
        // given list of cityEntity
        val citiesEntity = fakeData.getAllCitiesData()
        // when check for the cheapest city in the list
        val operation = cityHasCheapestInternet.execute()
        // then check the result
        assertEquals(citiesEntity[9].cityName, operation.cityName)
    }

}