package interactor
import fakedata.FakeDataSource
import model.CityEntity
import model.FoodPrices
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll

class GetMostSuitableSavingCityInteractorTest {

    private lateinit var getMostSuitableSavingCity: GetMostSuitableSavingCityInteractor

    private lateinit var fakeData: FakeDataSource

    @BeforeAll
    fun setUp() {
        fakeData = FakeDataSource()
        getMostSuitableSavingCity = GetMostSuitableSavingCityInteractor(fakeData)
    }

    @Test
    fun should_ReturnCityName_When_EnterCorrectCityName() {

        val fakeCity = fakeData.alexHighQuality

        val res = getMostSuitableSavingCity.execute()

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
        val actualResult = getMostSuitableSavingCity.excludeNullSalariesAndNullRealEstatePrice(fakeCity)
        // Then
        assertTrue(actualResult)
    }

    @Test
    fun should_ReturnFalse_When_AverageMonthlySalaryNull() {
        // Given
        val fakeCity = fakeData.berlinHighQualityNull
        // When
        val actualResult = getMostSuitableSavingCity.excludeNullSalariesAndNullRealEstatePrice(fakeCity)
        // Then
        assertFalse(actualResult)
    }

    @Test
    fun should_ReturnFalse_When_Apartment3BedroomsCorrect() {
        // Given
        val fakeCity = fakeData.bernHighQuality
        // When
        val actualResult = getMostSuitableSavingCity.excludeNullSalariesAndNullRealEstatePrice(fakeCity)
        // Then
        assertTrue(actualResult)
    }

    @Test
    fun should_ReturnFalse_When_Apartment3BedroomsNull() {
        // Given
        val fakeCity = fakeData.berlinHighQualityNull
        // When
        val actualResult = getMostSuitableSavingCity.excludeNullSalariesAndNullRealEstatePrice(fakeCity)
        // Then
        assertFalse(actualResult)
    }

    @Test
    fun should_ReturnTrue_When_FoodCorrect() {
        // Given
        val fakeCity = fakeData.newYorkLowQuality
        // When
        val actualResult = getMostSuitableSavingCity.excludeNullSalariesAndNullRealEstatePrice(fakeCity)
        // Then
        assertTrue(actualResult)
    }

    @Test
    fun should_ReturnFalse_When_foodNull() {
        val fakeCity = fakeData.berlinHighQualityNull
        // When
        val actualResult = getMostSuitableSavingCity.excludeNullSalariesAndNullRealEstatePrice(fakeCity)
        // then
        assertFalse(actualResult)
    }
}