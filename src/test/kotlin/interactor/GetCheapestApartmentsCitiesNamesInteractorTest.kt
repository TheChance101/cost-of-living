package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCheapestApartmentsCitiesNamesInteractorTest {

    private lateinit var fakeData: FakeDataSource
    private lateinit var getCheapestApartmentsCitiesNamesInteractor: GetCheapestApartmentsCitiesNamesInteractor

    @BeforeAll
    fun init() {
        fakeData = FakeDataSource()
        getCheapestApartmentsCitiesNamesInteractor =
            GetCheapestApartmentsCitiesNamesInteractor(fakeData)
    }

    @Test
    fun should_ReturnCorrectList_When_EnterValidData() {
        //Given -Valid Data
        fakeData.setDataType(FakeDataSource.DataType.VALID)

        //When -limit is 10
        val list = getCheapestApartmentsCitiesNamesInteractor.execute(10, 100)

        //Then -return 10 items of the list sorted ascending by years
        assertTrue(list.size == 10 && list == list.sortedBy { it.second })
    }

    @Test
    fun should_ReturnNoValidList_When_EnterNull() {
        //Given -Null Data
        fakeData.setDataType(FakeDataSource.DataType.NULLABLE)

        //When -limit is 10
        val list = getCheapestApartmentsCitiesNamesInteractor.execute(10, 100)

        //Then -return error statement
        assertEquals(listOf(Pair("Couldn't find Cities that meet your requirements :(", 0.0f)), list)
    }

    @Test
    fun should_ReturnNotValidList_When_EnterLowQualityData() {
        //Given -Low Quality Data
        fakeData.setDataType(FakeDataSource.DataType.LOWQUALITY)

        //When -limit is 10
        val list = getCheapestApartmentsCitiesNamesInteractor.execute(10, 100)

        //Then -return error statement
        assertEquals(listOf(Pair("Couldn't find Cities that meet your requirements :(", 0.0f)), list)
    }

    @Test
    fun should_ReturnNotValidList_When_EnterNotEnoughData() {
        //Given -Valid Data
        fakeData.setDataType(FakeDataSource.DataType.VALID)

        //When -limit is more than the size of existing data
        val list = getCheapestApartmentsCitiesNamesInteractor.execute(30, 100)

        //Then -return error statement
        assertEquals(listOf(Pair("Couldn't find Cities that meet your requirements :(", 0.0f)), list)
    }

}