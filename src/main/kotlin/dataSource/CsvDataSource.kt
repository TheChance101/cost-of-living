package dataSource

import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import model.CityData
import model.CityEntity
import java.io.File
import java.io.IOException

class CsvDataSource(private val parser: CsvParser): CostOfLivingDataSource {

    override fun getAllCitiesData(): List<CityEntity> {
        return getCsvFile().readLines().map { csvLine ->
            parser.parseLine(csvLine)
        }
    }

    override fun getCityData(): List<CityData> {
        return getCsvFile().readLines().map { csvLine ->
            parser.parseLine2(csvLine)
        }
    }

    private fun getCsvFile(): File {
        val costOfLivingCsvFile = File(FILE_NAME)
        if (costOfLivingCsvFile.exists()) {
            return costOfLivingCsvFile
        }
        throw IOException("File Not Found")
    }

    companion object {
        private const val FILE_NAME = "costOfLiving.csv"
    }

}