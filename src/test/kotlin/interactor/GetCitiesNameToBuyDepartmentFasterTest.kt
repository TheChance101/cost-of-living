package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import java.lang.ArithmeticException

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesNameToBuyApartmentFasterInteractorTest {

    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var interactor: GetCitiesNameToBuyApartmentFasterInteractor


    @BeforeEach
    fun setup() {
        dataSource = FakeDataSource()
        interactor = GetCitiesNameToBuyApartmentFasterInteractor(dataSource)
    }

    @Test
    fun `should return the top 5 cities names that he can buy this apartment faster`() {
        //Given a salary, limit, squareMeter
        val salary = 1000
        val limit = 5
        val squareMeter = 100
        //When execute the use case
        val actual = GetCitiesNameToBuyApartmentFasterInteractor(dataSource)
            .execute(
                salary = salary,
                limit = limit,
                squareMeter = squareMeter
            )
        //Then return the top 5 cities names that he can buy this apartment faster
        val expected = listOf(
            Pair("Havana", 2.235250162760417),
            Pair("Kasese", 3.3489166666666663),
            Pair("Aleppo", 3.9583333333333335),
            Pair("Warri", 8.44275),
            Pair("Damascus", 15.645000000000001)
        )
        assertEquals(expected, actual)
    }

    @Test
    fun `should throw exception when the salary less than one`() {
        //Given a salary, limit, squareMeter
        val salary = 0
        val limit = 5
        val squareMeter = 100
        //When execute the use case
        val actual = Executable {
            GetCitiesNameToBuyApartmentFasterInteractor(dataSource)
                .execute(
                    salary = salary,
                    limit = limit,
                    squareMeter = squareMeter
                )
        }
        //Then
        assertThrows(ArithmeticException::class.java, actual)
    }


    @Test
    fun `should return empty list when the limit equal to zero`() {
        //Given a salary, limit, squareMeter
        val salary = 1000
        val limit = 0
        val squareMeter = 100
        //When execute the use case
        val actual =
            GetCitiesNameToBuyApartmentFasterInteractor(dataSource)
                .execute(
                    salary = salary,
                    limit = limit,
                    squareMeter = squareMeter
                )
        val expected = emptyList<Pair<String, Float>>()
        //Then
        assertEquals(expected, actual)
    }


    @Test
    fun `should throw exception when the squareMeter less than one`() {
        //Given a salary, limit, squareMeter
        val salary = 1000
        val limit = 5
        val squareMeter = 0
        //When execute the use case
        val actual = Executable {
            GetCitiesNameToBuyApartmentFasterInteractor(dataSource)
                .execute(
                    salary = salary,
                    limit = limit,
                    squareMeter = squareMeter
                )
        }
        //Then
        assertThrows(ArithmeticException::class.java, actual)
    }


}