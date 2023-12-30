fun main() {
    println("LearnKotlin.kt")

    // Variables
    val i = 1
    val d = 2.0
    val c = 'c'
    val s = "s"
    val b = bool

    // String
    var word = "word"
    println(word.length)
    println(word.toUpperCase())
    println(word.toLowerCase())
    println(s.compareTo(word))


    // If else
    val x = 20
    val y = 18
    if (x > y) {
        println("x is greater than y")
    }

    // When --> Switch
    val day = 4
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    //For loop
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda") // Arrays
    for (x in cars) {
        println(x)
    }

    // While loop
    var i = 0
    while (i < 5) {
        println(i)
        i++
    } 

    // Functions
    myFunction()

    // Class
    val c1 = Car()
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

}

fun myFunction() {
    println("myFunction")
} 

class Car {
    var brand = ""
    var model = ""
    var year = 0
    fun drive() {
        println("Wrooom!")
    }
  }