package interactor
import dataSource.FakeCsvDataSourceForCinemaTicketsPrices
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals
import kotlin.test.assertNotNull


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTheMostExpensiveCitiesNamesIntTermOfCinemaTicketsTest {
    lateinit var dataSource: CostOfLivingDataSource
    lateinit var getTheMostExpensiveCitiesNamesIntTermOfCinemaTickets : GetTheMostExpensiveCitiesNamesIntTermOfCinemaTickets


    @BeforeAll
    fun setup()
    {
        dataSource  = FakeCsvDataSourceForCinemaTicketsPrices()
        getTheMostExpensiveCitiesNamesIntTermOfCinemaTickets=GetTheMostExpensiveCitiesNamesIntTermOfCinemaTickets(dataSource)
    }

    @Test
    fun should_ReturnValueNotNull_when_Execute() {
        // given a postive number to this function to implement
        val limit = 5
        // when execute this function
        val result = getTheMostExpensiveCitiesNamesIntTermOfCinemaTickets.execute(limit)
        // then the result should return not null
        assertNotNull(result)
    }


}