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
    lateinit var fakeNull: FakewithNull
    lateinit var allfakeData: MyFakeData
    lateinit var fakeNoNull: FakeWithNoNull

    @BeforeAll()
    fun setup() {
        allfakeData = MyFakeData()
        fakeNull = FakewithNull()
        fakeNoNull = FakeWithNoNull()
}
    @Test
    fun Should_returnOrderOfCitieyBybestCostForBreakfast_when_getListOfCity() {
        //givin

        //when
        var result = GetCitiesNamesOrderedByBestHealthyBreakfastCost(allfakeData).excute()
        //then
        assertEquals(listOf("L3","L2","L1","H3","H2","H1"),result)
    }
    @Test
    fun Should_returnAllInsertedCitiesButSorted_when_getListOfCityThatAllHaveHealthyBreakfast() {
        //givin

        //when
        var result = GetCitiesNamesOrderedByBestHealthyBreakfastCost(fakeNoNull).excute()
        //then
        assertEquals(listOf("L3","L2","L1","H3","H2","H1"),result)
    }

    @Test
    fun Should_returnemptyList_when_getListOfCityThatHaveNoHealthyBreakfast() {
        //givin

        //when
        var result = GetCitiesNamesOrderedByBestHealthyBreakfastCost(fakeNull).excute()
        //then
        assertEquals(listOf<String>(),result)
    }
}