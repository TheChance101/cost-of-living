package interactor

import data.FakeDataSource
import data.TestCase
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetBestCitiesToFashionShoppingInteractorTest {

    private lateinit var getBestCitiesToFashionShopping: GetBestCitiesToFashionShoppingInteractor
    private lateinit var fakeData: FakeDataSource

    @BeforeAll
    fun setUp() {
        fakeData = FakeDataSource()
        getBestCitiesToFashionShopping = GetBestCitiesToFashionShoppingInteractor(fakeData)

    }

    @Test
    fun should_returnCity_when_ValidData() {
        // Given
        fakeData.changeDataSource(TestCase.FashionShopping)

        // When
        val countries = listOf("Sancti Spiritus", "Santiago de Cuba", "Santa Clara")
        val result = getBestCitiesToFashionShopping.execute()

        // Then check the final result
        assertEquals(countries, result)
    }

    @Test
    fun should_returnEmptyList_When_clothesPricesAreNull() {
        // Given data clothes prices null
        fakeData.changeDataSource(TestCase.InvalidData)

        // When return emptyList
        val expected = emptyList<String>()
        val result = getBestCitiesToFashionShopping.execute()

        // Then check the final result
        assertEquals(expected, result)
    }


    @Test
    fun should_returnEmptyList_When_DataListEmpty() {
        // Given data empty
        fakeData.changeDataSource(TestCase.Empty)

        // When return emptyList
        val expected = emptyList<String>()
        val result = getBestCitiesToFashionShopping.execute()

        // Then check the final result
        assertEquals(expected, result)
    }

}