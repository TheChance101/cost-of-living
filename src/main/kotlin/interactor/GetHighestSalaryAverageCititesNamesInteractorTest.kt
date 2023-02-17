package interactor

import model.CityEntity
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class GetTopFiveCitiesForFashionInteractorTest {
    private lateinit var dataSource: CostOfLivingDataSource

    @Test
    fun should_returnListOfFiveCities_whenListOfCitiesNotEmpty() {

        // given cities not empty
        var cities: List<CityEntity> = dataSource.getAllCitiesData().filter { it.averageMonthlyNetSalaryAfterTax != null && it.dataQuality }

        // when find top five cities for fashion
        var topFiveCites = GetTopFiveCitiesForFashionInteractorTest().dataSource.getAllCitiesData()
            .sortedWith(compareBy({it.clothesPrices.onePairOfJeansLevis50oneOrSimilar},{it.clothesPrices.oneSummerDressInAChainStoreZaraHAndM},{it.clothesPrices.onePairOfNikeRunningShoesMidRange},{it.clothesPrices.onePairOfMenLeatherBusinessShoes}))
            .take(5)
            .map { it.cityName }

        // then check result
        assertEquals(listOf("Accra", "Abuja", "Abu Dhabi", "Aberdeen", "Abidjan"), topFiveCites)

    }
}