package interactor

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import model.CityEntity
import model.ClothesPrices
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import org.junit.jupiter.api.Assertions.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.junit5.JUnit5Asserter.assertEquals
import kotlin.test.junit5.JUnit5Asserter.assertNull

/**
 * @author: Bilal Alkhatib
 * @see: should_ReturnTopFiveFashionCities_When_TheListNotEmptyAndNotNullAndTheAttributesNotNull() and
 *       should_ThrowException_When_TheActualCitiesListIsEmpty() ...
 *
 *       the require() function: is used to perform a check on a condition and
 *       throw an exception if the condition is not met
 * */

internal class GetTopFiveFashionCitiesInteractTest {

    private lateinit var topFashionCities: GetTopFiveFashionCitiesInteractor

    @MockK
    private lateinit var dataSource: CostOfLivingDataSource

    @MockK
    private lateinit var gaza: CityEntity
    @MockK
    private lateinit var paris: CityEntity
    @MockK
    private lateinit var milan: CityEntity
    @MockK
    private lateinit var cairo: CityEntity


    init {
        MockKAnnotations.init(this)
        dataSource = mockk()

        every { gaza.cityName} returns "Gaza"
        every { gaza.clothesPrices } returns ClothesPrices(100f,
            100f,
            100f,
            100f)


        every { cairo.cityName } returns "Cairo"
        every { cairo.clothesPrices } returns ClothesPrices(90f,
            90f,
            90f,
            90f)


        every { paris.cityName } returns "Paris"
        every { paris.clothesPrices } returns ClothesPrices(80f,
            80f,
            80f,
            80f)

        every { milan.cityName } returns "Milan"
        every { milan.clothesPrices } returns ClothesPrices(5f,
            5f,
            5f,
            5f)

    }

    @Test
    fun should_ReturnTopFiveFashionCities_When_TheListNotEmptyAndNotNullAndTheAttributesNotNull() {
        // given
        val interactor = GetTopFiveFashionCitiesInteractor(dataSource)
        val citiesList = listOf( gaza,cairo, paris, milan )
        every { dataSource.getAllCitiesData() } returns citiesList

        // when
        val topFiveFashionCities = interactor.execute(3)

        // then
        val expectedCities = listOf("Gaza", "Cairo", "Paris")
        assertEquals(expectedCities, topFiveFashionCities)
    }

    @Test
    fun should_ThrowException_When_TheActualCitiesListIsEmpty(){
        //given empty cities list
        every { dataSource.getAllCitiesData() } returns emptyList()

        //when  the cities list is empty
        topFashionCities = GetTopFiveFashionCitiesInteractor(dataSource)

        // when
        val divideExecutable = Executable { topFashionCities.execute(5) }

        // then
        assertThrows(Exception::class.java, divideExecutable, "The cities list is empty")
    }

    @Test
    fun should_ThrowException_When_TheActualDataIsNull2() {
        // given null cities list
        every { dataSource.getAllCitiesData() } returns listOf()

        //when  the actual data is null
        val divideExecutable = Executable {
            require(GetTopFiveFashionCitiesInteractor(dataSource) == null) { "The cities list is null" }
        }

        // then
        assertThrows(Exception::class.java, divideExecutable, "The cities list is null")
    }

    @Test
    fun should_ReturnEmptyList_When_HaveLimitValueZero() {
        // given
        val limit = 0

        every { dataSource.getAllCitiesData() } returns listOf(gaza)
        val interactor = GetTopFiveFashionCitiesInteractor(dataSource)

        // when
        val topFashionCities = interactor.execute(limit)

        // then
        assertEquals(emptyList(), topFashionCities)
    }

    @Test
    fun should_ThrowException_When_HaveLimitValueNegative() {
        // given
        val limit = -1
        every { dataSource.getAllCitiesData() } returns emptyList()
        val interactor = GetTopFiveFashionCitiesInteractor(dataSource)

        // when-then
        assertThrows<Exception> { interactor.execute(limit) }
    }



}



