package interactor

import dataSource.FakeDataForLowQualityData
import dataSource.FakeDataSource
import dataSource.FakeDataWithEmptyList
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesNameToBuyApartmentFasterInteractorTest {

    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var interactor: GetCitiesNameToBuyApartmentFasterInteractor
    private lateinit var emptyListInteractor: GetCitiesNameToBuyApartmentFasterInteractor
    private lateinit var nullPricesInteractor: GetCitiesNameToBuyApartmentFasterInteractor


    @BeforeEach
    fun setup() {
        dataSource = FakeDataSource()
        interactor = GetCitiesNameToBuyApartmentFasterInteractor(dataSource)
        emptyListInteractor = GetCitiesNameToBuyApartmentFasterInteractor(FakeDataWithEmptyList())
        nullPricesInteractor =
            GetCitiesNameToBuyApartmentFasterInteractor(FakeDataForLowQualityData())
    }

    @Test
    fun `should return the top 5 cities names that he can buy this apartment faster`() {
        //Given a limit and squareMeter
        val limit = 10
        val squareMeter = 100
        //When find the cities to buy apartment faster
        val actual = interactor
            .execute(
                limit = limit,
                squareMeter = squareMeter
            )
        //Then return the top 5 cities names that he can buy this apartment faster
        val expected = listOf(
            Pair("Kasese", 49.998753f),
            Pair("Aleppo", 54.372707f),
            Pair("Havana", 62.52448f),
            Pair("Warri", 111.94312f),
            Pair("Banjul", 267.85245f),
            Pair("Damascus", 311.40524f)
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
            Pair("Kasese", 49.998753f),
            Pair("Aleppo", 54.372707f),
            Pair("Havana", 62.52448f),
            Pair("Warri", 111.94312f),
            Pair("Banjul", 267.85245f),
            Pair("Damascus", 311.40524f)
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
            emptyListInteractor
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
            nullPricesInteractor
                .execute(
                    limit = limit,
                    squareMeter = squareMeter
                )
        //Then
        assertTrue(actual.isEmpty())
    }


}