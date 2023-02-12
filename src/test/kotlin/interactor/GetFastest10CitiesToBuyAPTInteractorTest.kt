package interactor

import model.*
import model.DrinksPrices
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetFastest10CitiesToBuyAPTInteractorTest {
    @Test
    fun `should avoid low quality`() {
        //given
        val fastestCitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(getLowQualityCities())

        //when
        val result = fastestCitiesToBuyAPT.execute()

        //then
        assertTrue(result.isEmpty())

    }

    @Test
    fun `should avoid missing price per square meter outside centre`() {
        //given
        val fastestCitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(getMissingPricePerSquareMeterOutsideCentre())
        //when
        val result = fastestCitiesToBuyAPT.execute()
        //then
        assertTrue(result.isEmpty())

    }

    // should skip
    @Test
    fun `should avoid missing salary`() {
        //given
        val fastestCitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(getMissingSalary())
        //when
        val result = fastestCitiesToBuyAPT.execute()
        //then
        assertTrue(result.isEmpty())

    }

    @Test
    fun `list size should be 10`() {

        val fastest10CitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(getAcceptable11Element())
        //when
        val result = fastest10CitiesToBuyAPT.execute()
        //then
        assertEquals(10, result.size)

    }

    @Test
    fun `should return correct data`() {
        //given
        val fastest10CitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(getVariousData())
        val expectedList = listOf(
            Pair("City11", 43.47826086956522),
            Pair("City12", 44.87179487179487),
            Pair("City13", 46.51162790697674),
            Pair("City14", 47.36842105263158),
            Pair("City15", 100.0),
            Pair("City16", 100.0),
            Pair("City17", 120.0),
            Pair("City18", 225.0),
            Pair("City19", 250.0),
            Pair("City20", 300.0)
        )
        //when
        val result = fastest10CitiesToBuyAPT.execute()

        //then
        assertEquals(expectedList, result)
    }

}