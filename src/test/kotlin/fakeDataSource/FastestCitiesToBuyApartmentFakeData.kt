package fakeDataSource

import interactor.CostOfLivingDataSource
import model.*

class FastestCitiesToBuyApartmentFakeData {

    private val lowQualityCities = listOf(
        // region low data quality

        createFakeCity("City1", "Country1",332.83f, 5000f, false),
        createFakeCity("City2", "Country2", 362.83f, 5000f, false),
        createFakeCity("City3", "Country3", 372.83f, 5000f, false),
        createFakeCity("City4", "Country4", 3332.83f, 5000f, false),
        createFakeCity("City5", "Country5", 3332.83f, 5000f, false),

        // endregion.
    )

    private val missingPricePerSquareMeterOutsideCentre = listOf(
        //region null pricePerSquareMeter

        createFakeCity("City9", "Country9",  null, 5000f, true),
        createFakeCity("City10", "Country10", null, 5000f, true),

        //endregion

    )

    private val missingSalary = listOf(
        //region null Salaries

        createFakeCity("City6", "Country6", 332.83f, null, true),
        createFakeCity("City7", "Country7", 3321.83f, null, true),
        createFakeCity("City8", "Country8", 842.83f, null, true),

        //endregion
    )

    private val variousScenarioForSalaryAndPricePerSquare = listOf(
        //region average monthly salary sufficing afford to buy the apartment

        createFakeCity("City12", "Country12", 3500f, 7800f, true),
        createFakeCity("City13", "Country13", 4000f, 8600f, true),
        createFakeCity("City11", "Country11", 3000f, 6900f, true),
        createFakeCity("City14", "Country14", 4500f, 9500f, true),

        //endregion

        //region average monthly salary barely  sufficing afford to buy the apartment

        createFakeCity("City15", "Country15",4000f, 4000f, true),
        createFakeCity("City16", "Country16", 4500f, 4500f, true),

        //endregion

        //region average monthly salary not sufficing afford to buy the apartment
        createFakeCity("City17", "Country17", 3000f, 2500f, true),
        createFakeCity("City19", "Country19", 5000f, 2000f, true),
        createFakeCity("City20", "Country20",  4500f, 1500f, true),
        createFakeCity("City18", "Country18", 4500f, 2000f, true)

        //endregion

    )

    private val singleCityEntity = createFakeCity("City11", "Country11",
        3000f,6900f, true)

    fun getSingleCityEntity() = singleCityEntity

    fun getExpectedResultOfNumberOfYearsForSingleCityEntity() = 3.6231884057971016

    fun getExpectedResultForVariousData() = listOf(
        Pair("City11", 3.6231884057971016),
        Pair("City12", 3.7393162393162394),
        Pair("City13", 3.875968992248062),
        Pair("City14", 3.9473684210526314),
        Pair("City15", 8.333333333333334),
        Pair("City16", 8.333333333333334),
        Pair("City17", 10.0),
        Pair("City18", 18.75),
        Pair("City19", 20.833333333333332),
        Pair("City20", 25.0)
    )


    fun getLowQualityCities() = object : CostOfLivingDataSource {
        override fun getAllCitiesData() = lowQualityCities

    }

    fun getMissingPricePerSquareMeterOutsideCentre() = object : CostOfLivingDataSource {
        override fun getAllCitiesData() = missingPricePerSquareMeterOutsideCentre

    }


    fun getMissingSalary() = object : CostOfLivingDataSource {
        override fun getAllCitiesData() = missingSalary

    }

    fun getVariousData() = object : CostOfLivingDataSource {
        override fun getAllCitiesData() = listOf(
            lowQualityCities,
            missingSalary,
            missingPricePerSquareMeterOutsideCentre,
            variousScenarioForSalaryAndPricePerSquare
        ).flatten()

    }

    fun createFakeCity(
        apartmentPrice: Float?,
        salary: Float?,
        dataQuality: Boolean) = CityEntity(
        "City10",
        "Country10",
        MealsPrices(null, null, null),
        DrinksPrices(null, null, null, null, null),
        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
        FoodPrices(null, null, null, null, null, null),
        ServicesPrices(null, null, null, null, null, null, null, null),
        ClothesPrices(null, null, null, null),
        TransportationsPrices(null, null, null, null, null, null),
        CarsPrices(null, null),
        RealEstatesPrices(
            apartmentOneBedroomInCityCentre = null,
            apartmentOneBedroomOutsideOfCentre = null,
            apartment3BedroomsInCityCentre = null,
            apartment3BedroomsOutsideOfCentre = null,
            pricePerSquareMeterToBuyApartmentInCityCentre = null,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = apartmentPrice
        ),
        salary,
        dataQuality
    )

    fun createFakeCity(cityName: String,
                       countryName: String,
                       apartmentPrice: Float?,
                       salary: Float?,
                       dataQuality: Boolean) = CityEntity(cityName, countryName,
        MealsPrices(null, null, null),
        DrinksPrices(null, null, null, null, null),
        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
        FoodPrices(null, null, null, null, null, null),
        ServicesPrices(null, null, null, null, null, null, null, null),
        ClothesPrices(null, null, null, null),
        TransportationsPrices(null, null, null, null, null, null),
        CarsPrices(null, null),
        RealEstatesPrices(
            apartmentOneBedroomInCityCentre = null,
            apartmentOneBedroomOutsideOfCentre = null,
            apartment3BedroomsInCityCentre = null,
            apartment3BedroomsOutsideOfCentre = null,
            pricePerSquareMeterToBuyApartmentInCityCentre = null,
            pricePerSquareMeterToBuyApartmentOutsideOfCentre = apartmentPrice
        ),
        salary,
        dataQuality
    )

}
