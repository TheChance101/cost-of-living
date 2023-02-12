package interactor

import org.junit.jupiter.api.Assertions.*
import fakedata.FakeData
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito


class GetTheRightApartmentTest {
    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var fakeData: FakeData
    private lateinit var getTheRightApartment: GetTheRightApartment


    @BeforeEach
    fun setUp() {
        fakeData = FakeData()
        dataSource = Mockito.mock(CostOfLivingDataSource::class.java)
        getTheRightApartment = GetTheRightApartment(dataSource)
    }


    @Test
    fun should_ReturnFalse_when_OutPutInCorrect() {
        //Give
        val expectedResult = listOf(
            Pair("Alexandria", "20"),
            Pair("Bagdad", "13"),
            Pair("giza", "16"),
            Pair("Madrid", "10"),
        )

        //When
        Mockito.`when`(dataSource.getAllCitiesData()).thenReturn(fakeData.getAllCitiesData())
        val  actualResult = getTheRightApartment.getListOfDetailsOfApartment(1000)
        //Then
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun should_ReturnFalse_when_LowQualityData() {
        //Give
        val expectedResult = listOf(
            Pair("Alexandria", "20"),
            Pair("Bagdad", "13"),
            Pair("giza", "16"),
            Pair("Madrid", "10"),
        )

        //When
        Mockito.`when`(dataSource.getAllCitiesData()).thenReturn(fakeData.getAllCitiesData())
        val actualResult = getTheRightApartment.getListOfDetailsOfApartment(1000)
        //Then
        assertEquals(expectedResult, actualResult)
    }
    @Test
    fun should_ReturnTrue_when_OutPutInCorrect() {
        //Give
        val expectedResult = listOf(
            Pair("Alexandria", "20"),
            Pair("Bagdad", "13"),
            Pair("giza", "16"),
            Pair("Madrid", "10"),
        )

        //When
        Mockito.`when`(dataSource.getAllCitiesData()).thenReturn(fakeData.getAllCitiesData())
        val actualResult = getTheRightApartment.getListOfDetailsOfApartment(1000)
        //Then
        assertEquals(expectedResult, actualResult)
    }
}