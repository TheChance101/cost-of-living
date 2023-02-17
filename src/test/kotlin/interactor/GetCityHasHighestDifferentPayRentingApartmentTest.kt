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
        assertEquals(null, result)
    }

    @Test
    fun Should_Return_TheCityWith_TheHighest_Rental_PriceDifference() {
        //given a var of dataSource with return name of city
        val city = dataSource.getAllCitiesData()

        val result = getCityWithHighestRentalPriceDifference.execute(city)

        assertEquals("Cairo", result)
    }
    @Test
    fun Should_Return_TheCityWith_TheHighestRental_PriceDifference_For1BedroomApartments() {
        //given
        val cityData=dataSource.getAllCitiesData()
    //when
        val result = getCityWithHighestRentalPriceDifference.execute(cityData)
    //then
        assertEquals("Cairo", result)
    }

    @Test
    fun Should_Return_TheCityWith_TheHighestRental_PriceDifference_For3BedroomApartments() {
        val cityData=dataSource.getAllCitiesData()

        val expectedCity = "Moscow"
        val result = getCityWithHighestRentalPriceDifference.execute(cityData)

        assertEquals("Cairo", result)
    }

    @Test
    fun Should_Return_TheCityWith_TheHighestRental_PriceDifference_ForBuying1BedroomApartments() {
        //given
        val cityData=dataSource.getAllCitiesData()
        val expectedCity = "Cairo"
        //when
        val result = getCityWithHighestRentalPriceDifference.execute(cityData)
        //then
        assertEquals(expectedCity, result)
    }

    @Test
    fun Should_Return_TheCityWith_TheHighestRental_PriceDifference_ForBuying3BedroomApartments() {
        //given
        val cityData=dataSource.getAllCitiesData()
        val expectedCity = "San Francisco, CA"
        //when
        val result = getCityWithHighestRentalPriceDifference.execute(cityData)
        //then
        assertEquals(expectedCity, result)
    }

}





