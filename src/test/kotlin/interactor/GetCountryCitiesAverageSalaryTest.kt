package interactor
import FakeData
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCountryCitiesAverageSalaryInteractorTest {

    private lateinit var fakeData: FakeData
    private lateinit var GetCountryCitiesAverageSalary: GetCountryCitiesAverageSalaryInteractor

    @BeforeAll
    fun setUp() {
        fakeData = FakeData()
        GetCountryCitiesAverageSalary = GetCountryCitiesAverageSalaryInteractor(fakeData)
    }

    @Test
    fun should_ReturnCitiesSalaries_When_EntringCountryNameWithSpaces() {
        //given
        val country = "sri     lanka"
        val result = listOf(Pair("Colombo",156.15f),Pair("Colombo",156.15f))
        // when
        val cityAverage = GetCountryCitiesAverageSalary.execute(country = country)
        //then
        assertEquals(result,cityAverage)
    }
    @Test
    fun should_throwErr_When_EntringEmptyString() {
        //given
        val country = ""
        // when
        val result = Executable{GetCountryCitiesAverageSalary.execute(country = country)}
        //then
        assertThrows(Exception::class.java,result)
    }
    @Test
    fun should_throwErr_When_EntringCountryNameNotInEnglish(){
        //given
        val country = "كوبا"
        // when
        val result = Executable{GetCountryCitiesAverageSalary.execute(country = country)}
        //then
        assertThrows(Exception::class.java,result)
    }
    @Test
    fun should_ReturnCountryCities_When_EntringCountryInUpperCase(){
        //given
        val country = "CUBA"
        val result = listOf(Pair("Havana",35.75f))
        // when
        val cityAverage = GetCountryCitiesAverageSalary.execute(country = country)
        //then
        assertEquals(result,cityAverage)
    }
}