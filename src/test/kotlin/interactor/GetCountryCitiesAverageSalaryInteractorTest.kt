package interactor

import FakeData
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCountryCitiesAverageSalaryInteractorTest {

    private lateinit var getCountryCitiesAverageSalary: GetCountryCitiesAverageSalaryInteractor

    @BeforeAll
    fun setUp() {
        val fakeData = FakeData()
        getCountryCitiesAverageSalary = GetCountryCitiesAverageSalaryInteractor(fakeData)
    }

    @Test
    fun should_ReturnCitiesSalaries_When_EnteringCountryNameWithSpaces() {
        //given
        val country = "sri     lanka"
        // when
        val result = getCountryCitiesAverageSalary.execute(country = country)
        val expectedResult = listOf(Pair("Colombo", 156.15f), Pair("Colombo", 156.15f))
        //then
        assertEquals(expectedResult, result)
    }

    @Test
    fun should_throwException_when_enteringEmptyString() {
        //given
        val country = ""
        // when
        val result = Executable { getCountryCitiesAverageSalary.execute(country = country) }
        //then
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun should_throwException_when_enteringCountryNameNotInEnglish() {
        //given
        val country = "كوبا"
        // when
        val result = Executable { getCountryCitiesAverageSalary.execute(country = country) }
        //then
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun should_returnCountryCities_when_enteringCountryInUpperCase() {
        //given
        val country = "CUBA"
        // when
        val result = getCountryCitiesAverageSalary.execute(country = country)
        val expectedResult = listOf(Pair("Havana", 35.75f))
        //then
        assertEquals(expectedResult, result)
    }
}