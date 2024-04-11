package functions

// Functions with named arguments
object functionsDemoB {

  def sum(x:Int, y:Int): Int = {

    println(s"Value of x is: $x")
    println(s"Value of y is: $y")
    return (x + y)
  }

  def main(args: Array[String]): Unit = {

    var z = sum(8,9)
    println(z)

    var a = sum(y = 8, x = 9)
    println(a)
  }
}
