package interactor

import fakeDataSource.FakeDataSource
import model.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestSalaryAverageCititesNamesInteractorTest {

    lateinit var getHighestSalaryAverageCititesNamesInteractor: GetHighestSalaryAverageCititesNamesInteractor

    @BeforeAll
    fun setUp() {
        getHighestSalaryAverageCititesNamesInteractor = GetHighestSalaryAverageCititesNamesInteractor(object :
            FakeDataSource() {
        })
    }

    @Test
    fun executeTestOnSalaryAverage() {
        //given
        // list of ({egypt,cairo,18}-{Koura,solue,25}-{USA,LA,15})

        //when
        val expected = listOf("Solue","Cairo")

        //then
        assertEquals(expected,getHighestSalaryAverageCititesNamesInteractor.execute(2))


    }
}