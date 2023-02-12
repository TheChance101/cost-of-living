package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import model.CityData
import model.CityEntity
import model.FoodPrices
import model.RealEstatesPrices
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class GetMostSuitableSavingCityInteractorTest {

    lateinit var interactor: GetMostSuitableSavingCityInteractor

    @BeforeEach
    fun setUp() {
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
        interactor = GetMostSuitableSavingCityInteractor(dataSource)
    }

    @Test
    fun execute() {
        // given  value
        // when
        // then
    }

    @Test
    fun should_ReturnTrue_When_netSalaryNotNull() {
        // given  value
        val averageMonthlyNetSalaryAfterTax = 1000f
//        // when
        val result = interactor.excludeNullSalaries(averageMonthlyNetSalaryAfterTax as CityEntity)
//        // then
        assertTrue(result)
    }

    @Test
    fun should_ReturnFalse_When_netSalaryIsNull() {
        // given
        val averageMonthlyNetSalaryAfterTax = null

        // when
        val result = interactor.excludeNullSalaries(averageMonthlyNetSalaryAfterTax as CityEntity)

        // then
        assertFalse(result)
    }

    @Test
    fun should_returnCorrectSaving_when_EnterCityDataAndFamilyBudget() {
        val cityData = CityData(
            cityName = "Paris",
            country = "France",
            averageMonthlyNetSalaryAfterTax = 3000f,
            dataQuality = true,
            realEstatesPrices = RealEstatesPrices(
                apartment3BedroomsInCityCentre = 1500f,
                apartment3BedroomsOutsideOfCentre = null,
                apartmentOneBedroomInCityCentre = null,
                apartmentOneBedroomOutsideOfCentre = null,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 2f,
                localCheese1kg = 20f,
                beefRound1kgOrEquivalentBackLegRedMeat = 25f,
                chickenFillets1kg = 10f,
                riceWhite1kg = 5f,
                eggsRegular12 = null
            )
        )

        val familyBudget = 5000f

        val expectedSavings = 2960.0f

        val actualSavings = interactor.calculateCitySavings(cityData, familyBudget)

        assertEquals(expectedSavings, actualSavings)
    }

    @Test
    fun should_returnZero_When_FamilyBudgetNotEnough() {
        val cityData = CityData(
            cityName = "Paris",
            country = "France",
            averageMonthlyNetSalaryAfterTax = 3000f,
            dataQuality = true,
            realEstatesPrices = RealEstatesPrices(
                apartment3BedroomsInCityCentre = 2000f,
                apartment3BedroomsOutsideOfCentre = null,
                apartmentOneBedroomInCityCentre = null,
                apartmentOneBedroomOutsideOfCentre = null,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 2f,
                localCheese1kg = 20f,
                beefRound1kgOrEquivalentBackLegRedMeat = 25f,
                chickenFillets1kg = 10f,
                riceWhite1kg = 5f,
                eggsRegular12 = null
            )
        )

        val familyBudget = 5000f

        val expectedSavings = 0f

        val actualSavings = interactor.calculateCitySavings(cityData, familyBudget)

        assertEquals(expectedSavings, actualSavings)
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
        val result = interactor.calculateFoodCost(foodPrice)
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
        val result = interactor.calculateFoodCost(foodPrice)
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
        val result = interactor.calculateFoodCost(foodPrice)
        // then
        assertEquals(44f, result)
    }

    @Test
    fun should_returnCorrectValue_when_EnterAverageSalary() {
        // given  value
        val averageMonthlySalary = 1000f
        // when
        val result = interactor.calculateFamilyBudget(averageMonthlySalary)
        // then
        assertEquals(2000f, result)
    }
    @Test
    fun should_returnZero_when_EnterAverageSalaryZero() {
        // given
        val averageMonthlySalary = 0f
        // when
        val result = interactor.calculateFamilyBudget(averageMonthlySalary)
        // then
        assertEquals(0f, result)
    }

    @Test
    fun should_returnCorrectValue_when_EnterAverageSalaryNegative() {
        // given
        val averageMonthlySalary = -500f
        // when
        val result = interactor.calculateFamilyBudget(averageMonthlySalary)
        // then
        assertEquals(0f, result)
    }

    @Test
    fun should_returnCorrectValue_when_EnterAverageSalaryPositive() {
        // given
        val averageMonthlySalary = 1500f
        // when
        val result = interactor.calculateFamilyBudget(averageMonthlySalary)
        // then
        assertEquals(3000f, result)
    }
}