fun main() {
  var oneNumber = 60
  var twoNumber = 20

    if (oneNumber > twoNumber) {
      println("One letter is greater")
    } else {
      println("Two letter is lesser")
    }

    val a = -12
    val b = 12
    val max = if(a > b) {
        println("a is larger than b")
        a
    } else {
        println("b is lesser than a")
        b
    }
    println("max = $max")
}
