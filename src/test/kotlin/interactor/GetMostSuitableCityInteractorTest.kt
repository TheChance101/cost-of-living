package interactor

import dataSource.CitiesEmptyList
import dataSource.CitiesHasNullFakeDataSource
import dataSource.FakeDataSource
import dataSource.MostSuitableCity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetMostSuitableCityInteractorTest {

    private lateinit var fakeDataSource: FakeDataSource
    private lateinit var citiesEmptyList: CitiesEmptyList
    private lateinit var citiesHasNullFakeDataSource: CitiesHasNullFakeDataSource
    private lateinit var nullDataInteractor: GetMostSuitableCityToHaveMoreSavingsInteractor
    private lateinit var emptyDataInteractor: GetMostSuitableCityToHaveMoreSavingsInteractor
    private lateinit var mixedValidDataInteractor: GetMostSuitableCityToHaveMoreSavingsInteractor


    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeDataSource()
        citiesEmptyList = CitiesEmptyList()
        citiesHasNullFakeDataSource = CitiesHasNullFakeDataSource()
        emptyDataInteractor = GetMostSuitableCityToHaveMoreSavingsInteractor(citiesEmptyList)
        mixedValidDataInteractor = GetMostSuitableCityToHaveMoreSavingsInteractor(fakeDataSource)
        nullDataInteractor = GetMostSuitableCityToHaveMoreSavingsInteractor(citiesHasNullFakeDataSource)
    }


    @Test
    fun `should return city when given list of cities`() {
        //when
        val actual = mixedValidDataInteractor.execute()
        //then
        val expected = MostSuitableCity().mostSuitableCityEntity
        assertEquals(expected, actual)
    }

    @Test
    fun `should throw exception when retrieved cities list from data source is empty`() {
        //when
        val actual = Executable { emptyDataInteractor.execute() }
        //then
        assertThrows(IllegalStateException::class.java, actual)
    }

    @Test
    fun `should return empty list when all the cities list is filtered because it has only null data`() {
        //when
        val actual = Executable { nullDataInteractor.execute() }
        //then
        assertThrows(NoSuchElementException::class.java, actual)
    }


}

