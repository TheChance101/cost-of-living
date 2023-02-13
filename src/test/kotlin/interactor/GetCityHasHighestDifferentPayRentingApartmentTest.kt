package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import fakeDataSource.FakeDataSourceForRentalPrice
import model.CityEntity

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class TestGetCityWithHighestRentalPriceDifferenceInteractor{
    private lateinit var getCityWithHighestRentalPriceDifference: GetCityWithHighestRentalPriceDifferenceInteractor
    private lateinit var dataSource: FakeDataSourceForRentalPrice

    @BeforeAll
    fun setUp() {
        dataSource = FakeDataSourceForRentalPrice()
        getCityWithHighestRentalPriceDifference = GetCityWithHighestRentalPriceDifferenceInteractor(dataSource)
    }

    @Test
    fun `Should return false when input null apartment price in city center`() {
        //given an object of CityEntity with Null apartment price in city center
        var city = dataSource.getAllCitiesData()[0]

        //when
        val result = getCityWithHighestRentalPriceDifference.excludeNullValues(city)
        //then
        assertFalse(result)
    }

    @Test
    fun `Should return false when input null apartment price outside city center`() {
        //given an object of CityEntity with Null apartment price outside city center
        var city = dataSource.getAllCitiesData()[0]

        //when
        val result = getCityWithHighestRentalPriceDifference.excludeNullValues(city)
        //then
        assertFalse(result)
    }
    @Test
    fun `Should return an empty string if no city with high-quality data is found`() {
        val cityData = emptyList<CityEntity>()
        val result = getCityWithHighestRentalPriceDifference.execute(cityData)
        assertEquals("", result)
    }

    @Test

    fun `Should return the city with the highest rental price difference`() {
        val cityData = dataSource.getAllCitiesData()
        val result = getCityWithHighestRentalPriceDifference.execute(cityData)
        assertEquals("New York", result)

//       // given an object of GetCityWithHighestRentalPriceDifferenceInteractor with return list of CityEntity
//        val getData = GetCityWithHighestRentalPriceDifferenceInteractor(object : CostOfLivingDataSource {
//            override fun getAllCitiesData(): List<CityEntity> {
//                return dataSource.getAllCitiesData()
//            }
//        })
//        //when run execute function
//        val result = getData.execute()
//        //then
//        assertEquals("New York", result)
    }




//
    }


//internal class TestGetHighestDifferenceBetweenCityCenterAndOutsideCityCenter {
//    val csvParser = CsvParser()
//    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
//
//    var rating = interactor.GetHighestDifferenceBetweenCityCenterAndOutsideCityCenter(dataSource)
//
//    @Test
//    fun testGetHighestDifference_returnsCorrect_OneBedRoom_BetweenInCityCenter_OutCityCenter() {
//        //given
//        val cities = listOf(
//            "Abuja",
//            "Walton upon Thames",
//            "Port Moresby",
//        )
//        var expectedResult: List<String>
////        for (i in cities.indices) {
//            if (cities.isEmpty()) {
//                emptyList<String>()
//            }else {
//                expectedResult = listOf(cities[0])
//                //when
//                val result = rating.execute_DifferentPayRentingBetween3BedRoom_IntCityCenter_OutCitycenter(1)
//                //then
//                assertEquals(expectedResult, result)
////            }
//        }
//    }
//
//    @Test
//    fun testGetHighestDifference_returnsCorrect_3BedRoom_BetweenInCityCenter_OutCityCenter() {
//        //given
//        val cities = listOf(
//            "Abuja",
//            "New York",
//            "Logos",
//        )
//
//        var expectedResult: List<String>
////        for (i in cities.indices){
//            if (cities.isEmpty()) {
//                emptyList<String>()
//            } else {
//                expectedResult = listOf(cities[0])
//                //when
//                val result = rating.execute_DifferentPayRentingBetween3BedRoom_IntCityCenter_OutCitycenter(1)
//                //then
//                assertEquals(expectedResult, result)
////            }
//        }
//    }
//
//    @Test
//    fun testGetHighestDifference_returnsCorrect_pricePerSquareMeterToBuy_BetweenInCityCenter_OutCityCenter() {
//        val cities = listOf(
//            "Abuja",
//            "New York",
//            "Logos",
//        )
//        var expectedResult: List<String>
////        for (i in cities.indices){
//           if (cities.isEmpty()) {
//               emptyList<String>()
//           } else {
//               expectedResult = listOf(cities[0])
//               //when
//               val result = rating.execute_DifferentPayRentingBetween3BedRoom_IntCityCenter_OutCitycenter(1)
//               //then
//               assertEquals(expectedResult, result)
////           }
//       }
//    }





