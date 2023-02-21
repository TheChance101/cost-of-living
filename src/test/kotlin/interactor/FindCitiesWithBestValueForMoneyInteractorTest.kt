package interactor

import dataSource.*
import kotlin.test.Test
import kotlin.test.assertEquals

class FindCitiesWithBestValueForMoneyInteractorTest {


    @Test
    fun `should return cities with best value for money`() {
        // GIVEN List High Quality Data ( listOf(cityI, cityII, cityIII) )
        val dataSource = FakeHighQualityDataOfCityWithBestValueForMoney()
        val interactor = FindCitiesWithBestValueForMoneyInteractor(dataSource)

        // WHEN
        val result = interactor.execute(3)

        // THEN
        assertEquals(result, listOf(cityII, cityI, cityIII))

    }

    @Test
    fun `should exclude cities with null values and return empty list if all data have null`() {
        // GIVEN list of missing data ( listOf(cityIV, cityV) )
        val dataSource = FakeNullsDataOfCityWithBestValueForMoney()
        val interactor = FindCitiesWithBestValueForMoneyInteractor(dataSource)

        // WHEN
        val result = interactor.execute(2)

        // THEN
        assertEquals(emptyList(), result)
    }

    @Test
    fun `should exclude duplicate cities`() {
        // GIVEN List of cityIV,cityI with the same values ( listOf(cityI, cityIV) )
        val dataSource = FakeDuplicateDataOfCityWithBestValueForMoney()
        val interactor = FindCitiesWithBestValueForMoneyInteractor(dataSource)

        // WHEN
        val result = interactor.execute(3)

        // THEN filter out the duplicate
        assertEquals(result, listOf(cityI))

    }

    @Test
    fun `should exclude low quality cities`() {
        // GIVEN List of Two City Entities Fake Date cityI with true quality data and the false one is cityVII ( listOf(cityVII, cityI) )
        val dataSource = FakeLowQualityDataOfCityWithBestValueForMoney()
        val interactor = FindCitiesWithBestValueForMoneyInteractor(dataSource)

        // WHEN
        val result = interactor.execute(3)

        // THEN cityVII filter Out
        assertEquals(result, listOf(cityI))
    }


}