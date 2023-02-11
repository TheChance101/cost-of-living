package interactor

import model.CityEntity
import model.CityNameClothesPrices
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityNamesClothesPricesTest {

    lateinit var listCityEntity:  MutableList<CityEntity>
    lateinit var getCityNamesClothesPrices: GetCityNamesClothesPrices


    @BeforeEach
    fun Setup()
    {
        listCityEntity = mutableListOf()
        getCityNamesClothesPrices = GetCityNamesClothesPrices(listCityEntity)
    }


}