package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCheapestBananaPricesCitiesNamesInteractorTest() {

    private lateinit var fakeData: FakeDataSource
    private lateinit var getCheapestBananaPricesCitiesNamesInteractor: GetCheapestBananaPricesCitiesNamesInteractor

    @BeforeAll
    fun init() {
        fakeData = FakeDataSource()
        getCheapestBananaPricesCitiesNamesInteractor =
            GetCheapestBananaPricesCitiesNamesInteractor(fakeData)
    }

    @Test
    fun should_ReturnCorrectList_When_EnterValidData() {
        //Given
        fakeData.setDataType(FakeDataSource.DataType.VALID)

        //When
        val list = getCheapestBananaPricesCitiesNamesInteractor.run {
            execute(*getCitiesVarArgs())
        }

        //Then
        assertTrue(list.size == 20)
    }

    @Test
    fun should_ReturnEmptyList_When_EnterNullForAllBananaPrices() {
        //Given
        fakeData.setDataType(FakeDataSource.DataType.NULLABLE)

        //When
        val list = getCheapestBananaPricesCitiesNamesInteractor.run {
            execute(*getCitiesVarArgs())
        }

        //Then
        assertTrue(list.isEmpty())
    }

    @Test
    fun should_ReturnListHasNoNulls_When_EnterNullForSomeBananaPrices() {
        //Given
        fakeData.setDataType(FakeDataSource.DataType.NULLABLE)

        //When
        val list = getCheapestBananaPricesCitiesNamesInteractor.run {
            execute(*getCitiesVarArgs())
        }

        //Then
        assertTrue(list.size < 20)
    }

    @Test
    fun should_ReturnEmptyList_When_EnterNoData() {
        //Given
        fakeData.setDataType(FakeDataSource.DataType.NULLABLE)

        //When
        val list = getCheapestBananaPricesCitiesNamesInteractor.run {
            execute(*getCitiesVarArgs())
        }

        //Then
        assertTrue(list.isEmpty())
    }

}