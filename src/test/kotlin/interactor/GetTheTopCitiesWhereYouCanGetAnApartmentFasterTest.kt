package interactor

import fakedata.DataSourceType
import org.junit.jupiter.api.Assertions.*
import fakedata.FakeDataSource
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTheTopCitiesWhereYouCanGetAnApartmentFasterTest {
    private lateinit var dataSource: CostOfLivingDataSource

    private lateinit var fakeData: FakeDataSource

    private lateinit var getTheTopCitiesWhereYouCanGetAnApartmentFaster: GetTheTopCitiesWhereYouCanGetAnApartmentFaster


    @BeforeEach
    fun setUp() {
        fakeData = FakeDataSource()
        dataSource = fakeData
        getTheTopCitiesWhereYouCanGetAnApartmentFaster = GetTheTopCitiesWhereYouCanGetAnApartmentFaster(fakeData)
    }


    @Test
    fun should_ReturnNotEqualIsTrue_when_OutPutInCorrect() {
        //Give limit and list
        val limit = 10
        val expectedResult = listOf(
            Pair("Alexandria", 1.0f),
            Pair("Bagdad", 1.2f),
            Pair("giza", 1.22f),
            Pair("Madrid", 1.32f),
            Pair("Bradford", 1.22f),
            Pair("", 1.21f),
            Pair("giza", 1.22f),
            Pair("Madrid", 1.25f),
            Pair("Alexandria", 1.9f),
            Pair("Bagdad", 2.3f),
        )
        //When
        val actualResult = getTheTopCitiesWhereYouCanGetAnApartmentFaster.getListOfTopCitiesNamesAndNumberOfYearsToGetApartmentFaster(limit)
        //Then
        assertNotEquals(expectedResult, actualResult)
    }


    @Test
    fun should_ReturnEqualIsTrue_when_OutPutCorrect() {
        //Give
        val expectedResult = listOf(
            Pair("Lyon", 1.388889f),
            Pair("Alex", 2.0833335f),
        )
        //When
        val actualResult = getTheTopCitiesWhereYouCanGetAnApartmentFaster.getListOfTopCitiesNamesAndNumberOfYearsToGetApartmentFaster(2)
        //Then
        assertEquals(expectedResult, actualResult)
    }
    @Test
    fun should_ReturnCorrectList_When_EnterValidData() {
        //Given -Valid Data
        val limit=10
        fakeData.dataSourceType= DataSourceType.VALID

        //When -limit is 10
        val list = getTheTopCitiesWhereYouCanGetAnApartmentFaster
            .getListOfTopCitiesNamesAndNumberOfYearsToGetApartmentFaster(limit)
        println(list.size)
        //Then -return 10 items of the list sorted ascending by years
        assertTrue(list.size == 10 && list == list.sortedBy { it.second })
    }


}

