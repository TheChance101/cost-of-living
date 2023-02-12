package interactor

import fake.FakeData
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCheapestBananaCitiesNamesInteractorTest {

    private lateinit var interactor: GetCheapestBananaCitiesNamesInteractor
    private val fakeData = FakeData()

    @BeforeAll
    fun setup() {
        interactor = GetCheapestBananaCitiesNamesInteractor(fakeData)
    }

    @Test
    fun `should return entered single city when have correct city with not null banana price`() {
        // given correct city with not null banana price
        val city: String = "Santiago de Cuba"
        // when get cities list
        val cities = interactor.execute(city)
        // then if getting entered city in a list
        assertEquals(listOf("Santiago de Cuba"), cities)
    }

    @Test
    fun `should return empty list when have single correct city with null banana price`() {
        // given correct city with null banana price
        val city: String = "Santa Clara"
        // when get cities list
        val cities = interactor.execute(city)
        // then if getting empty list
        assertEquals(emptyList(), cities)
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
    fun `should return sorted correct cities when have all correct cities data with not null banana price`() {
        // given varargs of correct cities with not null banana price
        val citiesList = listOf("Santiago de Cuba", "Sancti Spiritus", "Masin")
        // when get sorted cities list by cheapest price
        val cities = interactor.execute(*citiesList.toTypedArray())
        // then if getting correct cities
        assertEquals(listOf("Masin", "Santiago de Cuba", "Sancti Spiritus"), cities)
    }

    @Test
    fun `should return sorted correct cities when have list of correct cities with one or more city is not correct typing`() {
        // given varargs of correct cities with Not null banana price but there is one incorrect typing
        val citiesList = listOf("Santiago de Cuba", "Sancti Spiritus", "Masin", "BlaBlaBla")
        // when get sorted cities list by cheapest price
        val cities = interactor.execute(*citiesList.toTypedArray())
        // then if getting correct cities
        assertEquals(listOf("Masin", "Santiago de Cuba", "Sancti Spiritus"), cities)
    }

    @Test
    fun `should return sorted correct cities when have list of correct cities with one or more city has a null banana price`() {
        // given varargs of correct cities with correct banana price but there is one or more city has a null banana price
        val citiesList = listOf("Santiago de Cuba", "Sancti Spiritus", "Masin", "Santa Clara")
        // when get sorted cities list by cheapest price
        val cities = interactor.execute(*citiesList.toTypedArray())
        // then if getting correct cities
        assertEquals(listOf("Masin", "Santiago de Cuba", "Sancti Spiritus"), cities)
    }

    @Test
    fun `should return empty list when have all cities incorrect typing or null banana price`() {
        // given varargs of all Incorrect cities , or it's banana price is null
        val citiesList = listOf("BlaBlaBla", "Fayrouz", "Almaza", "Nothing")
        // when get empty list
        val cities = interactor.execute(*citiesList.toTypedArray())
        // then if getting empty list
        assertEquals(listOf(), cities)
    }

    @Test
    fun `should return the only correct city from many incorrect cities when  all given only one city satisfies conditions in all given cities`() {
        // given varargs of all Incorrect cities except only one city satisfies all conditions
        val citiesList = listOf("BlaBlaBla", "Uyo", "Tamale", "Moratuwa", "Santiago de Cuba")
        // when get sorted cities list by cheapest price
        val cities = interactor.execute(*citiesList.toTypedArray())
        // then if the only correct city
        assertEquals(listOf("Santiago de Cuba"), cities)
    }
}