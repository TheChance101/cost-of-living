package interactor

import fakeDataSource.FakeDataSource
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractorTest {

    private lateinit var getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor: GetTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor


    @BeforeEach
    fun setUp() {
        val dataSource = FakeDataSource()
        getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor = GetTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor(dataSource)
    }

    @Test
    fun execute() {

    }
}