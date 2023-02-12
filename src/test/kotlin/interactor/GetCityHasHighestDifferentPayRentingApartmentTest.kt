package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasHighestDifferentPayRentingApartmentTest {
//    val csvParser = CsvParser()
//    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
//    lateinit var ratingHighest:GetCityHasHighestDifferentPayRentingApartment
//    @BeforeAll
//    fun setUp(){
//        ratingHighest = GetCityHasHighestDifferentPayRentingApartment(dataSource)
//    }
    data class cityData(val name:String,val salaryInCenter:Double,val salaryOutCenter:Double,val value:Boolean)
    // create method data city
private val cities = listOf(
    cityData("City1", 200.0, 100.0, true),
        cityData("City2", 150.0, 75.0, true),
        cityData("City3", 250.0, 125.0, false),
        cityData("City4", 300.0, 150.0, true)
)
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

    @Test
    fun should_Return_Correct_CityName_3BedroomsInCityCentre() {
        //given
        val cityName="Egypt"
        //when
        val largestRating = ratingHighest.execute_OneBedroomInCityCentre(1)
        //then
        assertEquals(cityName,largestRating)
    }

    @Test
    fun should_Return_Correct_CityName_3BedroomsOutsideOfCentre() {
        //given
        val cityName="Egypt"
        //when
        val largestRating = ratingHighest.execute_OneBedroomInCityCentre(1)
        //then
        assertEquals(cityName,largestRating)
    }


    @Test
    fun should_Return_Correct_CityName_pricePerSquareMeterToBuyApartmentInCityCentre() {
        //given
        val cityName="Egypt"
        //when
        val largestRating = ratingHighest.execute_3BedroomsOutsideOfCentre(1)
        //then
        assertEquals(cityName,largestRating)
    }
//    @Test
//    fun pricePerSquareMeterToBuyApartmentOutsideOfCentre() {
//        //given
//        val cityName="Egypt"
//        //when
//        val largestRating = ratingHighest.execute_OneBedroomInCityCentre(1)
//        //then
//        assertEquals(cityName,largestRating)
//    }


}