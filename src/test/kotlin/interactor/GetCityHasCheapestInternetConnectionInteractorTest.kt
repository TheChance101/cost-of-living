package interactor

import fakeDataSource.FakeDataSourceForInternet
import model.CityEntity
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var getCity: GetCityHasCheapestInternetConnectionInteractor
    private lateinit var dataSource: FakeDataSourceForInternet

    @BeforeAll
    fun setUp() {
        dataSource = FakeDataSourceForInternet()
        getCity = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    }

    @Test
    fun `Should return false when input null price`() {
        //given an object of CityEntity with Null price
        val city = dataSource.getAllCitiesWithNullPrice()[0]

        //when
        val result = getCity.excludeNullPrice(city)
        //then
        assertFalse(result)
    }

    @Test
    fun `Should return false when input null salary`() {
        //given an object of CityEntity with Null Salary
        val city = dataSource.getAllCitiesWithNullSalary()[0]
        //when
        val result = getCity.excludeNullSalaries(city)
        //then
        assertFalse(result)
    }


    @Test
    fun `Should return The Country With Cheapest Internet Price when same salary and different price`() {
        //given an object of GetCityHasCheapestInternetConnectionInteractor with return list of CityEntity That have Same Salary
        val getDataWithSameSalary = GetCityHasCheapestInternetConnectionInteractor(object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return dataSource.getAllCitiesWithSameSalaryAndDifferentPrice()
            }
        })
        //when run execute function
        val result = getDataWithSameSalary.execute()
        //then
        assertEquals("Egypt", result)
    }


    @Test
    fun `Should return The Country With Cheapest Internet Price when same price and different salary`() {
        //given an object of GetCityHasCheapestInternetConnectionInteractor with return list of CityEntity That have Same Price
        val getDataWithSamePrices = GetCityHasCheapestInternetConnectionInteractor(object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return dataSource.getAllCitiesWithSamePriceAndDifferentSalary()
            }
        })
        //when run execute function
        val result = getDataWithSamePrices.execute()
        //then
        assertEquals("London", result)
    }

    @Test
    fun `Should return The Country With Cheapest Internet Price when same percentage`() {
        //given an object of GetCityHasCheapestInternetConnectionInteractor with return list of CityEntity That have Same percentage
        val getDataWithSamePercentage = GetCityHasCheapestInternetConnectionInteractor(object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return dataSource.getAllCitiesWithSamePercentage()
            }
        })
        //when run execute function
        val result = getDataWithSamePercentage.execute()
        //then
        assertEquals("Egypt", result)
    }

    @Test
    fun `Should return The Country With Cheapest Internet Price when all cases of Data`() {
        //given an object of GetCityHasCheapestInternetConnectionInteractor with return list of CityEntity That have All Cases
        val getAllData = GetCityHasCheapestInternetConnectionInteractor(object : CostOfLivingDataSource {
            override fun getAllCitiesData(): List<CityEntity> {
                return dataSource.getAllCitiesData()
            }
        })
        //when run execute function
        val result = getAllData.execute()
        //then
        assertEquals("Jordan", result)
    }

}
