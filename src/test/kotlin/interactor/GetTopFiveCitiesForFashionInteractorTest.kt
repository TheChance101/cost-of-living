package interactor



import fakedata.FakeDataSource
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertNotEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopFiveCitiesForFashionInteractorTest {
    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var getTopFiveCitiesForFashionInteractor: GetTopFiveCitiesForFashionInteractor

    private lateinit var fakeData: FakeDataSource

    @BeforeAll
    fun setUp() {
        fakeData = FakeDataSource()
        dataSource = fakeData
        getTopFiveCitiesForFashionInteractor = GetTopFiveCitiesForFashionInteractor(dataSource)
    }

    @Test
    fun should_returnTrue_when_listOfTopCitiesEqualsFive() {
        // given limit equal 5
        val limit = 5
        // when size of list of cities if five
        val topFiveCites = getTopFiveCitiesForFashionInteractor.execute(limit)

        // then return true
        assertTrue(topFiveCites.size==5)

    }

    @Test
    fun should_returnListOfFiveCities_whenListOfCitiesNotEmpty() {

        // given
        val topCities = listOf("cairo","guelma", "annaba", "minia","madrid")

        // when
        val topFiveCites = getTopFiveCitiesForFashionInteractor.execute(5)

        // then
        assertNotEquals(topCities, topFiveCites)

    }


}