package interactor

import model.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCheapestApartmentsCitiesNamesInteractorTest {

    private lateinit var fakeData: FakeDataSource

    @BeforeAll
    fun init() {
        fakeData = FakeDataSource()
    }

    @Test
    fun execute() {
    }
}