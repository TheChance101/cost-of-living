package interactor
import dataSource.FakeDataSource
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

class GetHighestDifferentInApartmentRentTest {
    private lateinit var highestDifferentInApartmentRent: GetHighestDifferentInApartmentRent
    private lateinit var dataSource: FakeDataSource

    @BeforeEach
    fun setup(){
        dataSource = FakeDataSource()
        highestDifferentInApartmentRent =  GetHighestDifferentInApartmentRent(dataSource)
    }

    @Test
    fun `should return null when give null apartment bedrooms`(){
        // given null apartment bedrooms
        val apartmentOneBedroom=false
        val apartment3Bedrooms=false
        val limit=1
        // when check what is the highest different in list with giving emptyList
        val result = highestDifferentInApartmentRent.execute(apartmentOneBedroom,apartment3Bedrooms,limit)
        // then check the result
        Assertions.assertNull(result)
    }


    @Test
    fun `should return city has highest different in apartment when given list of cities`(){
        // given list of cityEntity
        val cities = dataSource.getAllCitiesData()
        val apartmentOneBedroom=true
        val apartment3Bedrooms=true
        val limit=1
        // when check what is the cities has highest different in apartment rent
        val result = highestDifferentInApartmentRent.execute(apartmentOneBedroom,apartment3Bedrooms,limit)
        // then check the result
        Assertions.assertEquals(cities[16].cityName, result)
    }

    @Test
    fun `should return highest different city with one bedroom appartment when want list of cities`(){
        // given list of cityEntity
        val cities = dataSource.getAllCitiesData()
        val apartmentOneBedroom=true
        val apartment3Bedrooms=false
        val limit=1
        // when check what is the cities has highest different in apartment rent
        val result = highestDifferentInApartmentRent.execute(apartmentOneBedroom,apartment3Bedrooms,limit)
        // then check the result
        Assertions.assertEquals(cities[4].cityName, result)
    }

    @Test
    fun `should return highest different city with 3 bedrooms appartment when want list of cities`(){
        // given list of cityEntity
        val cities = dataSource.getAllCitiesData()
        val apartmentOneBedroom=false
        val apartment3Bedrooms=true
        val limit=1
        // when check what is the cities has highest different in apartment rent
        val result = highestDifferentInApartmentRent.execute(apartmentOneBedroom,apartment3Bedrooms,limit)
        // then check the result
        Assertions.assertEquals(cities[16].cityName, result)
    }
    @Test
    fun `should return empty list when limit equal to zero`(){
        // given list of cityEntity
        val cities = dataSource.getAllCitiesData()
        val apartmentOneBedroom=false
        val apartment3Bedrooms=true
        val limit=0
        // when check what is the cities has highest different in apartment rent
        val result =Executable {
            highestDifferentInApartmentRent.execute(apartmentOneBedroom, apartment3Bedrooms, limit)
        }
        // then check the result
        Assertions.assertThrows(Exception::class.java, result)
    }

    @Test
    fun `should throw exception when limit is negative`(){
        // given list of cityEntity
        val cities = dataSource.getAllCitiesData()
        val apartmentOneBedroom=false
        val apartment3Bedrooms=true
        val limit=-1
        // when check what is the cities has highest different in apartment rent
        val result = Executable {
            highestDifferentInApartmentRent.execute(apartmentOneBedroom, apartment3Bedrooms, limit)
        }
            // then check the result

        assertThrows(Exception::class.java, result)

    }


}
