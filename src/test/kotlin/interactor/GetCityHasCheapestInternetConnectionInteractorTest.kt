package interactor
import FakeDataSource

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.mockito.Mockito

class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var fakeDataSource: FakeDataSource
    private lateinit var interactor: GetCitiesAndYearsToBuyApartmentInteractor


    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeDataSource()
        dataSource = Mockito.mock(CostOfLivingDataSource::class.java)
        interactor = GetCitiesAndYearsToBuyApartmentInteractor(fakeDataSource)
    }


    @Test
    fun execute_should_return_top10_cities_based_on_alculated_years_needed_to_buy_apartment() {
        //Give
        val expectedResult = listOf(
            Pair("Asheville", "1 year"),
            Pair("Hyderabad City", "10 year"),
            Pair("Giza", "11 year"),
            Pair("Alexandria", "12 year"),
        )

        //When
        Mockito.`when`(dataSource.getAllCitiesData()).thenReturn(fakeDataSource.getAllCitiesData())
        val actualResult = interactor.execute(4)

        //Then
        assertEquals( expectedResult , actualResult)
    }

    @Test
    fun execute_should_exclude_when_cities_is_null() {
        //Give
        val expectedResult = listOf(
            Pair("Hyderabad City", "10 year"),
            Pair("Giza", "11 year"),
            Pair("Alexandria", "12 year"),
            Pair("Multan", "13 year"),
        )

        //When
        Mockito.`when`(dataSource.getAllCitiesData()).thenReturn(fakeDataSource.getAllCitiesData())
        val actualResult = interactor.execute(4)

        //Then
        assertEquals( expectedResult , actualResult)

    }
    @Test
    fun execute_should_exclude_when_salary_is_null() {
        //Give
        val expectedResult = listOf(
            Pair("Hyderabad City", "10 year"),
            Pair("Giza", "11 year"),
            Pair("Alexandria", "12 year"),
            Pair("Multan", "13 year"),
        )

        //When
        Mockito.`when`(dataSource.getAllCitiesData()).thenReturn(fakeDataSource.getAllCitiesData())
        val actualResult = interactor.execute(4)

        //Then
        assertEquals( expectedResult , actualResult)

    }

    @Test
    fun execute_should_exclude_when_prices_per_squareMeter_is_null() {
        //Give
        val expectedResult = listOf(
            Pair("Hyderabad City", "10 year"),
            Pair("Giza", "11 year"),
            Pair("Alexandria", "12 year"),
            Pair("Multan", "13 year"),
        )

        //When
        Mockito.`when`(dataSource.getAllCitiesData()).thenReturn(fakeDataSource.getAllCitiesData())
        val actualResult = interactor.execute(4)

        //Then
        assertEquals( expectedResult , actualResult)

    }

    @Test
    fun execute_should_exclude_when_low_quality_data() {
        //Give
        val expectedResult = listOf(
            Pair("Hyderabad City", "10 year"),
            Pair("Giza", "11 year"),
            Pair("Alexandria", "12 year"),
            Pair("Multan", "13 year"),
        )

        //When
        Mockito.`when`(dataSource.getAllCitiesData()).thenReturn(fakeDataSource.getAllCitiesData())
        val actualResult = interactor.execute(4)

        //Then
        assertEquals( expectedResult , actualResult)

    }
}