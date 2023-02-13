package interactor
import org.junit.jupiter.api.Assertions.*
import fakedata.FakeData
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
class GetTheRightApartmentTest {
    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var fakeData: FakeData
    private lateinit var getTheRightApartment: GetTheRightApartment


    @BeforeEach
    fun setUp() {
        fakeData = FakeData()
        getTheRightApartment = GetTheRightApartment(fakeData)
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
        val  actualResult = getTheRightApartment.getListOfDetailsOfApartment(1000)
        //Then
        assertNotEquals(expectedResult, actualResult)
    }


    @Test
    fun should_ReturnTrue_when_OutPutCorrect() {
        //Give
        val expectedResult = listOf(
            Pair("Thimphu", 1.0251666f),
            Pair("Faisalabad", 1.3918333f),
            Pair("Yaounde", 1.6439167f),
            Pair("Multan", 1.6900834f),
            Pair("Hyderabad City",1.719f),
            Pair("Giza", 1.90775f),
            Pair("Tanta", 2.01225f),
            Pair("Alexandria", 2.0461667f),
            Pair("Vadodara", 2.047f),
            Pair("Bhopal", 2.0931666f),
        )

        //When
        val actualResult = getTheRightApartment.getListOfDetailsOfApartment(1000)
        //Then
        assertEquals(expectedResult, actualResult)
    }
    @Test
    fun should_ReturnTrue_when_OutPutInCorrec() {
        //Give
        val expectedResult = listOf(
            Pair("Alexandria", "20"),
            Pair("Bagdad", "13"),
            Pair("giza", "16"),
            Pair("Madrid", "10"),
        )
        //When
        val actualResult: Executable = Executable{ getTheRightApartment.getListOfDetailsOfApartment(0)}
        //Then
        assertThrows(Exception::class.java,actualResult)
    }
}