package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.function.Executable
import utils.Constants

class GetCityMatchManagerExpectationsInteractorTest {

    private lateinit var interactor: GetCityMatchManagerExpectationsInteractor
    private lateinit var dataSource: FakeDataSource


    @BeforeEach
    fun setup() {
        dataSource = FakeDataSource()
        interactor = GetCityMatchManagerExpectationsInteractor(dataSource)
    }


    @Test
    fun `should throw exception when country is not in one of north america countries`() {
        // when we check if it is one of the required countries
        val actual = Executable { interactor.execute() }
        val expected = Exception::class.java

        // then we should assert exception
        assertThrows(expected, actual)
    }


}