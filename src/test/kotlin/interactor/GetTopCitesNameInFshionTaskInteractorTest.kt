package interactor

import fakeDataSource.FakeDataSourceForFashionTask
import model.*
import org.junit.jupiter.api.*
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopCitesNameInFshionTaskInteractorTest {
    private lateinit var topCitesNameInFashionTaskInteractor: GetTopCitesNameInFashionTaskInteractor
    @BeforeAll
    fun setUp() {
        val fakedata = FakeDataSourceForFashionTask()
        topCitesNameInFashionTaskInteractor =
            GetTopCitesNameInFashionTaskInteractor(fakedata)
    }

    @Test
    fun should_returnFive_when_theListSizeIsFive() {
        //given
        //when
        val result = topCitesNameInFashionTaskInteractor.execute().size

        //then
        assertEquals(5, result)
    }


    @Test
    fun should_returnTopFiveCities_when_inputIsCorrect() {

        //given

        val topCiteNames = listOf("city11", "city12", "city23", "city24", "city47")

        //when
        val actualValue = topCitesNameInFashionTaskInteractor.execute()


        //then
        assertEquals(topCiteNames, actualValue)

    }

    @Test
    fun should_returnCorrectAverage_when_averagePriceIsCorrect() {
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
    fun should_returnFalse_When_ClothesPriceDataIsMissing() {
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
    fun should_returnTrue_When_ClothesPriceDataIsComplete() {
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











