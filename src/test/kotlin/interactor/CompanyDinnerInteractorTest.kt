package interactor

import fakeData.CompanyDinnerFakeData
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
    fun `should return null when invalid data`() {
        assertNull(CompanyDinnerInteractor(fakeData.allCities).execute())
    }
    @Test
    fun `should return city with most approx value when valid data`() {
        assertEquals(fakeData.cityLowQuality2,CompanyDinnerInteractor(fakeData.allCities).execute())

    }

}

