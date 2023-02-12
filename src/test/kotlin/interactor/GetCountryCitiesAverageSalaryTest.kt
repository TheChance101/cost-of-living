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
    fun should_return_cities_salaries_when_entring_country_name_with_spaces() {
        //given
        val country = "sri     lanka"
        val result = listOf(Pair("Colombo",156.15f),Pair("Colombo",156.15f))
        // when
        val cityAverage = GetCountryCitiesAverageSalary.execute(country = country)
        //then
        assertEquals(result,cityAverage)
    }
    @Test
    fun should_throw_err_when_entring_empty_string() {
        //given
        val country = ""
        // when
        val result = Executable{GetCountryCitiesAverageSalary.execute(country = country)}
        //then
        assertThrows(Exception::class.java,result)
    }
    @Test
    fun should_throw_err_when_entring_country_name_not_in_english(){
        //given
        val country = "كوبا"
        // when
        val result = Executable{GetCountryCitiesAverageSalary.execute(country = country)}
        //then
        assertThrows(Exception::class.java,result)
    }
    @Test
    fun should_return_country_cities_when_entring_country_in_upper_case(){
        //given
        val country = "CUBA"
        val result = listOf(Pair("Havana",35.75f))
        // when
        val cityAverage = GetCountryCitiesAverageSalary.execute(country = country)
        //then
        assertEquals(result,cityAverage)
    }
}