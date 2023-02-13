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

}