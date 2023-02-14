package interactor

import model.CityEntity
import java.lang.reflect.Executable

class GetCityNameAndSalrayAverageInteractor(private val dataSource: CostOfLivingDataSource) {


    fun execute(country: String): List<Pair<String,Float>>
    {
        val list = dataSource
            .getAllCitiesData()
            .filter { (it.country == country.convert()) && (it.dataQuality) }.getSalary()
        if(list.isEmpty())
        {
            throw Throwable("Enter Falid Country")

        }
        return list
    }
    private fun List<CityEntity>.getSalary(): List<Pair<String, Float>> {
        val newList = mutableListOf<Pair<String, Float>>()
        var salary: Float
        this.forEach{
            salary =
                it.averageMonthlyNetSalaryAfterTax!!
            newList.add(Pair(it.cityName, salary))
        }
        return newList
    }
    private fun String.convert(): String {
        return capitalize(lowercase())!!
    }
    private fun capitalize(str: String?): String? {
        return str?.capitalize() ?: str
    }

}