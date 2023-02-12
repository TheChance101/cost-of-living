package interactor

import dataSource.CsvDataSource
import fakeData.FackeDataSource
import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import java.util.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var getCity: GetCityHasCheapestInternetConnectionInteractor
    private lateinit var dataSource: FackeDataSource

    @BeforeEach
    fun setUp() {
        dataSource= FackeDataSource()
        getCity = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    }

    @Test
    fun Should_ReturnFalse_When_inputNullPrice() {
        //given a list of FackDataSource
        var city = dataSource.getAllCitiesWithNullPrice()[0]

        //when
        val result = getCity.excludeNullPrice(city)
        //then
        assertFalse(result)
    }

    @Test
    fun Should_ReturnFalse_When_InputNullSalary() {
        //given a list of FackDataSource
        var city = dataSource.getAllCitiesWithNullSalary()[0]
        //when
        val result = getCity.excludeNullSalaries(city)
        //then
        assertFalse(result)
    }


    @Test
    fun Should_ReturnTheCountryWithCheapestInternetPrice_When_SameSalaryAndDifferentPrice() {
        //given a list of FackDataSource
        dataSource.getAllCitiesWithSameSalaryAndDifferentPrice()
        //when
        val result = getCity.execute()
        //then
        assertEquals("Egypt", result)
    }

    @Test
    fun Should_ReturnTheCountryWithCheapestInternetPrice_When_SamePriceAndDifferentSalary() {
        //given a list of FackDataSource
        dataSource.getAllCitiesWithSamePriceAndDifferentSalary()
        //when
        val result = getCity.execute()
        //then
        assertEquals("London", result)
    }

    @Test
    fun Should_ReturnTheFirstCountryWithCheapestInternetPrice_When_SameAverage() {
        //given a list of FackDataSource
        dataSource.getAllCitiesWithSameAverage()
        //when
        val result = getCity.execute()
        //then
        assertEquals("Egypt", result)
    }

    @Test
    fun Should_ReturnTheCountryWithCheapestInternetPrice_When_AllTypeOfData() {
        //given a list of FackDataSource
        dataSource.getAllCitiesData()
        //when
        val result = getCity.execute()
        //then
        assertEquals("Jordan", result)
    }

}