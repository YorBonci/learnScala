package functions

// Nested Function
object functionsDemoO {

  def main(args:Array[String]): Unit = {

    val printHelloB = (msg: String) => println(s"Hello $msg") // When defining a function variable, it needs to be written first being declared

    printHello("Sree")
    printHello("Markus")
    printHelloB("Gurli")
    printHelloC("India")
    println(factorial(5))

    // Nested function inside the main function
    def printHello(msg: String): Unit = {
      println(s"Hello $msg")
    }
  }

  // 1. Nested Function
  def printHelloC(str: String): Unit = {

    def printSomething(str1: String, str2: String) = {
      println(s"$str1 $str2")
    }

    printSomething("Hello", str)
  }

  // 2. Nested Function
  def factorial(i: Int): Int = {

    def fact(x: Int, prevResult: Int): Int = {
      if (x <= 1)
        prevResult
      else
        fact(x - 1, x*prevResult)
    }
    var z = fact(i, 1)
    return z
  }



}
