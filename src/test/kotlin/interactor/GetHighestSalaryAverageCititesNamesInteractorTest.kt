package interactor

import FakeDataSource
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestSalaryAverageCititesNamesInteractorTest {

    private lateinit var fakeDataSource: FakeDataSource
    private lateinit var getHighestSalaryAverageCititesNames : GetHighestSalaryAverageCititesNamesInteractor

    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeDataSource()
        getHighestSalaryAverageCititesNames = GetHighestSalaryAverageCititesNamesInteractor(fakeDataSource)
    }

    @Test
    fun execute() {
    }
}