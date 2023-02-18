package interactor
import fakeDataSource.FakeDataOfGetCitiesAndYearsToBuyApartment
import interactor.util.Constants.COLUMN_INDEX_OF_AVAREG_MONTHTY_NET_SALARY_AFTER_TEX_WHEN_IS_ZERO
import model.*
import org.junit.jupiter.api.*

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.function.Executable



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesAndYearsToBuyApartmentInteractorTest {

    private lateinit var fakeDataSource: CostOfLivingDataSource
    private lateinit var getCitiesAndYearsToBuyApartment : GetCitiesAndYearsToBuyApartmentInteractor

    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeDataOfGetCitiesAndYearsToBuyApartment()
        getCitiesAndYearsToBuyApartment = GetCitiesAndYearsToBuyApartmentInteractor(fakeDataSource)
    }


    @Test
    fun should_ReturnTop10Cities_When_CalculatedYearsNeededToBuyApartmentIsCorrect() {
        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(10)

        //Then
        assertEquals( expectedResult , actualResult)
    }

    @Test
    fun should_ReturnCities_When_DataLessThanLimit() {
        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(30)

        //Then
        assertEquals( expectedResult , actualResult )
    }


    @Test
    fun should_ExcludeData_When_CitiesIsEmpty() {
        //Give city name = " "

        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(10)

        //Then
        assertFalse( actualResult.any { it ==  mapOf("" to "1.2 year" )})
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun should_ExcludeData_When_SalaryIsNull() {
        //Give salary is null

        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(10)

        //Then
        assertFalse( actualResult.any { it == mapOf( "Lannull" to "1.2 year") })
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun should_ExcludeData_When_PricesPerSquareMeterIsNull() {
        //Give price of square meter is null

        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(10)

        //Then

        assertFalse( actualResult.any { it == mapOf("Metanull" to "1.2 year") })
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun should_ExcludeData_When_LowQualityData() {
        //Give Pair("MeccaLow" , "1.2 year") is low quality data

        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(10)

        //Then
        assertFalse( actualResult.any { it == mapOf("MeccaLow" to "1.2 year") } )
        assertEquals( expectedResult , actualResult)
    }


    @Test
    fun should_ReturnFalse_When_DataIsNotEmpty() {

        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(3)

        //Then
        assertFalse( actualResult.isEmpty() )
    }


    @Test
    fun should_ThrowException_When_SalaryIsZero() {
        //Give salary = 0
        val cityEntityHaveSalaryZero =
            fakeDataSource.getAllCitiesData()[COLUMN_INDEX_OF_AVAREG_MONTHTY_NET_SALARY_AFTER_TEX_WHEN_IS_ZERO]

        //When
        val actualExecutable = Executable{ getCitiesAndYearsToBuyApartment
            .calculateYearsNeededToBuyApartment(cityEntityHaveSalaryZero)
        }

        //Then
        assertThrows(Exception::class.java , actualExecutable )
    }


    companion object{

        private val expectedResult = mapOf(
            "Syracuse" to "0.8 year",
            "Asheville" to "1.1 year",
            "Baltimore" to "1.1 year",
            "Richmond" to "1.1 year",
            "El Paso" to "1.2 year",
            "Mecca" to "1.2 year",
//           "MeccaLow", "1.2 year", `low data quality
             "Tulsa" to "1.6 year",
             "Wichita" to "1.6 year",
             "`Ajman" to "3.3 years",
             "Augusta" to "4.0 years",
        )

    }

}