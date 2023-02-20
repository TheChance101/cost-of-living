package interactor

import dataSource.utils.FakeDataSource
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestTaxesByCountryTest {

    lateinit var getHighestTaxesByCountry : GetHighestTaxesByCountry
    lateinit var fakeDataSource : FakeDataSource

    @BeforeAll
    fun setUp() {
        fakeDataSource = FakeDataSource()
        getHighestTaxesByCountry =
            GetHighestTaxesByCountry(fakeDataSource)

    }


    @Test
    fun should_ReturnCorrectList_When_TheDataIsValid() {
        // when the result is correct list
        val result = getHighestTaxesByCountry.execute()
        // then check
        val expected : List<Pair<String, Float>> =
            listOf(("Canada" to 2.16f), ("United States" to 2.12f), ("Mexico" to 0.71f), ("Iraq" to 0.34f))
        assertEquals(expected, result)
    }


}