package interactor

import dataSource.CsvDataSource
import dataSource.FakeCsvDataSource
import dataSource.utils.CsvParser
import model.CityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetHighestDifferentPayForRentTest {
    lateinit var csvParser : CsvParser
    lateinit var dataSource: CostOfLivingDataSource
    lateinit var getHighestDifferentPayForRent:GetHighestDifferentPayForRent
    @BeforeAll
    fun setup(){
        csvParser= CsvParser()
        dataSource  = FakeCsvDataSource(csvParser)
        getHighestDifferentPayForRent = GetHighestDifferentPayForRent(dataSource)
    }
   @Test
   fun should_ReturnapartmentOneBedroomOutsideOfCentreNotEqualNull(){
       //given
       //when
       val result=getHighestDifferentPayForRent.execute()
       //then not return null
       assertNotEquals(null , result.realEstatesPrices.apartmentOneBedroomOutsideOfCentre)
   }
    @Test
    fun should_ReturnApartmentOneBedroomInCityCentreNotEqualNull(){
        //given
        //when
        val result=getHighestDifferentPayForRent.execute()
        //then not return null
        assertNotEquals(null , result.realEstatesPrices.apartmentOneBedroomInCityCentre)
    }
    @Test
    fun should_ReturnApartment3BedroomsInCityCentreNotEqualNull(){
        //given
        //when
        val result=getHighestDifferentPayForRent.execute()
        //then not return null
        assertNotEquals(null , result.realEstatesPrices.apartment3BedroomsInCityCentre)
    }
    @Test
    fun should_ReturnApartmentOneBedroomOutsideOfCentreNotEqualNull(){
        //given
        //when
        val result=getHighestDifferentPayForRent.execute()
        //then not return null
        assertNotEquals(null , result.realEstatesPrices.apartmentOneBedroomOutsideOfCentre)
    }
}