package interactor

import FakeData.FakeData
import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import model.CityEntity
import org.jetbrains.annotations.Nullable
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasLowestYearsToBuyApartmentInteractorTest {

    private lateinit var  fakeData : FakeData
    private lateinit var converter :GetCityHasLowestYearsToBuyApartmentInteractor
    @BeforeAll
    fun setUp (){
        fakeData = FakeData()
        converter = GetCityHasLowestYearsToBuyApartmentInteractor(fakeData)
    }
    @Test
    fun should_ReturnTrue_When_DataQulityAndPriceOfApartmentOutSideIsNotNull(){
        //given
        val fackCity =fakeData.getAllCitiesData()[0]
        //when
        val result =converter.excludeNullPriceOfApartmentAndLowQualityData(fackCity)
        //then
        assertTrue(result)
    }
    @Test
    fun should_ReturnFalse_When_DataQulityAndPriceOfApartmentOutSideIsNull(){
        //given
        val fackCity =fakeData.getAllCitiesData()[1]
        //when
        val result =converter.excludeNullPriceOfApartmentAndLowQualityData(fackCity)
        //then
        assertFalse(result)
    }

}