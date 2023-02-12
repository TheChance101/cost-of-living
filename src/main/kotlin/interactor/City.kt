package interactor
data class City (val name: String, val bananaPrice: Int) {

    fun lowestPrice(vararg city: City): List<String> {
        val list = mutableListOf<City>()
        city.forEach { list.add(it) }
        return list.sortedBy { it.bananaPrice }.map { it.name }
    }
}