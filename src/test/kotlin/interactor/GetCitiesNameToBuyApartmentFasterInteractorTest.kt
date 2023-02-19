package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesNameToBuyApartmentFasterInteractorTest {

    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var interactor: GetCitiesNameToBuyApartmentFasterInteractor


    @BeforeEach
    fun setup() {
        dataSource = FakeDataSource()
        interactor = GetCitiesNameToBuyApartmentFasterInteractor(dataSource)
    }

    @Test
    fun `should return the top 5 cities names that he can buy this apartment faster`() {
        //Given a limit and squareMeter
        val limit = 5
        val squareMeter = 100
        //When find the cities to buy apartment faster
        val actual = interactor
            .execute(
                limit = limit,
                squareMeter = squareMeter
            )
        //Then return the top 5 cities names that he can buy this apartment faster
        val expected = listOf(
            Pair("Havana", 2.235250162760417),
            Pair("Kasese", 3.3489166666666663),
            Pair("Aleppo", 3.9583333333333335),
            Pair("Damascus", 15.645000000000001),
            Pair("Banjul", 20.161251302083333)
        )
        //Then
        assertEquals(expected, actual)
    }


    @Test
    fun `should return empty list when the limit equal to zero`() {
        //Given a limit and squareMeter
        val limit = 0
        val squareMeter = 100
        //When find the cities to buy apartment faster
        val actual =
            interactor
                .execute(
                    limit = limit,
                    squareMeter = squareMeter
                )
        //Then
        assertTrue(actual.isEmpty())
    }

    @Test
    fun `should throw exception when the limit is negative`() {
        //Given a limit and squareMeter
        val limit = -1
        val squareMeter = 100
        //When find the cities to buy apartment faster
        val actual =
            Executable {
                interactor
                    .execute(
                        limit = limit,
                        squareMeter = squareMeter
                    )
            }
        //Then
        assertThrows(InvalidLimitException::class.java, actual)
    }

    @Test
    fun `should return the minimum number of top city names to buy apartment faster when the limit greater the the filtered data count`() {
        //Given a limit and squareMeter
        val limit = 30
        val squareMeter = 100
        //When find the cities to buy apartment faster
        val actual = interactor
            .execute(
                limit = limit,
                squareMeter = squareMeter
            )
        //Then return the top 5 cities names that he can buy this apartment faster
        val expected = listOf(
            Pair("Havana", 2.235250162760417),
            Pair("Kasese", 3.3489166666666663),
            Pair("Aleppo", 3.9583333333333335),
            Pair("Damascus", 15.645000000000001),
            Pair("Banjul", 20.161251302083333)
        )
        //Then
        assertEquals(expected, actual)
    }

    @Test
    fun `should throw exception when the squareMeter equal to zero`() {
        //Given a limit and squareMeter
        val limit = 5
        val squareMeter = 0
        //When find the cities to buy apartment faster
        val actual = Executable {
            interactor
                .execute(
                    limit = limit,
                    squareMeter = squareMeter
                )
        }
        //Then
        assertThrows(InvalidMetersException::class.java, actual)
    }

    @Test
    fun `should throw exception when the squareMeter is negative`() {
        //Given a limit and squareMeter
        val limit = 5
        val squareMeter = -1
        //When find the cities to buy apartment faster
        val actual = Executable {
            interactor
                .execute(
                    limit = limit,
                    squareMeter = squareMeter
                )
        }
        //Then
        assertThrows(InvalidMetersException::class.java, actual)
    }

    @Test
    fun `should throw exception when the retrieved data source list is empty`() {
        //Given valid limit and squareMeter
        val limit = 5
        val squareMeter = 100
        //When find the cities to buy apartment faster
        val actual = Executable {
            interactor
                .execute(
                    limit = limit,
                    squareMeter = squareMeter
                )
        }
        //Then
        assertThrows(IllegalStateException::class.java, actual)
    }

    @Test
    fun `should return empty list when the filtered retrieved data source list is empty`() {
        //Given valid limit and squareMeter
        val limit = 5
        val squareMeter = 100
        //When find the cities to buy apartment faster
        val actual =
            interactor
                .execute(
                    limit = limit,
                    squareMeter = squareMeter
                )
        //Then
        assertTrue(actual.isEmpty())
    }


}