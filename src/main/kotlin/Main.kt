import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*
import kotlin.system.exitProcess

const val TEAM_VELVET_MESSAGE_WELCOME: String = "The Red Velvet team🍰 welcomes you in our application 👋"
const val TEXT_OF_CITY_NAME = "City Name"
const val TEXT_OF_COUNTRY_NAME = "Country Name"
/********************************************************************/
/* Request INPUT FROM USER CONSTANT*/
/********************************************************************/
const val ENTER_THE_CORRECT_VALUE_MESSAGE = "please enter the correct value"
const val ENTER_THE_LIMIT_OF_CITY_MESSAGE = "enter the limit number of City you want :  "
const val ENTER_THE_SALARY_MESSAGE = "Enter the Salary : "
const val ENTER_YOUR_NAME_MESSAGE = "please enter your name : "
const val QUESTION_ABOUT_DO_YOU_WANT_CONTINUE_IN_OUR_APPLICATION = "Do you want to continue for the trip in our application (y/n)"
const val NOT_CORRECT_CHOOSE = "you don't choose the correct option "
const val ENTER_YOUR_NUMBER_OPTION = "please enter the number of your option between [1-10]"

/*********************************************************************/

/*********************************************************************/
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
                exitFromOurApplication()
                println(ENTER_THE_CORRECT_VALUE_MESSAGE)
            }
        }
    }
}
fun getResultDependOnTheOption() {
    when (getChooseOptionNumber()) {
        1 -> {
            horizontalRule()
            print(ENTER_THE_LIMIT_OF_CITY_MESSAGE)
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
            print(ENTER_THE_SALARY_MESSAGE)
            val salary = readln().toInt()
            print(ENTER_THE_LIMIT_OF_CITY_MESSAGE)
            val limit = readln().toInt()
            print("enter square meter : ")
            val squareMeter = readln().toInt()
            getCitiesNameToBuyApartmentFaster(salary, limit, squareMeter)
            horizontalRule()
        }
        6 -> {
            horizontalRule()
            print(ENTER_THE_LIMIT_OF_CITY_MESSAGE)
            getTopFashionCitiesNames(readln().toInt())
            horizontalRule()
        }
        7 -> {
            horizontalRule()
            print(ENTER_THE_LIMIT_OF_CITY_MESSAGE)
            getHighestSalaryAverageCities(readln().toInt(), dataSource)
        }
        8 -> {
            horizontalRule()
            print("Enter the $TEXT_OF_COUNTRY_NAME Name : ")
            try {
                getSalaryAverageAndCitiesNamesInCountry(readln(), dataSource)
                horizontalRule()
            } catch (error: Exception) {
                horizontalRule()
                println("this city is not Exist")
            }
        }
        9 -> {
            horizontalRule()
            println("this option under maintain")
            horizontalRule()
        }
        10 ->{
            print(ENTER_THE_LIMIT_OF_CITY_MESSAGE)
            getLowestAveragePricesForFruitsAndVegetables(dataSource, readln().toInt())
            horizontalRule()
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
    print(ENTER_YOUR_NAME_MESSAGE)
    return readln()
}
fun getUserChooseStartOrNot(): Boolean {
    horizontalRule()
    println(QUESTION_ABOUT_DO_YOU_WANT_CONTINUE_IN_OUR_APPLICATION)
    val userChoose: String = readln()
    return if (checkUserStatus(userChoose)) {
        horizontalRule()
        printUserOptionList()
        horizontalRule()
        true
    } else {
        horizontalRule()
        println(NOT_CORRECT_CHOOSE)
        horizontalRule()
        exitFromOurApplication()

        false
    }
}
fun printUserOptionList() {
    println(
        """
            enter your choose what do you need discover
            1 - Top Countries With High Tax On Carbonated Drinks
            2 - Cities Names Sorted By Cheapest Banana Price 
            3 - City Has Cheapest Internet Connection 
            4 - Most Suitable City
            5 - Cities Name To Buy Apartment Faster
            6 - Top Fashion Cities Names 
            7 - Highest Salary Average Cities Name
            8 - Salary Average And Cities Names in $TEXT_OF_COUNTRY_NAME
            9 - Highest Different In Apartment Rent
            10 - Lowest Average Prices For Fruits And Vegetables
        """.trimIndent()
    )
}
fun checkUserStatus(userChoose: String): Boolean = userChoose.trimMargin() .lowercase()== "y"
fun getChooseOptionNumber(): Int {
    horizontalRule()
    println(ENTER_YOUR_NUMBER_OPTION)
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
               ${index+1}-$TEXT_OF_COUNTRY_NAME=> ${element.first}
            """.trimIndent())
    }}
fun getCitiesNamesSortedCheapestBananaPrices() {
        val getCitiesNamesSortedCheapestBananaPrices = GetCitiesNamesSortedCheapestBananaPrices()
    getCitiesNamesSortedCheapestBananaPrices.execute(*inputCitiesEntity)
        .forEach{ city ->
            println("$TEXT_OF_CITY_NAME => $city")
        }
    }
fun getCityHasCheapestInternetConnection() {
        val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor()
        val interactWithData = getCityHasCheapestInternetConnectionInteractor.execute(data)
        println("""
City Cheapest Internet Connection with $TEXT_OF_COUNTRY_NAME  and 
$TEXT_OF_CITY_NAME => ${interactWithData?.cityName}
$TEXT_OF_COUNTRY_NAME => ${interactWithData?.country}
Internet 60 Mbps => ${interactWithData?.servicesPrices?.internet60MbpsOrMoreUnlimitedDataCableAdsl}$
""".trimIndent())
    }
fun getMostSuitableCity() {
    val getMostSuitableCity = GetMostSuitableCityInteractor()
    val list = getMostSuitableCity.getAllCities(dataSource)
    val cityNameResult = getMostSuitableCity.execute(list)
    println("$TEXT_OF_CITY_NAME => $cityNameResult")
}
fun getCitiesNameToBuyApartmentFaster(salary: Int, limit: Int, squareMeter: Int) {
    val getCitiesNameToBuyApartmentFasterInteractor =
        GetCitiesNameToBuyApartmentFasterInteractor(dataSource)
    val listOfCityName = getCitiesNameToBuyApartmentFasterInteractor.execute(salary, limit, squareMeter)
    listOfCityName.forEachIndexed { index, pair ->
        println("""${index + 1}- $TEXT_OF_CITY_NAME =>${pair.first} && Salary ${pair.second}""")
}}
fun getTopFashionCitiesNames(limit: Int) {
    val topFashionCitiesNames = GetTopFashionCitiesNamesInteractor(dataSource)
    println("Top Fashion Cities Names")
    topFashionCitiesNames.execute(limit).forEachIndexed{index, cityName ->
        println("""${index + 1} - $TEXT_OF_CITY_NAME => $cityName""")
    }
}
fun getSalaryAverageAndCitiesNamesInCountry(countryName: String, dataSource: CostOfLivingDataSource) {
    val salaryAverageAndCitiesNamesInCountry = GetSalaryAverageAndCitiesNamesInCountryInteractor(dataSource)
    println("Salary Average And Cities Names In Country")
    salaryAverageAndCitiesNamesInCountry.execute(countryName).forEachIndexed{index, pair ->
        println(
            """${index + 1} - $TEXT_OF_CITY_NAME => ${pair.first}
    Salary Average => ${pair.second}          
        """.trimMargin())
    }
}
fun getHighestSalaryAverageCities(limit: Int, dataSource: CostOfLivingDataSource) {
    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println("Highest Salary Average Cities")
    getHighestSalaryAverageCities.execute(limit).forEachIndexed{index, cityName ->
            println("""${index + 1} - $TEXT_OF_CITY_NAME => $cityName""")
        }
}
fun getHighestDifferentInApartmentRent(dataSource: CostOfLivingDataSource){
    val highestDifferentInApartmentRent  = GetHighestDifferentInApartmentRent(dataSource)
    println("This option under maintain")
}
fun getLowestAveragePricesForFruitsAndVegetables(dataSource: CostOfLivingDataSource, limit: Int){
    val lowestAveragePricesForFruitsAndVegetablesInteractor = GetLowestAveragePricesForFruitsAndVegetablesInteractor(dataSource)
    lowestAveragePricesForFruitsAndVegetablesInteractor.execute(limit).forEachIndexed{index ,cityName->
        println("""${index + 1} -$TEXT_OF_CITY_NAME => $cityName""")
    }
}

/**********************************************************************
 EXIT FORM OUT APPLICATION
 **********************************************************************/
fun exitFromOurApplication(){
    println("Do you want Exit form our Application (y/n) 😥")
    val state = readln()
    if(state.lowercase().trim() == "y")
        exitProcess(0)
}