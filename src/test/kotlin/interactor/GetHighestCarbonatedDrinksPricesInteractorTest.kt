package interactor


import model.CityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance
import model.FakeDataSource
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestCarbonatedDrinksPricesInteractorTest(){

    private lateinit var fakeData : FakeDataSource
    private lateinit var getHighestCarbonatedDrinksPricesInteractor: GetHighestCarbonatedDrinksPricesInteractor
    @BeforeAll
    fun first(){
        fakeData = FakeDataSource()
        getHighestCarbonatedDrinksPricesInteractor = GetHighestCarbonatedDrinksPricesInteractor(fakeData)
    }

    @Test
    fun should_return_listOfPairs_When_Data_Valid(){
        //given
        val listofPairs = getHighestCarbonatedDrinksPricesInteractor.execute()
        //when
        fakeData.setDataType(FakeDataSource.DataType.VALID)
        //then
        assertTrue(listofPairs.size ==10)
    }

    @Test
    fun should_return_Null_When_Data_LowQuality(){
        //given
        val listofPairs = getHighestCarbonatedDrinksPricesInteractor.execute()
        //when
        fakeData.setDataType(FakeDataSource.DataType.LOWQUALITY)
        //then
        assertTrue(listofPairs.isEmpty())
    }

    @Test
    fun should_return_Null_When_Data_NotFound(){
        //given
        val listofPairs = getHighestCarbonatedDrinksPricesInteractor.execute()
        //when
        fakeData.setDataType(FakeDataSource.DataType.LOWQUALITY)
        //then
        assertTrue(listofPairs.isEmpty())
    }





}