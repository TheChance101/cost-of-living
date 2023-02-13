package fakeDataSource

import interactor.CostOfLivingDataSource
import model.*
import javax.sql.DataSource

class FakeDataSourceForInternet : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            // region data Correct
            CityEntity(
                "Egypt",
                "country1",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 200f, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                2000f,
                false
            ),
            CityEntity(
                "London",
                "country2",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 300f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                4000f, false

            ),CityEntity(
                "Iraq",
                "country4",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 600f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5000f, false

            ),CityEntity(
                "Jordan",
                "country5",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 80f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                8000f, false

            ),
            CityEntity(
                "Russia",
                "country6",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 700f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                4000f, false

            ),CityEntity(
                "China",
                "country7",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 300f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                2000f, false

            ),
            CityEntity(
                "Lybia",
                "country8",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 300f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                2000f, false

            ),
            CityEntity(
                "Germany",
                "country9",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 500f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                4000f, false

            ),CityEntity(
                "Franca",
                "country10",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 800f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                4000f, false

            ),
            CityEntity(
                "jaban",
                "country11",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 500f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                4000f, false

            ),CityEntity(
                "tunis",
                "country12",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 700f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5000f, false

            ),CityEntity(
                "Aurdn",
                "country13",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 850f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                8000f, false

            ),
            CityEntity(
                "Surya",
                "country14",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 400f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                4000f, false

            ),CityEntity(
                "Sudia",
                "country15",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 300f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                3000f, false

            ),CityEntity(
                "Turkya",
                "country16",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 300f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                3000f, false
            ),CityEntity(
                "Sudan",
                "country17",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 300f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                3000f, false
            ),


                        //endregion

            // region null Value
            CityEntity(
                "Canada",
                "country18",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                4000f, false
            ),
            CityEntity(
                "England",
                "country19",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 300f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                null, false
            ),CityEntity(
                "Brazil",
                "country20",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5000f, false
            )
            //endregion
        )
    }

    //return false
    fun getAllCitiesWithNullSalary(): List<CityEntity> {
        return listOf(
            // region null Salary
            CityEntity(
                "Egypt",
                "country1",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 200f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                null, false
            ),
            CityEntity(
                "London",
                "country2",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 400f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                null, false
            ),
            // endregion
        )
    }

    //return false
    fun getAllCitiesWithNullPrice(): List<CityEntity> {
        return listOf(
            // region data With Null Price
            CityEntity(
                "Egypt",
                "country1",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                2000f, false
            ),
            CityEntity(
                "London",
                "country1",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                3000f, false
            ),
            //endregion
        )
    }

    //return the lowest Average
    fun getAllCitiesWithSameSalaryAndDifferentPrice(): List<CityEntity> {
        return listOf(
            // region data With Same Salary
            CityEntity(
                "Egypt",
                "country1",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 200f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                2000f, false
            ),
            CityEntity(
                "London",
                "country2",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 300f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                2000f, false
            ),
            //endregion
        )
    }

    //return the lowest Average
    fun getAllCitiesWithSamePriceAndDifferentSalary(): List<CityEntity> {
        return listOf(
            // region data With Same Price
            CityEntity(
                "Egypt",
                "country1",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 200f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                2000f, false
            ),
            CityEntity(
                "London",
                "country2",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 200f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                3000f, false
            ),
            //endregion
        )
    }

    //return the first city
    fun getAllCitiesWithSamePercentage(): List<CityEntity> {
        return listOf(
            // region data With Same Average
            CityEntity(
                "Egypt",
                "country1",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 200f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                2000f, false
            ),
            CityEntity(
                "London",
                "country2",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, 300f, null, null, null, null, null), ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                3000f, false
            ),
            //endregion
        )
    }
}

