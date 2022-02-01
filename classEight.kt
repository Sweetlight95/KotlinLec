fun main() {
    // var ch = 'A'
    // when(ch){
    //     'A' -> println("A is a vowel")
    //     'E' -> println("E is a vowel")
    //     'I' -> println("I is a vowel")
    //     'O' -> println("O is a vowel")
    //     'U' -> println("U is a vowel")
    //     else -> println("$ch is a consonant")
    // }
    // can also be written this way
    // when(ch){
    //     'A', 'E', 'I', 'O', 'U'-> println("$ch is a VOWEL")
    //     else -> println("$ch is a consonant")
    // }

// combine two or more  branch conditions with a comma
    // val n = -1
    // when(n){
    //     1,2,3 -> println("n is a positive integer less than 4.")
    //     0 -> println("n is zero")
    //     -1, -2 -> println("n is a negative greater than 3.")
    // }

// Check value in the range
    // val a = 100
    // when (a) {
    //     in 1.. 10 -> println("A positive number less than 11.")
    //     in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
    // }

// variable name
    val name = "sandy"
    when(name){
        "sandy" -> println("Welcome $name")
        else -> println("Not $name")
    } 
}