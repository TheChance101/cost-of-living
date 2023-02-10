package model

import com.appmattus.kotlinfixture.decorator.nullability.NeverNullStrategy
import com.appmattus.kotlinfixture.decorator.nullability.nullabilityStrategy
import com.appmattus.kotlinfixture.kotlinFixture

class FakeDataSource() {

    val normalFixture = kotlinFixture {
        nullabilityStrategy(NeverNullStrategy)
        property(CityEntity::dataQuality) { true }
        repeatCount { 20 }
    }

    fun getNormalData() = normalFixture<List<CityEntity>>()

    val nullableFixture = kotlinFixture {
        property(CityEntity::dataQuality) { true }
        repeatCount { 20 }
    }

    fun getDataWithNullValues() = nullableFixture<List<CityEntity>>()

    val lowQualityFixture = kotlinFixture {
        nullabilityStrategy(NeverNullStrategy)
        property(CityEntity::dataQuality) { false }
        repeatCount { 20 }
    }

    fun getDataWithLowQuality() = lowQualityFixture<List<CityEntity>>()
}