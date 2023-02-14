package interactor

import fakedata.GetCitiesNameSortedFakeData
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GetCitiesNameSortedByBananaPriceKtTest{
    private val fakeData by lazy{
        GetCitiesNameSortedFakeData
    }

    @Test
    fun `should return empty list when invoked with empty data`(){
        //given no cities data
        val emptyCities=fakeData.emptyCities.getAllCitiesData().toTypedArray()
        //when getCitiesNameSortedByBananaPrice invoked with this data
        val citiesSortedByBananaPrice1 = getCitiesNameSortedByBananaPrice(*emptyCities)
        val citiesSortedByBananaPrice2 = getCitiesNameSortedByBananaPrice()
        // then it returns empty list
        assertTrue((citiesSortedByBananaPrice1+citiesSortedByBananaPrice2).isEmpty())
    }
    @Test
    fun `should return empty list when invoked with invalid data`(){
        //given invalid cities data
        val emptyCities=fakeData.extremeLowQualityCities.getAllCitiesData().toTypedArray()
        //when getCitiesNameSortedByBananaPrice invoked with this data
        val citiesSortedByBananaPrice = getCitiesNameSortedByBananaPrice(*emptyCities)
        // then it returns empty list
        assertTrue(citiesSortedByBananaPrice.isEmpty())
    }

}