package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import model.CityEntity
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasCheapestMealPricesInteractorTest {

    private lateinit var sut: GetCityHasCheapestMealPricesInteractor
    lateinit var fakeData: FakeData
    private val csvParser = CsvParser()
    private val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    @BeforeAll
    fun setUp() {
        // clear and cancel all objects mock
        clearAllMocks()
        unmockkAll()
        // sut: system under test
        sut = GetCityHasCheapestMealPricesInteractor(dataSource)
        fakeData = FakeData()
    }

    @Test
    fun `should return true when the city is in USA`() {
        // given fake city entity data
        val city: CityEntity = mockk()
        // when return the country of the city is USA
        every { city.country } returns ThreeSpecificCountries.USA.nameOFCountry
        val result = sut.citiesInUSACanadaAndMexico(city)
        // then
        assertTrue(result)
    }

    @Test
    fun `should return true when the city is in Canada`() {
        // given fake city entity data
        val city: CityEntity = mockk()
        // when return the country of the city is Canada
        every { city.country } returns ThreeSpecificCountries.CANADA.nameOFCountry
        val result = sut.citiesInUSACanadaAndMexico(city)
        // then
        assertTrue(result)
    }

    @Test
    fun `should return true when the city is in Mexico`() {
        // given fake city entity data
        val city: CityEntity = mockk()
        // when return the country of the city is Mexico
        every { city.country } returns ThreeSpecificCountries.MEXICO.nameOFCountry
        val result = sut.citiesInUSACanadaAndMexico(city)
        // then
        assertTrue(result)
    }

    @Test
    fun `should return false when the city is in Egypt`() {
        // given fake city entity data
        val city: CityEntity = mockk()
        // when return the country of the city is Egypt
        every { city.country } returns ThreeSpecificCountries.EGYPT.nameOFCountry
        val result = sut.citiesInUSACanadaAndMexico(city)
        // then
        assertFalse(result)
    }

    @Test
    fun `should return false when the city has no averageMeal price and InexpensiveMeal`() {
        // given
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns null
        every { city.mealsPrices.mealInexpensiveRestaurant } returns null
        // when
        val result = sut.isCityHasAverageMealPrice(city)
        // then
        assertEquals(false, result)
    }

    @Test
    fun `should return false when the city has no averageMeal price and Expensive`() {

        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns null
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 4.0F
        every { city.mealsPrices.mealAtMcDonaldSOrEquivalent } returns null

        val result = sut.isCityHasAverageMealPrice(city)

        assertEquals(false, result)
    }

    @Test
    fun `should return false when the city has averageMeal price and InexpensiveMeal is zero`() {
        // given
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns 0.0F
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 0.0F
        // when
        val result = sut.isCityHasAverageMealPrice(city)
        // then
        assertEquals(false, result)
    }

    @Test
    fun `should return false when the city has averageMeal price and ExpensiveMeal is zero`() {
        // given
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns 0.0F
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 4.0F
        every { city.mealsPrices.mealAtMcDonaldSOrEquivalent } returns 0.0F
        // when
        val result = sut.isCityHasAverageMealPrice(city)
        // then
        assertEquals(false, result)
    }

    @Test
    fun `should return true when the city has InexpensiveMeal and ExpensiveMeal`() {
        // given
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns null
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 6.0F
        every { city.mealsPrices.mealAtMcDonaldSOrEquivalent } returns 2.0F

        // when
        val result = sut.isCityHasAverageMealPrice(city)
        // then
        assertEquals(true, result)
    }

    @Test
    fun `should return true when the city has AverageMeal`() {
        // given
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns 6.0F
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 6.0F
        every { city.mealsPrices.mealAtMcDonaldSOrEquivalent } returns 2.0F

        // when
        val result = sut.isCityHasAverageMealPrice(city)
        // then
        assertEquals(true, result)
    }

    @Test
    fun `should return zero when has no midMeal and no expensive meal`() {
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns null
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 5.0F
        every { city.mealsPrices.mealAtMcDonaldSOrEquivalent } returns 0.0F
        // when
        val result = sut.getAverageMealInCity(city)
        // then
        assertEquals(0.0F, result)
    }

    @Test
    fun `should return number when has inExpensive and expensive meal`() {
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns 0.0F
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 3.0F
        every { city.mealsPrices.mealAtMcDonaldSOrEquivalent } returns 5.0F
        // when
        val result = sut.getAverageMealInCity(city)
        // then
        assertEquals(4.0F, result)
    }

    @Test
    fun `should return zero when has no average meal`() {
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns 0.0F
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 0.0F
        every { city.mealsPrices.mealAtMcDonaldSOrEquivalent } returns 0.0F
        // when
        val result = sut.getAverageMealInCity(city)
        // then
        assertEquals(0.0F, result)
    }

    @Test
    fun `should return average meals of all cities when cities list is not empty`() {
        // given fake city entity data and the expected value
        val sut = GetCityHasCheapestMealPricesInteractor(fakeData)
        val average = 7.5F
        // when list is not empty
        val result = sut.getAverageMealInAllCities(fakeData.getAllCitiesData())
        // then
        assertEquals(average, result)
    }

    @Test
    fun `should return zero of all cities when cities list is empty`() {
        // given fake city entity data and the expected value
        val sut = GetCityHasCheapestMealPricesInteractor(fakeData)
        val average = 0.0F
        // when list is empty
        val result = sut.getAverageMealInAllCities(fakeData.getAllCitiesData())
        // then
        assertEquals(average, result)
    }
}


