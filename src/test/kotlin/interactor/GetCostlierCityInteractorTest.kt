package interactor

import dataSource.utils.FakeDataSource
import interactor.utils.BedroomOption
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCostlierCityInteractorTest {
    lateinit var getCostlierCityInteractor:
            GetCostlierCityInteractor

    lateinit var fakeDataSource: FakeDataSource


    @BeforeAll
    fun setup() {
        fakeDataSource = FakeDataSource()
        getCostlierCityInteractor =
            GetCostlierCityInteractor(fakeDataSource)

    }

    @Test
    fun should_ReturnCorrectCity_When_OptionIsOneBedroom() {
        //given one bedroom
        val option = BedroomOption.ONE_BEDROOM
        //when the  city is correct
        val highest = getCostlierCityInteractor
            .execute(option)
        //then check names cities are equals
        assertEquals("Sancti Spiritus", highest.cityName)
    }

    @Test
    fun should_ReturnCorrectCity_When_OptionIsThreeBedroom() {
        //given Three bedroom
        val option = BedroomOption.THREE_BEDROOM
        //when the  city is correct
        val highest = getCostlierCityInteractor
            .execute(option)
        //then check names cities are equals
        assertEquals("Seoul", highest.cityName)
    }


}