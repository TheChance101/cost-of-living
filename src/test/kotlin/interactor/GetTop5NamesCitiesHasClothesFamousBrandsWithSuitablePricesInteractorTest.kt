package interactor

import model.NameCityClothesPrices
import org.junit.jupiter.api.*

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractorTest {

    lateinit var inputData : MutableList<NameCityClothesPrices>
    lateinit var getTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor: GetTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor

    @BeforeEach
    fun Setup()
    {
        inputData = mutableListOf()
        getTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor= GetTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor(inputData)
    }


    @Test
    fun should_TrowException_when_listIsEmpty()
    {
        //Given empty mutablelist

        //when
        val nameTop5City : Executable = Executable{getTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor.execute() }

        //then
        assertThrows(Exception::class.java , nameTop5City )
    }


    @Test
    fun should_TrowException_when_listHasLessThanFiveCities()
    {
        //Given less than 5 city
        val  insertNameCityClothesPrice = NameCityClothesPrices(
            cityName="cairo",
            onePairOfJeansLevis50oneOrSimilar = 24.0f ,
            oneSummerDressInAChainStoreZaraHAndM = 9.0f ,
            onePairOfNikeRunningShoesMidRange =8.3f,
            onePairOfMenLeatherBusinessShoes = 3.2f,
        )
        inputData.add(insertNameCityClothesPrice)
        //when
        val nameTop5City : Executable = Executable{getTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor.execute() }

        //then
        assertThrows(Exception::class.java , nameTop5City )
    }


    @Test
    fun should_TrowException_when_allCitisHaveNotAnyClothes()
    {
        //Given city has not any clothes
        val  insertNameCityClothesPrice = NameCityClothesPrices(
            cityName="cairo",
            onePairOfJeansLevis50oneOrSimilar = null ,
            oneSummerDressInAChainStoreZaraHAndM = null ,
            onePairOfNikeRunningShoesMidRange =null,
            onePairOfMenLeatherBusinessShoes = null,
        )
        inputData.add(insertNameCityClothesPrice)
        inputData.add(insertNameCityClothesPrice)
        inputData.add(insertNameCityClothesPrice)
        inputData.add(insertNameCityClothesPrice)
        inputData.add(insertNameCityClothesPrice)

        //when
        val nameTop5City : Executable = Executable{getTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor.execute() }

        //then
        assertThrows(Exception::class.java , nameTop5City )
    }




}