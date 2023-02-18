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
    fun `should throw exception when list is empty`() {
        //Given empty List
        val citiesData = listOf<CityEntity>()
        //when
        every { mockData.getAllCitiesData() } returns (citiesData)
        val namesCityHasSuitableClothesPrices= Executable { interactor.execute(5) }
        //then
        assertThrows(Exception::class.java, namesCityHasSuitableClothesPrices)
    }

    @Test
    fun `should TrowException when allCitis Have Not Any onePairOfJeansLevis50oneOrSimilar`() {
        //Given list hasn't any type of onePairOfJeansLevis50oneOrSimilar
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
            Executable { interactor.execute(5) }

        //then
        assertThrows(Exception::class.java, namesCityHasSuitableClothesPrices)
    }

    @Test
    fun `should TrowException when all Citis Have Not Any OneSummerDressInAChainStoreZaraHAndM`() {
        //Given list hasn't any type of oneSummerDressInAChainStoreZaraHAndM
        val citiesData = listOf(
            MockCityEntity.createMockCity(
                "City 1",
                ClothesPrices(
                    34f,
                    null,
                    24f,
                    25f,
                )
            ),
        )
        //when
        every { mockData.getAllCitiesData() } returns (citiesData)
        val namesCityHasSuitableClothesPrices: Executable =
            Executable { interactor.execute(5) }

        //then
        assertThrows(Exception::class.java, namesCityHasSuitableClothesPrices)
    }

    @Test
    fun `should TrowException when all Citis Have Not Any onePairOfNikeRunningShoesMidRange`() {
        //Given list hasn't any type of onePairOfNikeRunningShoesMidRange
        val citiesData = listOf(
            MockCityEntity.createMockCity(
                "City 1",
                ClothesPrices(
                    34f,
                    45f,
                    null,
                    25f,
                )
            ),
        )
        //when
        every { mockData.getAllCitiesData() } returns (citiesData)
        val namesCityHasSuitableClothesPrices: Executable =
            Executable { interactor.execute(5) }

        //then
        assertThrows(Exception::class.java, namesCityHasSuitableClothesPrices)
    }

    @Test
    fun `should TrowException when all Citis Have Not Any onePairOfMenLeatherBusinessShoes`() {
        //Given list hasn't any type of onePairOfMenLeatherBusinessShoes
        val citiesData = listOf(
            MockCityEntity.createMockCity(
                "City 1",
                ClothesPrices(
                    34f,
                    45f,
                    44f,
                    null,
                )
            ),
        )
        //when
        every { mockData.getAllCitiesData() } returns (citiesData)
        val namesCityHasSuitableClothesPrices: Executable =
            Executable { interactor.execute(5) }

        //then
        assertThrows(Exception::class.java, namesCityHasSuitableClothesPrices)
    }

    @Test
    fun `should TrowException when all Citis Have Not Any clothes`() {
        //Given list hasn't any type of clothes
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
        val namesCityHasSuitableClothesPrices: Executable =
            Executable { interactor.execute(5) }

        //then
        assertThrows(Exception::class.java, namesCityHasSuitableClothesPrices)
    }

    @Test
    fun `should Return 5 city name  when city has Has Suitable Clothes Prices`() {
        //Given list has 6 city has clothes prices
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
            MockCityEntity.createMockCity(
                "City4",
                ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 37.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 50.0f,
                    onePairOfNikeRunningShoesMidRange = 46.8f,
                    onePairOfMenLeatherBusinessShoes = 38.0f,
                )
            ),
            MockCityEntity.createMockCity(
                "City5",
                ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 36.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 49.0f,
                    onePairOfNikeRunningShoesMidRange = 45.8f,
                    onePairOfMenLeatherBusinessShoes = 37.0f,
                )
            ),
            MockCityEntity.createMockCity(
                "City6",
                ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 35.0f,
                    oneSummerDressInAChainStoreZaraHAndM = 48.0f,
                    onePairOfNikeRunningShoesMidRange = 44.8f,
                    onePairOfMenLeatherBusinessShoes = 36.0f,
                )
            ),
        )
        //Given list of 5 name city  will return
        val willReturnNamesCity = listOf("City6", "City5", "City4", "City3", "City2")

        //when
        every { mockData.getAllCitiesData() } returns (citiesData)
        val namesCityHasSuitableClothesPrices = interactor.execute(5)

        //then
        assertEquals(willReturnNamesCity, namesCityHasSuitableClothesPrices)
    }


}