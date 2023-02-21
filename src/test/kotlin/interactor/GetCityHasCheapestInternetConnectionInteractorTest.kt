package interactor

import fakedata.DataSourceType
import fakedata.FakeDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var getCityHasCheapestInternetConnectionTest: GetCityHasCheapestInternetConnectionInteractor

    private lateinit var dataSource: CostOfLivingDataSource

    private lateinit var fakeData: FakeDataSource

    @BeforeEach
    fun setUp() {
        fakeData = FakeDataSource()
        dataSource = fakeData
        getCityHasCheapestInternetConnectionTest = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    }

    @Test
    fun should_returnCorrectPercentage_when_cityEntityIsCorrect() {
        //given correct city entity
        val fakeCityEntityValid = dataSource.getAllCitiesData()[0]
        //when find the percentage
        val percentage = getCityHasCheapestInternetConnectionTest
            .calculateThePercentageBetweenSalaryAndInternetPrice(fakeCityEntityValid)
        //then check result
        assertEquals(0.0033333334f, percentage)
    }

    @Test
    fun should_returnThrowException_when_averageSalaryIsNull() {
        //given correct internet price and null average
        fakeData.dataSourceType = DataSourceType.NULLABLE
        val fakeCityEntityNullable = dataSource.getAllCitiesData()[0]
        //when find the percentage
        val nullAverage = Executable {
            getCityHasCheapestInternetConnectionTest
                .calculateThePercentageBetweenSalaryAndInternetPrice(fakeCityEntityNullable)
        }
        //then check result
        assertThrows(Exception::class.java, nullAverage)
    }

    @Test
    fun should_returnThrowException_when_internetPriceIsNull() {
        //given correct average and null internet price
        fakeData.dataSourceType = DataSourceType.NULLABLE
        val fakeCityEntityNullable = dataSource.getAllCitiesData()[1]
        //when find the percentage
        val nullInternetPrice = Executable {
            getCityHasCheapestInternetConnectionTest
                .calculateThePercentageBetweenSalaryAndInternetPrice(fakeCityEntityNullable)
        }
        //then check result
        assertThrows(Exception::class.java, nullInternetPrice)
    }

    @Test
    fun should_returnThrowException_when_internetPriceAndAverageSalaryAreNull() {
        //given null average and null internet price
        fakeData.dataSourceType = DataSourceType.NULLABLE
        val fakeCityEntityNullable = dataSource.getAllCitiesData()[2]
        //when find the percentage
        val nullInternetPriceAndAverage = Executable {
            getCityHasCheapestInternetConnectionTest
                .calculateThePercentageBetweenSalaryAndInternetPrice(fakeCityEntityNullable)
        }
        //then check result
        assertThrows(Exception::class.java, nullInternetPriceAndAverage)
    }

    @Test
    fun should_returnThrowException_when_cityEntityIsEmpty() {
        //given empty city entity
        fakeData.dataSourceType = DataSourceType.EMPTY

        //when find the percentage
        val emptyCityEntity = Executable {
            getCityHasCheapestInternetConnectionTest
                .calculateThePercentageBetweenSalaryAndInternetPrice(dataSource.getAllCitiesData()[0])
        }
        //then check result
        assertThrows(Exception::class.java, emptyCityEntity)
    }

    @Test
    fun should_returnTrue_when_averageSalaryAndInternetPriceAreNotNull() {
        //given not null average and internet price
        val fakeCityEntityValid = dataSource.getAllCitiesData()[0]

        //when exclude null salaries and internet prices
        val excludeNullSalariesAndInternetPrices =
            getCityHasCheapestInternetConnectionTest
                .excludeNullSalariesAndNullInternetPrices(fakeCityEntityValid)

        //then check result
        assertTrue(excludeNullSalariesAndInternetPrices)
    }

    @Test
    fun should_returnFalse_when_averageSalaryIsNull() {
        fakeData.dataSourceType = DataSourceType.NULLABLE
        //given null average
        val fakeCityEntityNullable = dataSource.getAllCitiesData()[0]

        //when exclude null salaries and internet prices
        val excludeNullSalariesAndInternetPrices =
            getCityHasCheapestInternetConnectionTest
                .excludeNullSalariesAndNullInternetPrices(fakeCityEntityNullable)

        //then check result
        assertFalse(excludeNullSalariesAndInternetPrices)
    }

    @Test
    fun should_returnFalse_when_InternetPriceIsNull() {
        fakeData.dataSourceType = DataSourceType.NULLABLE
        //given null average
        val fakeCityEntityNullable = dataSource.getAllCitiesData()[1]

        //when exclude null salaries and internet prices
        val excludeNullSalariesAndInternetPrices =
            getCityHasCheapestInternetConnectionTest
                .excludeNullSalariesAndNullInternetPrices(fakeCityEntityNullable)

        //then check result
        assertFalse(excludeNullSalariesAndInternetPrices)
    }

    @Test
    fun should_returnFalse_when_InternetPriceAndAverageSalaryAreNull() {
        fakeData.dataSourceType = DataSourceType.NULLABLE
        //given null average
        val fakeCityEntityNullable = dataSource.getAllCitiesData()[2]

        //when exclude null salaries and internet prices
        val excludeNullSalariesAndInternetPrices =
            getCityHasCheapestInternetConnectionTest
                .excludeNullSalariesAndNullInternetPrices(fakeCityEntityNullable)

        //then check result
        assertFalse(excludeNullSalariesAndInternetPrices)
    }

    @Test
    fun should_returnCorrectCheapestInternetConnection_when_ListOfCityEntityIsCorrect() {
        val cheapestInternetConnectionCity = getCityHasCheapestInternetConnectionTest.execute()?.cityName
        assertEquals("Lyon", cheapestInternetConnectionCity)
    }

    @Test
    fun should_returnFalse_when_WrongAnswer() {
        val cheapestInternetConnectionCity = getCityHasCheapestInternetConnectionTest.execute()?.cityName
        assertFalse(cheapestInternetConnectionCity == "Paris")
    }

}