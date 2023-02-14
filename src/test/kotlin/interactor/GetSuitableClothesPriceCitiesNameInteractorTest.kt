package interactor

import fakedata.FakeBrandDataWithNull
import fakedata.FakeDataWithNull
import fakedata.FakeFullData
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class GetSuitableClothesPriceCitiesNameInteractorTest {
    private lateinit var fakeFullData : FakeFullData
    private lateinit var fakeDataWithNull: FakeDataWithNull
    private lateinit var fakeBrandDataWithNull: FakeBrandDataWithNull

    @BeforeAll
    fun setup()
    {
        fakeFullData= FakeFullData()
        fakeDataWithNull= FakeDataWithNull()
        fakeBrandDataWithNull = FakeBrandDataWithNull()

    }
    @Test
    fun should_ReturnTop5CitiesName_When_EnterListOfCitiesWithFullData() {
        //given list of five city
        val listOfCities =GetSuitableClothesPriceCitiesNameInteractor(fakeFullData)
        //when find top 5cities for suitable price
        val topFiveCities =listOfCities.execute(5)
        //then check the result
        assertEquals(listOf("aswan","Giza","tanta","alexandria","cairo"),topFiveCities)
    }
    @Test
    fun should_ReturnTop5CitiesName_When_EnterListOfCitiesWithOneOrMoreBrand() {
        //given list of more than five cities with at least one brand or more for a city
        val listOfCities =GetSuitableClothesPriceCitiesNameInteractor(fakeBrandDataWithNull)
        //when find top 5cities for suitable price
        val topFiveCities =listOfCities.execute(5)
        //then check the result
        assertEquals(listOf("El-minya","aswan","Giza","tanta","alexandria"),topFiveCities)
    }
    @Test
    fun should_ExcludeCity_When_AllClothesPriceHaveNullValue()
    {
        //given list contain city with null value for all clothes price
        val listOfCities =GetSuitableClothesPriceCitiesNameInteractor(fakeDataWithNull)
        //when find top cities and exclude city have no brand for clothes
        val topCities = listOfCities.execute(5)
        //then check the result
        assertEquals(listOf("aswan","Giza","tanta","cairo"),topCities)

    }
}