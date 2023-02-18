package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesNamesSortedCheapestBananaPricesTest {
    private lateinit var citiesSortedCheapestBananaPrices:GetCitiesNamesSortedCheapestBananaPrices
    private lateinit var fakeDataSource: FakeDataSource

    @BeforeEach
    fun setup(){
        citiesSortedCheapestBananaPrices = GetCitiesNamesSortedCheapestBananaPrices()
        fakeDataSource= FakeDataSource()
    }

    @Test
    fun `should return empty list when isn't given data`(){
        //given empty data

        //When execute the use case
        val actual=citiesSortedCheapestBananaPrices.execute()

        //then
        assertTrue(actual.isEmpty())
    }

    @Test
    fun `should return correct result when price city banana isn't null And high Quality Data`(){
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

        //then
        val expecte= listOf(
            fakeDataSource.getAllCitiesData()[18].cityName,
            fakeDataSource.getAllCitiesData()[19].cityName,
            fakeDataSource.getAllCitiesData()[17].cityName,
            fakeDataSource.getAllCitiesData()[15].cityName,
            fakeDataSource.getAllCitiesData()[16].cityName,
            fakeDataSource.getAllCitiesData()[14].cityName)
        assertEquals(expecte,actual)
    }

    @Test
    fun `should return empty list when city banana price is null and low quality data`(){
        //given cities to be sorted
        val cities = arrayOf(
            fakeDataSource.getAllCitiesData()[11],
            fakeDataSource.getAllCitiesData()[12])

        //When execute the use case
        val result=citiesSortedCheapestBananaPrices.execute(*cities)

        //then
        assertTrue(result.isEmpty())
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
        val result=citiesSortedCheapestBananaPrices.execute(*cities)

        //then
        val valueExpected= listOf(
            fakeDataSource.getAllCitiesData()[13].cityName,
            fakeDataSource.getAllCitiesData()[4].cityName,
            fakeDataSource.getAllCitiesData()[10].cityName)
        assertEquals(valueExpected,result)
    }

    @Test
    fun `should return correct result Exclude low quality data when data quality false`(){
        //Given cities to be sorted
        val cities = arrayOf(
            fakeDataSource.getAllCitiesData()[0],
            fakeDataSource.getAllCitiesData()[13],
            fakeDataSource.getAllCitiesData()[1],
            fakeDataSource.getAllCitiesData()[19],
            fakeDataSource.getAllCitiesData()[5],
            fakeDataSource.getAllCitiesData()[10])
        //When execute the use case
        val result=citiesSortedCheapestBananaPrices.execute(*cities)

        //then
        val valueExpected= listOf(
            fakeDataSource.getAllCitiesData()[19].cityName,
            fakeDataSource.getAllCitiesData()[13].cityName,
            fakeDataSource.getAllCitiesData()[10].cityName)
        assertEquals(valueExpected,result)
    }
}