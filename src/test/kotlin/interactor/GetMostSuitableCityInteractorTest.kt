package interactor

import dataSource.CitiesHasNullFakeDataSource
import dataSource.CitiesEmptyList
import dataSource.ExpectedValuesForTesting
import dataSource.FakeDataSource
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetMostSuitableCityInteractorTest {

    private lateinit var fakeDataSource: FakeDataSource
    private lateinit var citiesEmptyList: CitiesEmptyList
    private lateinit var interactor: GetMostSuitableCityInteractor
    private lateinit var citiesHasNullFakeDataSource: CitiesHasNullFakeDataSource


    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeDataSource()
        citiesEmptyList = CitiesEmptyList()
        citiesHasNullFakeDataSource = CitiesHasNullFakeDataSource()
    }


    @Test
    fun `should return city when given list of cities`() {
        //given
        interactor = GetMostSuitableCityInteractor(fakeDataSource)
        //when
        val actual = interactor.execute()
        //then
        val expected = ExpectedValuesForTesting().mostSuitableCityEntity
        assertEquals(expected, actual)
    }

    @Test
    fun `should throw exception when cities list is empty`() {
        //given
        interactor = GetMostSuitableCityInteractor(citiesEmptyList)
        //when
        val actual = Executable { interactor.execute() }
        //then
        assertThrows(IllegalStateException::class.java, actual)
    }

    @Test
    fun `should throw exception when the cities list has only null data`() {
        //given
        interactor = GetMostSuitableCityInteractor(citiesHasNullFakeDataSource)
        //when
        val actual = Executable { interactor.execute() }
        //then
        assertThrows(Exception::class.java, actual)
    }


}

