//logical operators
//fun main() {
    //val a = 10
    //val b = 9
  //  val c = -1 
//    val result: Boolean

     // result = (a>b) and (a>c)
   // result = (a>b) && (a>c)
 //   println(result)
//}

//in Operators
//fun main() {
    //val numbers = intArrayOf(1, 42, -3)
  //  if(4 in numbers){
     //   println("numbers array contains 4.")
   // }else {
    //    println("numbers array contains no 4.")
  //  }
//}
//Index access Operators(example)
fun main() {
    val a = intArrayOf(1, 2, 3, 4, -1)
    println(a[1])  //a.get(i)
    a[1]= 12 //a.set(1, b)
    println(a[1])
    println(a[2] + a[3])
}