package interactor

import fakeDataSource.SearchForSalariesFakeDataSource
import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class SearchForAverageSalariesInCountryInteractorTest {

    private lateinit var searchForAverageSalariesInCountryInteractor: SearchForAverageSalariesInCountryInteractor
    private val fake = SearchForSalariesFakeDataSource()

    @BeforeAll
    fun setUp() {
        searchForAverageSalariesInCountryInteractor = SearchForAverageSalariesInCountryInteractor(fake)
    }

    @Test
    fun should_ReturnTrue_When_DataQualityInCityEntityIsHigh() {
        //given
        val city = fake.getHighQualityCityEntity()
        //when
        val dataQualityInCity = excludeLowQualityCityEntityData(city)
        //then
        assertTrue(dataQualityInCity)
    }

    @Test
    fun should_ReturnFalse_When_DataQualityInCityEntityIsLow() {
        //given
        val city = fake.getLowQualityCityEntity()

        //when
        val dataQualityInCity = excludeLowQualityCityEntityData(city)
        //then
        assertFalse(dataQualityInCity)
    }

    @Test
    fun shouldReturnNull_When_AverageSalaryIsNull() {
        //given
        val city = fake.getNullSalaries()
        //when
        val valueOfSalary = excludeNullSalaries(city)
        //then
        assertFalse(valueOfSalary)
    }

    @Test
    fun shouldReturnValueOfAverageSalary_When_AverageSalaryIsNotNull() {
        //given
        val city = fake.getNotNullAverageSalaries()
        //when
        val valueOfSalary = excludeNullSalaries(city)
        //then
        assertTrue(valueOfSalary)
    }

    @Test
    fun should_ReturnCorrectListOfCities_When_TheCountryNameIsCorrectAndInLowerCase() {
        //given
        val country = "egypt"
        val cities = fake.getExpectedCities()
        //when
        val listOfCitiesAndAverageSalary = searchForAverageSalariesInCountryInteractor.execute(country)
        //then
        assertEquals(cities, listOfCitiesAndAverageSalary)
    }

    @Test
    fun should_ReturnCorrectListOfCities_When_TheCountryNameIsCorrectAndInUpperCase() {
        //given
        val country = "EGYPT"
        val cities = fake.getExpectedCities()

        //when
        val listOfCitiesAndAverageSalary = searchForAverageSalariesInCountryInteractor.execute(country)
        //then
        assertEquals(cities, listOfCitiesAndAverageSalary)

    }

    @Test
    fun should_ReturnCorrectListOfCities_When_TheCountryNameIsCorrectAndMixedLetters() {
        //given
        val country = "Egypt"
        val cities = fake.getExpectedCities()
        //when
        val listOfCitiesAndAverageSalary = searchForAverageSalariesInCountryInteractor.execute(country)
        //then
        assertEquals(cities, listOfCitiesAndAverageSalary)

    }

    @Test
    fun should_ThrowException_When_TheNameOfTheCountryIsWrong() {
        //given
        val country = "egept"
        //when
        val listOfCitiesExecutable: Executable =
            org.junit.jupiter.api.function.Executable { searchForAverageSalariesInCountryInteractor.execute(country) }
        //then
        assertThrows(Exception::class.java, listOfCitiesExecutable)
    }


}
