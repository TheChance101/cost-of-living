package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach

class GetCityMatchManagerExpectationsInteractorTest {

    private lateinit var interactor: GetCityMatchManagerExpectationsInteractor
    private lateinit var dataSource: FakeDataSource

    @BeforeEach
    fun setup() {
        dataSource = FakeDataSource()
        interactor = GetCityMatchManagerExpectationsInteractor(dataSource)
    }

    @Test
    fun execute() {
    }
}