package interactor

import fakedata.GetCitiesNameSortedByBananaPriceFakeData
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GetCitiesNameSortedByBananaPriceKtTest {
    private val fakeData by lazy {
        GetCitiesNameSortedByBananaPriceFakeData
    }
    private val interactor by lazy { GetCitiesNameSortedByBananaPrice() }


    @Test
    fun `should return empty list when invoked with empty data`() {
        //given no cities data
        val emptyCities = fakeData.emptyCities.getAllCitiesData().toTypedArray()
        //when getCitiesNameSortedByBananaPrice invoked with this data
        val citiesSortedByBananaPrice1 = interactor.getCitiesNameSortedByBananaPrice(*emptyCities)
        val citiesSortedByBananaPrice2 = interactor.getCitiesNameSortedByBananaPrice()
        // then it returns empty list
        assertTrue((citiesSortedByBananaPrice1 + citiesSortedByBananaPrice2).isEmpty())
    }

    @Test
    fun `should return empty list when invoked with invalid data`() {
        //given invalid cities data
        val invalidCities = fakeData.extremeLowQualityCities.getAllCitiesData().toTypedArray()
        //when getCitiesNameSortedByBananaPrice invoked with this data
        val citiesSortedByBananaPrice = interactor.getCitiesNameSortedByBananaPrice(*invalidCities)
        // then it returns empty list
        assertTrue(citiesSortedByBananaPrice.isEmpty())
    }

    @Test
    fun `should return list of city names ordered by banana price when invoked valid data`() {
        //given invalid cities data
        val validCities = fakeData.highQualityCities.getAllCitiesData().toTypedArray()
        //when getCitiesNameSortedByBananaPrice invoked with this data
        val citiesSortedByBananaPrice = interactor.getCitiesNameSortedByBananaPrice(*validCities)
        // then it returns list of correct sorted string
        val citiesName =
            listOf("high quality city in usa", "high quality city in mexico", "high quality city in canada")

        assertEquals(citiesName, citiesSortedByBananaPrice)
    }

}