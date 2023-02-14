package interactor

import dataSource.HardCodedFakeDataSource
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
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

    @Test
    fun should_ReturnException_When_EnterEmptyCityList() {
        // given
        dataSource.setDatatype(HardCodedFakeDataSource.DataType.EMPTY)
        // when
        val emptyCityEntity = Executable {
            getMostSuitableCity.run {
                execute()
            }
        }
        // then
        assertThrows(Exception::class.java,emptyCityEntity)
    }

    @Test
    fun should_ReturnException_When_EnterNullableCityList() {
        // given
        dataSource.setDatatype(HardCodedFakeDataSource.DataType.NULLABLE)
        // when
        val emptyCityEntity = Executable {
            getMostSuitableCity.run {
                execute()
            }
        }
        // then
        assertThrows(Exception::class.java,emptyCityEntity)
    }


}