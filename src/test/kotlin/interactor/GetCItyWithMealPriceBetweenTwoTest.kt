package interactor
import fakedata.DataSourceType
import fakedata.FakeDataSource

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCItyWithMealPriceBetweenTwoTest {

    private lateinit var GetCItyWithMealPriceBetweenTwoInteractorValid: GetCItyWithMealPriceBetweenTwo
    private lateinit var GetCItyWithMealPriceBetweenTwoInteractorNullable: GetCItyWithMealPriceBetweenTwo
    private lateinit var GetCItyWithMealPriceBetweenTwoInteractorEmpty: GetCItyWithMealPriceBetweenTwo

    private lateinit var fakeData: FakeDataSource

    @BeforeEach
    fun setup() {
        fakeData = FakeDataSource()
        GetCItyWithMealPriceBetweenTwoInteractorValid = GetCItyWithMealPriceBetweenTwo(fakeData)
        fakeData.dataSourceType = DataSourceType.NULLABLE
        GetCItyWithMealPriceBetweenTwoInteractorNullable = GetCItyWithMealPriceBetweenTwo(fakeData)
        fakeData.dataSourceType = DataSourceType.EMPTY
        GetCItyWithMealPriceBetweenTwoInteractorEmpty = GetCItyWithMealPriceBetweenTwo(fakeData)
    }

    @Test
    fun should_ReturnSumOfPrices_When_InputIsCity() {
        //given City
        fakeData.dataSourceType = DataSourceType.VALID
        val city = fakeData.getAllCitiesData()[0]
        //when using it as input
        val sum = GetCItyWithMealPriceBetweenTwoInteractorValid.getSumOfPrices(city)
        //then return sum of meal prices types
        assertEquals(18.0f,sum)
    }
    @Test
    fun should_ThrowException_When_InputIsCityWithNull() {
        //given City with null values
        fakeData.dataSourceType = DataSourceType.NULLABLE
        val city = fakeData.getAllCitiesData()[0]
        //when using it as input
        val sum = Executable {GetCItyWithMealPriceBetweenTwoInteractorValid.getSumOfPrices(city)}
        //then throw exception
        assertThrows(Exception::class.java, sum)
    }

    @Test
    fun should_ReturnNearest_When_InputIsCitiesAndValue() {
        //given City
        val number = 12.2f
        fakeData.dataSourceType = DataSourceType.VALID
        val cities = fakeData.getAllCitiesData()
        //when using it as input
        val nearest = GetCItyWithMealPriceBetweenTwoInteractorValid.findNearestPrice(cities,number)
        //then return nearset city
        assertEquals(cities[0],nearest)
    }

    @Test
    fun should_ThrowException_When_InputIsCitiesAndValue() {
        //given City
        val number = 12.2f
        fakeData.dataSourceType = DataSourceType.NULLABLE
        val cities = fakeData.getAllCitiesData()
        //when using it as input
        val nearest = Executable {GetCItyWithMealPriceBetweenTwoInteractorValid.findNearestPrice(cities,number)}
        //then throw exception
        assertThrows(Exception::class.java, nearest)
    }

    @Test
    fun should_ReturnNull_When_DataIsCitiesValuesAreNull() {
        //given nullabele data
        val interactor = GetCItyWithMealPriceBetweenTwoInteractorNullable
        //when execute on the input
        val city = interactor.execute()
        //then return correct city
        assertNull(city)
    }
    @Test
    fun should_ReturnNull_When_InputIsListOfNamesThatDoesNotExist() {
        //given empty data
        val interactor = GetCItyWithMealPriceBetweenTwoInteractorEmpty
        //when execute on the input
        val city = interactor.execute()
        //then return null
        assertNull(city)
    }

}