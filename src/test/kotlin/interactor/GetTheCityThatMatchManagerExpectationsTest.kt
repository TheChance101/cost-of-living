package interactor

import FakeData
import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class GetTheCityThatMatchManagerExpectationsTest {

    private lateinit var fakeData: FakeData
    private lateinit var GetTheCityThatMatchManagerExpectations: GetTheCityThatMatchManagerExpectations

    @BeforeAll
    fun setUp() {
        fakeData = FakeData();
        GetTheCityThatMatchManagerExpectations = GetTheCityThatMatchManagerExpectations(fakeData)


    }

    @Test
    fun should_ReturnEmptyList_When_givenAListDoesntHave_USAMexicoCanada() {
        //given
        val CountriesList = fakeData.getAllCitiesData()
            .filterNot { it.country == "United States" || it.country == "Mexico" || it.country == "Canada" }

        // when
        val actualResult = GetTheCityThatMatchManagerExpectations.filterByCountryAndNoneNullable(CountriesList)

        //then
        assertTrue(actualResult.isEmpty())
    }
    @Test
    fun should_ReturnAList_When_given_InRangeCountries() {
        //given
        val CountriesList = fakeData.getAllCitiesData()
            .filter { it.country == "United States" || it.country == "Mexico" || it.country == "Canada" }

        // when
        val actualResult = GetTheCityThatMatchManagerExpectations.filterByCountryAndNoneNullable(CountriesList)

        //then
        assertTrue(actualResult.isNotEmpty())
    }


    @Test
    fun should_ReturnMideValue_when_EntringDoubleNumber(){
        // given
        val givenValue = 5
        // when
        val actualResult = GetTheCityThatMatchManagerExpectations.getMedianValue(givenValue)
        // then
        assertEquals(2,actualResult)
    }
    @Test
    fun should_ReturnZero_when_EntringZero(){
        // given
        val givenValue = 0
        // when
        val actualResult = GetTheCityThatMatchManagerExpectations.getMedianValue(givenValue)
        // then
        assertEquals(0,actualResult)
    }

    @Test
    fun should_ReturnMidValueCountry() {
        /*
           in fake data we have three city entities two in america and one in canada
           mealFor2PeopleMidRangeRestaurant in america is 60 and 65
           in canada it's 29.65
         */
        // when
        val actualResult = GetTheCityThatMatchManagerExpectations.execute().mealsPrices.mealFor2PeopleMidRangeRestaurant

        //then
        assertEquals(60.0f,actualResult)
    }
    @Test
    fun should_ExecludeNullValues_When_GivingAListContaininginRegionCountryMidMeal_IsNull(){
        //given
        val CountriesList = fakeData.getAllCitiesData()
            .filterNot { it.country == "United States" || it.country == "Mexico" || it.country == "Canada" } // 4
        // when
        val actualResult = GetTheCityThatMatchManagerExpectations.filterByCountryAndNoneNullable(CountriesList).size
        //then
        assertNotEquals(CountriesList.size,actualResult)
    }

}