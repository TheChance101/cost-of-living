package interactor
import fakedata.FakeData
import model.CityEntity
import model.FoodPrices
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class GetMostSuitableSavingCityInteractorTest {

    private lateinit var mostSuitableSavingCityInteractor: GetMostSuitableSavingCityInteractor
    private lateinit var dataSource: CostOfLivingDataSource

    private lateinit var fakeData: FakeData

    @BeforeEach
    fun setUp() {
        fakeData = FakeData()
        dataSource = fakeData
        mostSuitableSavingCityInteractor = GetMostSuitableSavingCityInteractor(dataSource)
    }

    @Test
    fun should_ReturnCityName_When_EnterCorrectCityName() {

        val expectedCity = listOf("Banjul", "Hamah","Narayanganj","Sri Jayewardenepura Kotte","Kasese", "Aleppo")

        val res = mostSuitableSavingCityInteractor.execute(limit = 6)

        assertEquals(expectedCity, res)
    }


    @Test
    fun should_ReturnTrue_When_netSalaryNotNull() {
        // given
        val averageNetSalary = 500f
        val realEstatesPrices = 300f
        // when
        val result = mostSuitableSavingCityInteractor.excludeNullSalariesAndNullRealEstatePrice(averageNetSalary, realEstatesPrices)
//        // then
        assertTrue(result)
    }

    @Test
    fun should_ReturnFalse_When_netSalaryNull() {
        // given
        val averageNetSalary = null
        val realEstatesPrices = 300f
        // when
        val result = mostSuitableSavingCityInteractor.excludeNullSalariesAndNullRealEstatePrice(averageNetSalary, realEstatesPrices)
//        // then
        assertFalse(result)
    }

    @Test
    fun should_ReturnFalse_When_netSalaryNullAndRealEstatePriceNull() {
        // given
        val averageNetSalary = null
        val realEstatesPrices = null
        // when
        val result = mostSuitableSavingCityInteractor.excludeNullSalariesAndNullRealEstatePrice(averageNetSalary, realEstatesPrices)
//        // then
        assertFalse(result)
    }

    @Test
    fun should_returnCorrectSaving_when_EnterCityDataAndFamilyBudget() {

        // given
        val foodPrice = FoodPrices(
            loafOfFreshWhiteBread500g = 1.0f, // 30
            localCheese1kg = 2.0f, // 2
            beefRound1kgOrEquivalentBackLegRedMeat = 1.0f, // 4
            chickenFillets1kg = 3.0f, // 30
            riceWhite1kg = 1.0f,      // 2
            eggsRegular12 = null
        )

        val realEstatesPrices = 100f
        val familyBudget = 2000f
        // when
        val actualSavings = mostSuitableSavingCityInteractor.calculateCitySavings(realEstatesPrices, foodPrice, familyBudget)
        // then
        assertEquals(1582.0f, actualSavings)
    }

    @Test
    fun should_returnCorrectValue_when_AllValuesArePositive() {
        // given
        val foodPrice = FoodPrices(
            loafOfFreshWhiteBread500g = 1.0f, // 30
            localCheese1kg = 2.0f, // 2
            beefRound1kgOrEquivalentBackLegRedMeat = 1.0f, // 4
            chickenFillets1kg = 3.0f, // 30
            riceWhite1kg = 1.0f,      // 2
            eggsRegular12 = null
        )
        // when
        val result = mostSuitableSavingCityInteractor.calculateFoodCost(foodPrice)
        // then
        assertEquals(68f, result)
    }

    @Test
    fun should_returnZero_when_AllValuesAreNull() {
        // given
        val foodPrice = FoodPrices(
            loafOfFreshWhiteBread500g = null,
            localCheese1kg = null,
            beefRound1kgOrEquivalentBackLegRedMeat = null,
            chickenFillets1kg = null,
            riceWhite1kg = null,
            eggsRegular12 = null
        )
        // when
        val result = mostSuitableSavingCityInteractor.calculateFoodCost(foodPrice)
        // then
        assertEquals(0f, result)
    }

    @Test
    fun should_returnZero_when_SomeValuesAreNull() {
        // given
        val foodPrice = FoodPrices(
            loafOfFreshWhiteBread500g = 1.0f,
            localCheese1kg = null,
            beefRound1kgOrEquivalentBackLegRedMeat = 2.0f,
            chickenFillets1kg = null,
            riceWhite1kg = 3.0f,
            eggsRegular12 = null
        )
        // when
        val result = mostSuitableSavingCityInteractor.calculateFoodCost(foodPrice)
        // then
        assertEquals(44f, result)
    }

    @Test
    fun should_returnCorrectValue_when_EnterAverageSalary() {
        // given  value
        val averageMonthlySalary = 1000f
        // when
        val result = mostSuitableSavingCityInteractor.calculateFamilyBudget(averageMonthlySalary)
        // then
        assertEquals(2000f, result)
    }
    @Test
    fun should_returnZero_when_EnterAverageSalaryZero() {
        // given
        val averageMonthlySalary = 0f
        // when
        val result = mostSuitableSavingCityInteractor.calculateFamilyBudget(averageMonthlySalary)
        // then
        assertEquals(0f, result)
    }

    @Test
    fun should_returnCorrectValue_when_EnterAverageSalaryNegative() {
        // given
        val averageMonthlySalary = -500f
        // when
        val result = mostSuitableSavingCityInteractor.calculateFamilyBudget(averageMonthlySalary)
        // then
        assertEquals(0f, result)
    }

    @Test
    fun should_returnCorrectValue_when_EnterAverageSalaryPositive() {
        // given
        val averageMonthlySalary = 1500f
        // when
        val result = mostSuitableSavingCityInteractor.calculateFamilyBudget(averageMonthlySalary)
        // then
        assertEquals(3000f, result)
    }
}