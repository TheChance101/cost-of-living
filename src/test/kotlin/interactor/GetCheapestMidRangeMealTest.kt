package interactor

import dataSource.FakeCsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCheapestMidRangeMealTest {

    lateinit var csvParser : CsvParser
    lateinit var dataSource: CostOfLivingDataSource
    lateinit var getCheapestMidRangeMeal: GetCheapestMidRangeMeal

    @BeforeAll
    fun setup(){
        csvParser= CsvParser()
        dataSource  = FakeCsvDataSource(csvParser)
        getCheapestMidRangeMeal = GetCheapestMidRangeMeal(dataSource)
    }

    @Test
    fun should_ReturnCityNotNull_when_Execute() {
        // given
        //costOfLiving.csv
        // when
        val result = getCheapestMidRangeMeal.execute()
        // then
        Assertions.assertNotEquals(null, result)

    }

    @Test
    fun should_ReturnCityWithMealsPricesNotEqualNull_when_Execute() {
        // given
        //costOfLiving.csv
        // when
        val result = getCheapestMidRangeMeal.execute()
        // then
        Assertions.assertNotEquals(null, result.mealsPrices)

    }

    @Test
    fun should_ReturnCityWithSpecifiedThreeCountries_when_Execute() {
        // given
        //costOfLiving.csv
        // when
        val result = getCheapestMidRangeMeal.execute()
        // then
        Assertions.assertNotEquals("Ghana", result.country)

    }

}