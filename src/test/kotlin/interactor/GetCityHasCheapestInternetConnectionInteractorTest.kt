package interactor
import FakeDataSource

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.function.Executable
import org.mockito.Mockito

class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var fakeDataSource: FakeDataSource
    private lateinit var interactor: GetCitiesAndYearsToBuyApartmentInteractor

    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeDataSource()
        interactor = GetCitiesAndYearsToBuyApartmentInteractor(fakeDataSource)
    }

    @Test
    fun execute_should_return_top10_cities_based_on_calculated_years_needed_to_buy_apartment() {
        //When
        val actualResult = interactor.execute(limit)

        //Then
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun execute_should_exclude_when_cities_is_null() {
        //When
        val actualResult = interactor.execute(limit)

        //Then
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun execute_should_exclude_when_salary_is_null() {
        //When
        val actualResult = interactor.execute(limit)

        //Then
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun execute_should_exclude_when_prices_per_squareMeter_is_null() {
        //When
        val actualResult = interactor.execute(limit)

        //Then
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun execute_should_exclude_when_low_quality_data() {
        //When
        val actualResult = interactor.execute(limit)

        //Then
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun execute_should_throw_exception_when_salary_is_zero() {
        //When
        val actualExecutable = Executable { interactor.execute(limit) }

        //Then
        assertThrows(Exception::class.java ,actualExecutable )
    }


    companion object{

        private val limit = 10

        private val expectedResult = listOf(
            Pair("Hyderabad City", "10 year"),
            Pair("Giza", "11 year"),
            Pair("Alexandria", "12 year"),
            Pair("Multan", "13 year"),
            Pair("Lahore", "15 year"),
            Pair("Dushanbe", "19 year"),
            Pair("Tanta", "19 year"),
            Pair("Karachi", "20 year"),
            Pair("Rawalpindi", "35 year"),
            Pair("Colombo", "59 year"),
        )
    }

}