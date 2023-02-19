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
    private lateinit var getCityHasHighestRentingBetweenApartmentsInteractor
                          : GetCityHasHighestRentingBetweenApartmentsInteractor

    @BeforeAll
    fun init() {
        dataSource = HardCodedFakeDataSource()
        getCityHasHighestRentingBetweenApartmentsInteractor =
            GetCityHasHighestRentingBetweenApartmentsInteractor(dataSource)
    }

    @Test
    fun should_ReturnCityEntity_When_EnterValidCityList() {
        // given a valid data city list with high quality & expected city
        dataSource.setDatatype(HardCodedFakeDataSource.DataType.VALID)
        val expectedCity = dataSource.cairoHighQuality
        // when data not equal null
        val cityEntity = getCityHasHighestRentingBetweenApartmentsInteractor.execute()

        // then return the city entity has highest appartement
        assertEquals(expectedCity, cityEntity)
    }

    @Test
    fun should_ReturnCityEntity_When_EnterMixedCityList() {
        // given a mixed data
        dataSource.setDatatype(HardCodedFakeDataSource.DataType.MIXED)
        val expectedCity = dataSource.cairoHighQuality
        // when data might include null
        val cityEntity = getCityHasHighestRentingBetweenApartmentsInteractor.execute()

        // then return right expected city
        assertEquals(expectedCity, cityEntity)
    }

    @Test
    fun should_ReturnException_When_EnterEmptyCityList() {
        // given an empty list
        dataSource.setDatatype(HardCodedFakeDataSource.DataType.EMPTY)
        // when get city has highest renting
        val emptyCityEntity = Executable {
            getCityHasHighestRentingBetweenApartmentsInteractor.execute()

        }
        // then return exception
        assertThrows(Exception::class.java, emptyCityEntity)
    }

    @Test
    fun should_ReturnException_When_EnterNullableCityList() {
        // given a nullable data
        dataSource.setDatatype(HardCodedFakeDataSource.DataType.NULLABLE)
        // when get city has highest renting
        val emptyCityEntity = Executable {
            getCityHasHighestRentingBetweenApartmentsInteractor.execute()
        }
        // then return exception
        assertThrows(Exception::class.java, emptyCityEntity)
    }
}