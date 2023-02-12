package interactor

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

/**
 * Created by Aziza Helmy on 2/12/2023.
 */
internal class GetSuitableCityMoreSavingPerMonthInteractorTest {
    private lateinit var getSuitableCityMoreSavingPerMonth: GetSuitableCityMoreSavingPerMonthInteractor
    private lateinit var fakedata: FakeData

    @BeforeAll
    fun setUp() {
        fakedata = FakeData()
        getSuitableCityMoreSavingPerMonth = GetSuitableCityMoreSavingPerMonthInteractor(fakedata)
    }

    @Test
    fun should_ReturnTrue_When_CitiesHasAnAverageMonthlySalary(){
        //Given
        //When
        //Then

    }

}