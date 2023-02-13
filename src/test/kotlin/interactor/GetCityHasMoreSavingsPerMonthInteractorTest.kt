package interactor

import org.junit.jupiter.api.Test
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import model.CityEntity
import model.FoodPrices
import model.RealEstatesPrices
import model.TransportationsPrices
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach


internal class GetCityHasMoreSavingsPerMonthInteractorTest {
    private lateinit var citySavings: GetCityHasMoreSavingsPerMonthInteractor

    @MockK
    private lateinit var dataSource: CostOfLivingDataSource

    @MockK
    private lateinit var transportationsNullAndFoodPriceAndApartmentAndAverageSalaryNotNull: CityEntity

    @MockK
    private lateinit var foodPricesWithNull: CityEntity


    @MockK
    private lateinit var averageSalaryWithNull: CityEntity

    @MockK
    private lateinit var transportationsPricesWithNotNull: CityEntity

    @MockK
    private lateinit var apartmentPricesWithNull: CityEntity


    @MockK
    private lateinit var transportationsNotNullAndFoodPriceAndApartmentAndAverageSalaryNull: CityEntity


    @BeforeEach
    fun setup() {
        MockKAnnotations.init(this)

    }

    @Test
    fun should_ReturnCity_When_ApartmentAndCostFoodNotNullAndTransportationsIsNull() {

        // given city with apartment and cost food not null and transportations is null

        every {
            transportationsNullAndFoodPriceAndApartmentAndAverageSalaryNotNull.foodPrices
        }returns FoodPrices(10f,20f,30f,40f,10f,50f)

        every {
            transportationsNullAndFoodPriceAndApartmentAndAverageSalaryNotNull.realEstatesPrices
        }returns RealEstatesPrices(10f,20f,30f,40f,10f,50f)

        every {
            transportationsNullAndFoodPriceAndApartmentAndAverageSalaryNotNull.averageMonthlyNetSalaryAfterTax
        }returns 200f

        every {
            transportationsNullAndFoodPriceAndApartmentAndAverageSalaryNotNull.transportationsPrices
        }returns TransportationsPrices(null,null,null,null,null,null)

        every {
            dataSource.getAllCitiesData()
        } returns listOf(transportationsNullAndFoodPriceAndApartmentAndAverageSalaryNotNull)



        // when find the most  city in the world have more savings per month.
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)
        val getCity = citySavings.execute()


        // done
        assertEquals(transportationsNullAndFoodPriceAndApartmentAndAverageSalaryNotNull, getCity)


    }


    @Test
    fun should_ReturnCity_When_countSavingPerMonthNotNull(){

        // given city saving permonth not null
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, FIND_COUNT_SAVING_PER_MONTH_NOT_NULL_FILE)
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)
        val listCityData=dataSource.getAllCitiesData()


        // when find the most  city in the world have more savings per month.
        val getCity = citySavings.execute()


        // done
        assertEquals(listCityData[0],getCity)

    }


    @Test
    fun  should_ReturnNull_When_countSavingPerMonthNull(){

        // given city with count Saving PerMonth null
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, NULL_CITY_FILE)
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)


        // when find the most  city in the world have more savings per month.
        val getNull = citySavings.execute()


        //done
        assertNull(getNull)

    }

    @Test
    fun should_ReturnNull_When_FoodPriceNull() {

        // given city with food price is null
        every {
            foodPricesWithNull.foodPrices
        } returns FoodPrices(10f,20f,null,40f,10f,50f)

        every {
            foodPricesWithNull.realEstatesPrices
        } returns RealEstatesPrices(10f,20f,null,40f,10f,50f)


        every {
            dataSource.getAllCitiesData()
        } returns listOf(foodPricesWithNull)

        // when find the most  city in the world have more savings per month.
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)
        val getNull = citySavings.execute()


        // done
        assertNull(getNull)


    }
    @Test
    fun should_ReturnNull_When_ApartmentNull() {

        // given city with apartment is null
        every {
            apartmentPricesWithNull.foodPrices
        }returns  FoodPrices(10f,20f,30f,15f,25f,40f)
        every {
            apartmentPricesWithNull.realEstatesPrices
        } returns RealEstatesPrices(10f,20f,null,null,10f,15f)

        every {
            dataSource.getAllCitiesData()
        } returns listOf( apartmentPricesWithNull)


        // when find the most  city in the world have more savings per month.
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)
        val getNull = citySavings.execute()


        // done
        assertNull(getNull)


    }

    @Test
    fun should_ReturnNull_When_AverageSalaryNull() {

        // given city with average salary  null
        every {
            averageSalaryWithNull.foodPrices
        }returns  FoodPrices(10f,20f,30f,15f,25f,40f)

        every {
            averageSalaryWithNull.realEstatesPrices
        } returns RealEstatesPrices(10f,20f,null,null,10f,15f)

        every {
            averageSalaryWithNull.averageMonthlyNetSalaryAfterTax
        } returns null

        every {
            dataSource.getAllCitiesData()
        } returns listOf( averageSalaryWithNull)


        // when find the most  city in the world have more savings per month.
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)
        val getNull = citySavings.execute()


        // done
        assertNull(getNull)


    }


    @Test
    fun should_ReturnNull_When_TransportationsNotNull() {

        // given city transportations not null
        every {
            transportationsPricesWithNotNull.foodPrices
        }returns  FoodPrices(10f,20f,30f,15f,25f,40f)

        every {
            transportationsPricesWithNotNull.realEstatesPrices
        } returns RealEstatesPrices(10f,20f,null,null,10f,15f)

        every {
            transportationsPricesWithNotNull.averageMonthlyNetSalaryAfterTax
        } returns 500f

        every {
            transportationsPricesWithNotNull.transportationsPrices
        }returns TransportationsPrices(10f,20f,30f,40f,50f,60f)

        every {
            dataSource.getAllCitiesData()
        } returns listOf( transportationsPricesWithNotNull)


        // when find the most  city in the world have more savings per month.
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)
        val getNull = citySavings.execute()


        // done
        assertNull(getNull)


    }


    @Test
    fun should_ReturnNull_When_TransportationsNotNullAndFoodPriceAndApartmentAndAverageSalaryNull() {

        // given city with transportations not null and food price And apartment is null
        every {
            transportationsNotNullAndFoodPriceAndApartmentAndAverageSalaryNull.foodPrices
        }returns  FoodPrices(10f,20f,30f,15f,25f,40f)

        every {
            transportationsNotNullAndFoodPriceAndApartmentAndAverageSalaryNull.realEstatesPrices
        } returns RealEstatesPrices(10f,20f,null,null,10f,15f)

        every {
            transportationsNotNullAndFoodPriceAndApartmentAndAverageSalaryNull.averageMonthlyNetSalaryAfterTax
        } returns 500f

        every {
            transportationsNotNullAndFoodPriceAndApartmentAndAverageSalaryNull.transportationsPrices
        }returns TransportationsPrices(10f,20f,30f,40f,50f,60f)

        every {
            dataSource.getAllCitiesData()
        } returns listOf( transportationsNotNullAndFoodPriceAndApartmentAndAverageSalaryNull)


        // when find the most  city in the world have more savings per month.
        citySavings = GetCityHasMoreSavingsPerMonthInteractor(dataSource)
        val getNull = citySavings.execute()


        //done
        assertNull(getNull)

    }



}




