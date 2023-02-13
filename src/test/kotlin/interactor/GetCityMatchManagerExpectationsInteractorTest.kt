package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import dataSource.utils.NorthAmericaCountries
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class GetCityMatchManagerExpectationsInteractorTest {

    /// TODO: uncomment this when completing the test
//    private lateinit var dataSource: FakeDataSource
    private lateinit var interactor: GetCityMatchManagerExpectationsInteractor

    /// TODO: remove this code when completing the test
    private lateinit var dataSource: CsvDataSource
    private lateinit var csvParser: CsvParser


    @BeforeEach
    fun setup() {
        /// TODO: remove this code when completing the test
        csvParser = CsvParser()
        dataSource = CsvDataSource(csvParser)

        interactor = GetCityMatchManagerExpectationsInteractor(dataSource)

        /// TODO: uncomment this when completing the test
//        dataSource = FakeDataSource()
    }

    @Test
    fun `should return false when country is not in one of north america countries`() {
        // given a list of countries that are in north america
        val givenList = NorthAmericaCountries.list
        // when we check if the countries are in north america
        val result = interactor.execute()
        // then we should get true
        assertFalse(!givenList.contains(result.country))
    }

    @Test
    fun `should return true when country is in one of north america countries`() {
        // given a list of countries that are in north america
        val givenList = NorthAmericaCountries.list
        // when we check if the countries are in north america
        val result = interactor.execute()
        // then we should get true
        assertTrue(givenList.contains(result.country))
    }

    @Test
    fun `should return meal price when mealFor2PeopleMidRangeRestaurant is not null`() {
        // given a list of countries that are in north america
        val givenValue = null
        // when we check if the countries are in north america
        val result = interactor.execute()
        // then we should get true
        assertNotEquals(givenValue, result.mealsPrices.mealFor2PeopleMidRangeRestaurant)
    }


    @Test
    fun `should return meal price when mealInexpensiveRestaurant is not null`() {
        // given a list of countries that are in north america
        val givenValue = null
        // when we check if the countries are in north america
        val result = interactor.execute()
        // then we should get true
        assertNotEquals(givenValue, result.mealsPrices.mealInexpensiveRestaurant)
    }




}