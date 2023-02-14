package interactor


import dataSource.HardCodedFakeDataSource
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest(){

    private lateinit var hardCodedFakeDataSource: HardCodedFakeDataSource
    private lateinit var getCityHasCheapestInternetConnectionInteractor: GetCityHasCheapestInternetConnectionInteractor

    @BeforeAll
    fun init() {
        hardCodedFakeDataSource = HardCodedFakeDataSource()
        getCityHasCheapestInternetConnectionInteractor =
            GetCityHasCheapestInternetConnectionInteractor(hardCodedFakeDataSource)
    }

    @Test
    fun should_ReturnCity_When_EnterValidData() {
        //Given
        hardCodedFakeDataSource.setDatatype(HardCodedFakeDataSource.DataType.VALID)
        //When
        val city = getCityHasCheapestInternetConnectionInteractor.execute(1)
        //Then
        assertEquals("paris",city.cityName)

    }

    @Test
    fun should_ReturnEmptyString_When_EnterNullData() {
        //Given
        hardCodedFakeDataSource.setDatatype(HardCodedFakeDataSource.DataType.NULLABLE)
        //When
        val city = getCityHasCheapestInternetConnectionInteractor.execute(1)
        //Then
        assertEquals("",city.cityName)
    }

}
