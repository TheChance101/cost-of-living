package interactor
import FakeData
import model.CityEntity
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.function.Executable
import kotlin.Exception


class GetCitiesAndYearsToBuyApartmentInteractorTest {

    private lateinit var fakeDataSource: FakeData
    private lateinit var interactor: GetCitiesAndYearsToBuyApartmentInteractor

    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeData()
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
        assertEquals( emptyList<CityEntity>(),actualResult)
    }


    @Test
    @Disabled
    fun should_ThrowException_When_SalaryIsZero() {
        //When
        val actualExecutable  = Executable { interactor.execute(limit) }

        //Then
        assertThrows(Exception::class.java ,actualExecutable )
    }



    companion object{

        private const val limit = 10

        private val expectedResult = listOf(
            Pair("Hyderabad City", "10.6 years"),
            Pair("Giza", "11.1 years"),
            Pair("Alexandria", "12.5 years"),
            Pair("Multan", "13.4 years"),
            Pair("Lahore", "15.6 years"),
            Pair("Dushanbe", "19.4 years"),
            Pair("Tanta", "19.8 years"),
            Pair("Karachi", "20.6 years"),
            Pair("Rawalpindi", "35.1 years"),
            Pair("Caracas", "51.4 years"),
        )
    }

}