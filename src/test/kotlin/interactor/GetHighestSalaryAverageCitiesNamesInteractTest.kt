package interactor

import FakeData
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestSalaryAverageCitiesNamesInteractTest {

    private lateinit var fakeData: FakeData
    private lateinit var GetHighestSalaryAverageCititesNames: GetHighestSalaryAverageCititesNamesInteractor

    @BeforeEach
    fun setUp() {
        fakeData = FakeData()
        GetHighestSalaryAverageCititesNames = GetHighestSalaryAverageCititesNamesInteractor(fakeData)
    }

    @Test
    fun execute() {
    }
}