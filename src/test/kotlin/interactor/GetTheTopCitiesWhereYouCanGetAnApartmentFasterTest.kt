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
    fun should_ReturnCorrectList_When_EnterValidData() {
        //Given -Valid Data
        val limit=2
        fakeData.dataSourceType= DataSourceType.VALID

        //When -limit is 2
        val list = getTheTopCitiesWhereYouCanGetAnApartmentFaster
            .getListOfTopCitiesNamesAndNumberOfYearsToGetApartmentFaster(limit)
        println(list.size)
        //Then -return 2 items of the list sorted ascending by years
        assertTrue(list.size == 2 && list == list.sortedBy { it.second })
    }
    @Test
    fun should_Throw_When_EnterNullList() {
        //Given -Valid Data
        val limit=2
        fakeData.dataSourceType= DataSourceType.NULLABLE

        //When -limit is 10
        val list = Executable{getTheTopCitiesWhereYouCanGetAnApartmentFaster
            .getListOfTopCitiesNamesAndNumberOfYearsToGetApartmentFaster(limit)}
        //Then -return 10 items of the list sorted ascending by years
        assertThrows(Exception::class.java,list)
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
    fun should_ReturnTrue_When_DataQualityIsLow() {
        //given fake data is empty
         fakeData.dataSourceType= DataSourceType.EMPTY
        //when limit equal 10
        val fastestCitiesToBuyAPT = GetTheTopCitiesWhereYouCanGetAnApartmentFaster(fakeData)
        val result = fastestCitiesToBuyAPT
            .getListOfTopCitiesNamesAndNumberOfYearsToGetApartmentFaster(10).isEmpty()
        //then return true is empty
        assertTrue(result)
    }


}

