fun main() {
    val a = 1
    val b = true
    var c = 1
        var result: Int
        var booleanResult: Boolean
            result = -a
        println("-a = $result")
            booleanResult = !b
        println("!b = $booleanResult")
            --c
            println("--c = $c")

    var num = 10
    while (num >= 5) {
        println("Loop: $num")
        num--
    }

    // mutlipication of two
    var num = 10

    while (num >= 5) {
        if(num % 2 == 0){
            var even = num * 2
            println("Evens: $even")
        } else { println("Odds: $num")}
        num--
    }

    // sum of natural numbers from 1 to 100
    var num = 100
    var i = 1
    var sum = 0 

    while (i <= num) {
        sum += i
        i++
    }
    println("Sum = $sum")

    // or
    var sum  = 0
    var i = 100

    while (i != 0){
        sum += i
        --i
    }
    println("Sum = $sum")
}