import interactor.CostOfLivingDataSource
import kotlin.math.abs
class Find_City {
    // Method to find the city with the highest difference in apartment rent prices in the city center and outside of it
    fun findCityWithHighestApartmentRentDifference(dataSource: CostOfLivingDataSource): String {
        // Get all the data of all cities
        val allCitiesData = dataSource.getAllCitiesData()

        // Initialize the city with the highest difference in apartment rent prices
        var cityWithHighestDifference = ""

        // Initialize the highest difference in apartment rent prices
        var highestDifference = 0f

        // Iterate over each city's data
        for (cityData in allCitiesData) {
            // Check if the data quality of the city is good and if the data for the 3 bedroom apartment prices in the city center and outside of it exists
            if (cityData.dataQuality && cityData.realEstatesPrices.apartment3BedroomsInCityCentre != null
                && cityData.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
            ) {
                // Calculate the difference in apartment rent prices
                val currentDifference = abs(
                    cityData.realEstatesPrices.apartment3BedroomsInCityCentre - cityData.realEstatesPrices.apartment3BedroomsOutsideOfCentre
                )

                // If the current difference is higher than the highest difference, update the city with the highest difference and the highest difference value
                if (currentDifference > highestDifference) {
                    highestDifference = currentDifference
                    cityWithHighestDifference = cityData.cityName
                }
            }
        }

        // Return the city with the highest difference in apartment rent prices
        return cityWithHighestDifference
    }
}
