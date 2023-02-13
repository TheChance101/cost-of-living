package interactor
import org.junit.jupiter.api.Assertions.*
import fakedata.FakeData
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import org.mockito.Mockito
class GetTheRightApartmentTest {
    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var fakeData: FakeData
    private lateinit var getTheRightApartment: GetTheRightApartment


    @BeforeEach
    fun setUp() {
        fakeData = FakeData()
        dataSource = Mockito.mock(CostOfLivingDataSource::class.java)
        getTheRightApartment = GetTheRightApartment(dataSource)
    }


    @Test
    fun should_ReturnTrue_when_OutPutInCorrect() {
        //Give
        val expectedResult = listOf(
            Pair("Alexandria", 1.0f),
            Pair("Bagdad", 1.2f),
            Pair("giza", 1.22f),
            Pair("Madrid", 1.32f),
            Pair("Bradford",1.22f),
            Pair("", 1.21f),
            Pair("giza", 1.22f),
            Pair("Madrid", 1.25f),
            Pair("Alexandria", 1.9f),
            Pair("Bagdad", 2.3f),
        )

        //When
        Mockito.`when`(dataSource.getAllCitiesData()).thenReturn(fakeData.getAllCitiesData())
        val  actualResult = getTheRightApartment.getListOfDetailsOfApartment(1000)
        //Then
        assertNotEquals(expectedResult, actualResult)
    }


    @Test
    fun should_ReturnTrue_when_OutPutCorrect() {
        //Give
        val expectedResult = listOf(
            Pair("Alexandria", "20"),
            Pair("Bagdad", "13"),
            Pair("giza", "16"),
            Pair("Madrid", "10"),
        )

        //When
        Mockito.`when`(dataSource.getAllCitiesData()).thenReturn(fakeData.getAllCitiesData())
        val actualResult = getTheRightApartment.getListOfDetailsOfApartment(1000)
        //Then
        assertEquals(expectedResult, actualResult)
    }
//    @Test
//    fun should_ReturnTrue_when_OutPutInCorrec() {
//        //Give
//        val expectedResult = listOf(
//            Pair("Alexandria", "20"),
//            Pair("Bagdad", "13"),
//            Pair("giza", "16"),
//            Pair("Madrid", "10"),
//        )
//
//        //When
//        Mockito.`when`(dataSource.getAllCitiesData()).thenReturn(fakeData.getAllCitiesData())
//        val actualResult: Executable = Executable{ getTheRightApartment.getListOfDetailsOfApartment(1000)}
//
//        //Then
//        assertThrows(Exception::class.java,actualResult)
//    }
}