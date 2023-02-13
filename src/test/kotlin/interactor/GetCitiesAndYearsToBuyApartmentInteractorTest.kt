package interactor

import FakeData
import model.CityEntity
import org.junit.jupiter.api.*

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.function.Executable
import kotlin.Exception

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesAndYearsToBuyApartmentInteractorTest {


    private lateinit var getCitiesAndYearsToBuyApartment: GetCitiesAndYearsToBuyApartmentInteractor

    @BeforeAll
    fun setUp() {
        val fakeData = FakeData()
        getCitiesAndYearsToBuyApartment = GetCitiesAndYearsToBuyApartmentInteractor(fakeData)
    }


    @Test
    fun should_returnTop10Cities_when_calculatedYearsNeededToBuyApartmentIsCorrect() {
        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(limit)

        //Then
        assertEquals(expectedResult, actualResult)
    }


    @Test
    fun should_excludeData_when_citiesIsNull() {
        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(limit)

        //Then
        assertEquals(expectedResult, actualResult)
    }


    @Test
    fun should_excludeData_when_salaryIsNull() {
        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(limit)

        //Then
        assertEquals(expectedResult, actualResult)
    }


    @Test
    fun should_excludeData_when_pricesPerSquareMeterIsNull() {
        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(limit)

        //Then
        assertEquals(expectedResult, actualResult)
    }


    @Test
    fun should_excludeData_when_lowQualityData() {
        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(limit)

        //Then
        assertEquals(expectedResult, actualResult)
    }


    @Test
    @Disabled
    fun should_returnEmptyList_when_dataIsEmpty() {

        //When
        val actualResult = getCitiesAndYearsToBuyApartment.execute(limit)

        //Then
        assertEquals(emptyList<CityEntity>(), actualResult)
    }


    @Test
    @Disabled
    fun should_throwException_when_salaryIsZero() {
        //When
        val actualExecutable = Executable { getCitiesAndYearsToBuyApartment.execute(limit) }

        //Then
        assertThrows(Exception::class.java, actualExecutable)
    }


    companion object {

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