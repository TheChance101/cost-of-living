package interactor

import dataSource.utils.GetCityNamesClothesPrices
import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityNamesClothesPricesTest {

   private lateinit var listCityEntity:  MutableList<CityEntity>
   private lateinit var getCityNamesClothesPrices: GetCityNamesClothesPrices

    @BeforeEach
    fun Setup()
    {
        listCityEntity = mutableListOf()
        getCityNamesClothesPrices = GetCityNamesClothesPrices(listCityEntity)
    }

    @Test
    fun should_TrowException_when_listIsEmpty()
    {
        //Given empty mutablelist

        //when
        val listCityNamesClothesPrices: Executable = Executable{getCityNamesClothesPrices.execute() }

        //then
        assertThrows(Exception::class.java , listCityNamesClothesPrices )
    }

}