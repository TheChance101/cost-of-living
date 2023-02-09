package interactor

import dataSource.utils.FakeDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCostlierCityWithRentingAnApartmentBetweenCityCenterAndOutsideCityCenterInteractorTest {
    lateinit var getCostlierCityWithRentingAnApartmentBetweenCityCenterAndOutsideCityCenterInteractor:
            GetCostlierCityWithRentingAnApartmentBetweenCityCenterAndOutsideCityCenterInteractor

    lateinit var fakeDataSource: FakeDataSource


    @BeforeAll
    fun setup() {
        fakeDataSource = FakeDataSource()
        getCostlierCityWithRentingAnApartmentBetweenCityCenterAndOutsideCityCenterInteractor =
            GetCostlierCityWithRentingAnApartmentBetweenCityCenterAndOutsideCityCenterInteractor(fakeDataSource)

    }

    @Test
    fun should_ReturnCorrectCity_When_OptionIsOneBedroom() {
        //given one bedroom
        val option = Option.ONE_BEDROOM
        //when
        val highest = getCostlierCityWithRentingAnApartmentBetweenCityCenterAndOutsideCityCenterInteractor
            .execute(option)
        //then
        assertEquals("sancti spiritus",highest?.cityName)
    }
    @Test
    fun should_ReturnCorrectCity_When_OptionIsThreeBedroom() {
        //given one bedroom
        val option = Option.THREE_BEDROOM
        //when
        val highest = getCostlierCityWithRentingAnApartmentBetweenCityCenterAndOutsideCityCenterInteractor
            .execute(option)
        //then
        assertEquals("santa clara",highest?.cityName)
    }



}