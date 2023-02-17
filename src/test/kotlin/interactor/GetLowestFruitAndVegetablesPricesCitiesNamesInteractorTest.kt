package interactor

import fakedata.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetLowestFruitAndVegetablesPricesCitiesNamesInteractorTest {
    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var fakedata: FakeDataSource
    private lateinit var getLowestFruitAndVegetablesPrices: GetLowestFruitAndVegetablesPricesCitiesNamesInteractor

    @BeforeEach
    fun setUp() {
        fakedata = FakeDataSource()
        dataSource = fakedata
        getLowestFruitAndVegetablesPrices = GetLowestFruitAndVegetablesPricesCitiesNamesInteractor(dataSource)
    }

    @Test
    fun should_ReturentrueResult_when_theInputisIncorect() {
        val input = listOf(Pair("apples1kg", Pair(11.02f, 2.4f)), Pair("banana1kg", Pair(0.44f, 3.2f)))
        val actuleResult = getLowestFruitAndVegetablesPrices.execute(10)
        assertEquals(input, actuleResult)
        println(actuleResult)
    }
//    @Test
//    fun should_ReturentrueResult_when_theInputiscorect() {
//        val input = listOf(Pair("apples1kg", Pair(11.02f, 2.4f)), Pair("banana1kg", Pair(0.44f, 3.2f)))
//        val actuleResult = getLowestFruitAndVegetablesPrices.execute(10)
//        assertEquals(input, actuleResult)
//    }

}