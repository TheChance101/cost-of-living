package interactor

import dataSource.utils.FakeDataProvider
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetBestCityForSavingMoneyInteractorTest {


    lateinit var bestCity: GetBestCityForSavingMoneyInteractor
    @BeforeAll
    fun setUp() {

        bestCity = GetBestCityForSavingMoneyInteractor(FakeDataProvider)

    }


    @Test
    fun should_ReturnHavanaCity_When_WePassTheFakeData(){

        Assertions.assertEquals("Havana", bestCity.execute().cityName)
    }
}