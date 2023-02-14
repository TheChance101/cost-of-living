package interactor

import dataSource.HardCodedFakeDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasHighestRentingBetweenApartmentsInteractorTest {
    private lateinit var dataSource: HardCodedFakeDataSource
    private lateinit var getCityHasHighestRentingBetweenApartmentsInteractor: GetCityHasHighestRentingBetweenApartmentsInteractor

    @BeforeAll
    fun init(){
        dataSource = HardCodedFakeDataSource()
        getCityHasHighestRentingBetweenApartmentsInteractor =
            GetCityHasHighestRentingBetweenApartmentsInteractor(dataSource)
    }

    @Test
    fun should_ReturnCityEntity_When_EnterValidCityList() {
        // given
        dataSource.setDatatype(HardCodedFakeDataSource.DataType.VALID)
        val expectedCity = dataSource.cairoHighQuality
        // when
        val cityEntity = getCityHasHighestRentingBetweenApartmentsInteractor.run {
            execute()
        }
        // then
        assertEquals(expectedCity, cityEntity)
    }

    @Test
    fun should_ReturnCityEntity_When_EnterMixedCityList() {
        // given
        dataSource.setDatatype(HardCodedFakeDataSource.DataType.MIXED)
        val expectedCity = dataSource.cairoHighQuality
        // when
        val cityEntity = getCityHasHighestRentingBetweenApartmentsInteractor.run {
            execute()
        }
        // then
        assertEquals(expectedCity, cityEntity)
    }

    @Test
    fun should_ReturnException_When_EnterEmptyCityList() {
        // given
        dataSource.setDatatype(HardCodedFakeDataSource.DataType.EMPTY)
        // when
        val emptyCityEntity = Executable {
            getCityHasHighestRentingBetweenApartmentsInteractor.run {
                execute()
            }
        }
        // then
        assertThrows(Exception::class.java, emptyCityEntity)
    }

    @Test
    fun should_ReturnException_When_EnterNullableCityList() {
        // given
        dataSource.setDatatype(HardCodedFakeDataSource.DataType.NULLABLE)
        // when
        val emptyCityEntity = Executable {
            getCityHasHighestRentingBetweenApartmentsInteractor.run {
                execute()
            }
        }
        // then
        assertThrows(Exception::class.java, emptyCityEntity)
    }
}