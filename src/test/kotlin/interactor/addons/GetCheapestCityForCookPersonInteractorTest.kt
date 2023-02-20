package interactor.addons

import fakeDataSource.addons.FakeDataSourceForCrookPerson
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach

class GetCheapestCityForCookPersonInteractorTest {


    private lateinit var interactor: GetCheapestCityForCookPersonInteractor
    private lateinit var fakeDataSource:FakeDataSourceForCrookPerson

    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeDataSourceForCrookPerson()
    }

    @Test
    fun execute() {
        interactor = GetCheapestCityForCookPersonInteractor(
            fakeDataSource.trueFalseCityEntityList())

        val data = interactor.execute().cityName

        val expected = "Cairo"

        assertEquals(expected,data)
    }

    @Test
    fun should_Return_True_When_Data_Quality_High() {
        interactor = GetCheapestCityForCookPersonInteractor(
            fakeDataSource.trueFalseCityEntityList())

        val expected = interactor.excludeFalseDataQuality(
            fakeDataSource.trueFalseCityEntityList().getAllCitiesData()[0])

        assertTrue(expected)
    }

    @Test
    fun should_Return_False_When_Data_Quality_Low() {
        interactor = GetCheapestCityForCookPersonInteractor(
            fakeDataSource.trueFalseCityEntityList())

        val expected = interactor.excludeFalseDataQuality(
            fakeDataSource.trueFalseCityEntityList().getAllCitiesData()[1])

        assertTrue(expected)
    }

    @Test
    fun should_Return_False_When_Salary_Is_Null() {
        interactor = GetCheapestCityForCookPersonInteractor(
            fakeDataSource.trueFalseCityEntityList())

        val expected = interactor.excludeFalseDataQuality(
            fakeDataSource.getListWithNullSalaryAndNullPrice().getAllCitiesData()[0])

        assertTrue(expected)
    }

    @Test
    fun should_Return_False_When_Price_Is_Null() {
        interactor = GetCheapestCityForCookPersonInteractor(
            fakeDataSource.trueFalseCityEntityList())

        val expected = interactor.excludeFalseDataQuality(
            fakeDataSource.getListWithNullSalaryAndNullPrice().getAllCitiesData()[1])

        assertTrue(expected)
    }

    @Test
    fun calculateMinutePricePercentToSalary() {
        interactor = GetCheapestCityForCookPersonInteractor(
            fakeDataSource.trueFalseCityEntityList())

        val result = interactor.excludeFalseDataQuality(
            fakeDataSource.percentLogicTest().getAllCitiesData()[0])

        val expected = 10

        assertEquals(expected,result)
    }
}