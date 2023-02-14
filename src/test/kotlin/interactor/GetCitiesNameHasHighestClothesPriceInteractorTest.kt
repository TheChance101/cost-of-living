//package interactor
//
//import dataSource.FakeCsvDataSource
//import dataSource.utils.CsvParser
//import org.junit.jupiter.api.Test
//
//import org.junit.jupiter.api.Assertions.*
//import org.junit.jupiter.api.BeforeAll
//import org.junit.jupiter.api.TestInstance
//
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//internal class GetCitiesNameHasHighestClothesPriceInteractorTest {
//
//    lateinit var csvParser : CsvParser
//    lateinit var dataSource: CostOfLivingDataSource
//    lateinit var citiesName: GetCitiesNameHasHighestClothesPriceInteractor
//
//    @BeforeAll
//    fun setup(){
//        csvParser= CsvParser()
//        dataSource  = FakeCsvDataSource(csvParser)
//        citiesName = GetCitiesNameHasHighestClothesPriceInteractor(dataSource)
//    }
//
//    @Test
//    fun should_ReturnTrue_when_allTheCityEntitesHasHighQualityData(){
//        //when
//        val result = citiesName.execute()
//        //then
//        assertTrue(result.all { it.dataQuality })
//    }
//
//    @Test
//    fun should_ReturnTrue_when_allTheCityEntitesHasNotNullOnePairOfJeansLevis50oneOrSimilar(){
//        //when
//        val result = citiesName.execute()
//        //then
//        assertTrue(result.all { it.clothesPrices.onePairOfJeansLevis50oneOrSimilar != null})
//    }
//
//    @Test
//    fun should_ReturnTrue_when_allTheCityEntitesHasNotNulloneSummerDressInAChainStoreZaraHAndM(){
//        //when
//        val result = citiesName.execute()
//        //then
//        assertTrue(result.all { it.clothesPrices.oneSummerDressInAChainStoreZaraHAndM != null})
//    }
//
//    @Test
//    fun should_ReturnTrue_when_allTheCityEntitesHasNotNullOnePairOfNikeRunningShoesMidRange(){
//        //when
//        val result = citiesName.execute()
//        //then
//        assertTrue(result.all { it.clothesPrices.onePairOfNikeRunningShoesMidRange != null})
//    }
//
//    @Test
//    fun should_ReturnTrue_when_allTheCityEntitesHasNotNullOnePairOfMenLeatherBusinessShoes(){
//        //when
//        val result = citiesName.execute()
//        //then
//        assertTrue(result.all { it.clothesPrices.onePairOfMenLeatherBusinessShoes != null})
//    }
//
//    @Test
//    fun should_ReturnListOfSizeFive_when_execute(){
//        // when
//        val result = citiesName.execute()
//        // then
//        assertEquals(5, result.size)
//    }
//
//    @Test
//    fun should_ReturnTrue_when_executeWithAcceptiableData(){
//        // given
//        val expected = listOf("Havana", "Damascus")
//        // when
//        val result = citiesName.execute()
//        // then
//        assertArrayEquals(expected, result)
//    }
//}