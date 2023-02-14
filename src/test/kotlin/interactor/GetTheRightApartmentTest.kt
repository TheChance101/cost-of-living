
package interactor
import org.junit.jupiter.api.Assertions.*
import fakedata.FakeData
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

class GetTheRightApartmentTest {
    private lateinit var fakeData: FakeData
    private lateinit var getTheRightApartment: GetTheRightApartment


    @BeforeEach
    fun setUp() {
        fakeData = FakeData()
        getTheRightApartment = GetTheRightApartment(fakeData)
    }


    @Test
    fun should_ReturnNotEqualIsTrue_when_OutPutInCorrect() {
        //Given list of cities and years
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

        //When salary =1000
        val actualResult = getTheRightApartment.getListOfDetailsOfApartment(1000)
        //Then return true when input not equal out put
        assertNotEquals(expectedResult, actualResult)
    }


    @Test
    fun should_ReturnEqualIsTrue_when_OutPutCorrect() {
        //Given list of cities and years
        val expectedResult = listOf(
            Pair("Havana", 2.2352502f),
            Pair("Damascus", 15.645f),
        )
        //When salary =1000
        val actualResult = getTheRightApartment.getListOfDetailsOfApartment(1000)
        //Then return true when input equal out put
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun should_Throw_when_salaryEqualZero() {
        //Given list of cities and years
        val expectedResult = listOf(
            Pair("Alexandria", "20"),
            Pair("Bagdad", "13"),
            Pair("giza", "16"),
            Pair("Madrid", "10"),
        )
        //When salary =0
        val actualResult = Executable { getTheRightApartment.getListOfDetailsOfApartment(0) }
        //Then throw when salary = 0
        assertThrows(Exception::class.java, actualResult)
    }
}

