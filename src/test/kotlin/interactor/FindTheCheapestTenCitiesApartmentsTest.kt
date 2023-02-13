package interactor

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import model.CityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FindTheCheapestTenCitiesApartmentsTest {

    private lateinit var cheapestApartments: FindTheCheapestTenCitiesApartments

    @MockK
    private lateinit var dataSource: CostOfLivingDataSource
    init {
        MockKAnnotations.init(this)
        dataSource = mockk()
    }

    @Test
    fun should_ReturnLeastCostAppartemnts_WhenNoNullOrNegativeInAllValues(){
        // given valid cities list
        val list= mutableListOf<CityEntity>()

        for (i in 0 until 100){
            val city= mockk<CityEntity>()
            every {
                city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre
            } returns i *1f
            every {
                city.averageMonthlyNetSalaryAfterTax
            } returns 100f

            every {
                city.cityName
            } returns "$i"

            list.add(city)
        }
        every {
            dataSource.getAllCitiesData()
        } returns list
        cheapestApartments=FindTheCheapestTenCitiesApartments(dataSource)

        val expectedPairs= mutableListOf<Pair<String,Double>>()

        for (i in 0 until 10){
            val pair=Pair("$i",i*1.0)
            expectedPairs.add(pair)
        }

        //when find the least cost cities for appartments
        val listOfCheapestTenCititesAppartements=cheapestApartments.execute()

        // then returns null
        assertEquals(expectedPairs,listOfCheapestTenCititesAppartements)
    }
    @Test
    fun should_ReturnNull_WhenListIsEmpty() {
        // given null list
        every {
            dataSource.getAllCitiesData()
        } returns emptyList()

        cheapestApartments=FindTheCheapestTenCitiesApartments(dataSource)

        //when find the least cost cities for appartments
        val listOfCheapestTenCititesAppartements=cheapestApartments.execute()

        // then returns null
        assertNull(listOfCheapestTenCititesAppartements)
    }

    @Test
    fun should_ReturnNull_WhenAllPricesPerSquareMeterToBuyApartmentOutsideOfCentreIsNegative() {

        // given negative price of apartments list
        val list= mutableListOf<CityEntity>()



        for (i in 0 until 10){
            val city= mockk<CityEntity>()
            every {
                city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre
            } returns -1f
            every {
                city.averageMonthlyNetSalaryAfterTax
            } returns 1f
            every {
                city.cityName
            } returns ""

            list.add(city)
        }

        every {
            dataSource.getAllCitiesData()
        } returns list

        cheapestApartments=FindTheCheapestTenCitiesApartments(dataSource)

        //when find the least cost cities for appartments
        val listOfCheapestTenCititesAppartements=cheapestApartments.execute()

        // then returns null
        assertNull(listOfCheapestTenCititesAppartements)
    }

    @Test
    fun should_ReturnNull_WhenAllSalariesIsNegative() {

        // given negative salaries cities list
        val list= mutableListOf<CityEntity>()

        for (i in 0 until 10){
            val city= mockk<CityEntity>()
            every {
                city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre
            } returns 1f
            every {
                city.averageMonthlyNetSalaryAfterTax
            } returns -1f
            every {
                city.cityName
            } returns ""

            list.add(city)
        }

        every {
            dataSource.getAllCitiesData()
        } returns list

        cheapestApartments=FindTheCheapestTenCitiesApartments(dataSource)

        //when find the least cost cities for appartments
        val listOfCheapestTenCititesAppartements=cheapestApartments.execute()

        // then returns null
        assertNull(listOfCheapestTenCititesAppartements)
    }

    @Test
    fun should_ReturnNull_WhenAllPricesPerSquareMeterToBuyApartmentOutsideOfCentreIsNull() {

        // given null price of apartments list

        val list= mutableListOf<CityEntity>()

        for (i in 0 until 10){
            val city= mockk<CityEntity>()
            every {
                city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre
            } returns null
            every {
                city.averageMonthlyNetSalaryAfterTax
            } returns 1f
            every {
                city.cityName
            } returns ""

            list.add(city)
        }

        every {
            dataSource.getAllCitiesData()
        } returns list

        cheapestApartments=FindTheCheapestTenCitiesApartments(dataSource)

        //when find the least cost cities for appartments
        val listOfCheapestTenCititesAppartements=cheapestApartments.execute()

        // then returns null
        assertNull(listOfCheapestTenCititesAppartements)
    }

    @Test
    fun should_ReturnNull_WhenAllSalariesIsNull() {

        // given null salaries list
        val list= mutableListOf<CityEntity>()

        for (i in 0 until 10){
            val city= mockk<CityEntity>()
            every {
                city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre
            } returns 1f
            every {
                city.averageMonthlyNetSalaryAfterTax
            } returns null
            every {
                city.cityName
            } returns ""

            list.add(city)
        }

        every {
            dataSource.getAllCitiesData()
        } returns list

        cheapestApartments=FindTheCheapestTenCitiesApartments(dataSource)

        //when find the least cost cities for appartments
        val listOfCheapestTenCititesAppartements=cheapestApartments.execute()

        // then returns null
        assertNull(listOfCheapestTenCititesAppartements)
    }


}