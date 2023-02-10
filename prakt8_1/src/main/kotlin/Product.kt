

class Product constructor(val title: String, val price: Double, val units: String, val type: String, val count: Int) {

    fun getInfo() {
        println(title)
        println(price)
        println(units)
        println(type)
        println(count)
    }

    fun getPotentialSalary() {
        println(count * price)
    }

    fun getPriceWithDiscount(discountPercent: Double) {
        println(price - (price * discountPercent / 100))
    }

}