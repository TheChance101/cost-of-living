package interactor.addons

import fakeDataSource.addons.FakeDataCheapestCityToRiasingOneChild
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.function.Executable

class GetCheapestCityForRaisingOneChildYearlyInteractorTest {

    val fakeDataCheapestCityToRiasingOneChild = FakeDataCheapestCityToRiasingOneChild()

    @Test
    fun should_ThrowException_When_AllDataLowQuality() {
        //given
        val lowQualityCities = fakeDataCheapestCityToRiasingOneChild.getLowQualityCities()
        val getCheapestCityForRaisingOneChildYearlyInteractor =
            GetCheapestCityForRaisingOneChildYearlyInteractor(lowQualityCities)
        //when
        val cityExecutable: Executable =
            org.junit.jupiter.api.function.Executable { getCheapestCityForRaisingOneChildYearlyInteractor.execute() }
        //then
        assertThrows(Exception::class.java, cityExecutable)
    }

    @Test
    fun should_ThrowException_When_AllDataPreschoolAndPrimarySchool() {
        //given
        val missingPreschoolAndPrimarySchool =
            fakeDataCheapestCityToRiasingOneChild.getMissingPreschoolAndPrimarySchool()
        val getCheapestCityForRaisingOneChildYearlyInteractor =
            GetCheapestCityForRaisingOneChildYearlyInteractor(missingPreschoolAndPrimarySchool)
        //when
        val cityExecutable: Executable =
            org.junit.jupiter.api.function.Executable { getCheapestCityForRaisingOneChildYearlyInteractor.execute() }
        //then
        assertThrows(Exception::class.java, cityExecutable)
    }

    @Test
    fun should_ReturnAccurateCity_When_PassingVariousData() {
        //given
        val variousData = fakeDataCheapestCityToRiasingOneChild.getVariousData()
        val getCheapestCityForRaisingOneChildYearlyInteractor =
            GetCheapestCityForRaisingOneChildYearlyInteractor(variousData)
        val expectedResult = fakeDataCheapestCityToRiasingOneChild.getExpectedResult()

        //when
        val result = getCheapestCityForRaisingOneChildYearlyInteractor.execute()
        //then
        assertEquals(result, expectedResult)
    }


}