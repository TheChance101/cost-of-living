package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetLowestAveragePricesForFruitsAndVegetablesInteractorTest {

    private lateinit var fakeDataSource: CostOfLivingDataSource
    lateinit var interactor: GetLowestAveragePricesForFruitsAndVegetablesInteractor

    @BeforeAll
    fun setup(){
        fakeDataSource = FakeDataSource()
        interactor = GetLowestAveragePricesForFruitsAndVegetablesInteractor(fakeDataSource)
    }


}