package interactor
import dataSource.FakeCsvDataSourceForCinemaTicketsPrices
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance



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



}