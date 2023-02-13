package interactor

import FakeData.FakeData
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var fakedata: FakeData
    private lateinit var converter: GetCityHasCheapestInternetConnectionInteractor

    @BeforeAll
    fun setUp() {
        fakedata = FakeData()
        converter = GetCityHasCheapestInternetConnectionInteractor(fakedata)

    }

    @Test
    fun `should return cheapest city When  enter list of cities`() {
        // given
        // when
        val city = converter.execute()
        // then
        assertEquals(fakedata.getAllCitiesData()[3], city)
    }


}