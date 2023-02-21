package interactor

import fakeDataSource.FakeData
import org.junit.jupiter.api.*
import kotlin.test.assertEquals
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesNamesSortedByCheapestBananaPricesInteractorTest {

    private lateinit var getCitiesNamesSortedByCheapestBananaPrices: GetCitiesNamesSortedByCheapestBananaPricesInteractor
    private lateinit var fakeData: FakeData

    @BeforeAll
    fun setUp() {
        fakeData = FakeData()
        getCitiesNamesSortedByCheapestBananaPrices = GetCitiesNamesSortedByCheapestBananaPricesInteractor(fakeData)
    }

    @Test
    fun should_ReturnListOfCorrectCitiesName_When_HaveCorrectListWithUpperCase() {
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute("Caracas", "Accra", "Giza")
        val expectedResult = listOf("Giza", "Accra", "Caracas")

        //Then
        assertEquals(expectedResult, result)
    }

    @Test
    fun should_ReturnCorrectCitiesName_When_HaveCorrectListWithLowerCase() {
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute("caracas", "accra", "giza")
        val expectedResult = listOf("Giza", "Accra", "Caracas")

        //Then
        assertEquals(expectedResult, result)
    }

    @Test
    fun should_ReturnListOfCorrectCitiesName_When_HaveSpaceAtTheEndAndTheStartOfCityName() {
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(" caracas ", "accra ", " giza")
        val expectedResult = listOf("Giza", "Accra", "Caracas")
        //Then
        assertEquals(expectedResult, result)
    }

    @Test
    fun should_ReturnCorrectListOfCitiesName_When_CitiesNameHaveLowerAndUpperCase() {
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute("CarAcas", "ACCRA", "giZA")
        val expectedResult = listOf("Giza", "Accra", "Caracas")

        //Then
        assertEquals(expectedResult, result)
    }

    @Test
    fun should_ReturnEmptyList_When_HaveEmptyList() {
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute("")
        val expectedResult: List<String> = emptyList()
        //Then
        assertEquals(expectedResult, result)
    }

    @Test
    fun should_ReturnCorrectSortedByTheCheapestBananaList_When_HaveCorrectCitiesName() {
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute("Caracas", "Accra", "Giza")
        val expectedResult = listOf("Giza", "Accra", "Caracas")
        //Then
        assertEquals(expectedResult, result)
    }@Test
    fun should_ReturnEmptyList_When_EnterBlank() {
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute("        ")
        val expectedResult = emptyList<String>()
        //Then
        assertEquals(expectedResult, result)
    }
    @Test
    fun should_ReturnTrue_When_EnterWoringCityName() {
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute("example")
        val expectedResult = emptyList<String>()
        //Then
        assertEquals(expectedResult, result)
    }

}
