package interactor

import dataSource.utils.CsvParser
import io.mockk.clearAllMocks
import io.mockk.unmockkAll
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll

class GetCityHasLowestYearsToBuyApartmentInteractorTest {
    private lateinit var sut :GetCityHasLowestYearsToBuyApartmentInteractor
    private val csvParser =CsvParser()

    @BeforeAll
    fun setUp(){
        clearAllMocks()
        unmockkAll()
       // sut = GetCityHasLowestYearsToBuyApartmentInteractor( )
    }
    @Test
    fun execute() {
    }
}