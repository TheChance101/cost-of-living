package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class GetCityMatchManagerExpectationsInteractorTest {

    private lateinit var interactor: GetCityMatchManagerExpectationsInteractor
    private lateinit var dataSource: FakeDataSource


    @BeforeEach
    fun setup() {
        dataSource = FakeDataSource()
        interactor = GetCityMatchManagerExpectationsInteractor(dataSource)
    }


    @Test
    fun `should return false when country is in one of north america countries`() {
        // given a list of required countries
        val givenList = GetCityMatchManagerExpectationsInteractor.onlyRequiredCountries
        // when we check if it is one of the required countries
        val result = interactor.execute()
        // then we should get false
        assertFalse(givenList.contains(result.country))
    }

    @Test
    fun `should return true when country is not in one of required countries`() {
        // given a list of required countries
        val givenList = GetCityMatchManagerExpectationsInteractor.onlyRequiredCountries
        // when we check if it is not one of the required countries
        val result = interactor.execute()
        // then we should get true
        assertTrue(!givenList.contains(result.country))
    }


    @Test
    fun `should return meal price when mealFor2PeopleMidRangeRestaurant is not null`() {
        // given a null value
        val givenValue = null
        // when we check if mealFor2PeopleMidRangeRestaurant is not null
        val result = interactor.execute()
        // then we should get true
        assertNotEquals(givenValue, result.mealsPrices.mealFor2PeopleMidRangeRestaurant)
    }


    @Test
    fun `should return meal price when mealInexpensiveRestaurant is not null`() {
        // given a null value
        val givenValue = null
        // when we check if mealInexpensiveRestaurant is not null
        val result = interactor.execute()
        // then we should get true
        assertNotEquals(givenValue, result.mealsPrices.mealInexpensiveRestaurant)
    }

    @Test
    fun `should return meal price when mealAtMcDonaldSOrEquivalent is not null`() {
        // given a null value
        val givenValue = null
        // when we check if mealAtMcDonaldSOrEquivalent is not null
        val result = interactor.execute()
        // then we should get true
        assertNotEquals(givenValue, result.mealsPrices.mealAtMcDonaldSOrEquivalent)
    }


}