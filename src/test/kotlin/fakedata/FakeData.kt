package fakedata

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import model.CityEntity

class FakeData : CostOfLivingDataSource {
    var fakeDataList: ArrayList<CityEntity> = ArrayList()

    init {
        val csvParser = CsvParser()
        val dataSource = CsvDataSource(csvParser)
        fakeDataList.addAll(
            dataSource.getAllCitiesData().take(20)
        )
    }

    override fun getAllCitiesData(): List<CityEntity> {
        return fakeDataList
    }
}
