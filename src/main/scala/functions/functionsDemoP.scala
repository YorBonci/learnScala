package functions

// SCarrying Function

object functionsDemoP {
  def main(args:Array[String]): Unit = {

    val str1 = "Hello"
    val str2 = "World"

    println("str1, str2: " + printSomeThing(str1) (str2))
    println("str1, str2: " + printSomeThingB(str1) (str2))

    val sum = add2(29)_ // Partially applied function
    println(sum(5))


  }

//  def printSomeThing(str1: String, str2: String): String = {
//    str1 + " " + str2
//  }

  def printSomeThing(str1: String) (str2: String): String = {
    str1 + " " + str2
  }

  def printSomeThingB(str1: String) = (str2: String) => str1 + " " + str2

  def add2(a: Int) (b: Int) = a + b // Function Curring - separating the parameters


}
