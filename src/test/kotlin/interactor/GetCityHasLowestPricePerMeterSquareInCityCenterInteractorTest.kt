package interactor

import fakedata.LowestPricePerMeterSquareInCityCenterFakeData
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasLowestPricePerMeterSquareInCityCenterInteractorTest {

    lateinit var fakeData: LowestPricePerMeterSquareInCityCenterFakeData

    @BeforeAll
    fun setup() {
        fakeData = LowestPricePerMeterSquareInCityCenterFakeData
    }

    @Test
    fun `should return null when given null data`() {
        //given data of null cases
        val getCityHasLowestPricePerMeterSquareInCityCenterInteractor =
            GetCityHasLowestPricePerMeterSquareInCityCenterInteractor(fakeData.fakeNullData)
        //when find city with the lowest price per meter square in city center
        val lowestPricePerMeterSquareCity = getCityHasLowestPricePerMeterSquareInCityCenterInteractor.execute()
        //then check null
        assertNull(lowestPricePerMeterSquareCity)
    }

    @Test
    fun `should return null when given empty data source`() {
        //given empty data source
        val getCityHasLowestPricePerMeterSquareInCityCenterInteractor =
            GetCityHasLowestPricePerMeterSquareInCityCenterInteractor(fakeData.emptyDataSource)
        //when find city with the lowest price per meter square in city center
        val lowestPricePerMeterSquareCity = getCityHasLowestPricePerMeterSquareInCityCenterInteractor.execute()
        //then check null
        assertNull(lowestPricePerMeterSquareCity)
    }

    @Test
    fun `should return null when given data with zero price`() {
        //given data with zero price only
        val getCityHasLowestPricePerMeterSquareInCityCenterInteractor =
            GetCityHasLowestPricePerMeterSquareInCityCenterInteractor(fakeData.fakeDataWithZeroPrice)
        //when find city with the lowest price per meter square in city center
        val lowestPricePerMeterSquareCity = getCityHasLowestPricePerMeterSquareInCityCenterInteractor.execute()
        //then check null
        assertNull(lowestPricePerMeterSquareCity)
    }

    @Test
    fun `should return null when given data with negative price`() {
        //given data with negative price only
        val getCityHasLowestPricePerMeterSquareInCityCenterInteractor =
            GetCityHasLowestPricePerMeterSquareInCityCenterInteractor(fakeData.fakeDataWithNegativePrice)
        //when find city with the lowest price per meter square in city center
        val lowestPricePerMeterSquareCity = getCityHasLowestPricePerMeterSquareInCityCenterInteractor.execute()
        //then check null
        assertNull(lowestPricePerMeterSquareCity)
    }

    @Test
    fun `should return correct city when given normal data`() {
        //given data of high quality, low quality, null , zero and negative cases
        val getCityHasLowestPricePerMeterSquareInCityCenterInteractor =
            GetCityHasLowestPricePerMeterSquareInCityCenterInteractor(fakeData.fakeNormalData)
        //when find city with the lowest price per meter square in city center
        val lowestPricePerMeterSquareCity = getCityHasLowestPricePerMeterSquareInCityCenterInteractor.execute()
        //then check the city
        assertEquals(fakeData.highQualityCase1, lowestPricePerMeterSquareCity)
    }

    @Test
    fun `should return correct city when given low quality data`() {
        //given low quality data
        val getCityHasLowestPricePerMeterSquareInCityCenterInteractor =
            GetCityHasLowestPricePerMeterSquareInCityCenterInteractor(fakeData.fakeLowQualityData)
        //when find city with the lowest price per meter square in city center
        val lowestPricePerMeterSquareCity = getCityHasLowestPricePerMeterSquareInCityCenterInteractor.execute()
        //then check the city
        assertEquals(fakeData.lowQualityCase1, lowestPricePerMeterSquareCity)
    }

    @Test
    fun `should return correct city when given data with duplicates`() {
        //given data with duplicates
        val getCityHasLowestPricePerMeterSquareInCityCenterInteractor =
            GetCityHasLowestPricePerMeterSquareInCityCenterInteractor(fakeData.fakeDataWithDuplicates)
        //when find city with the lowest price per meter square in city center
        val lowestPricePerMeterSquareCity = getCityHasLowestPricePerMeterSquareInCityCenterInteractor.execute()
        //then check the city
        assertEquals(fakeData.highQualityCase1, lowestPricePerMeterSquareCity)
    }


}