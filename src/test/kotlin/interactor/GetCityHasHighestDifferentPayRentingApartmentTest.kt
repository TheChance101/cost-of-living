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
//    data class City(val nameCity: String, val Real:RealEstatesPrices)
//
//    private val cities = listOf(
//
//        City("Sharjah", RealEstatesPrices(200.0f, 100.0f, null, null, null, null)),
//        City("Damascus",RealEstatesPrices(150.0f, 75.0f, null, null, null, null)),
//        City("Tanta",RealEstatesPrices(250.0f, 125.0f, null, null, null, null)),
//        City("Multan",RealEstatesPrices(300.0f, 150.0f, null, null, null, null))
//    )
    data class City(val nameCity:String)
    private val cities = listOf(
        "Havana",
        "Damascus",
        "Tanta",
        "Multan"
    )

    @Test
    fun testGetHighestDifference_returnsCorrect_OneBedRoom_BetweenInCityCenter_OutCityCenter() {
        //given

        val expectedResult  = listOf(cities[0])
        //when
        val result = rating.execute_DifferentPayRentingBetweenIntCityCenter_OutCitycenter(1)
        //then
        assertEquals(expectedResult,result)
    }


}



