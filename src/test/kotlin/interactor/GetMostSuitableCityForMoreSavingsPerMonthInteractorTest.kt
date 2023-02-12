package interactor

import dataSource.HardCodedFakeDataSource
import org.junit.jupiter.api.BeforeAll

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetMostSuitableCityForMoreSavingsPerMonthInteractorTest {

    private lateinit var dataSource: HardCodedFakeDataSource
    private lateinit var getMostSuitableCity: GetMostSuitableCityForMoreSavingsPerMonthInteractor

    @BeforeAll
    fun setUp() {
        dataSource = HardCodedFakeDataSource()
        getMostSuitableCity = GetMostSuitableCityForMoreSavingsPerMonthInteractor(dataSource)
    }

    @Test
    fun should_ReturnCityEntity_When_EnterValidCityList() {
        // given
        val expectedCity = dataSource.parisHighQuality
        // when
        val cityEntity = getMostSuitableCity.run {
            execute()
        }
        // then
        assertEquals(expectedCity,cityEntity)
    }


}