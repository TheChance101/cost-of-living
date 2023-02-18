package interactor
import FakeData
import model.*
import org.junit.jupiter.api.*

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.function.Executable



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesAndYearsToBuyApartmentInteractorTest {

    private lateinit var fakeDataSource: FakeData
    private lateinit var getCitiesAndYearsToBuyApartment : GetCitiesAndYearsToBuyApartmentInteractor

    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeData()
        getCitiesAndYearsToBuyApartment = GetCitiesAndYearsToBuyApartmentInteractor(fakeDataSource)
    }


    @Test
    fun should_ReturnTop10Cities_When_CalculatedYearsNeededToBuyApartmentIsCorrect() {
        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(limit)

        //Then
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun should_ExcludeData_When_CitiesIsEmpty() {
        //Give city name = " "

        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(limit)

        //Then
        assertFalse( actualResult.any { it == Pair("" , "1.2 year") })
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun should_ExcludeData_When_SalaryIsNull() {
        //Give salary is null

        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(limit)

        //Then
        assertFalse( actualResult.any { it == Pair("Lannull", "1.2 year") })
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun should_ExcludeData_When_PricesPerSquareMeterIsNull() {
        //Give price of square meter is null

        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(limit)

        //Then

        assertFalse( actualResult.any { it == Pair("Metanull", "1.2 year") })
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun should_ExcludeData_When_LowQualityData() {
        //Give Pair("MeccaLow" , "1.2 year") is low quality data

        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(limit)

        //Then
        assertFalse( actualResult.any { it == Pair("MeccaLow" , "1.2 year") } )
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun should_ReturnFalse_When_DataIsNotEmpty() {

        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(limit)

        //Then
        assertFalse( actualResult.isEmpty() )
    }


    @Test
    fun should_ThrowException_When_SalaryIsZero() {
        //Give salary = 0
        //When
        val actualExecutable  =  Executable{ getCitiesAndYearsToBuyApartment.execute(1)[12] }

        //Then
        assertThrows(Exception::class.java , actualExecutable )
    }



    companion object{

        private const val limit = 10

        private val expectedResult = listOf(
            Pair("Syracuse", "0.8 year"),
            Pair("Asheville", "1.1 year"),
            Pair("Baltimore", "1.1 year"),
            Pair("Richmond", "1.1 year"),
            Pair("El Paso", "1.2 year"),
            Pair("Mecca", "1.2 year"),
            //  Pair("MeccaLow", "1.2 year"), `low data quality
            Pair("Tulsa", "1.6 year"),
            Pair("Wichita", "1.6 year"),
            Pair("`Ajman", "3.3 years"),
            Pair("Augusta", "4.0 years"),
        )
    }

}