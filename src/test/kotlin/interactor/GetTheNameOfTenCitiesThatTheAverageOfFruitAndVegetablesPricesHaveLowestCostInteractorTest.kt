package interactor

import dataSource.FakeCsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractorTest {
  lateinit var csvParser : CsvParser
  lateinit var dataSource: CostOfLivingDataSource
  lateinit var getTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor:GetTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor
  @BeforeAll
  fun setup()
  {
    csvParser= CsvParser()
    dataSource  = FakeCsvDataSource(csvParser)
    getTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor=GetTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor(dataSource)
  }

  @Test
  fun should_ReturnValueNotNull_when_Execute() {
    // given

    // when
    val result = getTheNameOfTenCitiesThatTheAverageOfFruitAndVegetablesPricesHaveLowestCostInteractor.execute()
    // then

    assertNotNull(result)
  }







}