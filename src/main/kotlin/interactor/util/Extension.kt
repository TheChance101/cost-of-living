package interactor.util

object Extension {
     fun Float.toFormat(limit : Int = 1) : Float{
        return String.format("%.${limit}f", this).toFloat()
    }
}