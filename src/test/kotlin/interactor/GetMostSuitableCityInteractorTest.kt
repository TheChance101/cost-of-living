package interactor

import dataSource.CitiesHasNullFakeDataSource
import dataSource.CitiesEmptyList
import dataSource.MostSuitableCity
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
        //given
        mixedValidDataInteractor = GetMostSuitableCityToHaveMoreSavingsInteractor(fakeDataSource)
        //when
        val actual = mixedValidDataInteractor.execute()
        //then
        val expected = MostSuitableCity().mostSuitableCityEntity
        assertEquals(expected, actual)
    }

    @Test
    fun `should throw exception when retrieved cities list from data source is empty`() {
        //given
        emptyDataInteractor = GetMostSuitableCityToHaveMoreSavingsInteractor(citiesEmptyList)
        //when
        val actual = Executable { emptyDataInteractor.execute() }
        //then
        assertThrows(IllegalStateException::class.java, actual)
    }

    @Test
    fun `should throw exception when the cities list has only null data`() {
        //given
        nullDataInteractor = GetMostSuitableCityToHaveMoreSavingsInteractor(citiesHasNullFakeDataSource)
        //when
        val actual = Executable { nullDataInteractor.execute() }
        //then
        assertThrows(NoSuchElementException::class.java, actual)
    }


}

