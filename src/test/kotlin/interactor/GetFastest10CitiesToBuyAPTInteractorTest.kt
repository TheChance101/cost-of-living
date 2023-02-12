package interactor

import model.*
import model.DrinksPrices
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.BeforeAll

class GetFastest10CitiesToBuyAPTInteractorTest {

    lateinit var fastest10CitiesToBuyAPT: GetFastest10CitiesToBuyAPTInteractor

    @BeforeAll
    fun setup() {
        fastest10CitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return listOf(
                    // region low data quality
                    CityEntity(
                        "City1",
                        "Country1",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 78643.35f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 332.83f
                        ),
                        5000f,
                        false
                    ),
                    CityEntity(
                        "City2",
                        "Country2",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 78264.35f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 362.83f
                        ),
                        5000f,
                        false
                    ),
                    CityEntity(
                        "City3",
                        "Country3",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 784.35f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 372.83f
                        ),
                        5000f,
                        false
                    ),
                    CityEntity(
                        "City4",
                        "Country4",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 864.35f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 3332.83f
                        ),
                        5000f,
                        false
                    ),
                    CityEntity(
                        "City5",
                        "Country5",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 7864.35f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 3332.83f
                        ),
                        5000f,
                        false
                    ),
                    // endregion.

                    //region high data quality

                    //region null Salaries
                    CityEntity(
                        "City6",
                        "Country6",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 78643.35f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 332.83f
                        ),
                        null,
                        true
                    ),
                    CityEntity(
                        "City7",
                        "Country7",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 73.35f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 3321.83f
                        ),
                        null,
                        true
                    ),
                    CityEntity(
                        "City8",
                        "Country8",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 7863.35f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 842.83f
                        ),
                        null,
                        true
                    ),


                    //endregion

                    //region null pricePerSquareMeter
                    CityEntity(
                        "City9",
                        "Country9",
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
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                        ),
                        5000f,
                        true
                    ),
                    CityEntity(
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
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = null
                        ),
                        5000f,
                        true
                    ),

                    //endregion


                    //region price per square meter to buy APT in centre not null

                    //region average monthly salary sufficing afford to buy the apartment
                    CityEntity(
                        "City11",
                        "Country11",
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
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 3000f
                        ),
                        6900f,
                        true
                    ),
                    CityEntity(
                        "City12",
                        "Country12",
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
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 3500f
                        ),
                        7800f,
                        true
                    ),
                    CityEntity(
                        "City13",
                        "Country13",
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
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 4000f
                        ),
                        8600f,
                        true
                    ),
                    CityEntity(
                        "City14",
                        "Country14",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 19199.22f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 4500f
                        ),
                        9500f,
                        true
                    ),

                    //endregion

                    //region average monthly salary barely  sufficing afford to buy the apartment

                    CityEntity(
                        "City15",
                        "Country15",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 19159.22f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 4000f
                        ),
                        4000f,
                        true
                    ),


                    CityEntity(
                        "City16",
                        "Country16",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 13156.97f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 4500f
                        ),
                        4500f,
                        true
                    ),

                    //endregion

                    //region average monthly salary not sufficing afford to buy the apartment
                    CityEntity(
                        "City17",
                        "Country17",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 13150.97f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 3000f
                        ),
                        2500f,
                        true
                    ),
                    CityEntity(
                        "City18",
                        "Country18",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 9156.97f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 4500f
                        ),
                        2000f,
                        true
                    ),
                    CityEntity(
                        "City19",
                        "Country19",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 11156.97f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 5000f
                        ),
                        2000f,
                        true
                    ),
                    CityEntity(
                        "City20",
                        "Country20",
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
                            pricePerSquareMeterToBuyApartmentInCityCentre = 10246.97f,
                            pricePerSquareMeterToBuyApartmentOutsideOfCentre = 4500f
                        ),
                        1500f,
                        true
                    )

                    //endregion


                    //endregion

                    //endregion

                )
            }
        })
    }

    @Test
    fun execute() {


    }

    // should skip low quality data

    // should skip missing monthly salary average

    // should skip missing price per square meter outside centre

    // list size should  be 10

    // list should be sorted

    // should return correct data


}