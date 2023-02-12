package interactor

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import model.CityEntity
import model.MealsPrices
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class GetCityThatHasAverageMealsPricesInteractorTest {

    private lateinit var averageCityInteractor: GetCityThatHasAverageMealsPricesInteractor

    @MockK
    private lateinit var dataSource: CostOfLivingDataSource

    @MockK
    private lateinit var cityWithCheapestMealsPrices: CityEntity
    @MockK
    private lateinit var cityWithAverageMealsPrices: CityEntity
    @MockK
    private lateinit var cityWithMostExpensiveMealsPrices: CityEntity
    @MockK
    private lateinit var cityWithNullMealsPrices: CityEntity
    @MockK
    private lateinit var cityWithNegativeMealsPrices: CityEntity

    @BeforeEach
    fun setup() {
        MockKAnnotations.init(this)

        every {
            cityWithCheapestMealsPrices.mealsPrices
        } returns MealsPrices(3f, 5f, 4f)

        every {
            cityWithAverageMealsPrices.mealsPrices
        } returns MealsPrices(7f, 12f, 9f)

        every {
            cityWithMostExpensiveMealsPrices.mealsPrices
        } returns MealsPrices(15f, 25f, 17f)

        every {
            cityWithNullMealsPrices.mealsPrices
        } returns MealsPrices(1f, null, 9f)

        every {
            cityWithNegativeMealsPrices.mealsPrices
        } returns MealsPrices(2f, -1f, 4f)

    }

    @Test
    fun should_ReturnCityWithAverageMealsPrices_When_TheCitiesListAllFromValidAreaWithValidPrices() {
        // given a list of cities from usa,canada & mexico with valid prices

        every { cityWithCheapestMealsPrices.country } returns "Mexico"
        every { cityWithAverageMealsPrices.country } returns "Canada"
        every { cityWithMostExpensiveMealsPrices.country } returns "USA"

        every {
            dataSource.getAllCitiesData()
        } returns listOf(cityWithCheapestMealsPrices, cityWithAverageMealsPrices, cityWithMostExpensiveMealsPrices)

        //when find the city with average meals prices
        averageCityInteractor = GetCityThatHasAverageMealsPricesInteractor(dataSource)
        val actualResult = averageCityInteractor.execute()
        // then
        assertEquals(cityWithAverageMealsPrices, actualResult)

    }

    @Test
    fun should_ReturnTheValidCityWithAverageMealsPrices_When_TheListContainsCitiesFromBothValidAndInvalidAreasAndPrices() {
        // given a very mixed list of cities from around the world with valid and invalid prices

        every { cityWithCheapestMealsPrices.country } returns "Mexico"
        every { cityWithAverageMealsPrices.country } returns "Tunisia"
        every { cityWithMostExpensiveMealsPrices.country } returns "Jordan"

        every { cityWithNullMealsPrices.country } returns "USA"
        every { cityWithNegativeMealsPrices.country } returns "Canada"

        every {
            dataSource.getAllCitiesData()
        } returns listOf(
            cityWithCheapestMealsPrices,
            cityWithAverageMealsPrices,
            cityWithMostExpensiveMealsPrices,
            cityWithNullMealsPrices,
            cityWithNegativeMealsPrices
        )

        //when find the city from valid area and price
        averageCityInteractor = GetCityThatHasAverageMealsPricesInteractor(dataSource)
        val actualResult = averageCityInteractor.execute()
        // then
        assertEquals(cityWithCheapestMealsPrices, actualResult)

    }

    @Test
    fun should_ReturnTheValidCity_When_TheCitiesListContainsSingleValidCity() {
        // given a list of cities from worldwide and a single valid city in (Canada,Mexico,USA) all with valid prices

        every { cityWithCheapestMealsPrices.country } returns "India"
        every { cityWithAverageMealsPrices.country } returns "Palestine"
        every { cityWithMostExpensiveMealsPrices.country } returns "Canada"

        every {
            dataSource.getAllCitiesData()
        } returns listOf(cityWithCheapestMealsPrices, cityWithAverageMealsPrices, cityWithMostExpensiveMealsPrices)

        //when find the only valid city, no matter how expensive it is
        averageCityInteractor = GetCityThatHasAverageMealsPricesInteractor(dataSource)
        val actualResult = averageCityInteractor.execute()
        // then
        assertEquals(cityWithMostExpensiveMealsPrices, actualResult)

    }

    @Test
    fun should_ReturnNull_When_TheCitiesListAllFromValidAreaWithNullPrices() {
        // given a list of a single city from usa with null prices
        every { cityWithNullMealsPrices.country } returns "USA"
        every {
            dataSource.getAllCitiesData()
        } returns listOf(cityWithNullMealsPrices)

        //when checking the meals prices
        averageCityInteractor = GetCityThatHasAverageMealsPricesInteractor(dataSource)
        val actualResult = averageCityInteractor.execute()
        // then
        assertNull(actualResult)
    }

    @Test
    fun should_ReturnNull_When_TheCitiesListAllFromValidAreaWithNegativePrices() {
        // given a list of a single city from Mexico with null prices
        every { cityWithNegativeMealsPrices.country } returns "Mexico"
        every {
            dataSource.getAllCitiesData()
        } returns listOf(cityWithNegativeMealsPrices)

        //when find the city with average meals prices
        averageCityInteractor = GetCityThatHasAverageMealsPricesInteractor(dataSource)
        val actualResult = averageCityInteractor.execute()
        // then
        assertNull(actualResult)
    }
    @Test
    fun should_ReturnNull_When_TheCitiesListAllFromInvalidAreaWithValidPrices() {
        // given a list of cities from Japan, Palestine & Iraq with valid prices

        every { cityWithCheapestMealsPrices.country } returns "Japan"
        every { cityWithAverageMealsPrices.country } returns "Palestine"
        every { cityWithMostExpensiveMealsPrices.country } returns "Iraq"

        every {
            dataSource.getAllCitiesData()
        } returns listOf(cityWithCheapestMealsPrices, cityWithAverageMealsPrices, cityWithMostExpensiveMealsPrices)

        //when find the city with average meals prices
        averageCityInteractor = GetCityThatHasAverageMealsPricesInteractor(dataSource)
        val actualResult = averageCityInteractor.execute()
        // then
        assertNull(actualResult)

    }
    @Test
    fun should_ReturnNull_When_TheCitiesListAllFromInvalidAreaWithInvalidPrices() {
        // given a list of cities from Japan, Palestine & Iraq with negative & null prices

        every { cityWithNullMealsPrices.country } returns "Ukraine"
        every { cityWithNegativeMealsPrices.country } returns "Poland"

        every {
            dataSource.getAllCitiesData()
        } returns listOf(cityWithNullMealsPrices, cityWithNegativeMealsPrices)

        //when find the city with average meals prices
        averageCityInteractor = GetCityThatHasAverageMealsPricesInteractor(dataSource)
        val actualResult = averageCityInteractor.execute()
        // then
        assertNull(actualResult)

    }

    @Test
    fun should_ReturnNull_When_TheCitiesListIsEmpty() {
        // given an empty list
        every {
            dataSource.getAllCitiesData()
        } returns emptyList()
        //when find the city with average meals prices
        averageCityInteractor = GetCityThatHasAverageMealsPricesInteractor(dataSource)
        val actualResult = averageCityInteractor.execute()
        // then
        assertNull(actualResult)
    }


}