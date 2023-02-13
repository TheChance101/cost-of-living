package interactor

import fakeDataSource.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll

class GetAverageSalariesInCountryInteractorTest {

    lateinit var getAverageSalariesInCountryInteractor: GetAverageSalariesInCountryInteractor

    @BeforeAll
    fun setUp() {
        var fake = FakeDataSource()
        getAverageSalariesInCountryInteractor = GetAverageSalariesInCountryInteractor(fake)
    }
}