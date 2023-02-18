package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTopFiveCitiesNamesForShoppingClothesFromFamousBrandsInteractorTest {

    private lateinit var fakeData: FakeDataSource
    private lateinit var GetTopFiveCitiesNamesForShoppingClothesFromFamousBrandsInteractor: GetTopFiveCitiesNamesForShoppingClothesFromFamousBrandsInteractor

    @BeforeAll
    fun init() {
        fakeData = FakeDataSource()
        GetTopFiveCitiesNamesForShoppingClothesFromFamousBrandsInteractor =
            GetTopFiveCitiesNamesForShoppingClothesFromFamousBrandsInteractor(fakeData)
    }

    @Test
    fun should_ReturnCorrectList_When_EnterValidData() {
        //Given
        fakeData.setDataType(FakeDataSource.DataType.VALID)

        //When
        val list = GetTopFiveCitiesNamesForShoppingClothesFromFamousBrandsInteractor.execute(5)

        //Then
        assertTrue(list.size == 5)
    }
}