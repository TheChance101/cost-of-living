package interactor

import dataSource.utils.FakeDataSource
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TopTenCountriesTaxesTest {

    lateinit var TopTenCountriesTaxes: TopTenCountriesTaxes
    lateinit var fakeDataSource: FakeDataSource

    @BeforeAll
    fun setUp() {
        fakeDataSource = FakeDataSource()
        TopTenCountriesTaxes =
            TopTenCountriesTaxes(fakeDataSource)
    }


}