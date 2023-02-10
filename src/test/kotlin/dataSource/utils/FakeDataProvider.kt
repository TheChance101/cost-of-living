package dataSource.utils

import dataSource.CsvDataSource
import interactor.CostOfLivingDataSource
import model.CityEntity

object FakeDataProvider : CostOfLivingDataSource{

    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    var fakeData = mutableListOf<CityEntity>()

    init {

        val cities = dataSource.getAllCitiesData()
        for (it in 0..10){

            var city = cities[it]
            if (it == 4) city = city.copy(
                averageMonthlyNetSalaryAfterTax = city.averageMonthlyNetSalaryAfterTax!!*100
            )
            fakeData.add(city)
        }
    }

    override fun getAllCitiesData(): List<CityEntity> {

        return fakeData.toList()
    }
}