import kotlin.arrayOf as arrayOf1

fun main() {
    //initialize a 2D array
    var cinema = arrayOf1<Array<Int>>()
    for (i in 0..4) {
        var array = arrayOf1<Int>()
        for (j in 0..4) {
            array += 0
        }
        cinema = cinema.plus(array)
    }
    
    for (array in cinema) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
    
    //filling with data
    cinema[2][2] = 1
    for (i in 1..3) {
        cinema[3][i] = 1
    }
    for (i in 0..4) {
        cinema[4][i] = 1
    }
    println()
    for (array in cinema) {
        for (value in array) {
            print("$value")
        }
        println()
    }
}