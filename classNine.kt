import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Enter a number: ")
    var number = reader.nextInt()
    var sum = 0
    while(number != -1){
        if(number != 0){
            sum += number
        }
        else {
            break
        }
        number = reader.nextInt()
    }
    println("You entered: $sum")

    //or

    var sum = 0
    var number: Int
    while(true){
        println("Enter a number: ")
        number = readLine()!!.toInt()
        if(number == 0)
        break
            sum += number
            println("Sum = $sum")
    } 

}