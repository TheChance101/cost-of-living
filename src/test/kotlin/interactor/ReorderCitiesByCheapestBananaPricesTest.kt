package interactor

import dataSource.utils.ColumnIndex.BANANA_1KG
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ReorderCitiesByCheapestBananaPricesTest {

    @Test
    fun should_ReorderCitiesList_When_ListeOfCitiesEntered() {
        // given three city lists
        val cityOfBatna = listOf("Batna","Algeria",5.98,37.35,null,2.49,1.0,0.75,1.15,0.55,0.6,0.8,0.82,1.2,3.32,5.15,20.3,3.4,1.5,0.38,0.93,0.33,0.38,0.52,0.48,7.48,0.7,1.0,1.25,0.05,4.0,0.8,0.65,1.5,1.07,null,null,200.0,0.0,null,9.0,3.5,3.0,66.67,1950.0,25.0,15.0,150.0,150.0,76.67,40.0,306.67,100.0,1000.0,350.0,46.33,8.0,0)
        val cityOfGafsa = listOf("Gafsa","Tunisia",5.98,37.35,null,2.49,1.0,0.75,1.15,0.55,0.6,0.8,0.82,1.2,3.32,5.15,18.1,2.3,1.5,0.38,0.93,0.33,0.38,0.52,0.48,7.48,0.7,1.0,1.25,0.05,4.0,0.8,0.65,1.5,1.07,null,null,200.0,0.0,null,9.0,3.5,3.0,66.67,1950.0,25.0,15.0,150.0,150.0,76.67,40.0,306.67,100.0,1000.0,350.0,46.33,8.0,0)
        val cityOfRebat = listOf("Rebat","Moroco",5.98,37.35,null,2.49,1.0,0.75,1.15,0.55,0.6,0.8,0.82,1.2,3.32,5.15,14.5,1.33,1.5,0.38,0.93,0.33,0.38,0.52,0.48,7.48,0.7,1.0,1.25,0.05,4.0,0.8,0.65,1.5,1.07,null,null,200.0,0.0,null,9.0,3.5,3.0,66.67,1950.0,25.0,15.0,150.0,150.0,76.67,40.0,306.67,100.0,1000.0,350.0,46.33,8.0,0)
        // when Reorder cities
        val newCitiesList = ReorderCitiesByCheapestBananaPrices.execute("Gafsa", "Rebat", "Batna")
        // then find the cheapest banana prices cities
        assertArrayEquals(arrayOf("Batna", "Gafsa", "Rebat"), newCitiesList)
    }
}