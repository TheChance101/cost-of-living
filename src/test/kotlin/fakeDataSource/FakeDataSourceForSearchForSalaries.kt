package fakeDataSource

import interactor.CostOfLivingDataSource
import model.*

class FakeDataSourceForSearchForSalaries : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            createFakeCityEntity("city1", "country1", 5000f, false),
            createFakeCityEntity("city2", "country2", 5000f, false),
            createFakeCityEntity("city3", "country3", 8000f, false),
            createFakeCityEntity("city4", "country4", 2000f, false),
            createFakeCityEntity("city5", "country5", 3000f, false),
            createFakeCityEntity("city6", "country6", null, true),
            createFakeCityEntity("city7", "country7", null, true),
            createFakeCityEntity("city8", "country8", null, true),
            createFakeCityEntity("city9", "country9", null, true),
            createFakeCityEntity("city10", "country10", null, true),
            createFakeCityEntity("Cairo", "Egypt", 3000f, true),
            createFakeCityEntity("Alexandria", "Egypt", 4000f, true),
            createFakeCityEntity("Mansoura", "Egypt", 2000f, true),
            createFakeCityEntity("Suis", "Egypt", 2500f, true),
            createFakeCityEntity("Riyadh", "Saudi Arabia", 5500f, true),
            createFakeCityEntity("Jeddah", "Saudi Arabia", 4500f, true),
            createFakeCityEntity("Dammam", "Saudi Arabia", 3500f, true),
            createFakeCityEntity("Abha", "Saudi Arabia", 3000f, true),
            createFakeCityEntity("London", "UK", 7000f, true),
            createFakeCityEntity("Manchester", "UK", 5000f, true),
        )
    }

    fun getHighQualityCityEntity() = createFakeCityEntity(
        "city1", "country1", 1000f,
        true
    )


    fun getLowQualityCityEntity() = createFakeCityEntity(
        "city2", "country2", 1000f,
        false
    )

    fun getNullSalaries() = createFakeCityEntity("city3", "country3", null,
        true)

    fun getNotNullAverageSalaries() = createFakeCityEntity(
        "city4", "country4", 1000f,
        true
    )

    fun getExpectedCities() = listOf(
        Pair("Cairo", 3000f), Pair("Alexandria", 4000f), Pair("Mansoura", 2000f),
        Pair("Suis", 2500f)
    )

    fun createFakeCityEntity(
        cityName: String,
        countryName: String,
        averageSalary: Float?,
        dataQuality: Boolean
    ): CityEntity {
        return CityEntity(
            cityName, countryName, MealsPrices(null, null,
                null),
            DrinksPrices(null, null,
                null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null,
                null, null),
            FoodPrices(null, null, null, null,
                null, null),
            ServicesPrices(null,
                null, null,
                null, null, null,
                null, null),
            ClothesPrices(null, null,
                null, null),
            TransportationsPrices(null, null, null,
                null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null,
                null, null,
                null, null),
            averageSalary,
            dataQuality
        )
    }
}




