package interactor

import dataSource.FakeDataSource
import dataSource.HardCodedFakeDataSource
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityNameAndSalrayAverageInteractorTest {

    private  lateinit var fakeData: HardCodedFakeDataSource
    private lateinit var getcityandsalary: GetCityNameAndSalrayAverageInteractor

    @BeforeAll
    fun init() {
        fakeData = HardCodedFakeDataSource()
        getcityandsalary = GetCityNameAndSalrayAverageInteractor(fakeData)
    }


    @Test
    fun should_ReturnlistOfPairs_When_DataValid()
    {
        //given
        fakeData.setDatatype(HardCodedFakeDataSource.DataType.VALID)
        //when
        val listOfCityAndSalary = getcityandsalary.execute("eGypt")
        //then
        assertTrue(listOfCityAndSalary.size==1&&listOfCityAndSalary[0]==Pair("Cairo",6000.0f))
    }

    @Test
    fun should_returnlistEmpty_When_EnterDataNull(){
        //given
        fakeData.setDatatype(HardCodedFakeDataSource.DataType.NULLABLE)

        //when
        val listOfCityAndSalary = getcityandsalary.execute("")
        //then
        assertTrue(listOfCityAndSalary.isEmpty())
    }






}