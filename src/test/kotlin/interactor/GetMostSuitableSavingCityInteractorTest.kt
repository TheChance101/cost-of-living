package interactor
import fakedata.FakeDataSource
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class GetMostSuitableSavingCityInteractorTest {

    private lateinit var fakeData: FakeDataSource
    private lateinit var getMostSuitableSavingCity: GetMostSuitableSavingCityInteractor

    @BeforeEach
    fun setUp() {
        fakeData = FakeDataSource()
        getMostSuitableSavingCity = GetMostSuitableSavingCityInteractor(fakeData)
    }

    @Test
    fun should_ReturnCityName_When_EnterCorrectCityName() {
        // Given
        val fakeCity = fakeData.lyonHighQuality
        // When
        val res = getMostSuitableSavingCity.execute()
        // Then
        assertEquals(fakeCity, res)
    }

    @Test
    fun should_ReturnNotSuitableCity_When_LessSavingBerMonth() {
        // Given
        val fakeCity = fakeData.newYorkLowQuality
        // when
        val actualResult = getMostSuitableSavingCity.execute()
        // Then
        assertNotEquals(fakeCity, actualResult)
    }

    @Test
    fun should_ReturnTrue_When_AverageMonthlySalaryCorrect() {
        // Given
        val fakeCity = fakeData.newYorkLowQuality
        // when
        val actualResult = getMostSuitableSavingCity.excludeNullAverageSalaryRealStatePricesFoodPrices(fakeCity)
        // Then
        assertTrue(actualResult)
    }

    @Test
    fun should_ReturnFalse_When_AverageMonthlySalaryNull() {
        // Given
        val fakeCity = fakeData.berlinHighQualityNull
        // When
        val actualResult = getMostSuitableSavingCity.excludeNullAverageSalaryRealStatePricesFoodPrices(fakeCity)
        // Then
        assertFalse(actualResult)
    }

    @Test
    fun should_ReturnFalse_When_Apartment3BedroomsCorrect() {
        // Given
        val fakeCity = fakeData.bernHighQuality
        // When
        val actualResult = getMostSuitableSavingCity.excludeNullAverageSalaryRealStatePricesFoodPrices(fakeCity)
        // Then
        assertTrue(actualResult)
    }

    @Test
    fun should_ReturnFalse_When_Apartment3BedroomsNull() {
        // Given
        val fakeCity = fakeData.berlinHighQualityNull
        // When
        val actualResult = getMostSuitableSavingCity.excludeNullAverageSalaryRealStatePricesFoodPrices(fakeCity)
        // Then
        assertFalse(actualResult)
    }

    @Test
    fun should_ReturnTrue_When_FoodCorrect() {
        // Given
        val fakeCity = fakeData.newYorkLowQuality
        // When
        val actualResult = getMostSuitableSavingCity.excludeNullAverageSalaryRealStatePricesFoodPrices(fakeCity)
        // Then
        assertTrue(actualResult)
    }

    @Test
    fun should_ReturnFalse_When_foodNull() {
        // Given
        val fakeCity = fakeData.berlinHighQualityNull
        // When
        val actualResult = getMostSuitableSavingCity.excludeNullAverageSalaryRealStatePricesFoodPrices(fakeCity)
        // then
        assertFalse(actualResult)
    }
}