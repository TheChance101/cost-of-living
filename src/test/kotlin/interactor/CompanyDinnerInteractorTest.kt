package interactor

import fakedata.CompanyDinnerFakeData
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CompanyDinnerInteractorTest {
    private lateinit var fakeData: CompanyDinnerFakeData

    @BeforeAll
    fun setUp() {
        fakeData = CompanyDinnerFakeData
    }

    @Test
    fun `should return country in north america when given any cities `() {
        //given interactor with cities out of north america
        val outOfAmericaInteractor =
            CompanyDinnerInteractor(fakeData.outsideAndInsideAmericaCities)
        //when execute function is called
        val executeOnOutOfAmerica = outOfAmericaInteractor.execute()?.country
        //then the returned value is null or city inside north america

        assertTrue(
            executeOnOutOfAmerica == null || executeOnOutOfAmerica.lowercase() in listOf(
                "usa",
                "canada",
                "mexico"
            )
        )
    }

    @Test
    fun `should return null when invalid data`() {
        //given interactor with empty cities or cities with no meals data
        val emptyCitiesInteractor = CompanyDinnerInteractor(fakeData.emptyCities)
        val extremeCitiesInteractor = CompanyDinnerInteractor(fakeData.extremeLowQualityCities)
        //when execute function is called
        val executeOnEmptyCities = emptyCitiesInteractor.execute()
        val executeOnExtremeCities = extremeCitiesInteractor.execute()
        //then the returned value is null
        assertNull(executeOnEmptyCities)
        assertNull(executeOnExtremeCities)
    }

    @Test
    fun `should return city with most approx value when valid data`() {
        //given interactor with valid cities
        val allCitiesData = CompanyDinnerInteractor(fakeData.allCities)
        val highQualityCities = CompanyDinnerInteractor(fakeData.highQualityCities)
        val lowQualityCitiesInteractor = CompanyDinnerInteractor(fakeData.lowQualityCities)
        //when execute function is called
        val executeOnAllCities = allCitiesData.execute()
        val executeOnHighQualityCities = highQualityCities.execute()
        val executeOnLowQualityData = lowQualityCitiesInteractor.execute()
        //then it returns city with a price which is the closest to  (min(prices)+max(prices))/2
        assertEquals(fakeData.cityLowQuality2, executeOnAllCities)
        assertEquals(fakeData.cityHighQuality2, executeOnHighQualityCities)
        assertEquals(fakeData.cityLowQuality2, executeOnLowQualityData)

    }

    @Test
    fun `should return city with exact price when available`() {
        //given interactor with valid cities
        val allCitiesData = CompanyDinnerInteractor(fakeData.allCities)
        //when execute function is called with boundary = 0 on data contains the exact price
        val executeOnAllCities = allCitiesData.execute(0f)
        //then it returns city with a price equal to  (min(prices)+max(prices))/2
        assertEquals(fakeData.cityLowQuality2, executeOnAllCities)

    }

    @Test
    fun `should return null when there is no exact price`() {
        //given interactor with valid cities
        val highQualityCities = CompanyDinnerInteractor(fakeData.highQualityCities)
        //when execute function is called with boundary = 0 on data doesn't contain the exact price
        val executeOnHighQualityCities = highQualityCities.execute(0f)
        //then it returns null
        assertEquals(null, executeOnHighQualityCities)

    }

}

