package interactor

import io.mockk.clearAllMocks
import io.mockk.mockk
import io.mockk.unmockkAll
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityWithCheapestInternationalPrimarySchoolForOneChildInteractorTest{

    private val dataSource = mockk<CostOfLivingDataSource>()
    private lateinit var interactor: GetCityWithCheapestInternationalPrimarySchoolForOneChildInteractor
    @BeforeAll
    fun setUp () {
        unmockkAll()
        clearAllMocks()
        interactor = GetCityWithCheapestInternationalPrimarySchoolForOneChildInteractor(dataSource)
    }}