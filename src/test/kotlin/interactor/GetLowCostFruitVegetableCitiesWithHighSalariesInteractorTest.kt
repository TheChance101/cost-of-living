package interactor

import fakeDataSource.FakeData
import model.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetLowCostFruitVegetableCitiesWithHighSalariesInteractorTest {
    private lateinit var getLowCostFruitVegetableCitiesWithHighSalaries: GetLowCostFruitVegetableCitiesWithHighSalariesInteractor
    private lateinit var fakeData: FakeData
    private lateinit var expectedResult: List<CityEntity>

    @BeforeAll
    fun setup() {
        fakeData = FakeData()
        getLowCostFruitVegetableCitiesWithHighSalaries =
            GetLowCostFruitVegetableCitiesWithHighSalariesInteractor(fakeData)
        expectedResult = fakeData.getAllCitiesData().filter(::cityName).sortedBy { it.cityName }
    }


    @Test
    fun should_returnCorrectResult_when_correctListIsGiven() {
        // when find 10 cities that has lowest fruitVeg prices comparing to salaries paid there
        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute().sortedBy { it.cityName }

        //then
        assertEquals(expectedResult, result)
    }

    @Test
    fun should_returnFalse_when_theNameOfCityIsNull() {
        // when
        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute()

        //then
        assertFalse(result.any { it.cityName == "" })
    }

    @Test
    fun should_returnTen_when_theSizeOfTheListIsTen() {
        // when
        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute()

        //then
        assertEquals(10, result.size)
    }

    @Test
    fun should_returnFalse_when_salaryIsNull() {
        // when
        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute()

        //then
        assertFalse(result.any { it.averageMonthlyNetSalaryAfterTax == null })
    }

    @Test
    fun should_returnFalse_when_salaryIsZero() {
        // when
        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute()

        //then
        assertFalse(result.any { it.averageMonthlyNetSalaryAfterTax == 0f })
    }

    @Test
    fun should_returnFalse_when_salaryIsNegative() {
        // when
        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute()

        //then
        assertFalse(result.any { it.averageMonthlyNetSalaryAfterTax!! < 0f })
    }

    private fun cityName(city: CityEntity): Boolean {
        return city.cityName == "Giza" || city.cityName == "Rawalpindi" || city.cityName == "Alexandria"
                || city.cityName == "Hyderabad City" || city.cityName == "Karachi" || city.cityName == "Lahore"
                || city.cityName == "Multan" || city.cityName == "Tanta" || city.cityName == "Accra" || city.cityName == "Dushanbe"
    }


}