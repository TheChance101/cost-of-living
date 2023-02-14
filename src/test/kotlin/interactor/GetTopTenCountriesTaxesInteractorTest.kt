package interactor

import data.FakeDataSource
import data.TestCase
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopTenCountriesTaxesInteractorTest {

    private lateinit var getTopTenCountriesTaxesInteractor : GetTopTenCountriesTaxesInteractor
    private lateinit var fakeData : FakeDataSource

    @BeforeAll
    fun setUp() {
        fakeData = FakeDataSource()
        getTopTenCountriesTaxesInteractor =
            GetTopTenCountriesTaxesInteractor(fakeData)
        fakeData.changeDataSource(TestCase.CountriesTaxes)

    }


    @Test
    fun should_ReturnCorrectList_When_TheDataIsValid() {
        // when the result is correct list
        val result = getTopTenCountriesTaxesInteractor.execute()
        // then check
        val expected : List<Pair<String, Float>> =
            listOf(("Canada" to 2.16f), ("United States" to 2.12f), ("Mexico" to 0.71f), ("Iraq" to 0.34f))
        assertEquals(expected, result)
    }


}