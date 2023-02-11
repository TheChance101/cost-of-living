package model

import com.appmattus.kotlinfixture.decorator.nullability.AlwaysNullStrategy
import com.appmattus.kotlinfixture.decorator.nullability.NeverNullStrategy
import com.appmattus.kotlinfixture.decorator.nullability.nullabilityStrategy
import com.appmattus.kotlinfixture.kotlinFixture
import interactor.CostOfLivingDataSource

class FakeDataSource() : CostOfLivingDataSource {

    enum class DataType {
        VALID, NULLABLE, LOWQUALITY
    }

    private var dataType: DataType = DataType.VALID
    fun setDataType(_dataType: DataType) {
        this.dataType = _dataType
    }

    private val normalFixture = kotlinFixture {
        nullabilityStrategy(NeverNullStrategy)
        property(CityEntity::dataQuality) { true }
        repeatCount { 20 }
    }

    private fun getNormalData() = normalFixture<List<CityEntity>>()

    private val nullableFixture = kotlinFixture {
        nullabilityStrategy(AlwaysNullStrategy)
        property(CityEntity::dataQuality) { true }
        repeatCount { 20 }
    }

    private fun getDataWithNullValues() = nullableFixture<List<CityEntity>>()

    private val lowQualityFixture = kotlinFixture {
        nullabilityStrategy(NeverNullStrategy)
        property(CityEntity::dataQuality) { false }
        repeatCount { 20 }
    }

    private fun getDataWithLowQuality() = lowQualityFixture<List<CityEntity>>()

    /**
     * retrieve data from FakeDataSource depending on the type needed
     * @return List<CityEntity>
     */
    override fun getAllCitiesData(): List<CityEntity> {
        return when (dataType) {
            DataType.VALID -> {
                getNormalData()
            }
            DataType.NULLABLE -> {
                getDataWithNullValues()
            }
            DataType.LOWQUALITY -> {
                getDataWithLowQuality()
            }
        }
    }
}