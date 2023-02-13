package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class GetCityMatchManagerExpectationsInteractorTest {

    /// TODO: uncomment this when completing the test
//    private lateinit var dataSource: FakeDataSource
    private lateinit var interactor: GetCityMatchManagerExpectationsInteractor

    /// TODO: remove this code when completing the test
    private lateinit var dataSource: CsvDataSource
    private lateinit var csvParser: CsvParser


    @BeforeEach
    fun setup() {
        /// TODO: remove this code when completing the test
        csvParser = CsvParser()
        dataSource = CsvDataSource(csvParser)

        interactor = GetCityMatchManagerExpectationsInteractor(dataSource)

        /// TODO: uncomment this when completing the test
//        dataSource = FakeDataSource()
    }

    @Test
    fun `should return true when country is in one of north america countries`() {
        // given a list of countries that are in north america
        val northAmericaCountries: List<String> =
            listOf(
                "United States",
                "Guatemala",
                "Belize",
                "El Salvador",
                "Honduras",
                "Nicaragua",
                "Costa Rica",
                "Panama",
                "Canada",
                "Mexico"
            )
        // when we check if the countries are in north america
        val result = interactor.execute(dataSource.getAllCitiesData())
        // then we should get true
        assertTrue(northAmericaCountries.contains(result))
    }
}