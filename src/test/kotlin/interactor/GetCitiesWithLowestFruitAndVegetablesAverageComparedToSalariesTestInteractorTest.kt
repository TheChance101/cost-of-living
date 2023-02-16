package interactor

import model.*
import model.MealsPrices
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesTestInteractorTest {
    private lateinit var data: GetCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor

    @BeforeAll
    fun setup() {
        val dataSource = object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf(
                    //region clean data
                    CityEntity(
                        "City1",
                        "Country1",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        5000f,
                        true
                    ),
                    CityEntity(
                        "City2",
                        "Country2",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(1.1f, 2.1f, 3.1f, 4.1f, 5.1f, 6.1f, 7.1f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        4000f,
                        true
                    ),
                    CityEntity(
                        "City3",
                        "Country3",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(1.2f, 2.2f, 3.2f, 4.2f, 5.2f, 6.2f, 7.2f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        6000f,
                        true
                    ),
                    CityEntity(
                        "City4",
                        "Country4",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(1.3f, 2.3f, 3.3f, 4.3f, 5.3f, 6.3f, 7.3f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        5500f,
                        true
                    ),
                    CityEntity(
                        "City5",
                        "Country5",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(1.4f, 2.4f, 3.4f, 4.4f, 5.4f, 6.4f, 7.4f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        5400f,
                        true
                    ), CityEntity(
                        "City6",
                        "Country6",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        5300f,
                        true
                    ),
                    CityEntity(
                        "City7",
                        "Country7",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(1.6f, 2.6f, 3.6f, 4.6f, 5.6f, 6.6f, 7.6f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        5200f,
                        true
                    ),
                    CityEntity(
                        "City8",
                        "Country8",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(1.7f, 2.7f, 3.7f, 4.7f, 5.7f, 6.7f, 7.7f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        5100f,
                        true
                    ),
                    CityEntity(
                        "City9",
                        "Country9",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(1.8f, 2.8f, 3.8f, 4.8f, 5.8f, 6.8f, 7.8f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        4900f,
                        true
                    ), CityEntity(
                        "City10",
                        "Country10",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(1.9f, 2.9f, 3.9f, 4.9f, 5.9f, 6.9f, 7.9f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        4500f,
                        true
                    ), CityEntity(
                        "City11",
                        "Country11",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(1.11f, 2.11f, 3.11f, 4.11f, 5.11f, 6.11f, 7.11f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        4700f,
                        true

                    )//endregion

                    //region low quality data
                    ,
                    CityEntity(
                        "City12",
                        "Country12",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(null, 2.10f, null, 4.10f, 5.10f, -6.10f, 7.10f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        6700f,
                        false
                    ),
                    CityEntity(
                        "City13",
                        "Country13",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(-1.0f, -2.10f, -3.10f, 4.10f, null, 6.10f, 7.10f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        7400f,
                        false
                    ),
                    CityEntity(
                        "City14",
                        "Country14",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(-3.0f, null, 3.10f, 4.10f, 5.10f, 6.10f, 7.10f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        3600f,
                        false
                    ),
                    CityEntity(
                        "City15",
                        "Country15",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(-1.9f, 2.10f, 3.10f, 4.10f, 5.10f, 6.10f, null),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        10000f,
                        false
                    ),
                    CityEntity(
                        "City16",
                        "Country16",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(-6.0f, 2.10f, 3.10f, null, 5.10f, 6.10f, 7.10f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        6900f,
                        false
                    ),
                    CityEntity(
                        "City17",
                        "Country17",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(-9.0f, -0.10f, null, 4.10f, 5.10f, -6.10f, 7.10f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        6300f,
                        false
                    ),
                    CityEntity(
                        "City18",
                        "Country18",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(-10.8f, 0.14f, 7.10f, -47.10f, null, 6.10f, 7.10f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        6100f,
                        false
                    ),
                    CityEntity(
                        "City19",
                        "Country19",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(-15.0f, 2.10f, 36.10f, null, 5.10f, 6.10f, 7.10f),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        7400f,
                        false
                    ),
                    CityEntity(
                        "",
                        "",
                        MealsPrices(null, null, null),
                        DrinksPrices(null, null, null, null, null),
                        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                        FoodPrices(null, null, null, null, null, null),
                        ServicesPrices(null, null, null, null, null, null, null, null),
                        ClothesPrices(null, null, null, null),
                        TransportationsPrices(null, null, null, null, null, null),
                        CarsPrices(null, null),
                        RealEstatesPrices(null, null, null, null, null, null),
                        8800f,
                        false
                    )//endregion
                )
            }
        }
        data = GetCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor(dataSource)
    }

    @Test
    fun should_return10CitiesWithLowestFruitAndVegetablesAverageComparedToSalaries_When_execute() {
        //given clean data
        val cities = listOf("City10", "City2", "City9", "City8", "City7", "City11", "City6", "City5", "City1", "City4")
        //when executing
        val result = data.execute(10)
        //then
        assertEquals(cities, result)
    }

    @Test
    fun should_returnFalse_When_CityNameIsEmpty() {
        //given an empty city name should
        val emptyCityName = CityEntity(
            "",
            "",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            8800f,
            true
        )
        //when executing
        val result = data.excludeEmptyCityNameAndLowQualityDataAndNullSalaries(emptyCityName)
        //then
        assertFalse(result)

    }

    @Test
    fun should_returnTheAverageOfFruitsAndVegetables_When_CountingAverage() {
        //given clean data
        val fruitAndVegetables = FruitAndVegetablesPrices(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f)
        //when counting the average
        val result = data.average(fruitAndVegetables)
        //then
        assertEquals(4.0f, result)
    }

    @Test
    fun should_returnTheResultOfComparingFruitAndVegetablesWithSalaries_When_ComparingFruitAndVegetablesWithSalaries() {
        //given the average and the salaries
        val average = 4.0f
        val salaries = 5000.0f
        //when comparing fruit and vegetables with salaries
        val result = data.comparingFruitAndVegetablesWithSalaries(average, salaries)
        //then
        assertEquals(0.0008f, result)
    }

    @Test
    fun should_returnFalse_When_FruitAndVegetablesISNull() {
        //given null fruit and vegetables
        val nullFruitAndVegetables = FruitAndVegetablesPrices(null, 1.0f, null, null, null, null, null)
        //when FruitAndVegetablesISNull
        val result = data.excludeNullFruitsAndVegetables(nullFruitAndVegetables)
        //then
        assertFalse(result)

    }

    @Test
    fun should_returnFalse_When_SalariesISNull() {
        //given null salaries
        val nullSalaries = CityEntity(
            "city",
            "city",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            null,
            true
        )
        //when SalariesISNull
        val result = data.excludeEmptyCityNameAndLowQualityDataAndNullSalaries(nullSalaries)
        //then
        assertFalse(result)
    }

    @Test
    fun should_returnFalse_When_LowQualityData() {
        //given low quality data
        val lowQualityData = CityEntity(
            "city",
            "city",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            8800f,
            false
        )
        //when executing
        val result = data.excludeEmptyCityNameAndLowQualityDataAndNullSalaries(lowQualityData)
        //then
        assertFalse(result)
    }
}