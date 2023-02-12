package interactor

import dataSourse.utils.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTopTenCitiesHasCheapestPriceOfApartmentsAndCountOfYearToBuyTest {
    // region init
    private lateinit var getTopTenCitiesHasCheapestPriceOfApartmentsAndCountOfYearToBuyTest:
            GetTopTenCitiesHasCheapestPriceOfApartmentsAndCountOfYearToBuy
    private lateinit var fakeDataSource: FakeDataSource

    @BeforeAll
    fun setup() {
        fakeDataSource = FakeDataSource()
        getTopTenCitiesHasCheapestPriceOfApartmentsAndCountOfYearToBuyTest =
            GetTopTenCitiesHasCheapestPriceOfApartmentsAndCountOfYearToBuy(fakeDataSource)
    }
    // endregion

    // region null case cases
    @Test
    fun should_ReturnNull_when_TheInputIsNull() {
        // given null salary input
        val salaryOfFullTimeJob = null

        // when the output null
        val result =
            getTopTenCitiesHasCheapestPriceOfApartmentsAndCountOfYearToBuyTest
                .getPairOfCheapestCitiesAndCountOfYears(salaryOfFullTimeJob)

        // then check
        assertNull(result)
    }

    @Test
    fun should_ReturnNull_when_TheInputIsStringNumerical() {
        // given salary not numerical input
        val salaryOfFullTimeJob = "lol"

        // when the output is null
        val result =
            getTopTenCitiesHasCheapestPriceOfApartmentsAndCountOfYearToBuyTest
                .getPairOfCheapestCitiesAndCountOfYears(salaryOfFullTimeJob)

        // then check
        assertNull(result)
    }

    //endregion

    // region passed cases
    @Test
    fun should_ReturnList_when_TheInputIsStringNumericalSalary() {
        // given String salary but Numeric input
        val salaryOfFullTimeJob = "800"

        // when the output list of a pair of cities names and count of years
        val result =
            getTopTenCitiesHasCheapestPriceOfApartmentsAndCountOfYearToBuyTest
                .getPairOfCheapestCitiesAndCountOfYears(salaryOfFullTimeJob)

        // then check
        assertEquals(
            listOf
                (
                Pair("Dominate", 0.625),
                Pair("Popeye Village", 2.08333),
                Pair("Hallstatt", 5.20833),
                Pair("Simiane La Rotonde", 8.33333),
                Pair("Cinque Terre", 9.375),
                Pair("Ortahisar", 10.41667),
                Pair("Oia", 12.5),
                Pair("Shirakawa-go", 15.625),
                Pair("Ait Ben-Haddou", 17.70833),
                Pair("Cua Van", 20.83333),
            ),


            result
        )
    }

    @Test
    fun should_ReturnList_when_TheInputIsDoubleSalary() {
        // given double salary
        val salaryOfFullTimeJob = 800.0

        // when the output list of a pair of cities names and count of years
        val result =
            getTopTenCitiesHasCheapestPriceOfApartmentsAndCountOfYearToBuyTest
                .getPairOfCheapestCitiesAndCountOfYears(salaryOfFullTimeJob)

        // then check
        assertEquals(
            listOf
                (
                Pair("Dominate", 0.625),
                Pair("Popeye Village", 2.08333),
                Pair("Hallstatt", 5.20833),
                Pair("Simiane La Rotonde", 8.33333),
                Pair("Cinque Terre", 9.375),
                Pair("Ortahisar", 10.41667),
                Pair("Oia", 12.5),
                Pair("Shirakawa-go", 15.625),
                Pair("Ait Ben-Haddou", 17.70833),
                Pair("Cua Van", 20.83333),
            ),


            result
        )
    }

    @Test
    fun should_ReturnList_when_TheInputIsFloatSalary() {
        // given float salary
        val salaryOfFullTimeJob = 800.0f

        // when the output list of a pair of cities names and count of years
        val result =
            getTopTenCitiesHasCheapestPriceOfApartmentsAndCountOfYearToBuyTest
                .getPairOfCheapestCitiesAndCountOfYears(salaryOfFullTimeJob)

        // then check
        assertEquals(
            listOf
                (
                Pair("Dominate", 0.625),
                Pair("Popeye Village", 2.08333),
                Pair("Hallstatt", 5.20833),
                Pair("Simiane La Rotonde", 8.33333),
                Pair("Cinque Terre", 9.375),
                Pair("Ortahisar", 10.41667),
                Pair("Oia", 12.5),
                Pair("Shirakawa-go", 15.625),
                Pair("Ait Ben-Haddou", 17.70833),
                Pair("Cua Van", 20.83333),
            ),


            result
        )
    }

    //endregion

}