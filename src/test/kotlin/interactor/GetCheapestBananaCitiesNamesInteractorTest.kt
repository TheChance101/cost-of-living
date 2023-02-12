package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import fake.FakeData
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCheapestBananaCitiesNamesInteractorTest {

    private lateinit var interactor: GetCheapestBananaCitiesNamesInteractor
    private val csvParser = CsvParser()
    private val dataSource = CsvDataSource(csvParser)
    private lateinit var fakeData: FakeData

    @BeforeAll
    fun setup() {
        fakeData = FakeData()
        interactor = GetCheapestBananaCitiesNamesInteractor(dataSource)
    }

    @Test
    fun `should return entered single city when have correct city with correct banana value`() {
        // given correct city with correct banana value
        val city: String = "Alexandria"
        // when get cities list
        val cities = interactor.execute(city)
        // then if getting entered city in a list
        assertEquals(listOf("Alexandria"), cities)
    }

    @Test
    fun `should return empty list when have single incorrect city`() {
        // given Incorrect city
        val city: String = "BlaBlaBla"
        // when get cities list
        val cities = interactor.execute(city)
        // then if getting empty list
        assertEquals(emptyList(), cities)
    }

    @Test
    fun `should return empty list when have single correct city with incorrect banana value`() {
        // given correct city with incorrect banana value
        val city: String = "Tamale"
        // when get cities list
        val cities = interactor.execute(city)
        // then if getting empty list
        assertEquals(emptyList(), cities)
    }

    @Test
    fun `should return empty list when have single correct city and it's dataQuality is false`() {
        // given correct city with incorrect banana value
        val city: String = "Tamale"
        // when get cities list
        val cities = interactor.execute(city)
        // then if getting empty list
        assertEquals(emptyList(), cities)
    }

    @Test
    fun `should return sorted correct cities when have all correct cities data`() {
        // given varargs of correct cities with true data quality and correct banana price
        val citiesList = listOf("Havana", "Damascus", "Alexandria")
        // when get sorted cities list by cheapest price
        val cities = interactor.execute(*citiesList.toTypedArray())
        // then if getting correct list
        assertEquals(listOf("Alexandria", "Havana", "Damascus"), cities)
    }

    @Test
    fun `should return sorted correct cities when have list of correct cities with one or more city is not correct typing`() {
        // given varargs of correct cities with true data quality and correct banana price but there is one incorrect typing
        val citiesList = listOf("Havana", "Damascus", "Alexandria", "BlaBlaBla")
        // when get sorted cities list by cheapest price
        val cities = interactor.execute(*citiesList.toTypedArray())
        // then if getting correct list
        assertEquals(listOf("Alexandria", "Havana", "Damascus"), cities)
    }

    @Test
    fun `should return sorted correct cities when have list of correct cities with one or more city has incorrect dataQuality or banana price`() {
        // given varargs of correct cities with true data quality and correct banana price but there is one or more city is not incorrect dataQuality or incorrect banana price
        val citiesList = listOf("Havana", "Damascus", "Alexandria", "Moratuwa")
        // when get sorted cities list by cheapest price
        val cities = interactor.execute(*citiesList.toTypedArray())
        // then if getting correct list
        assertEquals(listOf("Alexandria", "Havana", "Damascus"), cities)
    }

    @Test
    fun `should return empty list when have all cities incorrect typing , incorrect dataQuality or incorrect banana price`() {
        // given varargs of all Incorrect cities
        val citiesList = listOf("BlaBlaBla", "Uyo", "Tamale", "Moratuwa")
        // when get empty list
        val cities = interactor.execute(*citiesList.toTypedArray())
        // then if getting empty list
        assertEquals(listOf(), cities)
    }

    @Test
    fun `should return the only correct city from many incorrect cities when  all given only one city satisfies conditions in all given cities`() {
        // given varargs of all Incorrect cities except only one city satisfies all conditions
        val citiesList = listOf("BlaBlaBla", "Uyo", "Tamale", "Moratuwa" , "Alexandria")
        // when get sorted cities list by cheapest price
        val cities = interactor.execute(*citiesList.toTypedArray())
        // then if the only correct city
        assertEquals(listOf("Alexandria"), cities)
    }
}