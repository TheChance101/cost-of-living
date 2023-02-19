package interactor

import fakeDataSource.FakeDataSourceForFamilySavings
import model.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityMakesFamilySaveMoreInteractionTest {
    private lateinit var fakeDataSourceForFamilySavings: FakeDataSourceForFamilySavings
    private lateinit var getCityMakesFamilySaveMoreInteractor: GetCityMakesFamilySaveMoreInteractor

    @BeforeAll
    fun setup() {
        fakeDataSourceForFamilySavings = FakeDataSourceForFamilySavings()

    }

    @Test
    fun should_ReturnOneCity_When_FunctionInvoke() {

        getCityMakesFamilySaveMoreInteractor =
            GetCityMakesFamilySaveMoreInteractor(fakeDataSourceForFamilySavings.getMeCity())
        //given
        val expected = "Cairo"
        //when
        val getCity = getCityMakesFamilySaveMoreInteractor.execute()
        //then
        assertEquals(expected, getCity)
    }

    @Test
    fun should_ReturnMessage_When_NOData() {
        getCityMakesFamilySaveMoreInteractor =
            GetCityMakesFamilySaveMoreInteractor(fakeDataSourceForFamilySavings.getMeEmptyCity())
        // given
        val expected = Exception("There is no Data")::class.java
        //when
        val executable = Executable {
            getCityMakesFamilySaveMoreInteractor.execute() }
        //then
        assertThrows(expected,executable)
    }

    @Test
    fun should_Return_False_When_Food_Is_Null(){

        getCityMakesFamilySaveMoreInteractor =
            GetCityMakesFamilySaveMoreInteractor(fakeDataSourceForFamilySavings.getCityWithNull())

        val result = getCityMakesFamilySaveMoreInteractor
            .excludeNullValues(fakeDataSourceForFamilySavings.getCityWithNull().getAllCitiesData()[0])

        assertFalse(result)
    }


    @Test
    fun should_Return_False_When_Salary_Is_Null(){

        getCityMakesFamilySaveMoreInteractor =
            GetCityMakesFamilySaveMoreInteractor(fakeDataSourceForFamilySavings.getCityWithNull())

        //Given
        val tempCity = fakeDataSourceForFamilySavings.nullSalaryCityFakeData()

        val result = getCityMakesFamilySaveMoreInteractor.excludeNullValues(tempCity)
        assertFalse(result)
    }
}