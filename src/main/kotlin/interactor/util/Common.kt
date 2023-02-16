package interactor.util

import interactor.util.Constants.CANT_CATCH_INFO_OF_THIS_CITY
import interactor.util.Constants.VALUE_OF_PLURAL_YEARS
import interactor.util.Constants.YEAR
import interactor.util.Constants.YEARS


fun Float.toFormat(limit: Int = 1): Float {
    return String.format("%.${limit}f", this).toFloat()
}

fun String.formatSentence(): String {
    return this.lowercase().trim().replace(Regex(" +"), " ")
}

fun Float.toDiv(dividedNumber: Float): Float {
    return dividedNumber.let { this.div(it).toFormat() }
}

fun Float.toYear(): String {
    return  if (this >=  2.0F) "$this $YEARS"
    else "$this $YEAR"
}
