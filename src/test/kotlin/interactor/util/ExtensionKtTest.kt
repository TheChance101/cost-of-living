package interactor.util

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ExtensionKtTest {
    
    @Test
    fun should_ReturnFormatedSentance_when_EntringFormatedSentance() {
        //given
        val value = "chocolate"
        //when
        val actualResult = value.formatSentence()
        //then
        assertEquals("chocolate",actualResult)
    }

    @Test
    fun should_ReturnFormatedSentance_When_AddingLeadingAndTrailing() {
        //given
        val value = "   chocolate      "
        //when
        val actualResult = value.formatSentence()
        //then
        assertEquals("chocolate",actualResult)
    }
    @Test
    fun should_ReturnFormatedSentance_When_AddingInBetweenSpace() {
        //given
        val value = "chocolate        cake"
        //when
        val actualResult = value.formatSentence()
        //then
        assertEquals("chocolate cake",actualResult)
    }
    @Test
    fun should_ReturnFormatedSentance_When_AddingInBetweenSpaceAndLeadingAndTrailing() {
        //given
        val value = "     chocolate        cake    "
        //when
        val actualResult = value.formatSentence()
        //then
        assertEquals("chocolate cake",actualResult)
    }
    @Test
    fun should_ReturnSmallCase_When_EntringUpperCase() {
        //given
        val value = "CHOCOLATE"
        //when
        val actualResult = value.formatSentence()
        //then
        assertEquals("chocolate",actualResult)
    }
    @Test
    fun should_ReturnSmallCase_When_EntringMixedCase() {
        //given
        val value = "ChOcOlATe"
        //when
        val actualResult = value.formatSentence()
        //then
        assertEquals("chocolate",actualResult)
    }
    @Test
    fun should_EmptyString_When_EntringSpaces() {
        //given
        val value = "        "
        //when
        val actualResult = value.formatSentence()
        //then
        assertEquals("",actualResult)
    }
}