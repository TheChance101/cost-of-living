# Cost of living
Week 2 Task at @ The Chance plus 2023

- As a team Leader fork this repository into your personal github account then add all of your teammates as a contributors
- Using the provided parsed data csv data set
> note: all the prices in the data set is in USD $
- Use Test Driven Development approach 
- Try your best to keep your functions pure and have no side effect
- Write a readable code with a meaningful names.
- Try to make all function reusable by avoid hardcoding the values and pass them to the function
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

> Note: the dataQulaity property which is boolean take 2 values if it is `true` that mean the data qulaity is high and if it is `false` thats mean the data quality for this city is low.

> Note: there is no data set in the world is totaly clean, be aware of missing field don't use them for calculations!

- Add Interactors classes to achive all required features described below

  1. Complete `GetCityHasCheapestInternetConnectionInteractor` make this interactor return the city has the cheapest internet connection with 60 Mbps speed keep in mind if the internet price is 10$ but the average of salary is 50$ that doesn't mean the internet is cheap cause it is 20% of your salary, but if the internet price is 40$ but the salary average is 2000$ that mean you are paying only 2% of your salary for 60 Mbps internet connection.
  2. find the name of 10 cities that the average of fruit and vegetables prices have the lowest cost compraing to the slaries that paid in those cities.
  3. search for salaries in country: your should enter a country name (upper case or lower case or mixed all input should be accepted) then if the country name is correct the function will return a List of pairs each pair have city name and salray average for this city, please avoid low qulaity data. if the country name was wrong the function should throw an Exception.
  4. find the city that has the highest different that you should pay for renting an apartment between city center and outside city center, keep in mind the data set has two different type of apartments. use high qulaity data only
  5. There is a 2 youth girl and boy care about fashion alot and they have alot of money so they don't care about getting a job, help them to find the top 5 cities name they should visit to get the clothes from famous brands for most suitable prices.
  6. There is a guy who **hate the crowd and love the nature** and he hate to pay for renting appartments all of his life, he decied to work in 1 full time job + 1 part time job, he pay all the money he get from the part time job for living and eating and all his needs, and save all the money that he get from the full time job to buy 100 meter apartment, find the top 10 cities names that he can buy this apartment faster, and how many year is needed to buy each apartment for each city, the expected return type is a list of pairs each pair is city name and the years needed to buy the apartment in float or double, this guy is serious so please avoid the low qulaity data.
  7. A monkey lover guy how has a lot of monkeys to care about them, he have a group of city that he plan to live there, witre a function that take `vararg's` cities and return a sorted list of cities names sorted by cheapest banan prices.
  8. A startup company consist of 10 employees achived a huge success and gained a lot of money, the owner decied to invite all the employees for a dinner in any city they like in the world, there is two guys have two different suggestions the first one suggest to go the city that has the most expensive meals, and the second one decied to go the city that has the cheapest meal prices, keep in mind this startup located in north america and they are searching in USA, Canda, and Mexcio only, then the manger decied to go a city that their meals price are excatly between the both suggestions. create all needed functions inside the interactor to find the city that match manager expectations.
  9. Find the top 10 countires name in the world that enforce high taxes on carbonated drinks like coke, so the price are the highest there, let your function return a list of pairs each pair has country name and the average prices for those drinks for this country, use high quality data only!
  10. A family consist of father and mother and 2 kids that only there father has a full time job, they need an apartment with 3 room, the father use a bike to go to his job he don't like cars and he is highly paid so his monthly salary is 2x of the average of the city he could work in. the family consume 15 KG of white bread, 1 KG of cheese, 4 KG of red meet beaf, 10 KG of chicken fillets, and 2 KG of rice per month, and have a limit of 250$ payment for the other type of needs, ignoring taxes, find the most suitable city in the world that they can have more savings per month.
