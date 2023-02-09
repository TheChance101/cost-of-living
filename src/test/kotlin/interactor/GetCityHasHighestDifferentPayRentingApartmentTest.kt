package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasHighestDifferentPayRentingApartmentTest {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
    lateinit var ratingHighest:GetCityHasHighestDifferentPayRentingApartment
    @BeforeAll
    fun setUp(){
        ratingHighest = GetCityHasHighestDifferentPayRentingApartment(dataSource)
    }

    @Test
    fun should_Return_Correct_CityName_OneBedroomInCityCentre() {
        //given
        val cityName="Egypt"
        //when
        val largestRating = ratingHighest.execute_OneBedroomInCityCentre(1)
        //then
        assertEquals(cityName,largestRating)
    }

    @Test
    fun should_Return_Correct_CityName_OneBedroomOutsideOfCentre() {
        //given
        val cityName="Egypt"
        //when
        val largestRating = ratingHighest.execute_OneBedroomInCityCentre(1)
        //then
        assertEquals(cityName,largestRating)
    }


}