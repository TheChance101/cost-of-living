package interactor

import dataSource.utils.FakeDataSource
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopTenCountriesTaxesInteractorTest {

    lateinit var getTopTenCountriesTaxesInteractor : GetTopTenCountriesTaxesInteractor
    lateinit var fakeDataSource : FakeDataSource

    @BeforeAll
    fun setUp() {
        fakeDataSource = FakeDataSource()
        getTopTenCountriesTaxesInteractor =
            GetTopTenCountriesTaxesInteractor(fakeDataSource)

    }


    @Test
    fun should_ReturnCorrect_When_drinksPrices() {

        // given
        val expected : List<Pair<String, Float>> =
            listOf(("Canada" to 2.16f), ("United States" to 2.12f), ("Mexico" to 0.71f), ("Iraq" to 0.34f))


        // when
        val result = getTopTenCountriesTaxesInteractor.execute()

        // then
        assertEquals(expected, result)
    }


}