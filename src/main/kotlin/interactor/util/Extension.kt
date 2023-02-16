package interactor.util


fun Float.toFormat(limit: Int = 1): Float {
    return String.format("%.${limit}f", this).toFloat()
}

fun String.formatSentence(): String {
    return this.lowercase().trim().replace(Regex(" +"), " ")
}

fun Float.toYear(): String {
    return if (this >= 2f || this == 0f) "$this years" else if (this == 1f) "$this year"
    else {
        throw IllegalArgumentException("Invalid input: $this. Input must be greater than or equal zero.")
    }
}
