package interactor

import fakedata.FakeData

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.Assertions.*
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCItyWithMealPriceBetweenTwoTest {

    lateinit var GetCItyWithMealPriceBetweenTwoInteractor: GetCItyWithMealPriceBetweenTwo

    private lateinit var fakeData: FakeData

    @BeforeAll
    fun setup() {
        fakeData = FakeData()
        GetCItyWithMealPriceBetweenTwoInteractor = GetCItyWithMealPriceBetweenTwo(fakeData)
    }
    @Test
    fun should_ReturnCity_When_InputIsListOfNamesThatExist() {
        //given countries names exist in data
        val countries: List<String> = listOf("Cuba","Syria")
        //when input is list of name of existing countries
        val cityName = GetCItyWithMealPriceBetweenTwoInteractor.execute(countries)!!.cityName
        //then return correct city
        assertEquals("Damascus",cityName)
    }
    @Test
    fun should_ReturnCityInTheCorrectCountry_When_InputIsListOfSomeNamesThatExist() {
        //given countries names exist in data
        val countries: List<String> = listOf("Cuba","xxxx")
        //when input is list of name of some existing countries
        val cityName = GetCItyWithMealPriceBetweenTwoInteractor.execute(countries)!!.cityName
        //then return correct city
        assertEquals("Sancti Spiritus",cityName)
    }
    @Test
    fun should_ReturnNull_When_InputIsListOfNamesThatDoesNotExist() {
        //given countries names exist in data
        val countries: List<String> = listOf("xxxx","xxxx")
        //when input is list of names of not existing countries
        val city = GetCItyWithMealPriceBetweenTwoInteractor.execute(countries)
        //then return null
        assertNull(city)
    }
    @Test
    fun should_ReturnNull_When_InputEmptyList() {
        //given countries names exist in data
        val countries: List<String> = listOf()
        //when input is empty list
        val city = GetCItyWithMealPriceBetweenTwoInteractor.execute(countries)
        //then return null
        assertNull(city)
    }
    @Test
    fun should_ReturnNull_When_InputListOfCountriesContainLessThanThreeCitiesWithValidData() {
        //given countries names exist in data
        val countries: List<String> = listOf("Nigeria")//have 2 cities
        //when list of countries have less than 3 cities with valid data
        val city = GetCItyWithMealPriceBetweenTwoInteractor.execute(countries)
        println(fakeData.getAllCitiesData())
        //then return null
        assertNull(city)
    }

}