package interactor

import fakedata.FakeNormalData
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestSalaryAverageCitiesNamesInteractorTest {


    @Test
    fun should_ReturnCitiesNameWithHighestSalary_WhenGetNormalData() {
        //given normal Data of high ,low quality and null salary cases
        val interactor = GetHighestSalaryAverageCitiesNamesInteractor(FakeNormalData())
        //when find the highest salary
        val highestSalaryCities = interactor.execute(3)
        //then low quality and null cases should be filtered out
        assertEquals(listOf("alexandria"), highestSalaryCities)
    }
}