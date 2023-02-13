package interactor

import dataSource.FakeDataSource
import model.CityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTenCitiesHaveTheAverageOfFruitsAndVegetablesPricesInteractorTest{

   private lateinit var getTenCitiesHaveTheAverageOfFruitsAndVegetablesPricesInteractor:
            GetTenCitiesHaveTheAverageOfFruitsAndVegetablesPricesInteractor
   private lateinit var fakeData: FakeDataSource
    @BeforeAll
    fun setup() {
        fakeData = FakeDataSource()
        getTenCitiesHaveTheAverageOfFruitsAndVegetablesPricesInteractor =
            GetTenCitiesHaveTheAverageOfFruitsAndVegetablesPricesInteractor(fakeData)
    }
    @Test
    fun should_ReturnTheTenCitiesName_When_TheDataIsValid() {
        //given
        fakeData.setDataType(FakeDataSource.DataType.VALID)
        //When
        val result = getTenCitiesHaveTheAverageOfFruitsAndVegetablesPricesInteractor.execute()
        //Then
        assertTrue(result.size == 10)
    }

    @Test
    fun should_ReturnTheTenCitiesName_When_TheDataIsNull() {
        //given
        fakeData.setDataType(FakeDataSource.DataType.NULLABLE)
        //When
        val result = getTenCitiesHaveTheAverageOfFruitsAndVegetablesPricesInteractor.execute()
        //Then
        assertTrue(result.isEmpty())
    }

    @Test
    fun should_ReturnTheTenCitiesName_When_TheDataIsMixture() {
        //given
        fakeData.setDataType(FakeDataSource.DataType.MIXTURE)
        //When
        val result = getTenCitiesHaveTheAverageOfFruitsAndVegetablesPricesInteractor.execute()
        //Then
        assertTrue(result.isEmpty())
    }

}