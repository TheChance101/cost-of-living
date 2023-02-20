package interactor

import data.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import java.lang.Exception

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTopCitiesHasCheapestPriceOfApartmentsAndCountOfYearToBuyTest {

    // region init
    private lateinit var getTopCitiesHasCheapestPriceOfApartmentsAndYearInteractor:
            GetTopCitiesHasCheapestPriceOfApartmentsAndYearInteractor
    private lateinit var fakeDataSource: CheapestApartmentsInCitiesFakeData
    private lateinit var emptyDataSource: EmptyFakeData
    private lateinit var invalidDataSource: InvalidFakeData

    @BeforeEach
    fun setup() {
        fakeDataSource = CheapestApartmentsInCitiesFakeData()
        emptyDataSource = EmptyFakeData()
        invalidDataSource = InvalidFakeData()

        getTopCitiesHasCheapestPriceOfApartmentsAndYearInteractor =
            GetTopCitiesHasCheapestPriceOfApartmentsAndYearInteractor(fakeDataSource)
    }
    // endregion


    @Test
    fun `should return list when the input salary`() {

        // when the output list of a pair of cities names and count of years
        val result =
            getTopCitiesHasCheapestPriceOfApartmentsAndYearInteractor(10)

        // expect list
        val expectData=listOf(
            Pair("Domyat", 20.0f),
            Pair("Popeye Village", 66.66667f),
            Pair("Hallstatt", 166.66667f),
            Pair("Simiane La Rotonde", 266.66666f),
            Pair("Cinque Terre", 300.0f),
            Pair("Ortahisar", 333.33334f),
            Pair("Oia", 400.0f),
            Pair("Shirakawa-go", 500.0f),
            Pair("Ait Ben-Haddou", 566.6667f),
            Pair("Cua Van", 666.6667f),
        )

        // then check
        assertEquals(expectData ,result)
    }


    @Test
    fun `should throw exception when limit less than or equal zero`() {
        // when the output list of a pair of cities names and count of years
        val result = org.junit.jupiter.api.function.Executable {
            getTopCitiesHasCheapestPriceOfApartmentsAndYearInteractor(0)
        }
        // then check
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `should throw exception when data is invalid`() {

        getTopCitiesHasCheapestPriceOfApartmentsAndYearInteractor =
            GetTopCitiesHasCheapestPriceOfApartmentsAndYearInteractor(invalidDataSource)
        // when the output list of a pair of cities names and count of years
        val result = org.junit.jupiter.api.function.Executable {
            getTopCitiesHasCheapestPriceOfApartmentsAndYearInteractor(10)
        }
        // then check
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun should_throwException_when_dataIsEmpty() {
        getTopCitiesHasCheapestPriceOfApartmentsAndYearInteractor =
            GetTopCitiesHasCheapestPriceOfApartmentsAndYearInteractor(emptyDataSource)
        // when the output list of a pair of cities names and count of years
        val result = org.junit.jupiter.api.function.Executable {
            getTopCitiesHasCheapestPriceOfApartmentsAndYearInteractor(0)
        }
        // then check
        assertThrows(Exception::class.java, result)
    }


}