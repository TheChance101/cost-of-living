package fakeDataSource

import interactor.CostOfLivingDataSource
import model.*

 class FakeDataSourceForFashionTask: CostOfLivingDataSource {
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
                true,
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
                true,
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
                true,
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
                true,
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
                false,
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
                false,
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
                false,
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
                false,
            ), CityEntity(
                "city58",
                "country05",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 90f,
                    oneSummerDressInAChainStoreZaraHAndM = 56f,
                    onePairOfNikeRunningShoesMidRange = 50f,
                    onePairOfMenLeatherBusinessShoes = 70f
                ),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                averageMonthlyNetSalaryAfterTax = null,
                false,
            )
            , CityEntity(
                "city69",
                "country06",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 80f,
                    oneSummerDressInAChainStoreZaraHAndM = 46f,
                    onePairOfNikeRunningShoesMidRange = 40f,
                    onePairOfMenLeatherBusinessShoes = 60f
                ),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                averageMonthlyNetSalaryAfterTax = null,
                true,
            )
        ) }
}


