package interactor

import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import mockdata.MockCityEntity
import model.CityEntity
import model.ClothesPrices
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTopCitiesNameHasSuitableClothesPricesInteractorTest {

    private lateinit var interactor: GetTopCitiesNameHasSuitableClothesPricesInteractor
    private val mockData = mockk<CostOfLivingDataSource>()

    @BeforeAll
    fun setup() {
        unmockkAll()
        clearAllMocks()
        interactor = GetTopCitiesNameHasSuitableClothesPricesInteractor(mockData)
    }

    @Test
    fun `should throw exception when limit is zero`() {
        //Given empty List
        val limit = 0
        val citiesData = listOf<CityEntity>()
        //when
        every { mockData.getAllCitiesData() } returns (citiesData)
        val namesCityHasSuitableClothesPrices = Executable { interactor.execute(limit) }
        //then
        assertThrows(Exception::class.java, namesCityHasSuitableClothesPrices)
    }

    @Test
    fun `should throw exception when given on value in clothes prices is null`() {
        //Given list hasn't any type of onePairOfJeansLevis50oneOrSimilar
        val limit = 1
        val citiesData = listOf(
            MockCityEntity.createMockCity(
                "City 1",
                ClothesPrices(
                    null,
                    23f,
                    24f,
                    25f,
                )
            ),
        )
        //when
        every { mockData.getAllCitiesData() } returns (citiesData)
        val namesCityHasSuitableClothesPrices: Executable =
            Executable { interactor.execute(limit) }
        //then
        assertThrows(Exception::class.java, namesCityHasSuitableClothesPrices)
    }

    @Test
    fun `should throw exception when all cities haven't any clothes`() {
        //Given list hasn't any type of clothes
        val limit = 1
        val citiesData = listOf(
            MockCityEntity.createMockCity(
                "City 1",
                ClothesPrices(
                    null,
                    null,
                    null,
                    null,
                )
            ),
        )
        //when
        every { mockData.getAllCitiesData() } returns (citiesData)
        val namesCityHasSuitableClothesPrices: Executable = Executable { interactor.execute(limit) }
        //then
        assertThrows(Exception::class.java, namesCityHasSuitableClothesPrices)
    }

    @Test
    fun `should return sorted correct cities when every city has suitable clothes prices`() {
        //Given list has 3 cities has clothes prices
        val limit = 3
        val citiesData = listOf(
            MockCityEntity.createMockCity(
                "City1",
                ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 44.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 56.0f,
                    onePairOfNikeRunningShoesMidRange = 50.8f,
                    onePairOfMenLeatherBusinessShoes = 43.0f,
                )
            ),
            MockCityEntity.createMockCity(
                "City2",
                ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 40.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 55.0f,
                    onePairOfNikeRunningShoesMidRange = 49.8f,
                    onePairOfMenLeatherBusinessShoes = 41.0f,
                )
            ),
            MockCityEntity.createMockCity(
                "City3",
                ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 38.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 51.0f,
                    onePairOfNikeRunningShoesMidRange = 47.8f,
                    onePairOfMenLeatherBusinessShoes = 39.0f,
                )
            ),
        )
        //when
        every { mockData.getAllCitiesData() } returns (citiesData)
        val namesCityHasSuitableClothesPrices = interactor.execute(limit)
        //then
        assertEquals(listOf("City3", "City2", "City1"), namesCityHasSuitableClothesPrices)
    }

    @Test
    fun `should throw exception when limit is less zan zero`() {
        //Given empty List
        val limit = -1
        val citiesData = listOf<CityEntity>()
        //when
        every { mockData.getAllCitiesData() } returns (citiesData)
        val namesCityHasSuitableClothesPrices = Executable { interactor.execute(limit) }
        //then
        assertThrows(Exception::class.java, namesCityHasSuitableClothesPrices)
    }

}