package functions

object functionsDemoE {

  def factorial (n: Int): Int = {
    if (n <= 1)
      1
    else
      n * factorial(n-1) // recursive function, it calls itself
  }

  def main(args: Array[String]): Unit = {

    var fact = factorial(5)
    println(fact)
  }

}
