package fakeDataSource.addons

import interactor.CostOfLivingDataSource
import model.*

class FakeDataCheapestCityToRiasingOneChild {

    private val lowQualityCities = listOf(
        createFakeCity("City1", "Country1", 332.83f, 5000f, false),
        createFakeCity("City2", "Country2", 362.83f, 5040f, false),
        createFakeCity("City3", "Country3", 372.83f, 5300f, false),
        createFakeCity("City4", "Country4", 3332.83f, 50f, false),
        createFakeCity("City5", "Country5", 3332.83f, 6300f, false),
    )

    private val missingPreschoolAndPrimarySchool = listOf(
        createFakeCity("City6", "Country6", dataQuality = true),
        createFakeCity("City7", "Country7", dataQuality = true),
    )

    private val NoneMissingDataNorLowQualityData = listOf(
        createFakeCity("City8", "Country8", 100f, 5300f),
        createFakeCity("City9", "Country9", 120f, 8400f),
        createFakeCity("City10", "Country10", 240f, 6000f),
        createFakeCity("City11", "Country11", 500f, 10500f),
        createFakeCity("City12", "Country12", 100f, 5000f),
    )

    fun getLowQualityCities() = object : CostOfLivingDataSource {
        override fun getAllCitiesData() = lowQualityCities
    }

    fun getMissingPreschoolAndPrimarySchool() = object : CostOfLivingDataSource {
        override fun getAllCitiesData() = missingPreschoolAndPrimarySchool
    }

    fun getVariousData() = object : CostOfLivingDataSource {
        override fun getAllCitiesData() =
            listOf(lowQualityCities, missingPreschoolAndPrimarySchool, NoneMissingDataNorLowQualityData).flatten()
    }

    fun getExpectedResult() = createFakeCity("City12", "Country12", 100f, 5000f)

    private fun createFakeCity(
        cityName: String = "City10",
        countryName: String = "Country10",
        preschool: Float? = null,
        primarySchool: Float? = null,
        dataQuality: Boolean = true
    ) = CityEntity(
        cityName,
        countryName,
        MealsPrices(null, null, null),
        DrinksPrices(null, null, null, null, null),
        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
        FoodPrices(null, null, null, null, null, null),
        ServicesPrices(
            null, null, null, null, null, null, preschool, primarySchool
        ),
        ClothesPrices(null, null, null, null),
        TransportationsPrices(null, null, null, null, null, null),
        CarsPrices(null, null),
        RealEstatesPrices(null, null, null, null, null, null),
        null,
        dataQuality
    )


}