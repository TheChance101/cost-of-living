package interactor

import dataSource.FakeDataForLowQualityData
import dataSource.FakeDataWithEmptyList
import dataSource.FakeDataSource
import dataSource.FakeDataWithItemInHighQuality
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var cityHasCheapestInternet: GetCityHasCheapestInternetConnectionInteractor
    private lateinit var fakeDataSource:CostOfLivingDataSource
    private lateinit var fakeDataWithItemInHighQuality: CostOfLivingDataSource
    private lateinit var fakeDataForLowQualityData: CostOfLivingDataSource
    private lateinit var fakeDataWithEmptyList: CostOfLivingDataSource
    private lateinit var cityHasCheapestInternetConnectionWithEmptyList:GetCityHasCheapestInternetConnectionInteractor
    private lateinit var cityHasCheapestInternetConnectionWithOneItem: GetCityHasCheapestInternetConnectionInteractor
    private lateinit var cityHasCheapestInternetConnectionWithLowQualityData: GetCityHasCheapestInternetConnectionInteractor


    @BeforeEach
    fun setup(){
        fakeDataSource = FakeDataSource()
        cityHasCheapestInternet = GetCityHasCheapestInternetConnectionInteractor(fakeDataSource)
        fakeDataWithItemInHighQuality = FakeDataWithItemInHighQuality()
        fakeDataForLowQualityData = FakeDataForLowQualityData()
        fakeDataWithEmptyList = FakeDataWithEmptyList()
        cityHasCheapestInternetConnectionWithEmptyList = GetCityHasCheapestInternetConnectionInteractor(fakeDataWithEmptyList)
        cityHasCheapestInternetConnectionWithOneItem = GetCityHasCheapestInternetConnectionInteractor(fakeDataWithItemInHighQuality)
        cityHasCheapestInternetConnectionWithLowQualityData = GetCityHasCheapestInternetConnectionInteractor(fakeDataForLowQualityData)
    }



    @Test
    fun `should return one city when given list has only one item in high quality data`(){
        // when check what is the cheapest city in list with giving only 1 city in list
        val actual = cityHasCheapestInternetConnectionWithOneItem.execute().cityName
        val expected = fakeDataWithItemInHighQuality.getAllCitiesData()[0].cityName
        // then check the result
        assertEquals(expected,actual)
    }

    @Test
    fun `should throw exception when given empty list`(){
        // when check what is the cheapest city in list with giving emptyList
        val actual = Executable{cityHasCheapestInternetConnectionWithEmptyList.execute()}
        val expected = NoSuchElementException::class.java
        // then check the result
        assertThrows(expected,actual)
    }

    @Test
    fun `should return cheapest city when given list of cities`(){
        // when check what is the cheapest city in the list
        val actual = cityHasCheapestInternet.execute().cityName
        val expected = fakeDataSource.getAllCitiesData()[17].cityName
        // then check the result
        assertEquals(expected,actual)
    }


    @Test
    fun `should throw exception when all elements in the list is bad quality or internet Price is null or average salary is null`(){
        // when check what is the cheapest city in the list
        val actual = Executable{cityHasCheapestInternetConnectionWithLowQualityData.execute()}
        val expected = NoSuchElementException::class.java
        // then check the result
        assertThrows(expected,actual)
    }
}