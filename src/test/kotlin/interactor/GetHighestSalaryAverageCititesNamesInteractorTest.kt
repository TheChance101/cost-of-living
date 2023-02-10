package interactor

import FakeDataSource
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestSalaryAverageCititesNamesInteractorTest {

    private lateinit var fakeData: FakeDataSource
    private lateinit var GetHighestSalaryAverageCititesNames: GetHighestSalaryAverageCititesNamesInteractor

    @BeforeEach
    fun setUp() {
        fakeData = FakeDataSource()
        GetHighestSalaryAverageCititesNames = GetHighestSalaryAverageCititesNamesInteractor(fakeData)
    }

    @Test
    fun execute() {
    }
}