package interactor
import fakedata.FakeData
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class getTheAverageSalaryForEachCityInTheCountryInteractorTest {
    lateinit var fakeData :FakeData
    @BeforeAll
    fun setup(){
        fakeData= FakeData()
    }
    @Test
    fun should_ReturnListOfPairsEachPairContainCityNameAndSalaryAverage_whenCountryNameIsLowerCase (){
        //given country name in lower case
        val countryName = "cuba"
        //when find the city name and salary average
         val salaryAverage = getTheAverageSalaryForEachCityInTheCountryInteractor(fakeData).execute(countryName)
        //then check return a List of pairs each pair have city name and salary average for this city
        assertEquals(listOf<Any>(listOf( "Santiago de Cuba", 18.0),
                            listOf("Sancti Spiritus", 20.0),
                            listOf("Santa Clara", 25.0),
                            listOf("Havana", 35.75),
                            listOf("Las Tunas", 40.0)).toString(),salaryAverage.toString())

    }
    @Test
    fun should_ReturnListOfPairsEachPairContainCityNameAndSalaryAverage_whenCountryNameIsUpperCase (){
        //given country name in lower case
        val countryName = "CUBA"
        //when find the city name and salary average
        val salaryAverage = getTheAverageSalaryForEachCityInTheCountryInteractor(fakeData).execute(countryName)
        //then check return a List of pairs each pair have city name and salary average for this city
        assertEquals(listOf<Any>(listOf( "Santiago de Cuba", 18.0),
            listOf("Sancti Spiritus", 20.0),
            listOf("Santa Clara", 25.0),
            listOf("Havana", 35.75),
            listOf("Las Tunas", 40.0)).toString(),salaryAverage.toString())
    }
    @Test
    fun should_ReturnListOfPairsEachPairContainCityNameAndSalaryAverage_whenCountryNameIsMixedCase (){
        //given country name in lower case
        val countryName = "Cuba"
        //when find the city name and salary average
        val salaryAverage = getTheAverageSalaryForEachCityInTheCountryInteractor(fakeData).execute(countryName)
        //then check return a List of pairs each pair have city name and salary average for this city
        assertEquals(listOf<Any>(listOf( "Santiago de Cuba", 18.0),
            listOf("Sancti Spiritus", 20.0),
            listOf("Santa Clara", 25.0),
            listOf("Havana", 35.75),
            listOf("Las Tunas", 40.0)).toString(),salaryAverage.toString())
    }

}
