package interactor
import FakeDataSource
import model.CityEntity

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.function.Executable
import kotlin.Exception


class GetCitiesAndYearsToBuyApartmentInteractorTest {

    private lateinit var fakeDataSource: FakeDataSource
    private lateinit var interactor: GetCitiesAndYearsToBuyApartmentInteractor

    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeDataSource()
        interactor = GetCitiesAndYearsToBuyApartmentInteractor(fakeDataSource)
    }


    @Test
    fun should_ReturnTop10Cities_When_CalculatedYearsNeededToBuyApartmentIsCorrect() {
        //When
        val actualResult = interactor.execute(limit)

        //Then
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun should_ExcludeData_When_CitiesIsNull() {
        //When
        val actualResult = interactor.execute(limit)

        //Then
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun should_ExcludeData_When_SalaryIsNull() {
        //When
        val actualResult = interactor.execute(limit)

        //Then
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun should_ExcludeData_When_PricesPerSquareMeterIsNull() {
        //When
        val actualResult = interactor.execute(limit)

        //Then
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun should_ExcludeData_When_LowQualityData() {
        //When
        val actualResult = interactor.execute(limit)

        //Then
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun should_ReturnEmptyList_When_DataIsEmpty() {
        //When
        val actualResult = interactor.execute(limit)

        //Then
        assertEquals( null,actualResult)
    }


    @Test
    fun should_ThrowException_When_SalaryIsZero() {
        //When
        val actualExecutable  = Executable { interactor.execute(limit) }

        //Then
        assertThrows(Exception::class.java ,actualExecutable )
    }



    companion object{

        private val limit = 10

        private val expectedResult = listOf(
            Pair("Hyderabad City", "10.6 year"),
//            Pair("Giza", "11.1 year"), //when salary is 0 not show
            Pair("Alexandria", "12.5 year"),
            Pair("Multan", "13.4 year"),
            Pair("Lahore", "15.6 year"),
            Pair("Dushanbe", "19.4 year"),
            Pair("Tanta", "19.8 year"),
            Pair("Karachi", "20.6 year"),
            Pair("Rawalpindi", "35.1 year"),
            Pair("Colombo", "59.5 year"),
            Pair("Colomb", "59.5 year"),
        )
    }

}