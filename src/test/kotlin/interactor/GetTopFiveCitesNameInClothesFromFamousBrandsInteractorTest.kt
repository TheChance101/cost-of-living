package interactor

import model.*
import org.junit.jupiter.api.*
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopFiveCitesNameInClothesFromFamousBrandsInteractorTest {
    private lateinit var topFiveCitesNameInClothesFromFamousBrandsInteractor: GetTopFiveCitesNameInClothesFromFamousBrandsInteractor

    @BeforeAll
    fun setup() {
        topFiveCitesNameInClothesFromFamousBrandsInteractor =
            GetTopFiveCitesNameInClothesFromFamousBrandsInteractor(object : CostOfLivingDataSource {
                override fun getAllCitiesData(): List<CityEntity> {
                    return listOf(

                        CityEntity(
                            "city11",
                            "country01",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 170f,
                                oneSummerDressInAChainStoreZaraHAndM = 350f,
                                onePairOfNikeRunningShoesMidRange = 180f,
                                onePairOfMenLeatherBusinessShoes = 200f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city12",
                            "country01",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 160f,
                                oneSummerDressInAChainStoreZaraHAndM = 300f,
                                onePairOfNikeRunningShoesMidRange = 150f,
                                onePairOfMenLeatherBusinessShoes = 177f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city23",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 140f,
                                oneSummerDressInAChainStoreZaraHAndM = 280f,
                                onePairOfNikeRunningShoesMidRange = 130f,
                                onePairOfMenLeatherBusinessShoes = 150f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city24",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 130f,
                                oneSummerDressInAChainStoreZaraHAndM = 180f,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city25",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = null,
                                oneSummerDressInAChainStoreZaraHAndM = null,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ),
                        CityEntity(
                            "city26",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = null,
                                oneSummerDressInAChainStoreZaraHAndM = 232f,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ),
                        CityEntity(
                            "city36",
                            "country03",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 200f,
                                oneSummerDressInAChainStoreZaraHAndM = null,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ), CityEntity(
                            "city47",
                            "country04",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 100f,
                                oneSummerDressInAChainStoreZaraHAndM = 66f,
                                onePairOfNikeRunningShoesMidRange = 70f,
                                onePairOfMenLeatherBusinessShoes = 80f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        )
                    )
                }
            })
    }


    @Test
    fun shouldTheListSizebe5() {

        val topFiveCitesNameInClothesFromFamousBrandsInteractor =
            GetTopFiveCitesNameInClothesFromFamousBrandsInteractor(object : CostOfLivingDataSource {
                override fun getAllCitiesData(): List<CityEntity> {
                    return listOf(

                        CityEntity(
                            "city11",
                            "country01",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 170f,
                                oneSummerDressInAChainStoreZaraHAndM = 350f,
                                onePairOfNikeRunningShoesMidRange = 180f,
                                onePairOfMenLeatherBusinessShoes = 200f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city12",
                            "country01",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 160f,
                                oneSummerDressInAChainStoreZaraHAndM = 300f,
                                onePairOfNikeRunningShoesMidRange = 150f,
                                onePairOfMenLeatherBusinessShoes = 177f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city23",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 140f,
                                oneSummerDressInAChainStoreZaraHAndM = 280f,
                                onePairOfNikeRunningShoesMidRange = 130f,
                                onePairOfMenLeatherBusinessShoes = 150f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city24",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 130f,
                                oneSummerDressInAChainStoreZaraHAndM = 180f,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city25",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = null,
                                oneSummerDressInAChainStoreZaraHAndM = null,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ),
                        CityEntity(
                            "city26",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = null,
                                oneSummerDressInAChainStoreZaraHAndM = 232f,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ),
                        CityEntity(
                            "city36",
                            "country03",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 200f,
                                oneSummerDressInAChainStoreZaraHAndM = null,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ), CityEntity(
                            "city47",
                            "country04",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 100f,
                                oneSummerDressInAChainStoreZaraHAndM = 66f,
                                onePairOfNikeRunningShoesMidRange = 70f,
                                onePairOfMenLeatherBusinessShoes = 80f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        )
                    )
                }
            })
//when
        val result = topFiveCitesNameInClothesFromFamousBrandsInteractor.execute()
//then
        assertEquals(5, result.size)
    }


    @Test
    fun shouldReturnCorrectFiveTopCitiesWheninputisCorrect() {
        val topFiveCitesNameInClothesFromFamousBrandsInteractor =
            GetTopFiveCitesNameInClothesFromFamousBrandsInteractor(object : CostOfLivingDataSource {
                override fun getAllCitiesData(): List<CityEntity> {
                    return listOf(

                        CityEntity(
                            "city11",
                            "country01",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 170f,
                                oneSummerDressInAChainStoreZaraHAndM = 350f,
                                onePairOfNikeRunningShoesMidRange = 180f,
                                onePairOfMenLeatherBusinessShoes = 200f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city12",
                            "country01",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 160f,
                                oneSummerDressInAChainStoreZaraHAndM = 300f,
                                onePairOfNikeRunningShoesMidRange = 150f,
                                onePairOfMenLeatherBusinessShoes = 177f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city23",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 140f,
                                oneSummerDressInAChainStoreZaraHAndM = 280f,
                                onePairOfNikeRunningShoesMidRange = 130f,
                                onePairOfMenLeatherBusinessShoes = 150f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city24",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 130f,
                                oneSummerDressInAChainStoreZaraHAndM = 180f,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city25",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = null,
                                oneSummerDressInAChainStoreZaraHAndM = null,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ),
                        CityEntity(
                            "city26",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = null,
                                oneSummerDressInAChainStoreZaraHAndM = 232f,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ),
                        CityEntity(
                            "city36",
                            "country03",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 200f,
                                oneSummerDressInAChainStoreZaraHAndM = null,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ), CityEntity(
                            "city47",
                            "country04",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 100f,
                                oneSummerDressInAChainStoreZaraHAndM = 66f,
                                onePairOfNikeRunningShoesMidRange = 70f,
                                onePairOfMenLeatherBusinessShoes = 80f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        )
                    )
                }
            })


        //given
        val topCiteNames = listOf("city11", "city12", "city23", "city24", "city47")

        //when
        val actualValue = topFiveCitesNameInClothesFromFamousBrandsInteractor.execute()


        //then
        assertEquals(topCiteNames, actualValue)

    }

    @Test
    fun shouldReturnCorrectavgWhenifunAvgPriceCorrect() {


        //given
        val clothesPrices = ClothesPrices(
            onePairOfJeansLevis50oneOrSimilar = 170f,
            oneSummerDressInAChainStoreZaraHAndM = 350f,
            onePairOfNikeRunningShoesMidRange = 180f,
            onePairOfMenLeatherBusinessShoes = 200f
        )
        //when
        val avg = avgPrice(
            clothesPrices
        )

        //then

        assertEquals(225f, avg)
    }

    @Test
    fun returnFalseWhenCitiesVaveMissingClothesPrices() {
        //given

        val topFiveCitesNameInClothesFromFamousBrandsInteractor =
            GetTopFiveCitesNameInClothesFromFamousBrandsInteractor(object : CostOfLivingDataSource {
                override fun getAllCitiesData(): List<CityEntity> {
                    return listOf(

                        CityEntity(
                            "city11",
                            "country01",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 170f,
                                oneSummerDressInAChainStoreZaraHAndM = 350f,
                                onePairOfNikeRunningShoesMidRange = 180f,
                                onePairOfMenLeatherBusinessShoes = 200f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city12",
                            "country01",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 160f,
                                oneSummerDressInAChainStoreZaraHAndM = 300f,
                                onePairOfNikeRunningShoesMidRange = 150f,
                                onePairOfMenLeatherBusinessShoes = 177f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city23",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 140f,
                                oneSummerDressInAChainStoreZaraHAndM = 280f,
                                onePairOfNikeRunningShoesMidRange = 130f,
                                onePairOfMenLeatherBusinessShoes = 150f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city24",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 130f,
                                oneSummerDressInAChainStoreZaraHAndM = 180f,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city25",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = null,
                                oneSummerDressInAChainStoreZaraHAndM = null,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ),
                        CityEntity(
                            "city26",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = null,
                                oneSummerDressInAChainStoreZaraHAndM = 232f,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ),
                        CityEntity(
                            "city36",
                            "country03",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 200f,
                                oneSummerDressInAChainStoreZaraHAndM = null,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ), CityEntity(
                            "city47",
                            "country04",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 100f,
                                oneSummerDressInAChainStoreZaraHAndM = 66f,
                                onePairOfNikeRunningShoesMidRange = 70f,
                                onePairOfMenLeatherBusinessShoes = 80f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        )
                    )
                }
            })

        val clothesPrices = CityEntity(
            "city11",
            "country01",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 170f,
                oneSummerDressInAChainStoreZaraHAndM = null,
                onePairOfNikeRunningShoesMidRange = null,
                onePairOfMenLeatherBusinessShoes = 200f
            ),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            averageMonthlyNetSalaryAfterTax = null,
            true
        )
//when
        val result = topFiveCitesNameInClothesFromFamousBrandsInteractor.excludeNullClothesPrices(clothesPrices)
//then
        assertFalse { result }
    }

    @Test
    fun returnNullWhenCitiesVaveMissingClothesPrices() {
        //given

        val topFiveCitesNameInClothesFromFamousBrandsInteractor =
            GetTopFiveCitesNameInClothesFromFamousBrandsInteractor(object : CostOfLivingDataSource {
                override fun getAllCitiesData(): List<CityEntity> {
                    return listOf(

                        CityEntity(
                            "city11",
                            "country01",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 170f,
                                oneSummerDressInAChainStoreZaraHAndM = 350f,
                                onePairOfNikeRunningShoesMidRange = 180f,
                                onePairOfMenLeatherBusinessShoes = 200f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city12",
                            "country01",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 160f,
                                oneSummerDressInAChainStoreZaraHAndM = 300f,
                                onePairOfNikeRunningShoesMidRange = 150f,
                                onePairOfMenLeatherBusinessShoes = 177f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city23",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 140f,
                                oneSummerDressInAChainStoreZaraHAndM = 280f,
                                onePairOfNikeRunningShoesMidRange = 130f,
                                onePairOfMenLeatherBusinessShoes = 150f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city24",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 130f,
                                oneSummerDressInAChainStoreZaraHAndM = 180f,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            true
                        ),
                        CityEntity(
                            "city25",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = null,
                                oneSummerDressInAChainStoreZaraHAndM = null,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ),
                        CityEntity(
                            "city26",
                            "country02",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = null,
                                oneSummerDressInAChainStoreZaraHAndM = 232f,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ),
                        CityEntity(
                            "city36",
                            "country03",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 200f,
                                oneSummerDressInAChainStoreZaraHAndM = null,
                                onePairOfNikeRunningShoesMidRange = 120f,
                                onePairOfMenLeatherBusinessShoes = 130f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        ), CityEntity(
                            "city47",
                            "country04",
                            MealsPrices(null, null, null),
                            DrinksPrices(null, null, null, null, null),
                            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                            FoodPrices(null, null, null, null, null, null),
                            ServicesPrices(null, null, null, null, null, null, null, null),
                            ClothesPrices(
                                onePairOfJeansLevis50oneOrSimilar = 100f,
                                oneSummerDressInAChainStoreZaraHAndM = 66f,
                                onePairOfNikeRunningShoesMidRange = 70f,
                                onePairOfMenLeatherBusinessShoes = 80f
                            ),
                            TransportationsPrices(null, null, null, null, null, null),
                            CarsPrices(null, null),
                            RealEstatesPrices(null, null, null, null, null, null),
                            averageMonthlyNetSalaryAfterTax = null,
                            false
                        )
                    )
                }
            })

        val clothesPrices = CityEntity(
            "city11",
            "country01",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 170f,
                oneSummerDressInAChainStoreZaraHAndM = 350f,
                onePairOfNikeRunningShoesMidRange = 180f,
                onePairOfMenLeatherBusinessShoes = 200f
            ),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            averageMonthlyNetSalaryAfterTax = null,
            true
        )
//when
        val result = topFiveCitesNameInClothesFromFamousBrandsInteractor.excludeNullClothesPrices(clothesPrices)
//then
        assertTrue { result }
    }
}











