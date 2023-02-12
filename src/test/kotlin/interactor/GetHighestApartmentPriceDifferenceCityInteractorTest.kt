package interactor

import FakeData
import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestApartmentPriceDifferenceCityInteractorTest {

// create an object from FakeData class
    private lateinit var fakeData: FakeData
    private lateinit var GetHighestApartmentPrice: GetHighestApartmentPriceDifferenceCityInteractor

    @BeforeEach
    fun setUp() {
        fakeData = FakeData()
        GetHighestApartmentPrice = GetHighestApartmentPriceDifferenceCityInteractor(fakeData)
    }

//to test execute function we need to list of city , We take it from FakeData class
    @Test
    fun should_ReturnCithyHashighestDiffirenceRent_When_InputIsTrue(){
        // given list
        val cities = fakeData.getAllCitiesData()
        //when
        val result = GetHighestApartmentPrice.execute()
        // then check the result
        assertEquals(cities,result)
    }

    @Test
    fun Should_ReturnNull_When_theListIsEmpty(){
        // given an empty list
        val cities = emptyList<CityEntity>()
        // when check if the highest city is an empty list
        val result = GetHighestApartmentPrice.execute()
        // then check the result
        assertEquals(null,result)
    }

/*
if we have
CityEntity(
                cityName = "Paris",
                country = "France",
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = null,
                    apartmentOneBedroomOutsideOfCentre = 1000f,
                    dataQuality = true
                )
 */
    @Test
    fun should_ReturnNull_When_CityMissingApartmentPrice(){
        // given make an object from FakeData class
        val cities = fakeData.getAllCitiesData()
        // when check if the apartment price is missing
        val result = GetHighestApartmentPrice.execute()
        // then check the result
        assertEquals(null,result)
    }
    @Test
    fun Should_returnNull_When_CityWithLowQualityData(){
        // given make an object from FakeData class
        val cities = fakeData.getAllCitiesData()
        // when check if the data is low quality
        val result = GetHighestApartmentPrice.execute()
        // then check the result
        assertEquals(null,result)
    }

    @Test
    fun should_ReturnFirstCity_When_JustOneCityInList() {
        // given make an object from FakeData class
        val city = fakeData.getAllCitiesData()[0]
        // when execute fun
        val result = GetHighestApartmentPrice.execute()
        // then
        assertEquals(city,result)

    }

}