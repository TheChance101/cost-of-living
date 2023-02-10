package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCheapestBananaCitiesNamesInterActorTest {

    private lateinit var interActor: GetCheapestBananaCitiesNamesInterActor
    private lateinit var csvParser: CsvParser
    private lateinit var dataSource: CostOfLivingDataSource

    @BeforeAll
    fun setup() {
        csvParser = CsvParser()
        dataSource = CsvDataSource(csvParser)
        interActor = GetCheapestBananaCitiesNamesInterActor(dataSource)
    }

    @Test
    fun should_returnCitiesNamesSortedByCheapestBananaPrices_when_haveCorrectCities() {
        // given more than correct city name
        val cities = listOf("Bamako", "Tamale", "Aswan", "Abakan", "Davao")
        // when cities is correct typing and exists
        val citiesSortedByCheapestBanana = interActor.execute(cities.toString())
        // then check if getting correct sorting of correct cities
        assertEquals(listOf("Abakan", "Bamako", "Aswan", "Davao", "Tamale"), citiesSortedByCheapestBanana)
    }
}