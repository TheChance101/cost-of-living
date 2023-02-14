package interactor

import fakedata.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {
    private lateinit var fakeNormalData: CheapInternetFakeData
    private lateinit var internetServiceProviderFakeData: InternetServiceProviderFakeData
    private lateinit var salaryServiceProviderFakeData: SalaryServiceProviderFakeData
    private lateinit var salaryServiceProviderAndInternetServiceProviderFakeData: SalaryServiceProviderAndInternetServiceProviderFakeData
    private lateinit var fakeDataWithSameCheap: FakeDataWithSameCheap
    private lateinit var negativeInternetServiceProviderFakeData: NegativeInternetServiceProviderFakeData
    private lateinit var negativeSalaryServiceProviderFakeData: NegativeSalaryServiceProviderFakeData
    @BeforeAll
    fun setUp() {
        fakeNormalData = CheapInternetFakeData()
        fakeDataWithSameCheap= FakeDataWithSameCheap()
        internetServiceProviderFakeData= InternetServiceProviderFakeData()
        salaryServiceProviderFakeData=SalaryServiceProviderFakeData()
        salaryServiceProviderAndInternetServiceProviderFakeData= SalaryServiceProviderAndInternetServiceProviderFakeData()
        negativeInternetServiceProviderFakeData=NegativeInternetServiceProviderFakeData()
        negativeSalaryServiceProviderFakeData=NegativeSalaryServiceProviderFakeData()
    }
    @Test
    fun should_ReturnCityWithCheapestInternetConnection_When_GetNormalData() {
        //given normal correct Data
        val interactor=GetCityHasCheapestInternetConnectionInteractor(fakeNormalData)
        //when find the Cheapest Internet Connection
        val city = interactor.execute()
        //then check the result of this city
        assertEquals(fakeNormalData.getAllCitiesData()[2],city)
    }
    @Test
    fun should_ReturnFirstCityWithCheapestInternetConnection_When_GetNormalDataWithSameCheap() {
        //given normal correct Data and two city or more with same cheap
        val interactor=GetCityHasCheapestInternetConnectionInteractor(fakeDataWithSameCheap)
        //when find the Cheapest Internet Connection
        val city = interactor.execute()
        //then check the result of return fist city
        assertEquals(fakeDataWithSameCheap.getAllCitiesData().get(0),city)
    }
    @Test
    fun should_ReturnNull_When_GetNullInternet60MbpsOrMoreUnlimitedDataCableAdsl() {
        //given null internet60MbpsOrMoreUnlimitedDataCableAdsl ServicesPrices
        val interactor=GetCityHasCheapestInternetConnectionInteractor(internetServiceProviderFakeData)
        //when not find the Cheapest Internet Connection
        val city = interactor.execute()
        //then no city found
        assertNull(city)
    }
    @Test
    fun should_ReturnNull_When_GetNullAverageMonthlyNetSalaryAfterTax(){
        //given null averageMonthlyNetSalaryAfterTax ServicesPrices
        val interactor=GetCityHasCheapestInternetConnectionInteractor(salaryServiceProviderFakeData)
        //when not find the Cheapest Internet Connection
        val city = interactor.execute()
        //then no city found
        assertNull(city)
    }
    @Test
    fun should_ReturnNull_When_GetNullAverageMonthlyNetSalaryAfterTaxAndetNullInternet60MbpsOrMoreUnlimitedDataCableAdsl(){
        //given null averageMonthlyNetSalaryAfterTax ServicesPrices and null internet60MbpsOrMoreUnlimitedDataCableAdsl ServicesPrices
        val interactor=GetCityHasCheapestInternetConnectionInteractor(salaryServiceProviderAndInternetServiceProviderFakeData)
        //when not find the Cheapest Internet Connection
        val city = interactor.execute()
        //then no city found
        assertNull(city)
    }
    @Test
    fun should_ReturnNull_When_GetNegativeInternet60MbpsOrMoreUnlimitedDataCableAdsl() {
        //given Negative internet60MbpsOrMoreUnlimitedDataCableAdsl ServicesPrices
        val interactor=GetCityHasCheapestInternetConnectionInteractor(negativeInternetServiceProviderFakeData)
        //when not find the Cheapest Internet Connection
        val city = interactor.execute()
        //then no city found
        assertNull(city)
    }
    @Test
    fun should_ReturnNull_When_GetNegativeAverageMonthlyNetSalaryAfterTax(){
        //given Negative averageMonthlyNetSalaryAfterTax ServicesPrices
        val interactor=GetCityHasCheapestInternetConnectionInteractor(negativeSalaryServiceProviderFakeData)
        //when not find the Cheapest Internet Connection
        val city = interactor.execute()
        //then no city found
        assertNull(city)
    }
}