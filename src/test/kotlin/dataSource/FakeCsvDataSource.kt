package dataSource

import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import model.CityEntity
import java.io.File
import java.io.IOException

class FakeCsvDataSource(private val parser: CsvParser) : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return getCsvFile().readLines().take(20).map { csvLine ->
            parser.parseLine(csvLine)
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