package interactor

import fackdata.FakeData
import model.CityEntity
import model.FoodPrices
import model.RealEstatesPrices
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class GetMostSuitableSavingCityInteractorTest {

    lateinit var mostSuitableSavingCityInteractor: GetMostSuitableSavingCityInteractor
    lateinit var realEstatesPrices: RealEstatesPrices
    private lateinit var dataSource: CostOfLivingDataSource

    private lateinit var fakeData: FakeData

    @BeforeEach
    fun setUp() {
        fakeData = FakeData()
        dataSource = fakeData
        mostSuitableSavingCityInteractor = GetMostSuitableSavingCityInteractor(dataSource)
    }

//    @Test
//    fun testExecute() {
//        val dataSource = object : CostOfLivingDataSource {
//            override fun getAllCitiesData() = listOf(city)
//        }
//        val finder = SuitableCitiesFinder(dataSource)
//
//        val suitableCities = finder.execute(10)
//
//        assertEquals(listOf(city.cityName), suitableCities)
//    }

    @Test
    fun should_ReturnTrue_When_netSalaryNotNull() {
        val city = fakeData.getAllCitiesData().first()
        // when
        val result = mostSuitableSavingCityInteractor.excludeNullSalaries(city)
//        // then
        assertTrue(result)
    }

    @Test
    fun should_ReturnFalse_When_netSalaryIsNull() {
        // given
//        val city =
//        println(city)
//        // when
//        val result = mostSuitableSavingCityInteractor.excludeNullSalaries(city)
//
//        // then
//        assertFalse(result)
    }

    @Test
    fun should_returnCorrectSaving_when_EnterCityDataAndFamilyBudget() {


        val city = fakeData.getAllCitiesData().filter {
            it.averageMonthlyNetSalaryAfterTax != null
                    && it.dataQuality
        }.first()
        val familyBudget = mostSuitableSavingCityInteractor.calculateFamilyBudget(city.averageMonthlyNetSalaryAfterTax!!)

        val actualSavings = mostSuitableSavingCityInteractor.calculateCitySavings(city, familyBudget)

        assertEquals(-1954.51f, actualSavings)
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