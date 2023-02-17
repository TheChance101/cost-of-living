import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*

const val TEAM_VELVET_MESSAGE_WELCOME: String = "The Red Velvet team welcomes you in our application"


val csvParser = CsvParser()
val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
val data = dataSource.getAllCitiesData()
val inputCitiesEntity = arrayOf(
    dataSource.getAllCitiesData()[11],
    dataSource.getAllCitiesData()[4],
    dataSource.getAllCitiesData()[10],
    dataSource.getAllCitiesData()[12],
    dataSource.getAllCitiesData()[13]
)

fun main() {

    val isNeedContinue = true
    welcomeUserMessageWithUserNameOrNot(getUserName())
    while (isNeedContinue) {
        if (getUserChooseStartOrNot()) {
            try {
                getResultDependOnTheOption()
            } catch (error: Exception) {
                println("please enter the correct value")
            }
        }
    }
}

fun getResultDependOnTheOption() {
    when (getChooseOptionNumber()) {
        1 -> {
            horizontalRule()
            print("enter the limit number of countries you want ")
            getTopCountriesWithHighTaxOnCarbonatedDrinks((readln().toInt()))
            horizontalRule()
        }

        2 -> {
            horizontalRule()
            getCitiesNamesSortedCheapestBananaPrices()
            horizontalRule()
        }
        3 -> {
            horizontalRule()
            getCityHasCheapestInternetConnection()
            horizontalRule()
        }

        4 -> {
            horizontalRule()
            getMostSuitableCity()
            horizontalRule()
        }

        5 -> {
            horizontalRule()
            print("Enter the Salary : ")
            val salary = readln().toInt()
            print("enter the limit of cities : ")
            val limit = readln().toInt()
            print("enter square meter : ")
            val squareMeter = readln().toInt()
            getCitiesNameToBuyApartmentFaster(salary, limit, squareMeter)
            horizontalRule()
        }

        6 -> {
            horizontalRule()
            println("This option is under maintenance")
            horizontalRule()

        }

        7 -> {
            horizontalRule()
            print("enter the limit : ")
            getHighestSalaryAverageCities(readln().toInt(), dataSource)
        }

        8 -> {
            horizontalRule()
            print("Enter the Country Name : ")
            try {
                getSalaryAverageAndCitiesNamesInCountry(readln(), dataSource)
                horizontalRule()
            } catch (error: Exception) {
                horizontalRule()
                println("this city is not Exist")
            }
        }

        else -> {
            println("You choose worse case")
            horizontalRule()
        }
    }
}


fun welcomeUserMessageWithUserNameOrNot(nameOfUser: String?) =
    if (nameOfUser != null && nameOfUser.trim() != "")
        println("Hi $nameOfUser $TEAM_VELVET_MESSAGE_WELCOME")
    else println("Hi There $TEAM_VELVET_MESSAGE_WELCOME")


fun getUserName(): String {
    print("please enter your name : ")
    return readln()
}

fun getUserChooseStartOrNot(): Boolean {
    horizontalRule()
    println("Do you want to continue for the trip in our application y/n")
    val userChoose: String = readln()
    return if (checkUserStatus(userChoose)) {
        horizontalRule()
        printUserOptionList()
        horizontalRule()
        true
    } else {
        horizontalRule()
        println("you don't choose the correct option ")
        horizontalRule()
        false
    }
}

fun checkUserStatus(userChoose: String): Boolean = userChoose.trimMargin() == "y"

fun printUserOptionList() {
    println(
        """
            enter your choose what do you need discover
            1 - Top 10 Countries With High Tax On Carbonated Drinks
            2 - Cities Names Sorted By Cheapest Banana Price 
            3 - City Has Cheapest Internet Connection 
            4 - Most Suitable City
            5 - Cities Name To Buy Apartment Faster
            6 - Top Fashion Cities Names 
            7 - Highest Salary Average Cities Name
            8 - Salary Average And Cities Names in Country
        """.trimIndent()
    )
}

fun getChooseOptionNumber(): Int {
    horizontalRule()
    println("please enter the number of your option between [1-8]-> (Just receive Number)")
    return readln().toInt()
}

fun horizontalRule() {
    println("_________________________________________________________________________")
}

/*******************************************************
Side of Get Data element -> Instance Zone
 *********************************************************/
fun getTopCountriesWithHighTaxOnCarbonatedDrinks(limit: Int) {
    val getTopCountriesWithHighTaxOnCarbonatedDrinks = GetTop10CountriesWithHighTaxOnCarbonatedDrinks(dataSource)
    val interactWithData = getTopCountriesWithHighTaxOnCarbonatedDrinks.execute(limit, data)
    interactWithData.forEachIndexed{index,element ->
        println("""
               ${index+1}-Country Name => ${element.first}
            """.trimIndent())

    }}
fun getCitiesNamesSortedCheapestBananaPrices() {
        val getCitiesNamesSortedCheapestBananaPrices = GetCitiesNamesSortedCheapestBananaPrices()
        println(getCitiesNamesSortedCheapestBananaPrices.execute(*inputCitiesEntity))
    }

    fun getCityHasCheapestInternetConnection() {
        val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor()
        val interactWithData = getCityHasCheapestInternetConnectionInteractor.execute(data)
        println("""
City Cheapest Internet Connection with country name and 
city name => ${interactWithData?.cityName}
Country => ${interactWithData?.country}
Internet 60 Mbps => ${interactWithData?.servicesPrices?.internet60MbpsOrMoreUnlimitedDataCableAdsl}$
""".trimIndent())
    }
    fun getMostSuitableCity() {
        val getMostSuitableCity = GetMostSuitableCityInteractor()
        val list = getMostSuitableCity.getAllCities(dataSource)
        val cityNameResult = getMostSuitableCity.execute(list)
        println(cityNameResult)
    }

    fun getCitiesNameToBuyApartmentFaster(salary: Int, limit: Int, squareMeter: Int) {
        val getCitiesNameToBuyApartmentFasterInteractor =
            GetCitiesNameToBuyApartmentFasterInteractor(dataSource)
        println(getCitiesNameToBuyApartmentFasterInteractor.execute(salary, limit, squareMeter))
//    println(getCitiesNameToBuyApartmentFasterInteractor.execute(1000, 10, 100))
    }

    fun getTopFashionCitiesNames(limit: Int) {
        val topFashionCitiesNames = GetTopFashionCitiesNamesInteractor(dataSource)
        topFashionCitiesNames.execute(limit)
    }

    fun getHighestSalaryAverageCities(limit: Int, dataSource: CostOfLivingDataSource) {
        val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
        println(getHighestSalaryAverageCities.execute(limit))
    }

    fun getSalaryAverageAndCitiesNamesInCountry(countryName: String, dataSource: CostOfLivingDataSource) {
        val salaryAverageAndCitiesNamesInCountry = GetSalaryAverageAndCitiesNamesInCountryInteractor(dataSource)
        println(salaryAverageAndCitiesNamesInCountry.execute(countryName))
    }




