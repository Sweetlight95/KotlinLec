import java.util.Scanner

//string
fun main() {
    print("Enter text: ")
    val stringInput = readLine()!!
    println("You entered: $stringInput")
}

//For Int
fun main() {
    val reader = Scanner(System.`in`)
    println("Enter a number: ")
    var number:Int = reader.nextInt()
    println("You entered: $number")
}