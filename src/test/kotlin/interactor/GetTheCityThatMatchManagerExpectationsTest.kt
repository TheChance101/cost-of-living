package interactor

import FakeData
import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class GetTheCityThatMatchManagerExpectationsTest {

    private lateinit var fakeData:FakeData
    private lateinit var GetTheCityThatMatchManagerExpectations:GetTheCityThatMatchManagerExpectations

    @BeforeAll
    fun setUp() {
        fakeData = FakeData();
        GetTheCityThatMatchManagerExpectations = GetTheCityThatMatchManagerExpectations(fakeData)


    }
    @Test
    fun Should_ReturnNotNullCityExcute(){
        //when
        val result= GetTheCityThatMatchManagerExpectations.excute()
        //then
        assertNotNull(result)
    }

    @Test
    fun ShouldSearchInSelectedCities(){
        //when
        val Country = listOf<String>("USA","Canada","Mexico")

        if(GetTheCityThatMatchManagerExpectations.searchCity() != null){
            val isExists:Boolean = GetTheCityThatMatchManagerExpectations.searchCity()!!.country in Country
            //then
            assertTrue(isExists)
        }
    }


}