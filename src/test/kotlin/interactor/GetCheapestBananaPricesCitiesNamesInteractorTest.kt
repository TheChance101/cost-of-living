package interactor

import dataSource.FakeDataSource
import model.CityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCheapestBananaPricesCitiesNamesInteractorTest {

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
        val data = getCheapestBananaPricesCitiesNamesInteractor.getCitiesVarArgs()
        //When valid data is entered
        val list = getCheapestBananaPricesCitiesNamesInteractor.run {
            execute(*data)
        }
        //Then
        assertTrue(
            list == data
                .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
                .map { it.cityName }
        )
    }

    @Test
    fun should_ReturnEmptyList_When_EnterNullForAllBananaPrices() {
        //Given
        fakeData.setDataType(FakeDataSource.DataType.NULLABLE)
        val data = getCheapestBananaPricesCitiesNamesInteractor.getCitiesVarArgs()
        //When entering null for all banana prices
        val list = getCheapestBananaPricesCitiesNamesInteractor.run {
            execute(*data)
        }
        //Then
        assertTrue(list.isEmpty())
    }

    @Test
    fun should_ReturnNotValidList_When_EnterNoData() {
        //Given empty array of CityEntities
        val array = emptyArray<CityEntity>()

        //When entering no data or empty array of CityEntities to execute()
        val list = getCheapestBananaPricesCitiesNamesInteractor.execute(*array)

        //Then
        assertEquals(listOf("No Data is Entered !"), list)
    }

}

