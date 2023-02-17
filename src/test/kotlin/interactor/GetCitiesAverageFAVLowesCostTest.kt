package interactor

import fakedata.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesAverageFAVLowesCostTest {

    private lateinit var fakeDataGetCitiesAverageFAVLowesCostThatCitiesHaveNotNullSalariesOrNullFruitsAndVegetablesPrices: FakeDataGetCitiesAverageFAVLowesCostThatCitiesHaveNotNullSalariesOrNullFruitsAndVegetablesPrices
    private lateinit var fakeDataGetCitiesAverageFAVLowesCostThatSomeCitiesHaveNullSalariesOrNullFruitsAndVegetablesPrices: FakeDataGetCitiesAverageFAVLowesCostThatSomeCitiesHaveNullSalariesOrNullFruitsAndVegetablesPrices
    private lateinit var fakeDataAllCitiesHaveNullSalaryCase: FakeDataAllCitiesHaveNullSalaryCase
    private lateinit var fakeDataAllCitiesHaveNullPricesOfFruitsAndVegetables: FakeDataAllCitiesHaveNullPricesOfFruitsAndVegetables
    @BeforeAll
    fun setUp() {
        fakeDataGetCitiesAverageFAVLowesCostThatCitiesHaveNotNullSalariesOrNullFruitsAndVegetablesPrices = FakeDataGetCitiesAverageFAVLowesCostThatCitiesHaveNotNullSalariesOrNullFruitsAndVegetablesPrices()
        fakeDataGetCitiesAverageFAVLowesCostThatSomeCitiesHaveNullSalariesOrNullFruitsAndVegetablesPrices = FakeDataGetCitiesAverageFAVLowesCostThatSomeCitiesHaveNullSalariesOrNullFruitsAndVegetablesPrices()
        fakeDataAllCitiesHaveNullSalaryCase = FakeDataAllCitiesHaveNullSalaryCase()
        fakeDataAllCitiesHaveNullPricesOfFruitsAndVegetables =  FakeDataAllCitiesHaveNullPricesOfFruitsAndVegetables()
    }
    @Test
    fun should_ReturnAtLeastTenCitiesNames_When_GetCitiesNamesThatAverageOfFruitsAndVegetablesHaveLowestCostAndAllCitiesHaveNotNullSalariesOrNullFruitsAndVegetablesPrices() {
        //Given fakeDataOfCityEntities
        val fakeDataOfCityEntities = fakeDataGetCitiesAverageFAVLowesCostThatCitiesHaveNotNullSalariesOrNullFruitsAndVegetablesPrices
        //When execute to get Cities Names That Average Fruits And Vegetables Lowest Cost
        val citiesNames = GetCitiesAverageFAVLowesCost(fakeDataOfCityEntities).execute(10)
        //Then Get At Least 10 Names Of Cities
        assertEquals(listOf("Dendera","Deir Mawas","Dairut","Dekernes","Dar El Salam","Daraw","Dishna","Cairo","Dahab","Desouk"),citiesNames)
    }

    @Test
    fun should_ReturnAtLeastTenCitiesNames_When_GetCitiesNamesThatAverageOfFruitsAndVegetablesHaveLowestCostAndSomeOfCitiesHaveNullSalariesAndNullFruitsAndVegetablesPrices() {
        //Given FakeDataOfCityEntities
        val fakeDataOfCityEntities = fakeDataGetCitiesAverageFAVLowesCostThatSomeCitiesHaveNullSalariesOrNullFruitsAndVegetablesPrices
        //When execute to get Cities Names That Average Fruits And Vegetables Lowest Cost
        val citiesNames = GetCitiesAverageFAVLowesCost(fakeDataOfCityEntities).execute(10)
        //Then Get At Least 10 Names Of Cities
        assertEquals(listOf("Edfu","Dishna","Dar El Salam","Dairut","Dahab","Desouk","Cairo","Daraw"),citiesNames)
    }

    @Test
    fun should_ReturnEmptyList_When_GetCitiesNamesThatAverageOfFruitsAndVegetablesHaveLowestCostAndAllCitiesHaveNonOrNullSalaries() {
        //Given fakeDataOfCitiesNullSalary
        val fakeDataOfCitiesNullSalary = fakeDataAllCitiesHaveNullSalaryCase
        //When execute to get Cities Names That Average Fruits And Vegetables Lowest Cost
        val citiesNames = GetCitiesAverageFAVLowesCost(fakeDataOfCitiesNullSalary).execute(10)
        //Then Get EmptyList Of Cities
        assertEquals(emptyList<String>(),citiesNames)
    }

    @Test
    fun should_ReturnEmptyList_When_GetCitiesNamesThatAverageOfFruitsAndVegetablesHaveLowestCostAndPricesOfFruitsAndVegetablesOfAllCitiesAreNull() {
        //Given fakeDataAllCitiesHaveNullPricesOfFAV
        val fakeDataAllCitiesHaveNullPricesOfFAV = fakeDataAllCitiesHaveNullPricesOfFruitsAndVegetables
        //When execute to get Cities Names That Average Fruits And Vegetables Lowest Cost
        val citiesNames = GetCitiesAverageFAVLowesCost(fakeDataAllCitiesHaveNullPricesOfFAV).execute(10)
        //Then Get EmptyList Of Cities
        assertEquals(emptyList<String>(),citiesNames)
    }


}