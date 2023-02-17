package interactor

import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import mockData.MockCityEntity
import model.CityEntity
import model.ClothesPrices
import org.junit.jupiter.api.*

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTop5CitiesNameHasSuitableClothesPricesInteractorTest {

    private val fakeData= mockk<CostOfLivingDataSource>()
    private lateinit var getTop5CitiesNameHasSuitableClothesPricesInteractor :GetTop5CitiesNameHasSuitableClothesPricesInteractor

    @BeforeAll
    fun Setup() {
        unmockkAll()
        clearAllMocks()
        getTop5CitiesNameHasSuitableClothesPricesInteractor = GetTop5CitiesNameHasSuitableClothesPricesInteractor(fakeData)
    }


    @Test
    fun should_TrowException_when_listIsEmpty() {
        //Given empty List
        val citiesData = listOf<CityEntity>()
        //when
        every { fakeData.getAllCitiesData() } returns (citiesData)
        val nameTop5City: Executable = Executable { getTop5CitiesNameHasSuitableClothesPricesInteractor.execute(5) }

        //then
        assertThrows(Exception::class.java, nameTop5City)
    }



}