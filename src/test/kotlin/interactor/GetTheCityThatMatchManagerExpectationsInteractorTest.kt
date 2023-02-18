package interactor

import fakeDataSource.FakeData
import interactor.util.Constants.CANADA
import interactor.util.Constants.MEXICO
import interactor.util.Constants.UNITED_STATES
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTheCityThatMatchManagerExpectationsInteractorTest {

    private lateinit var fakeData: FakeData
    private lateinit var getTheCityThatMatchManagerExpectations: GetTheCityThatMatchManagerExpectationsInteractor

    @BeforeAll
    fun setUp() {
        fakeData = FakeData();
        getTheCityThatMatchManagerExpectations = GetTheCityThatMatchManagerExpectationsInteractor(fakeData)
    }

    @Test
    fun should_ReturnEmptyList_When_givenAListDoesntHave_USAMexicoCanada() {
        //given
        val countries = fakeData.getAllCitiesData()
            .filterNot { it.country == UNITED_STATES || it.country == MEXICO || it.country == CANADA }

        // when
        val actualResult = getTheCityThatMatchManagerExpectations.filterByCountryAndNoneNullable(countries)

        //then
        assertTrue(actualResult.isEmpty())
    }

    @Test
    fun should_ReturnAList_When_given_InRangeCountries() {
        //given
        val countries = fakeData.getAllCitiesData()
            .filter { it.country == UNITED_STATES || it.country == MEXICO || it.country == CANADA }

        // when
        val actualResult = getTheCityThatMatchManagerExpectations.filterByCountryAndNoneNullable(countries)

        //then
        assertTrue(actualResult.isNotEmpty())
    }


    @Test
    fun should_ReturnMideValue_when_EntringDoubleNumber() {
        // given
        val givenValue = 5
        // when
        val actualResult = getTheCityThatMatchManagerExpectations.getMedianValue(givenValue)
        // then
        assertEquals(2, actualResult)
    }

    @Test
    fun should_ReturnZero_when_EntringZero() {
        // given
        val givenValue = 0
        // when
        val actualResult = getTheCityThatMatchManagerExpectations.getMedianValue(givenValue)
        // then
        assertEquals(0, actualResult)
    }

    @Test
    fun should_ReturnMidValueCountry() {
        /*
           in fake data we have three city entities two in america and one in canada
           mealFor2PeopleMidRangeRestaurant in america is 60 and 65
           in canada it's 29.65
         */
        // when
        val actualResult = getTheCityThatMatchManagerExpectations.execute().mealsPrices.mealFor2PeopleMidRangeRestaurant

        //then
        assertEquals(60.0f, actualResult)
    }

    @Test
    fun should_ExecludeNullValues_When_GivingAListContaininginRegionCountryMidMeal_IsNull() {
        //given
        val countries = fakeData.getAllCitiesData()
            .filterNot { it.country == UNITED_STATES || it.country == MEXICO || it.country == CANADA } // 4
        // when
        val actualResult = getTheCityThatMatchManagerExpectations.filterByCountryAndNoneNullable(countries).size
        //then
        assertNotEquals(countries.size, actualResult)
    }

}