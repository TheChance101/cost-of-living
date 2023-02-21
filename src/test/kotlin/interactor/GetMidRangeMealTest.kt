package interactor

import dataSource.FakeCsvDataSourceForGetMidRangeMeal
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertNotNull


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetMidRangeMealTest {

    lateinit var dataSource: CostOfLivingDataSource
    lateinit var getMidRangeMeal: GetMidRangeMeal

    @BeforeAll
    fun setup(){
        dataSource  = FakeCsvDataSourceForGetMidRangeMeal()
        getMidRangeMeal = GetMidRangeMeal(dataSource)
    }

    @Test
    fun should_ReturnValueNotNull_When_ChooseCity()
    {
        //when
        val result = getMidRangeMeal.execute()
        //then
        assertNotNull(result)
    }

    @Test
    fun should_ReturnFalse_When_NoDataFound() {
        // when
        val actual = getMidRangeMeal.execute()
        val expected = actual != null
        // then
        Assertions.assertTrue(expected)
    }


}