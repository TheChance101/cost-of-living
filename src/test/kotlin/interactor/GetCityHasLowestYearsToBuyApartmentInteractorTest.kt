package interactor

import FakeData.FakeData
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasLowestYearsToBuyApartmentInteractorTest {

    private lateinit var fakeData: FakeData
    private lateinit var converter: GetCityHasLowestYearsToBuyApartmentInteractor

    @BeforeAll
    fun setUp() {
        fakeData = FakeData()
        converter = GetCityHasLowestYearsToBuyApartmentInteractor(fakeData)
    }

    @Test
    fun should_ReturnTrue_When_DataQulityAndPriceOfApartmentOutSideIsNotNull() {
        //given
        val fackCity = fakeData.getAllCitiesData()[0]
        //when
        val result = converter.excludeNullSalariesAndLowQualityData(fackCity)
        //then
        assertTrue(result)
    }

    @Test
    fun should_ReturnFalse_When_DataQulityAndPriceOfApartmentOutSideIsNull() {
        //given
        val fackCity = fakeData.getAllCitiesData()[1]
        //when
        val result = converter.excludeNullSalariesAndLowQualityData(fackCity)
        //then
        assertFalse(result)
    }

    @Test
    fun should_ReturnCorrectListOfCitiesAndNumberOfYearsToBuyApartment_when_EnterPostiveFullTimeSalary() {
        //given
        val fullTimeSalary = 12
        val limit = 1
        //when
        val resultList = converter.execute(limit, fullTimeSalary)
        //then
        assertEquals(listOf(Pair("Santiago de Cuba", 2.2275f)), resultList)
    }

    @Test
    fun should_ReturnNullupleList_When_EnterFullTimeSalaryEqualZero() {
        //given
        val fullTimeSalary = 0
        val limit = 1

        //when
        val resultList: org.junit.jupiter.api.function.Executable =
            org.junit.jupiter.api.function.Executable { converter.execute(limit, fullTimeSalary) }
        // then eception should be thrown
        assertThrows(Exception::class.java, resultList)

    }

    @Test
    fun Should_Return_When_EnterNegativeNumberOfFullTimeSallary() {
        //given
        val fullTimeSalary = -100
        val limit = 1
        //when
        val resultList: org.junit.jupiter.api.function.Executable =
            org.junit.jupiter.api.function.Executable { converter.execute(limit, fullTimeSalary) }
        // then eception should be thrown
        assertThrows(Exception::class.java, resultList)
    }

    @Test
    fun should_ThrowsException_When_LimitIsNegative() {
        //given
        val limit = -1
        val fullTimeSalary = 12

        val resultList: org.junit.jupiter.api.function.Executable =
            org.junit.jupiter.api.function.Executable { converter.execute(limit, fullTimeSalary) }
        // then eception should be thrown
        assertThrows(Exception::class.java, resultList)
    }

    @Test
    fun should_ThrowsException_When_EnterFullTimeSalaryEqualZero() {
        //given
        val fullTimeSalary = 0
        val fackCity = fakeData.getAllCitiesData()[1]
        //when
        val result: org.junit.jupiter.api.function.Executable = org.junit.jupiter.api.function.Executable {
            converter.getNumberOfYearsToBuyApartment(
                fullTimeSalary,
                fackCity
            )
        }
        // then eception should be thrown
        assertThrows(Exception::class.java, result)

    }

    @Test
    fun Should_ThrowsException_When_EnterNegativeNumberOfFullTimeSallary() {
        //given
        val fullTimeSalary = -100
        val fackCity = fakeData.getAllCitiesData()[1]
        //when
        val result: org.junit.jupiter.api.function.Executable = org.junit.jupiter.api.function.Executable {
            converter.getNumberOfYearsToBuyApartment(
                fullTimeSalary,
                fackCity
            )
        }
        // then eception should be thrown
        assertThrows(Exception::class.java, result)
    }


}