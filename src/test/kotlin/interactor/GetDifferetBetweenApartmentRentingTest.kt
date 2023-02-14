package interactor

import fakedata.FakeData
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import somepackage.GetDifferentBetweenApartmentRenting
import kotlin.test.assertEquals


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetDifferetBetweenApartmentRentingTest {
    private lateinit var dataSource: CostOfLivingDataSource

    private lateinit var fakeData: FakeData

    private lateinit var getDifferentBetweenApartmentRenting: GetDifferentBetweenApartmentRenting
    @BeforeAll
    fun setup() {
        fakeData = FakeData()
        dataSource = fakeData
        getDifferentBetweenApartmentRenting= GetDifferentBetweenApartmentRenting(dataSource)

    }
   @Test
   fun should_ReturnCorrectDifferent_when_inputsAreCorrect(){

       //given correct city center and out city center
       val cityCenter=90.0f
       val outsideCityCenter=65.0f
       //when calculate the different between apartment renting
       var DifferentBetweenApartmentRenting=getDifferentBetweenApartmentRenting.getApartmentRentDifference(cityCenter,outsideCityCenter)
       //then check the result
       assertEquals(25.0f,DifferentBetweenApartmentRenting)
   }
    @Test
    fun should_ReturnZero_When_CityCenterAndOutsideCityCenterIsNotCorrect(){

        //given Is not correct city center and out city center
        val cityCenter=null
        val outsideCityCenter=null
        //when calculate the different between apartment renting
        val DifferentBetweenApartmentRenting=getDifferentBetweenApartmentRenting.getApartmentRentDifference(cityCenter,outsideCityCenter)
        //then check the result
        assertEquals(0f,DifferentBetweenApartmentRenting)
    }
    @Test

    fun shoduld_ReturnZero_When_CityCenterIsCorrectAndOutsideCityCenterIsNotCorrect(){

        //given Is  correct city center and out city center is not correct
        val cityCenter=33.0f
        val outsideCityCenter=null
        //when calculate the different between apartment renting
        val DifferentBetweenApartmentRenting=getDifferentBetweenApartmentRenting.getApartmentRentDifference(cityCenter,outsideCityCenter)
        //then check the result
        assertEquals(0f,DifferentBetweenApartmentRenting)
    }
    @Test
    fun shoduld_ReturnZero_When_CityCenterIsNotCorrectAndOutsideCityCenterIsCorrect(){

        //given Is  not correct city center and out city center is  correct
        val cityCenter=null
        val outsideCityCenter=97.12f
        //when calculate the different between apartment renting
        val DifferentBetweenApartmentRenting=getDifferentBetweenApartmentRenting.getApartmentRentDifference(cityCenter,outsideCityCenter)
        //then check the result
        assertEquals(0f,DifferentBetweenApartmentRenting)
    }
    @Test
    fun should_ReturnCorrectDifferent_when_inputsAreCorrectCityCenterAndOutSideCityCenter(){

        //given correct city center and out city center
        val cityCenter=100f
        val outsideCityCenter=306f
        //when calculate the different between apartment renting
        val DifferentBetweenApartmentRenting=getDifferentBetweenApartmentRenting.getApartmentRentDifference(cityCenter,outsideCityCenter)
        //then check the result
        assertEquals(-206f,DifferentBetweenApartmentRenting)

}}
