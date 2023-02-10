

class Cinema constructor(val moveName: String, val session: String, val price: Double, val hall: Double, val personCount: Int) {

    fun getInfo() {
        println(moveName)
        println(session)
        println(price)
        println(hall)
        println(personCount)
    }

    fun getSalary() {
        println(personCount * price)
    }

    fun getHallPerson(hallPlaces: Int) {
        if (hallPlaces < personCount) println("$session не может вместить всех поситителей") else println("$session может вместить всех поситителей");
    }

}