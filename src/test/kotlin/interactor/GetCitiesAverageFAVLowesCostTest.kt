package interactor

import fakedata.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesAverageFAVLowesCostTest {

    private lateinit var fakeDataGetCitiesHaveNotNullSalariesAndNotNullFruitsAndVegetablesPrices: FakeDataGetCitiesHaveNotNullSalariesAndNotNullFruitsAndVegetablesPrices
    private lateinit var fakeDataGetCitiesHaveSomeNullSalariesAndSomeNullFruitsAndVegetablesPrices: FakeDataGetCitiesHaveSomeNullSalariesAndSomeNullFruitsAndVegetablesPrices
    private lateinit var fakeDataAllCitiesHaveNullSalary: FakeDataAllCitiesHaveNullSalary
    private lateinit var fakeDataAllCitiesHaveNullFruitsAndVegetablesPrices: FakeDataAllCitiesHaveNullFruitsAndVegetablesPrices
    @BeforeAll
    fun setUp() {
        fakeDataGetCitiesHaveNotNullSalariesAndNotNullFruitsAndVegetablesPrices = FakeDataGetCitiesHaveNotNullSalariesAndNotNullFruitsAndVegetablesPrices()
        fakeDataGetCitiesHaveSomeNullSalariesAndSomeNullFruitsAndVegetablesPrices = FakeDataGetCitiesHaveSomeNullSalariesAndSomeNullFruitsAndVegetablesPrices()
        fakeDataAllCitiesHaveNullSalary = FakeDataAllCitiesHaveNullSalary()
        fakeDataAllCitiesHaveNullFruitsAndVegetablesPrices =  FakeDataAllCitiesHaveNullFruitsAndVegetablesPrices()
    }
    @Test
    fun `should return at most ten cities names when given data with not null salaries and not null fruit and vegetable prices`() {
        //Given fakeDataOfCityEntities
        val fakeDataOfCityEntities = fakeDataGetCitiesHaveNotNullSalariesAndNotNullFruitsAndVegetablesPrices
        //When execute to get Cities Names That Average Fruits And Vegetables The Lowest Cost
        val citiesNames = GetCitiesAverageFAVLowesCost(fakeDataOfCityEntities).execute(10)
        //Then Get At Most 10 Names Of Cities
        assertEquals(listOf("Dendera","Deir Mawas","Dairut","Dekernes","Dar El Salam","Daraw","Dishna","Cairo","Dahab","Desouk"),citiesNames)
    }

    @Test
    fun `should return at most ten cities names when given data with some null salaries and some null fruit and vegetable prices`() {
        //Given FakeDataOfCityEntities
        val fakeDataOfCityEntities = fakeDataGetCitiesHaveSomeNullSalariesAndSomeNullFruitsAndVegetablesPrices
        //When execute to get Cities Names That Average Fruits And Vegetables The Lowest Cost
        val citiesNames = GetCitiesAverageFAVLowesCost(fakeDataOfCityEntities).execute(10)
        //Then Get At Most 10 Names Of Cities
        assertEquals(listOf("Edfu","Dishna","Dar El Salam","Dairut","Dahab","Desouk","Cairo","Daraw"),citiesNames)
    }

    @Test
    fun `should return empty list when given data with null salaries and not null fruit and vegetable prices`() {
        //Given fakeDataOfCitiesNullSalary
        val fakeDataOfCitiesNullSalary = fakeDataAllCitiesHaveNullSalary
        //When execute to get Cities Names That Average Fruits And Vegetables The Lowest Cost
        val citiesNames = GetCitiesAverageFAVLowesCost(fakeDataOfCitiesNullSalary).execute(10)
        //Then Get EmptyList Of Cities
        assertEquals(emptyList<String>(),citiesNames)
    }

    @Test
    fun `should return empty list when given data with not null salaries and null fruit and vegetable prices`() {
        //Given fakeDataAllCitiesHaveNullPricesOfFAV
        val fakeDataAllCitiesHaveNullPricesOfFAV = fakeDataAllCitiesHaveNullFruitsAndVegetablesPrices
        //When execute to get Cities Names That Average Fruits And Vegetables The Lowest Cost
        val citiesNames = GetCitiesAverageFAVLowesCost(fakeDataAllCitiesHaveNullPricesOfFAV).execute(10)
        //Then Get EmptyList Of Cities
        assertEquals(emptyList<String>(),citiesNames)
    }
    @Test
    fun `should return empty list when given Any data with lower than 1`() {
        //Given FakeDataOfCityEntities
        val fakeDataOfCityEntities = fakeDataGetCitiesHaveNotNullSalariesAndNotNullFruitsAndVegetablesPrices
        //When execute to get Cities Names That Average Fruits And Vegetables The Lowest Cost
        val citiesNames = GetCitiesAverageFAVLowesCost(fakeDataOfCityEntities).execute(-1)
        //Then Get EmptyList Of Cities
        assertEquals(emptyList<String>(),citiesNames)
    }


}