package interactor

import model.*
import org.junit.jupiter.api.*
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopFiveCitesNameInClothesFromFamousBrandsInteractorTest {
    private lateinit var topFiveCitesNameInClothesFromFamousBrandsInteractor: GetTopFiveCitesNameInClothesFromFamousBrandsInteractor

    @BeforeAll
    fun setUp() {
        val fakedata = FakeDataSourceForFashionTask()
        topFiveCitesNameInClothesFromFamousBrandsInteractor =
            GetTopFiveCitesNameInClothesFromFamousBrandsInteractor(fakedata)
    }

    @Test
    fun shouldTheListSizebe5() {
//when
        val result = topFiveCitesNameInClothesFromFamousBrandsInteractor.execute()
//then
        assertEquals(5, result.size)
    }


    @Test
    fun shouldReturnCorrectFiveTopCitiesWheninputisCorrect() {

        //given
        val topCiteNames = listOf("city11", "city12", "city23", "city24", "city47")

        //when
        val actualValue = topFiveCitesNameInClothesFromFamousBrandsInteractor.execute()


        //then
        assertEquals(topCiteNames, actualValue)

    }

    @Test
    fun shouldReturnCorrectavgWhenifunAvgPriceCorrect() {


        //given
        val clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 170f,
            oneSummerDressInAChainStoreZaraHAndM = 350f,
            onePairOfNikeRunningShoesMidRange = 180f,
            onePairOfMenLeatherBusinessShoes = 200f
        )
        //when
        val avg = avgPrice(
            clothesPrices
        )

        //then

        assertEquals(225f, avg)
    }

    @Test
    fun returnFalseWhenCitiesVaveMissingClothesPrices() {
        //given


        val clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = null,
            oneSummerDressInAChainStoreZaraHAndM = 350f,
            onePairOfNikeRunningShoesMidRange = null,
            onePairOfMenLeatherBusinessShoes = 200f
        )
         //when
        val result = topFiveCitesNameInClothesFromFamousBrandsInteractor.excludeNullClothesPrices(clothesPrices)
        //then
        assertFalse { result }
    }

    @Test
    fun returnNullWhenCitiesVaveMissingClothesPrices() {
        //given
        val clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 170f,
            oneSummerDressInAChainStoreZaraHAndM = 350f,
            onePairOfNikeRunningShoesMidRange = 180f,
            onePairOfMenLeatherBusinessShoes = 200f
        )
        // when
        val result = topFiveCitesNameInClothesFromFamousBrandsInteractor.excludeNullClothesPrices(clothesPrices)
        //then
        assertTrue { result }
    }


}











