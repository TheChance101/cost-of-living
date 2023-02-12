package interactor

import FakeData
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestSalaryAverageCititesNamesInteractorTest {

    private lateinit var fakeDataSource: FakeData
    private lateinit var getHighestSalaryAverageCititesNames : GetHighestSalaryAverageCititesNamesInteractor

    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeData()
        getHighestSalaryAverageCititesNames = GetHighestSalaryAverageCititesNamesInteractor(fakeDataSource)
    }

    @Test
    fun execute() {
    }
}