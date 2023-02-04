# Cost of living
Week 2 Task at @ The Chance plus 2023

- As a team Leader fork this repository into your personal github account then add all of your teammates as a contributors
- Using the provided parsed data csv data set
> note: all the prices in the data set is in USD $
- Use Test Driven Development approach 
- Try your best to keep your functions pure and have no side effect
- Write a readable code with a meaningful names.
- Follow the Recommended Git Flow approch in branch naming

here is a sample how to **GetHighestSalaryAverageCititesNamesInteractor**
```
class GetHighestSalaryAverageCititesNamesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndLowQualityData)
            .sortedByDescending { it.averageMonthlyNetSalaryAfterTax }
            .take(limit)
            .map { it.cityName }
    }

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }

}
```

> Be aware from requirements description if we said a function return cities name that mean it should return `List<String>` but if we said a function return cities that mean `List<CityEntity>`

- Add Interactors classes to achive all required features described below

  1. Complete `GetCityHasCheapestInternetConnectionInteractor` make this interactor return the city has the cheapest internet connection with 60 Mbps speed keep in mind if the internet price is 10$ but the average of salary is 50$ that doesn't mean the internet is cheap cause it is 20% of your salary, but if the internet price is 40$ but the salary average is 2000$ that mean you are paying only 2% of your salary for 60 Mbps internet connection.
  2. find the name of 10 cities that the average of fruit and vegetables prices have the lowest cost compraing to the slaries that paid in those cities.
  3.
