package interactor

import fakeDataSource.FakeDataSource
import model.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import org.junit.jupiter.api.BeforeEach

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestSalaryAverageCititesNamesInteractorTest {

    lateinit var getHighestSalaryAverageCititesNamesInteractor: GetHighestSalaryAverageCititesNamesInteractor

    @BeforeEach
    fun setUp() {
        var fake = FakeDataSource()
        getHighestSalaryAverageCititesNamesInteractor = GetHighestSalaryAverageCititesNamesInteractor(fake)
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

    @Test
    fun executeTestOnLowDataQuality() {
        //given
        // list of ({egypt,cairo,false}-{Koura,solue,true}-{USA,LA,true})

        //when
        val expected = listOf("Solue","LA")

        //then
        assertEquals(expected,getHighestSalaryAverageCititesNamesInteractor.execute(2))


    }
}
