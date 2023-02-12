package interactor

import dataSource.HardCodedFakeDataSource
import org.junit.jupiter.api.BeforeAll

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetMostSuitableCityForMoreSavingsPerMonthInteractorTest {

    private lateinit var dataSource: HardCodedFakeDataSource
    private lateinit var getMostSuitableCity: GetMostSuitableCityForMoreSavingsPerMonthInteractor

    @BeforeAll
    fun setUp() {
        dataSource = HardCodedFakeDataSource()
        getMostSuitableCity = GetMostSuitableCityForMoreSavingsPerMonthInteractor()
    }

    @Test
    fun should_ReturnCityEntity_When_EnterValidCityList() {
        // given

        // when

        // then
    }


}