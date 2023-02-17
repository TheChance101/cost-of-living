package interactor

import fakeDataSource.FakeDataSourceForRentalPrice
import model.CityEntity

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class TestGetCityWithHighestRentalPriceDifferenceInteractor {
    private lateinit var getCityWithHighestRentalPriceDifference: GetCityWithHighestRentalPriceDifferenceInteractor
    private lateinit var dataSource: FakeDataSourceForRentalPrice

    @BeforeAll
    fun setUp() {
        dataSource = FakeDataSourceForRentalPrice()
        getCityWithHighestRentalPriceDifference = GetCityWithHighestRentalPriceDifferenceInteractor(dataSource)
    }

    @Test
    fun Should_ReturnFalse_WhenInput_Null_ApartmentPrice_InCityCenter() {
        //given an object of CityEntity with Null apartment price in city center
        val city = dataSource.getAllCitiesData()[0]

        //when
        val result = getCityWithHighestRentalPriceDifference.excludeNullValues(city)
        //then
        assertFalse(result)
    }

    @Test
    fun Should_Return_FalseWhenInput_NullApartmentPrice_OutsideCityCenter() {
        //given an object of CityEntity with Null apartment price outside city center
        val city = dataSource.getAllCitiesData()[0]

        //when
        val result = getCityWithHighestRentalPriceDifference.excludeNullValues(city)
        //then
        assertFalse(result)
    }

    @Test
    fun ShouldReturn_AnEmptyString_IfNoCity_WithHigh_QualityDataIsFound() {
        val cityData = emptyList<CityEntity>()
        val result = getCityWithHighestRentalPriceDifference.execute(cityData)
        assertEquals("", result)
    }

    @Test
    fun Should_Return_TheCityWith_TheHighest_Rental_PriceDifference() {
        //given a var of dataSource with return name of city
        val cityData = dataSource.getAllCitiesData()

        val result = getCityWithHighestRentalPriceDifference.execute(cityData)

        assertEquals("Cairo", result)
    }
    @Test
    fun Should_Return_TheCityWith_TheHighestRental_PriceDifference_For1BedroomApartments() {
        val cityData=dataSource.getAllCitiesData()

        val result = getCityWithHighestRentalPriceDifference.execute(cityData)

        assertEquals("Paris", result)
    }

}





