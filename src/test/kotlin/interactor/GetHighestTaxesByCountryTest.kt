package interactor

import data.CountriesTaxesFakeData
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestTaxesByCountryTest {

    lateinit var getHighestTaxesByCountry : GetHighestTaxesByCountry
    lateinit var fakeDataSource : CountriesTaxesFakeData

    @BeforeAll
    fun setUp() {
        fakeDataSource = CountriesTaxesFakeData()
        getHighestTaxesByCountry =
            GetHighestTaxesByCountry(fakeDataSource)

    }


    @Test
    fun `should return correct list when the data is valid`() {
        // when the result is correct list
        val result = getHighestTaxesByCountry(10)
        // then check
        val expected : List<Pair<String, Float>> =
            listOf(("Canada" to 2.16f), ("United States" to 2.12f), ("Mexico" to 0.71f), ("Iraq" to 0.34f))
        assertEquals(expected, result)
    }



    @Test
    fun `should throw exception when the data is inValid`() {

        // when the result is correct list
        val result = getHighestTaxesByCountry(10)
        // then check
        val expected : List<Pair<String, Float>> =
            listOf(("Canada" to 2.16f), ("United States" to 2.12f), ("Mexico" to 0.71f), ("Iraq" to 0.34f))
        assertEquals(expected, result)
    }

}