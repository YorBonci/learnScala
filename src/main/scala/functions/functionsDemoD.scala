package functions

import scala.io.StdIn.readInt

// Default parameters
object functionsDemoD {

  def div(x:Int = 5, y:Int = 1): Double = {
    println(s"value of x: $x")
    println(s"Value of y: $y")
    return (x / y)
  }

  def main(args: Array[String]): Unit = {
    println(div(y = 2))

    var a = readInt()
    var b = readInt()

    println(div(a,b))


  }

}
