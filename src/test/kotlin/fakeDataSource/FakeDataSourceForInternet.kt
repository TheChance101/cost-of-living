package fakeDataSource

import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import model.*

class FakeDataSourceForInternet {


    fun getAllCity() = allCityData

    fun getAllCitiesWithSamePercentage() = citiesWithSamePercentage

    fun getAllCitiesWithNullSalary() = citiesWithNullSalary

    fun getAllCitiesWithNullPrice() = citiesWithNullPrice

    fun getAllCitiesWithSameSalaryAndDifferentPrice() = citiesWithSameSalary

    fun getAllCitiesWithSamePriceAndDifferentSalary() = citiesWithSamePrices

    fun getAllCitiesWithNegativeSalary() = cityWithNegativeSalary

    fun getAllCitiesWithNegativePrice() = cityWithNegativePrice

    fun getAllCitiesWithNegativePriceAndSalary() = cityWithNegativePriceAndSalary

    private val cityWithNegativePriceAndSalary = object : CostOfLivingDataSource {
        override fun getAllCitiesData(): List<CityEntity> {
            return listOf(
                createFakeCity("Egypt", -2000f, -200f),
                createFakeCity("London", -4000f, -400f)
            )
        }

    }

    private val cityWithNegativePrice = object : CostOfLivingDataSource {
        override fun getAllCitiesData(): List<CityEntity> {
            return listOf(
                createFakeCity("Egypt", 5050f, -70f),
                createFakeCity("London", 7000f, -300f)
            )
        }

    }

    private val cityWithNegativeSalary = object : CostOfLivingDataSource {
        override fun getAllCitiesData(): List<CityEntity> {
            return listOf(
                createFakeCity("Egypt", -59450f, 1780f),
                createFakeCity("London", -7000f, 700f)
            )
        }

    }
    private val allCityData =
        object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf(
                    createFakeCity("Germany", 2000f, null),
                    createFakeCity("London", 5000f, 500f),
                    createFakeCity("England", 7000f, 750f),
                    createFakeCity("America", null, 1700f),
                    createFakeCity("Libya", 1200f, 210f),
                    createFakeCity("Iraq", 7800f, 1500f),
                    createFakeCity("Saudi Arabia", 7000f, 2020f),
                    createFakeCity("Japan", 5200f, null),
                    createFakeCity("Britain", 6400f, 105f),
                    createFakeCity("Syria", 9300f, 200f),
                    createFakeCity("Palestine", 6000f, 300f),
                    createFakeCity("Morocco", 4000f, 450f),
                    createFakeCity("Tunisia", 3000f, 10f),
                    createFakeCity("Turkey", 4200f, 800f),
                    createFakeCity("Brazil", 6000f, 1000f),
                    createFakeCity("Algeria", 3200f, 20f),
                    createFakeCity("France", 5580f, 209f),
                    createFakeCity("Iran", 7890f, 562f),
                    createFakeCity("The UAE", 8964f, 452f),
                    createFakeCity("Egypt", 5000f, 200f),
                )
            }
        }


    private val citiesWithSamePercentage =
        object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf(
                    createFakeCity("Egypt", 2000f, 200f),
                    createFakeCity("London", 4000f, 400f),
                    createFakeCity("England", 5000f, 500f)
                )
            }
        }

    private val citiesWithSameSalary = object : CostOfLivingDataSource {
        override fun getAllCitiesData(): List<CityEntity> {
            return listOf(
                // region data With Same Salary
                createFakeCity("Egypt", 2000f, 10f),
                createFakeCity("London", 2000f, 20f),
                //endregion
            )
        }
    }

    private val citiesWithSamePrices =
        object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf(
                    // region data With Same Price
                    createFakeCity("Egypt", 2000f, 500f),
                    createFakeCity("London", 4000f, 500f),
                    //endregion
                )
            }
        }

    private val citiesWithNullSalary = object : CostOfLivingDataSource {
        override fun getAllCitiesData(): List<CityEntity> {
            return listOf(
                // region null Salary
                createFakeCity("Egypt", null, 1000f),
                createFakeCity("London", null, 500f),
                // endregion
            )
        }
    }

    private val citiesWithNullPrice = object : CostOfLivingDataSource {
        override fun getAllCitiesData(): List<CityEntity> {
            return listOf(
                // region data With Null Price
                createFakeCity("Egypt", 2000f, null),
                createFakeCity("London", 4000f, null),
                //endregion
            )
        }
    }

    private fun createFakeCity(
        cityName: String,
        salary: Float?,
        price: Float?
    ): CityEntity = CityEntity(
        cityName,
        "country1",
        MealsPrices(null, null, null),
        DrinksPrices(null, null, null, null, null),
        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
        FoodPrices(null, null, null, null, null, null),
        ServicesPrices(null, null, price, null, null, null, null, null),
        ClothesPrices(null, null, null, null),
        TransportationsPrices(null, null, null, null, null, null),
        CarsPrices(null, null),
        RealEstatesPrices(null, null, null, null, null, null),
        salary,
        false
    )

}

