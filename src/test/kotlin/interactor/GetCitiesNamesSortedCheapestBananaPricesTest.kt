package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesNamesSortedCheapestBananaPricesTest {
    private lateinit var citiesSortedCheapestBananaPrices:GetCitiesNamesSortedCheapestBananaPrices
    private lateinit var fakeDataSource:CostOfLivingDataSource

    @BeforeEach
    fun setup(){
        citiesSortedCheapestBananaPrices = GetCitiesNamesSortedCheapestBananaPrices()
        fakeDataSource= FakeDataSource()
    }

    @Test
    fun `should return correct result when banana isn't null and high quality data`(){
        //given cities to be sorted
        val cities = arrayOf(
            fakeDataSource.getAllCitiesData()[14],
            fakeDataSource.getAllCitiesData()[15],
            fakeDataSource.getAllCitiesData()[16],
            fakeDataSource.getAllCitiesData()[17],
            fakeDataSource.getAllCitiesData()[18],
            fakeDataSource.getAllCitiesData()[19])

        //When execute the use case
        val actual=citiesSortedCheapestBananaPrices.execute(*cities)
        val expected= listOf(
            fakeDataSource.getAllCitiesData()[18].cityName,
            fakeDataSource.getAllCitiesData()[19].cityName,
            fakeDataSource.getAllCitiesData()[17].cityName,
            fakeDataSource.getAllCitiesData()[15].cityName,
            fakeDataSource.getAllCitiesData()[16].cityName,
            fakeDataSource.getAllCitiesData()[14].cityName)
        //then
        assertEquals(expected,actual)
    }

    @Test
    fun `should return correct result Exclude null banana prices city when some city banana price is null`(){
        //given cities to be sorted
        val cities = arrayOf(
            fakeDataSource.getAllCitiesData()[11],
            fakeDataSource.getAllCitiesData()[4],
            fakeDataSource.getAllCitiesData()[10],
            fakeDataSource.getAllCitiesData()[12],
            fakeDataSource.getAllCitiesData()[13])

        //When execute the use case
        val actual=citiesSortedCheapestBananaPrices.execute(*cities)
        val expected= listOf(
            fakeDataSource.getAllCitiesData()[13].cityName,
            fakeDataSource.getAllCitiesData()[4].cityName,
            fakeDataSource.getAllCitiesData()[10].cityName)

        //then
        assertEquals(expected,actual)
    }

    @Test
    fun `should return correct result Exclude low quality data when data quality false`(){
        //given cities to be sorted
        val cities = arrayOf(
            fakeDataSource.getAllCitiesData()[0],
            fakeDataSource.getAllCitiesData()[13],
            fakeDataSource.getAllCitiesData()[1],
            fakeDataSource.getAllCitiesData()[19],
            fakeDataSource.getAllCitiesData()[5],
            fakeDataSource.getAllCitiesData()[10])

        //When execute the use case
        val actual=citiesSortedCheapestBananaPrices.execute(*cities)
        val expected= listOf(
            fakeDataSource.getAllCitiesData()[19].cityName,
            fakeDataSource.getAllCitiesData()[13].cityName,
            fakeDataSource.getAllCitiesData()[10].cityName)

        //then
        assertEquals(expected,actual)
    }

    @Test
    fun `should return empty list when city banana price is null and low quality data`(){
        //given cities null banana price and low quality data
        val cities = arrayOf(
            fakeDataSource.getAllCitiesData()[11],
            fakeDataSource.getAllCitiesData()[12])

        //When execute the use case
        val expected =citiesSortedCheapestBananaPrices.execute(*cities)

        //then
        assertTrue(expected.isEmpty())
    }

    @Test
    fun `should throw exception when isn't given data`(){
        //When execute the use case
        val expected=Executable{ citiesSortedCheapestBananaPrices.execute() }

        //then
        assertThrows(NoSuchElementException::class.java,expected)
    }
}