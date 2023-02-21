package interactor

import fakeDataSource.FakeDataSourceForFashionTask
import model.*
import org.junit.jupiter.api.*
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopCitesNameInFshionTaskInteractorTest {
    private lateinit var topCitesNameInFashionTaskInteractor: GetTopCitesNameInFashionTaskInteractor


    @BeforeAll
    fun setUp() {
        val fakedata = FakeDataSourceForFashionTask()
        topCitesNameInFashionTaskInteractor = GetTopCitesNameInFashionTaskInteractor(fakedata)
    }

    @Test
    fun should_ReturnTrue_When_TheListSizeEqualsLimit() {
        //given
        val limit = 5
        //when
        val result = topCitesNameInFashionTaskInteractor.execute(limit).size == limit
        //then
        assertTrue(result)
    }


    @Test
    fun should_ReturnTopFiveCities_When_InputIsCorrect() {
        //given
        val topCiteNames = listOf("city11", "city12", "city23", "city24", "city47")
        val limit = 5
        //when
        val actualValue = topCitesNameInFashionTaskInteractor.execute(limit)
        //then
        assertEquals(topCiteNames, actualValue)
    }

    @Test
    fun should_ReturnCorrectAverage_When_AveragePriceIsCorrect() {
        //given
        val clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 170f,
            oneSummerDressInAChainStoreZaraHAndM = 350f,
            onePairOfNikeRunningShoesMidRange = 180f,
            onePairOfMenLeatherBusinessShoes = 200f
        )
        //when
        val average = averagePrice(
            clothesPrices
        )
        //then
        assertEquals(225f, average)
    }

    @Test
    fun should_ReturnFalse_When_ClothesPriceDataIsMissing() {
        //given
        val clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = null,
            oneSummerDressInAChainStoreZaraHAndM = 350f,
            onePairOfNikeRunningShoesMidRange = null,
            onePairOfMenLeatherBusinessShoes = 200f
        )
        //when
        val result = excludeNullClothesPrices(clothesPrices)
        //then
        assertFalse { result }
    }

    @Test
    fun should_ReturnTrue_When_ClothesPriceDataIsComplete() {
        //given
        val clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 170f,
            oneSummerDressInAChainStoreZaraHAndM = 350f,
            onePairOfNikeRunningShoesMidRange = 180f,
            onePairOfMenLeatherBusinessShoes = 200f
        )
        // when
        val result = excludeNullClothesPrices(clothesPrices)
        //then
        assertTrue { result }
    }
}











