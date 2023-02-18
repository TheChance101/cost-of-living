package interactor

import fakedata.FakeDataSource
import org.junit.jupiter.api.Assertions.*


import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTheAverageSalaryForEachCityInTheCountryInteractorTest {
    lateinit var fakeData: FakeDataSource

    @BeforeAll
    fun setup() {
        fakeData = FakeDataSource()
    }

    @Test
    fun should_ReturnListOfPairsEachPairContainCityNameAndSalaryAverage_whenCountryNameIsLowerCase() {
        //given country name in lower case
        val countryName = "egypt"
        val expectedOutput = listOf(Pair("Alex", 6000f))
        //when find the city name and salary average
        val cityAndSalaryAverage = GetTheAverageSalaryForEachCityInTheCountryInteractor(fakeData).execute(countryName)
        //then check return a List of pairs each pair have city name and salary average for this city
        assertEquals(expectedOutput, cityAndSalaryAverage)

    }

    @Test
    fun should_ReturnListOfPairsEachPairContainCityNameAndSalaryAverage_whenCountryNameIsUpperCase() {
        //given country name in upper case
        val countryName = "EGYPT"
        val expectedOutput = listOf(Pair("Alex", 6000f))
        //when find the city name and salary average
        val cityAndSalaryAverage = GetTheAverageSalaryForEachCityInTheCountryInteractor(fakeData).execute(countryName)
        //then check return a List of pairs each pair have city name and salary average for this city
        assertEquals(expectedOutput, cityAndSalaryAverage)
    }

    @Test
    fun should_ReturnListOfPairsEachPairContainCityNameAndSalaryAverage_whenCountryNameIsMixedCase() {
        //given country name in mix case
        val countryName = "Egypt"
        val expectedOutput = listOf(Pair("Alex", 6000f))
        //when  the city name and salary average
        val cityAndSalaryAverage = GetTheAverageSalaryForEachCityInTheCountryInteractor(fakeData).execute(countryName)
        //then check return a List of pairs each pair have city name and salary average for this city
        assertEquals(expectedOutput, cityAndSalaryAverage)
    }

    @Test
    fun should_throwAnException_whenCountryNameWasEmpty() {
        //given empty country name
        val countryName = ""
        //when  the city name and salary average
        val cityAndSalaryAverageExecutable = Executable {
            GetTheAverageSalaryForEachCityInTheCountryInteractor(fakeData)
                .execute(countryName)
        }
        //then check exception
        assertThrows(Exception::class.java, cityAndSalaryAverageExecutable)
    }

    @Test
    fun should_throwAnException_whenCountryNameWasWrong() {
        //given wrong country name
        val countryName = "test wrong name"
        //when  the city name and salary average
        val cityAndSalaryAverageExecutable = Executable {
            GetTheAverageSalaryForEachCityInTheCountryInteractor(fakeData)
                .execute(countryName)
        }
        //then check exception
        assertThrows(Exception::class.java, cityAndSalaryAverageExecutable)
    }
}
