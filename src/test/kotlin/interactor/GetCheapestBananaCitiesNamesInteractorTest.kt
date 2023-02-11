package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import io.mockk.clearAllMocks
import io.mockk.unmockkAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCheapestBananaCitiesNamesInteractorTest {

    private lateinit var interactor: GetCheapestBananaCitiesNamesInteractor
    private val csvParser = CsvParser()
    private val dataSource = CsvDataSource(csvParser)

    @BeforeAll
    fun setup() {
        clearAllMocks()
        unmockkAll()
        interactor = GetCheapestBananaCitiesNamesInteractor(dataSource)
    }

}