import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test
import interactor.CostOfLivingDataSource
// JUnit test to check if the findCityWithHighestRentPriceDifference() method works as expected
class GetHighestDifferanceBetween_CityCenterAndOutsideTest {
    @Test
    fun findCityWithHighestApartmentRentDifferenceTest() {
        // Create an instance of the CsvParser class
        val csvParser = CsvParser()
        // Create an instance of the CsvDataSource class that uses the CsvParser instance
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
        // Create an instance of the Find_City class
        val findCity = GetHighestDifferanceBetweenCityCenterAndOutside()
        // Call the findCityWithHighestRentPriceDifference() method to find the city with the highest rent difference
        val cityWithHighestDifference = findCity.execute(dataSource)
        // Print the result
        println("City with highest apartment rent difference: $cityWithHighestDifference")
    }
}