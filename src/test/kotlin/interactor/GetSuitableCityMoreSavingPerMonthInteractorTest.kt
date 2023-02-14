package interactor

import fakeData.FakeData
import model.CityEntity
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

/**
 * Created by Aziza Helmy on 2/12/2023.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetSuitableCityMoreSavingPerMonthInteractorTest {
    private lateinit var getSuitableCityMoreSavingPerMonth: GetSuitableCityMoreSavingPerMonthInteractor
    private lateinit var fakeData: FakeData

    @BeforeAll
    fun setUp() {
        fakeData = FakeData()
        getSuitableCityMoreSavingPerMonth = GetSuitableCityMoreSavingPerMonthInteractor(fakeData)
    }

    @Test
    fun should_ReturnTrue_When_CitiesHasAnAverageMonthlySalary() {
        //Given
        val fakeCity: CityEntity = fakeData.getAllCitiesData()[0]
        //When
        val actualResult = getSuitableCityMoreSavingPerMonth.excludeNullSalariesApartment3BedroomsAndFoodies(fakeCity)
        //Then
        assertTrue(actualResult)
    }

    @Test
    fun should_ReturnFalse_When_CitiesHasNotAnAverageMonthlySalary() {
        //Given
        val fakeCity: CityEntity = fakeData.getAllCitiesData()[1]
        //When
        val actualResult = getSuitableCityMoreSavingPerMonth.excludeNullSalariesApartment3BedroomsAndFoodies(fakeCity)
        //Then
        assertFalse(actualResult)
    }

    @Test
    fun should_ReturnTrue_When_CitiesHasAnApartment3BedroomsInCityCenter() {
        //Given
        val fakeCity: CityEntity = fakeData.getAllCitiesData()[0]
        //When
        val actualResult = getSuitableCityMoreSavingPerMonth.excludeNullSalariesApartment3BedroomsAndFoodies(fakeCity)
        //Then
        assertTrue(actualResult)
    }

    @Test
    fun should_ReturnFalse_When_CitiesHasNotAnApartment3BedroomsInCityCenter() {
        //Given
        val fakeCity: CityEntity = fakeData.getAllCitiesData()[1]
        //When
        val actualResult = getSuitableCityMoreSavingPerMonth.excludeNullSalariesApartment3BedroomsAndFoodies(fakeCity)
        //Then
        assertFalse(actualResult)
    }

    @Test
    fun should_ReturnTrue_When_CitiesHasTheNeededFoodies() {
        //Given
        val fakeCity: CityEntity = fakeData.getAllCitiesData()[0]
        //When
        val actualResult = getSuitableCityMoreSavingPerMonth.excludeNullSalariesApartment3BedroomsAndFoodies(fakeCity)
        //Then
        assertTrue(actualResult)
    }

    @Test
    fun should_ReturnFalse_When_CitiesHasNotTheNeededFoodies() {
        //Given
        val fakeCity: CityEntity = fakeData.getAllCitiesData()[1]
        //When
        val actualResult = getSuitableCityMoreSavingPerMonth.excludeNullSalariesApartment3BedroomsAndFoodies(fakeCity)
        //Then
        assertFalse(actualResult)
    }

    @Test
    fun should_Not_ReturnSuitableCity_When_NoSavingsMorePerMonth() {
        //Given
        val fakeCity: CityEntity = fakeData.getAllCitiesData()[5]
        //When
        val actualResult = getSuitableCityMoreSavingPerMonth.execute()
        //Then
        assertNotEquals(fakeCity, actualResult)
    }

    @Test
    fun should_ReturnSuitableCity_When_SavingsMorePerMonth() {
        //Given
        val fakeCity: CityEntity = fakeData.getAllCitiesData()[0]
        //When
        val actualResult = getSuitableCityMoreSavingPerMonth.execute()
        //Then
        assertEquals(fakeCity, actualResult)
    }

}