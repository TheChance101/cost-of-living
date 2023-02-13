package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import fakeData.FakeData
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import model.CityEntity
import org.junit.jupiter.api.*
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasCheapestMealPricesInteractorTest {

    private lateinit var sut: GetCityHasCheapestMealPricesInteractor
    private lateinit var fakeData: FakeData
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
        // given mealFor2PeopleMidRangeRestaurant , mealInexpensiveRestaurant is null
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns null
        every { city.mealsPrices.mealInexpensiveRestaurant } returns null
        // when check if city has average meal
        val result = sut.isCityHasAverageMealPrice(city)
        // then
        assertEquals(false, result)
    }

    @Test
    fun `should return false when the city has no averageMeal price and Expensive`() {
        // given mealFor2PeopleMidRangeRestaurant , mealAtMcDonaldSOrEquivalent is null
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns null
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 4.0F
        every { city.mealsPrices.mealAtMcDonaldSOrEquivalent } returns null
        // when check if city has average meal
        val result = sut.isCityHasAverageMealPrice(city)
        // then
        assertEquals(false, result)
    }

    @Test
    fun `should return false when the city has averageMeal price and InexpensiveMeal is zero`() {
        // given mealFor2PeopleMidRangeRestaurant , mealInexpensiveRestaurant
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns 0.0F
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 0.0F
        // when check if city has average meal
        val result = sut.isCityHasAverageMealPrice(city)
        // then
        assertEquals(false, result)
    }

    @Test
    fun `should return false when the city has averageMeal price and ExpensiveMeal is zero`() {
        // given mealFor2PeopleMidRangeRestaurant , mealAtMcDonaldSOrEquivalent is zero
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns 0.0F
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 4.0F
        every { city.mealsPrices.mealAtMcDonaldSOrEquivalent } returns 0.0F
        // when check if city has average meal
        val result = sut.isCityHasAverageMealPrice(city)
        // then
        assertEquals(false, result)
    }

    @Test
    fun `should return true when the city has InexpensiveMeal and ExpensiveMeal`() {
        // given mealFor2PeopleMidRangeRestaurant is null
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns null
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 6.0F
        every { city.mealsPrices.mealAtMcDonaldSOrEquivalent } returns 2.0F

        // when check if city has average meal
        val result = sut.isCityHasAverageMealPrice(city)
        // then
        assertEquals(true, result)
    }

    @Test
    fun `should return true when the city has AverageMeal`() {
        // given all mealPrices data
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns 6.0F
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 6.0F
        every { city.mealsPrices.mealAtMcDonaldSOrEquivalent } returns 2.0F

        // when check if city has average meal
        val result = sut.isCityHasAverageMealPrice(city)
        // then
        assertEquals(true, result)
    }

    @Test
    fun `should return zero when has no midMeal and no expensive meal`() {
        // given mealFor2PeopleMidRangeRestaurant is null ,  mealInexpensiveRestaurant , mealAtMcDonaldSOrEquivalent is zero
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns null
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 5.0F
        every { city.mealsPrices.mealAtMcDonaldSOrEquivalent } returns 0.0F
        // when check the average meal in city
        val result = sut.getAverageMealInCity(city)
        // then
        assertEquals(0.0F, result)
    }

    @Test
    fun `should return number when has inExpensive and expensive meal`() {
        // given mealFor2PeopleMidRangeRestaurant is zero
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns 0.0F
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 3.0F
        every { city.mealsPrices.mealAtMcDonaldSOrEquivalent } returns 5.0F
        // when check the average meal in city
        val result = sut.getAverageMealInCity(city)
        // then
        assertEquals(4.0F, result)
    }

    @Test
    fun `should return zero when has no average meal`() {
        // given all mealPrices is zero
        val city: CityEntity = mockk()
        every { city.mealsPrices.mealFor2PeopleMidRangeRestaurant } returns 0.0F
        every { city.mealsPrices.mealInexpensiveRestaurant } returns 0.0F
        every { city.mealsPrices.mealAtMcDonaldSOrEquivalent } returns 0.0F
        // when check the average meal in city
        val result = sut.getAverageMealInCity(city)
        // then
        assertEquals(0.0F, result)
    }

    @Test
    fun `should return average meals of all cities when cities list is not empty`() {
        // given fake city entity data and the expected value
        val sut = GetCityHasCheapestMealPricesInteractor(fakeData)
        val average = 9.25F
        // when list is not empty
        val result = sut.getAverageMealInAllCities(fakeData.getAllCitiesData())
        // then
        assertEquals(average, result)
    }

    @Test
    fun `should return zero of all cities when cities list is empty`() {
        // given fake city entity data and the expected value
        val sut = GetCityHasCheapestMealPricesInteractor(dataSource)
        val average = 0.0F
        // when list is empty
        val result = sut.getAverageMealInAllCities(emptyList())
        // then
        assertEquals(average, result)
    }
}

