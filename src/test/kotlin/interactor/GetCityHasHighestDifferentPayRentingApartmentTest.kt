package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser

import model.RealEstatesPrices
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TestGetHighestDifferenceBetweenCityCenterAndOutsideCityCenter {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    var rating = interactor.GetHighestDifferenceBetweenCityCenterAndOutsideCityCenter(dataSource)

    private val cities = listOf(
        "Havana",
        "Abuja",
        "Abuja",
    )

    @Test
    fun testGetHighestDifference_returnsCorrect_OneBedRoom_BetweenInCityCenter_OutCityCenter() {
        //given
        val expectedResult  = listOf(cities[0])
        //when

        val result = rating.execute_DifferentPayRentingBetweenIntCityCenter_OutCitycenter(1)
        assertEquals(expectedResult,result)
    }
    @Test
    fun testGetHighestDifference_returnsCorrect_3BedRoom_BetweenInCityCenter_OutCityCenter() {
        //given
        val expectedResult  = listOf(cities[1])
        //when
        val result = rating.execute_DifferentPayRentingBetween3BedRoom_IntCityCenter_OutCitycenter(1)
        //then
        assertEquals(expectedResult,result)
    }
    @Test
    fun testGetHighestDifference_returnsCorrect_pricePerSquareMeterToBuy_BetweenInCityCenter_OutCityCenter() {
        //given
        val expectedResult  = listOf(cities[2])
        //when
        val result = rating.execute_DifferentPayRentingBetween_pricePerSquareMeterToBuy_IntCityCenter_OutCitycenter(1)
        //then
        assertEquals(expectedResult,result)
    }


}



