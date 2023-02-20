package interactor

import fakedata.FakeWithNoNull
import fakedata.FakewithNull
import fakedata.MyFakeData
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesNamesOrderedByBestHealthyBreakfastCostTest {
  private  lateinit var fakeNull: FakewithNull
  private  lateinit var allFakeData: MyFakeData
  private  lateinit var fakeNoNull: FakeWithNoNull

    @BeforeAll
    fun setup() {
        allFakeData = MyFakeData()
        fakeNull = FakewithNull()
        fakeNoNull = FakeWithNoNull()
}
    @Test
    fun should_returnOrderOfCityByBestCostForBreakfast_when_getListOfCity() {
        //given list of cities
        val cityList = allFakeData
        //when find Cities Names Ordered By Best Healthy Breakfast Cost
        val result = GetCitiesNamesOrderedByBestHealthyBreakfastCost(cityList).execute()
        //then
        assertEquals(listOf("L3","L2","L1","H3","H2","H1"),result)
    }
    @Test
    fun should_returnAllInsertedCitiesButSorted_when_getListOfCityThatAllHaveHealthyBreakfast() {
        //given list of cities have no null in milk and egg and cheese attributes
        val cityList = fakeNoNull
        //when find Cities Names Ordered By Best Healthy Breakfast Cost
        val result = GetCitiesNamesOrderedByBestHealthyBreakfastCost(cityList).execute()
        //then
        assertEquals(listOf("L3","L2","L1","H3","H2","H1"),result)
    }
    @Test
    fun should_return4CitiesButSorted_when_getListOfCityThatAllHaveHealthyBreakfast() {
        //given list of cities have no null in milk and egg and cheese attributes
        val cityList = fakeNoNull
        //when find 4 Cities Names Ordered By Best Healthy Breakfast Cost
        val result = GetCitiesNamesOrderedByBestHealthyBreakfastCost(cityList).execute(4)
        //then
        assertEquals(listOf("L3","L2","L1","H3"),result)
    }

    @Test
    fun should_returnEmptyList_when_getListOfCityThatHaveNoHealthyBreakfast() {
        //given list of cities have null in milk or egg or cheese attributes
        val cityList = fakeNull
        //when find All null Cities Names Ordered By Best Healthy Breakfast Cost
        val result = GetCitiesNamesOrderedByBestHealthyBreakfastCost(cityList).execute()
        //then
        assertEquals(listOf<String>(),result)
    }
}