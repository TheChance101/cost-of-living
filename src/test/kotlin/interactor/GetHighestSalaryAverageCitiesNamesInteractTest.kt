package interactor

import FakeData
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestSalaryAverageCitiesNamesInteractTest {

    private lateinit var getHighestSalaryAverageCititesNames: GetHighestSalaryAverageCititesNamesInteractor
    private lateinit var fakeData: FakeData


    @BeforeAll
    fun setUp() {
        fakeData = FakeData()
        getHighestSalaryAverageCititesNames = GetHighestSalaryAverageCititesNamesInteractor(fakeData)
    }

    @Test
    fun execute() {
    }
}