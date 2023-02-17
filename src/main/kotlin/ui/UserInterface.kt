package ui

import interactor.*
import interactor.utils.BedroomOption
import model.*


class UserInterface(private val dataSource: CostOfLivingDataSource) {
    fun init() {
        do {
            println(
                "1- Get the city that has the cheapest internet connection. \n" +
                        "2- Get 10 cities with lowest fruit/veg prices compared to salaries. \n" +
                        "3- Get country's salaries with mixed case input.\n" +
                        "4- Get city with highest apartment rent difference between city center and outside.\n" +
                        "5- Get top 5 cities to fashion shopping famous brands for most suitable prices.\n" +
                        "6- Get top 10 cities names that he can buy this apartment faster.\n" +
                        "7- Get best cities with cheapest banana prices. \n" +
                        "8- Get the city that match manager expectations.\n" +
                        "9- Get the top 10 countries that enforce high taxes on carbonated drinks.\n" +
                        "10-Get the most suitable city in the world that they can have more savings per month.\n" +
                        "Note: for exit write 'Exit/exit' \n\n"
            )
            when (readlnOrNull()) {
                "1" -> {
                    println(GetCityHasCheapestInternetConnectionInteractor(dataSource).execute())
                    printSeparationLine()
                }

                "2" -> {
                    println(GetAverageFruitAndVegetablesInteractor(dataSource).execute())
                    printSeparationLine()
                }

                "3" -> {
                    print("please enter name country:-")
                    val nameCountry = readlnOrNull()
                    println(nameCountry?.let { GetCitiesAverageSalary(dataSource).execute(it) })
                    printSeparationLine()
                }

                "4" -> {
                    print("choose:-")
                    print("1- Apartment one bedroom.")
                    print("2- Apartment three bedroom :-")
                    print("enter 1 or 2")
                    val count = readlnOrNull()
                    var option = BedroomOption.ONE_BEDROOM
                    if (count.equals("2"))
                        option = BedroomOption.THREE_BEDROOM
                    println(count?.let { GetCostlierCityInteractor(dataSource).execute(option) })
                    printSeparationLine()
                }

                "5" -> {
                    println(GetBestCitiesToFashionShoppingInteractor(dataSource).execute())
                    printSeparationLine()
                }

                "6" -> {
                    print("please enter your full time salary:-")
                    val fullTimeSalary = readlnOrNull()?.toDouble()
                    if (fullTimeSalary != null) {
                        println(
                            GetTopTenCitiesHasCheapestPriceOfApartmentsAndYearInteractor(dataSource).execute(
                                fullTimeSalary
                            )
                        )
                    } else {
                        print("your input not valid, try again.")
                    }
                    printSeparationLine()
                }

                "7" -> {
                    print("please enter cities names seperated by dash :- ")
                    val citiesNames = readlnOrNull()
                    if (citiesNames != null) {
                        val city = makeCities(citiesNames.split("-"))
                            println(GetCitiesNamesWithCheapestBananaPricesInteractor(dataSource)(*city))
                    } else {
                        print("your input not valid, try again.")
                    }
                    printSeparationLine()
                }

                "8" -> {
                    print("please enter  list name countries :-")
                    print("example iraq, usa:-")
                    val countries = readlnOrNull().toString().split(",")
                    if (countries.isNotEmpty()) {
                        print(GetCityThatMatchTheManagerExpectationsInteractor(dataSource).execute(countries))
                    } else {
                        print("your input not valid, try again.")
                    }
                    printSeparationLine()
                }

                "9" -> {
                    println(GetTopTenCountriesTaxesInteractor(dataSource).execute())
                    printSeparationLine()
                }

                "10" -> {
                    print("please enter you need in center ot  city:-")
                    print("1-In center")
                    print("2-Out center")

                    val option = readlnOrNull()?.toInt()
                    if (option != null) {
                        val optionCity = option == 1
                        println(GetBestCityForSavingMoneyInteractor(dataSource).execute(optionCity))
                    } else {
                        print("your input not valid, try again.")
                    }
                }

                "Exit", "exit" -> {
                    break
                }
            }


        } while (true)
    }

    private fun printSeparationLine() {
        print("\n_______________________________\n")
    }
}

fun makeCities(cityNames: List<String>) = cityNames.map {
    CityEntity(
        it, "",
        MealsPrices(null, null, null),
        DrinksPrices(null, null, null, null, null),
        FruitAndVegetablesPrices(null, null, null, null, null, null, null),
        FoodPrices(null, null, null, null, null, null),
        ServicesPrices(null, null, null, null, null, null, null, null),
        ClothesPrices(null, null, null, null),
        TransportationsPrices(null, null, null, null, null, null),
        CarsPrices(null, null),
        RealEstatesPrices(null, null, null, null, null, null),
        null, false
    )
}.toTypedArray()
