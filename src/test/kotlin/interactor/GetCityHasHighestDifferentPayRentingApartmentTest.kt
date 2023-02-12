package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TestGetHighestDifferenceBetweenCityCenterAndOutsideCityCenter {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    var rating = GetHighestDifferenceBetweenCityCenterAndOutsideCityCenter(dataSource)
    data class City(val nameCity: String, val inCityCenter: Double, val outCityCenter: Double, val value: Boolean)

    private val cities = listOf(
        City("New York", 200.0, 100.0, true),
        City("London", 150.0, 75.0, true),
        City("Tokyo", 250.0, 125.0, false),
        City("Paris", 300.0, 150.0, true)
    )


    @Test
    fun testGetHighestDifference_returnsCorrect_OneBedRoom_BetweenInCityCenter_OutCityCenter() {
        val excepted = "Havana"

        val result =rating.execute_DifferentPayRentingBetweenIntCityCenter_OutCitycenter(1)
        assertEquals(excepted,result)
    }


}



