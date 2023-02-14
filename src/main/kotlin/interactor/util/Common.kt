package interactor.util


fun Float.toFormat(limit: Int = 1): Float {
    return String.format("%.${limit}f", this).toFloat()
}

fun String.formatSentence(): String {
    return this.lowercase().trim().replace(Regex(" +"), " ")
}

fun Float.toYear(): String {
    return if (this >= 2.0) "$this years" else "$this year"
}
