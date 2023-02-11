package interactor

import model.FakeDataSource
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
        //Given
        fakeData.setDataType(FakeDataSource.DataType.VALID)

        //When
        val list = getCheapestApartmentsCitiesNamesInteractor.execute(10)

        //Then
        assertTrue(list.size == 10)
    }

    @Test
    fun should_ReturnNoValidList_When_EnterNull() {
        //Given
        fakeData.setDataType(FakeDataSource.DataType.NULLABLE)

        //When
        val list = getCheapestApartmentsCitiesNamesInteractor.execute(10)

        //Then
        assertEquals(listOf(Pair("No Valid Data Found !", 0.0f)),list)
    }

    @Test
    fun should_ReturnNotValidList_When_EnterLowQualityData() {
        //Given
        fakeData.setDataType(FakeDataSource.DataType.LOWQUALITY)

        //When
        val list = getCheapestApartmentsCitiesNamesInteractor.execute(10)

        //Then
        assertEquals(listOf(Pair("No Valid Data Found !", 0.0f)),list)
    }

}