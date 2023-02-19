package interactor

import data.FakeDataSource
import data.TestCase
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTopTenCitiesHasCheapestPriceOfApartmentsAndCountOfYearToBuyTest {

    // region init
    private lateinit var getTopTenCitiesHasCheapestPriceOfApartmentsAndYearInteractorTest:
            GetTopTenCitiesHasCheapestPriceOfApartmentsAndYearInteractor
    private lateinit var fakeDataSource: FakeDataSource

    @BeforeAll
    fun setup() {
        fakeDataSource = FakeDataSource()
        getTopTenCitiesHasCheapestPriceOfApartmentsAndYearInteractorTest =
            GetTopTenCitiesHasCheapestPriceOfApartmentsAndYearInteractor(fakeDataSource)
        fakeDataSource.changeDataSource(TestCase.CheapestApartmentsInCities)
    }
    // endregion

    // region null case cases
    @Test
    fun should_ReturnNull_when_TheInputSalaryIsNegative() {
        // given salary is negative
        val salaryOfFullTimeJob = -1

        // when the output list of a pair of cities names and count of years
        val result =
            getTopTenCitiesHasCheapestPriceOfApartmentsAndYearInteractorTest
                .execute(salaryOfFullTimeJob)

        // then check
     assertNull(result)
    }

  @Test
    fun should_ReturnNull_when_TheInputSalaryIsZero() {
        // given salary is Zero
        val salaryOfFullTimeJob = 0

        // when the output list of a pair of cities names and count of years
        val result =
            getTopTenCitiesHasCheapestPriceOfApartmentsAndYearInteractorTest
                .execute(salaryOfFullTimeJob)

        // then check
     assertNull(result)
    }


    // endregion


    // region passed cases
    @Test
    fun should_ReturnList_when_TheInputIsStringNumericalSalary() {
        // given Int salary
        val salaryOfFullTimeJob = 800

        // when the output list of a pair of cities names and count of years
        val result =
            getTopTenCitiesHasCheapestPriceOfApartmentsAndYearInteractorTest
                .execute(salaryOfFullTimeJob)

        // then check
        assertEquals(
            listOf
                (
                Pair("Domyat", 0.625),
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
            getTopTenCitiesHasCheapestPriceOfApartmentsAndYearInteractorTest
                .execute(salaryOfFullTimeJob)

        // then check
        assertEquals(
            listOf
                (
                Pair("Domyat", 0.625),
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