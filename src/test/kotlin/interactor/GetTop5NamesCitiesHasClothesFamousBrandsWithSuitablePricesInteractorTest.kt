package interactor

import model.CityNameClothesPrices
import org.junit.jupiter.api.*

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractorTest {


    lateinit var fakeData : MutableList<CityNameClothesPrices>
    lateinit var getTop5CitiesNameHasSuitableClothesPricesInteractor: GetTop5CitiesNameHasSuitableClothesPricesInteractor

    @BeforeEach
    fun Setup()
    {
        fakeData = mutableListOf()
        getTop5CitiesNameHasSuitableClothesPricesInteractor= GetTop5CitiesNameHasSuitableClothesPricesInteractor(fakeData)
    }


    @Test
    fun should_TrowException_when_listIsEmpty()
    {
        //Given empty mutablelist

        //when
        val nameTop5City : Executable = Executable{getTop5CitiesNameHasSuitableClothesPricesInteractor.execute() }

        //then
        assertThrows(Exception::class.java , nameTop5City )
    }


    @Test
    fun should_TrowException_when_listHasLessThanFiveCities()
    {
        //Given less than 5 city
        val  insertNameCityClothesPrice = CityNameClothesPrices(
            cityName="cairo",
            onePairOfJeansLevis50oneOrSimilar = 24.0f ,
            oneSummerDressInAChainStoreZaraHAndM = 9.0f ,
            onePairOfNikeRunningShoesMidRange =8.3f,
            onePairOfMenLeatherBusinessShoes = 3.2f,
        )
        fakeData.add(insertNameCityClothesPrice)
        //when
        val nameTop5City : Executable = Executable{getTop5CitiesNameHasSuitableClothesPricesInteractor.execute() }

        //then
        assertThrows(Exception::class.java , nameTop5City )
    }


    @Test
    fun should_TrowException_when_allCitisHaveNotAnyClothes()
    {
        //Given city has not any clothes
        val  insertNameCityClothesPrice = CityNameClothesPrices(
            cityName="cairo",
            onePairOfJeansLevis50oneOrSimilar = null ,
            oneSummerDressInAChainStoreZaraHAndM = null ,
            onePairOfNikeRunningShoesMidRange =null,
            onePairOfMenLeatherBusinessShoes = null,
        )
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)

        //when
        val nameTop5City : Executable = Executable{getTop5CitiesNameHasSuitableClothesPricesInteractor.execute() }

        //then
        assertThrows(Exception::class.java , nameTop5City )
    }


    @Test
    fun should_TrowException_when_allCitisHaveNotAnyOnePairOfJeansLevis50oneOrSimilar()
    {
        //Given city has not onePairOfJeansLevis50oneOrSimilar
        val  insertNameCityClothesPrice = CityNameClothesPrices(
            cityName="cairo",
            onePairOfJeansLevis50oneOrSimilar = null ,
            oneSummerDressInAChainStoreZaraHAndM = 33.0f ,
            onePairOfNikeRunningShoesMidRange = 33.0f,
            onePairOfMenLeatherBusinessShoes = 36.0f ,
        )
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)

        //when
        val nameTop5City : Executable = Executable{getTop5CitiesNameHasSuitableClothesPricesInteractor.execute() }

        //then
        assertThrows(Exception::class.java , nameTop5City )
    }


    @Test
    fun should_TrowException_when_allCitisHaveNotAnyOneSummerDressInAChainStoreZaraHAndM()
    {
        //Given city has not any oneSummerDressInAChainStoreZaraHAndM
        val  insertNameCityClothesPrice = CityNameClothesPrices(
            cityName="cairo",
            onePairOfJeansLevis50oneOrSimilar = 44.0f ,
            oneSummerDressInAChainStoreZaraHAndM = null ,
            onePairOfNikeRunningShoesMidRange = 33.0f,
            onePairOfMenLeatherBusinessShoes = 36.0f ,
        )
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)

        //when
        val nameTop5City : Executable = Executable{getTop5CitiesNameHasSuitableClothesPricesInteractor.execute() }

        //then
        assertThrows(Exception::class.java , nameTop5City )
    }



    @Test
    fun should_TrowException_when_allCitisHaveNotAnyOnePairOfNikeRunningShoesMidRange()
    {
        //Given city has not any onePairOfNikeRunningShoesMidRange
        val  insertNameCityClothesPrice = CityNameClothesPrices(
            cityName="cairo",
            onePairOfJeansLevis50oneOrSimilar = 44.0f ,
            oneSummerDressInAChainStoreZaraHAndM = 56.0f ,
            onePairOfNikeRunningShoesMidRange = null,
            onePairOfMenLeatherBusinessShoes = 36.0f ,
        )
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)

        //when
        val nameTop5City : Executable = Executable{getTop5CitiesNameHasSuitableClothesPricesInteractor.execute() }

        //then
        assertThrows(Exception::class.java , nameTop5City )
    }


    @Test
    fun should_TrowException_when_allCitisHaveNotAnyOnePairOfMenLeatherBusinessShoes()
    {
        //Given city has not any onePairOfMenLeatherBusinessShoes
        val  insertNameCityClothesPrice = CityNameClothesPrices(
            cityName="cairo",
            onePairOfJeansLevis50oneOrSimilar = 44.0f ,
            oneSummerDressInAChainStoreZaraHAndM = 56.0f ,
            onePairOfNikeRunningShoesMidRange = 50.8f,
            onePairOfMenLeatherBusinessShoes = null ,
        )
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)
        fakeData.add(insertNameCityClothesPrice)

        //when
        val nameTop5City : Executable = Executable{getTop5CitiesNameHasSuitableClothesPricesInteractor.execute() }

        //then
        assertThrows(Exception::class.java , nameTop5City )
    }


    @Test
    fun should_ReturnListOfTopFiveCity_when_allCityHasClothes()
    {
        //Given city has not any onePairOfMenLeatherBusinessShoes
        var  insertNameCityClothesPrice = CityNameClothesPrices(
            cityName="Cairo",
            onePairOfJeansLevis50oneOrSimilar = 44.0f ,
            oneSummerDressInAChainStoreZaraHAndM = 56.0f ,
            onePairOfNikeRunningShoesMidRange = 50.8f,
            onePairOfMenLeatherBusinessShoes = 43.0f ,
        )
        fakeData.add(insertNameCityClothesPrice)

        insertNameCityClothesPrice = CityNameClothesPrices(
            cityName="Elminya",
            onePairOfJeansLevis50oneOrSimilar = 40.0f ,
            oneSummerDressInAChainStoreZaraHAndM = 55.0f ,
            onePairOfNikeRunningShoesMidRange = 49.8f,
            onePairOfMenLeatherBusinessShoes = 41.0f ,
        )
        fakeData.add(insertNameCityClothesPrice)

        insertNameCityClothesPrice = CityNameClothesPrices(
            cityName="Fayoum",
            onePairOfJeansLevis50oneOrSimilar = 39.0f ,
            oneSummerDressInAChainStoreZaraHAndM = 52.0f ,
            onePairOfNikeRunningShoesMidRange = 48.8f,
            onePairOfMenLeatherBusinessShoes = 40.0f ,
        )
        fakeData.add(insertNameCityClothesPrice)

        insertNameCityClothesPrice = CityNameClothesPrices(
            cityName="Giza",
            onePairOfJeansLevis50oneOrSimilar = 38.0f ,
            oneSummerDressInAChainStoreZaraHAndM = 51.0f ,
            onePairOfNikeRunningShoesMidRange = 47.8f,
            onePairOfMenLeatherBusinessShoes = 39.0f ,
        )
        fakeData.add(insertNameCityClothesPrice)

        insertNameCityClothesPrice = CityNameClothesPrices(
            cityName="El mansoura",
            onePairOfJeansLevis50oneOrSimilar = 37.0f ,
            oneSummerDressInAChainStoreZaraHAndM = 50.0f ,
            onePairOfNikeRunningShoesMidRange = 46.8f,
            onePairOfMenLeatherBusinessShoes = 38.0f ,
        )
        fakeData.add(insertNameCityClothesPrice)

        insertNameCityClothesPrice = CityNameClothesPrices(
            cityName="El menoufy",
            onePairOfJeansLevis50oneOrSimilar = 36.0f ,
            oneSummerDressInAChainStoreZaraHAndM = 49.0f ,
            onePairOfNikeRunningShoesMidRange = 45.8f,
            onePairOfMenLeatherBusinessShoes = 37.0f ,
        )
        fakeData.add(insertNameCityClothesPrice)


        //when
        val nameTop5City : List<String> = getTop5CitiesNameHasSuitableClothesPricesInteractor.execute()

        //then
        assertEquals(listOf("El menoufy" , "El mansoura" , "Giza" , "Fayoum" , "Elminya"  ) , nameTop5City )
    }


}