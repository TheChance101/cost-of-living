package interactor

import data.CostlierCityFakeData
import data.EmptyFakeData
import data.InvalidFakeData
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCostlierCityInteractorTest {
    lateinit var getCostlierCityInteractor:
            GetCostlierCityInteractor

    lateinit var fakeDataSource: CostlierCityFakeData
    lateinit var emptyFakeData: EmptyFakeData
    lateinit var invalidFakeData: InvalidFakeData


    @BeforeAll
    fun setup() {
        fakeDataSource = CostlierCityFakeData()
        emptyFakeData = EmptyFakeData()
        invalidFakeData= InvalidFakeData()
    }

    @Test
    fun should_ReturnCorrectCity_When_TheDataIsValid() {
        getCostlierCityInteractor = GetCostlierCityInteractor(fakeDataSource)
        //when The result is one city
        val city = getCostlierCityInteractor.execute()
        //then check
        assertEquals( "Seoul", city.cityName)
    }

    @Test
    fun should_ReturnEmpty_When_TheDataIsEmpty() {
        getCostlierCityInteractor =
            GetCostlierCityInteractor(emptyFakeData)
        //when The result is one city
        val result = Executable { getCostlierCityInteractor.execute() }
        //then check
        assertThrows(Exception::class.java , result )

    }

    @Test
    fun should_ReturnCorrectCity_When_TheDataIsInValid() {
        getCostlierCityInteractor =
            GetCostlierCityInteractor(invalidFakeData)
        //when The result is one city
        val result = Executable { getCostlierCityInteractor.execute() }
        //then check
        assertThrows(Exception::class.java , result )
    }



}