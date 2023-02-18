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
        // given a valid data list and expected city
        dataSource.setDatatype(HardCodedFakeDataSource.DataType.VALID)
        val expectedCity = dataSource.parisHighQuality
        // when get most suitable city
        val cityEntity = getMostSuitableCity.execute()
        // then return correct expected city
        assertEquals(expectedCity,cityEntity)
    }

    @Test
    fun should_ReturnCityEntity_When_EnterMixedCityList() {
        // given a mixed data list and expected city
        dataSource.setDatatype(HardCodedFakeDataSource.DataType.MIXED)
        val expectedCity = dataSource.parisHighQuality
        // when get most suitable city
        val cityEntity = getMostSuitableCity.execute()
        // then return correct expected city
        assertEquals(expectedCity,cityEntity)
    }

    @Test
    fun should_ReturnException_When_EnterEmptyCityList() {
        // given an empty list
        dataSource.setDatatype(HardCodedFakeDataSource.DataType.EMPTY)
        // when get most suitable city
        val emptyCityEntity = Executable {
            getMostSuitableCity.execute()
        }
        // then return exception
        assertThrows(Exception::class.java,emptyCityEntity)
    }

    @Test
    fun should_ReturnException_When_EnterNullableCityList() {
        // given a nullable data list
        dataSource.setDatatype(HardCodedFakeDataSource.DataType.NULLABLE)
        // when get most suitable city
        val emptyCityEntity = Executable {
            getMostSuitableCity.execute()
        }
        // then return exception
        assertThrows(Exception::class.java,emptyCityEntity)
    }


}