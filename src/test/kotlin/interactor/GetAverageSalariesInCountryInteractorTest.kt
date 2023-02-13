package interactor

import fakeDataSource.FakeDataSource
import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class GetAverageSalariesInCountryInteractorTest {

    lateinit var getAverageSalariesInCountryInteractor: GetAverageSalariesInCountryInteractor

    @BeforeAll
    fun setUp() {
        var fake = FakeDataSource()
        getAverageSalariesInCountryInteractor = GetAverageSalariesInCountryInteractor(fake)
    }
    @Test
    fun should_ReturnTrue_When_DataQualityInCityEntityIsHigh(){
        //given
        val city = CityEntity(
            "City7", "Country7", MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            null,
            true
        )

        //when
        val dataQualityInCity = getAverageSalariesInCountryInteractor.excludeLowQualityData(city)
        //then
        assertTrue(dataQualityInCity)
    }

    @Test
    fun should_ReturnFalse_When_DataQualityInCityEntityIsLow(){
        //given
        val city = CityEntity(
            "City3", "Country3", MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            5000f,
            false
        )

        //when
        val dataQualityInCity = getAverageSalariesInCountryInteractor.excludeLowQualityData(city)
        //then
        assertFalse(dataQualityInCity)
    }

    @Test
    fun shouldReturnNull_When_AverageSalaryIsNull(){
        //given
        val city = CityEntity(
            "City6", "Country6", MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            null,
            true)
        //when
        val valueOfSalary = getAverageSalariesInCountryInteractor.excludeNullSalaries(city)
        //then
        assertFalse(valueOfSalary)
    }
    @Test
    fun shouldReturnValueOfAverageSalary_When_AverageSalaryIsNotNull(){
        //given
        val city = CityEntity(
            "City6", "Country6", MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            5000f,
            true)
        //when
        val valueOfSalary = getAverageSalariesInCountryInteractor.excludeNullSalaries(city)
        //then
        assertTrue(valueOfSalary)
    }
    @Test
    fun should_ReturnCorrectListOfCities_When_TheCountryNameIsCorrectAndInLowerCase() {
        //given
        val country = "egypt"
        val cities = listOf(Pair("Cairo",3000f),Pair("Alexandria",4000f),Pair("Mansoura",2000f),Pair("Suis",2500f))
        //when
        val listOfCitiesAndAverageSalary = getAverageSalariesInCountryInteractor.execute(country)
        //then
        assertEquals(cities,listOfCitiesAndAverageSalary)
    }

    @Test
    fun should_ReturnCorrectListOfCities_When_TheCountryNameIsCorrectAndInUpperCase() {
        //given
        val country = "EGYPT"
        val cities = listOf(Pair("Cairo",3000f),Pair("Alexandria",4000f),Pair("Mansoura",2000f),Pair("Suis",2500f))
        //when
        val listOfCitiesAndAverageSalary = getAverageSalariesInCountryInteractor.execute(country)
        //then
        assertEquals(cities,listOfCitiesAndAverageSalary)

    }

    @Test
    fun should_ReturnCorrectListOfCities_When_TheCountryNameIsCorrectAndMixedLetters() {
        //given
        val country = "Egypt"
        val cities = listOf(Pair("Cairo",3000f),Pair("Alexandria",4000f),Pair("Mansoura",2000f),Pair("Suis",2500f))

        //when
        val listOfCitiesAndAverageSalary = getAverageSalariesInCountryInteractor.execute(country)
        //then
        assertEquals(cities,listOfCitiesAndAverageSalary)

    }

    @Test
    fun should_ThrowException_When_TheNameOfTheCountryIsWrong(){
        //given
        val country = "egept"
        //when
        val listOfCitiesExecutable: Executable = org.junit.jupiter.api.function.Executable { getAverageSalariesInCountryInteractor.execute(country) }
        //then
        assertThrows(Exception::class.java,listOfCitiesExecutable)
    }



}
