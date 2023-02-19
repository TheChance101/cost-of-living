
package interactor

import fakedata.DataSourceType
import fakedata.FakeDataSource
import org.junit.jupiter.api.Assertions.*


import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTheAverageSalaryForEachCityInTheCountryInteractorTest {



    private lateinit var interactor: GetTheAverageSalaryForEachCityInTheCountryInteractor

    private lateinit var dataSource: CostOfLivingDataSource

    private lateinit var fakeData: FakeDataSource

    @BeforeAll
    fun setup() {
        fakeData = FakeDataSource()
        dataSource =fakeData
        interactor =GetTheAverageSalaryForEachCityInTheCountryInteractor(dataSource)
    }

    @Test
    fun should_ReturnListOfPairsEachPairContainCityNameAndSalaryAverage_whenCountryNameIsLowerCase() {
        //given country name in lower case
        val countryName = "egypt"
        val expectedOutput = listOf(Pair("Alex", 6000f))
        //when find the city name and salary average
        val cityAndSalaryAverage = interactor.execute(countryName)
        //then check return a List of pairs each pair have city name and salary average for this city
        assertEquals(expectedOutput, cityAndSalaryAverage)

    }

    @Test
    fun should_ReturnListOfPairsEachPairContainCityNameAndSalaryAverage_whenCountryNameIsUpperCase() {
        //given country name in upper case
        val countryName = "EGYPT"
        val expectedOutput = listOf(Pair("Alex", 6000f))
        //when find the city name and salary average
        val cityAndSalaryAverage = interactor.execute(countryName)
        //then check return a List of pairs each pair have city name and salary average for this city
        assertEquals(expectedOutput, cityAndSalaryAverage)
    }

    @Test
    fun should_throwAnException_whenCountryNameWasEmpty() {
        //given empty country name
        val countryName = ""
        //when  the city name and salary average
        val cityAndSalaryAverageExecutable = Executable { interactor.execute(countryName) }
        //then check exception
        assertThrows(Exception::class.java, cityAndSalaryAverageExecutable)
    }

    @Test
    fun should_throwAnException_whenCountryNameWasWrong() {
        //given wrong country name
        val countryName = "test wrong name"
        //when  the city name and salary average
        val cityAndSalaryAverageExecutable = Executable { interactor.execute(countryName) }
        //then check exception
        assertThrows(Exception::class.java, cityAndSalaryAverageExecutable)
    }
    @Test
    fun should_throwAnException_whenAverageSalaryIsNull() {
        fakeData.dataSourceType = DataSourceType.NULLABLE
        //given wrong country
        val fakeCityEntityNullable = dataSource.getAllCitiesData()[2]
        val countryName = fakeCityEntityNullable.country
        //when  the city name and salary average
        val cityAndSalaryAverageExecutable = Executable { interactor.execute(countryName) }
        //then check exception
        assertThrows(Exception::class.java, cityAndSalaryAverageExecutable)
    }
}
