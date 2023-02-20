package interactor

import fakeDataSource.FakeDataSourceForInternet
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasCheapestInternetConnectionInteractorTest {

    private val fakeDataSource: FakeDataSourceForInternet = FakeDataSourceForInternet()

    @Test
    fun should_ReturnThrowException_When_CityWithNullPrice() {
        //given an object of Interactor with Null price
        val getCityHasCheapestInternetConnectionInteractor =
            GetCityHasCheapestInternetConnectionInteractor(fakeDataSource.getAllCitiesWithNullPrice())
        //when
        val result =
            Executable { getCityHasCheapestInternetConnectionInteractor.execute() }
        //then
        val expected = Exception::class.java
        assertThrows(expected, result)
    }

    @Test
    fun should_ReturnThrowException_When_CityWithNullSalary() {
        //given an object of Interactor with Null Salary
        val getCityHasCheapestInternetConnectionInteractor =
            GetCityHasCheapestInternetConnectionInteractor(fakeDataSource.getAllCitiesWithNullSalary())
        //when
        val result =
            Executable { getCityHasCheapestInternetConnectionInteractor.execute() }
        //then
        val expected = Exception::class.java
        assertThrows(expected, result)
    }


    @Test
    fun should_ReturnThrowException_When_CityWithNegativeSalary() {
        //given an object of Interactor with Negative Salary
        val getCityHasCheapestInternetConnectionInteractor =
            GetCityHasCheapestInternetConnectionInteractor(fakeDataSource.getAllCitiesWithNegativeSalary())
        //when
        val result =
            Executable { getCityHasCheapestInternetConnectionInteractor.execute() }
        //then
        val expected = Exception::class.java
        assertThrows(expected, result)
    }

    @Test
    fun should_ReturnThrowException_When_CityWithNegativePrice() {
        //given an object of Interactor with negative price
        val getCityHasCheapestInternetConnectionInteractor =
            GetCityHasCheapestInternetConnectionInteractor(fakeDataSource.getAllCitiesWithNegativePrice())
        //when
        val result =
            Executable { getCityHasCheapestInternetConnectionInteractor.execute() }
        //then
        val expected = Exception::class.java
        assertThrows(expected, result)
    }

    @Test
    fun should_ReturnThrowException_When_NegativePriceAndSalary() {
        //given an object of Interactor with negative salary and price
        val getCityHasCheapestInternetConnectionInteractor =
            GetCityHasCheapestInternetConnectionInteractor(fakeDataSource.getAllCitiesWithNegativePriceAndSalary())
        //when
        val result =
            Executable { getCityHasCheapestInternetConnectionInteractor.execute() }
        //then
        val expected = Exception::class.java
        assertThrows(expected, result)
    }

    @Test
    fun should_ReturnTheCityWithLowestPercentage_When_SameSalaryAndDifferentPrice() {
        //given an object of Interactor has a list of cityEntity with same salary
        val getCityHasCheapestInternetConnectionInteractor =
            GetCityHasCheapestInternetConnectionInteractor(fakeDataSource.getAllCitiesWithSameSalaryAndDifferentPrice())
        //when run execute function
        val result = getCityHasCheapestInternetConnectionInteractor.execute()
        //then
        val value = fakeDataSource.getAllCitiesWithSameSalaryAndDifferentPrice().getAllCitiesData()[0]
        assertEquals(value, result)
    }


    @Test
    fun should_ReturnTheCityWithLowestPercentage_When_SamePriceAndDifferentSalary() {
        //given an object of Interactor has a list of cityEntity with same Price
        val getCityHasCheapestInternetConnectionInteractor =
            GetCityHasCheapestInternetConnectionInteractor(fakeDataSource.getAllCitiesWithSamePriceAndDifferentSalary())
        //when run execute function
        val result = getCityHasCheapestInternetConnectionInteractor.execute()
        //then
        val value = fakeDataSource.getAllCitiesWithSamePriceAndDifferentSalary().getAllCitiesData()[1]
        assertEquals(value, result)
    }

    @Test
    fun should_ReturnFirstCityWithCheapestInternetPrice_When_SamePercentage() {
        //given an object of Interactor has a list of cityEntity with same percentage
        val getCityHasCheapestInternetConnectionInteractor =
            GetCityHasCheapestInternetConnectionInteractor(fakeDataSource.getAllCitiesWithSamePercentage())
        //when run execute function
        val result = getCityHasCheapestInternetConnectionInteractor.execute()
        //then
        val value = fakeDataSource.getAllCitiesWithSamePercentage().getAllCitiesData()[0]
        assertEquals(value, result)
    }

    @Test
    fun should_ReturnCityWithCheapestInternetPrice_When_AllCasesOfData() {
        //given an object of Interactor has a list of cityEntities
        val getCityHasCheapestInternetConnectionInteractor =
            GetCityHasCheapestInternetConnectionInteractor(fakeDataSource.getAllCity())
        //when run execute function
        val result = getCityHasCheapestInternetConnectionInteractor.execute()
        //then
        val value = fakeDataSource.getAllCity().getAllCitiesData()[12]
        assertEquals(value, result)
    }

}
