package functions

object functionsDemoA {

  // defining a function
  def sum(x: Int, y: Int): Int = {

    return (x + y)
  }

  def main(args: Array[String]) : Unit = {

    var z = sum(2,3)
    println(z)

  }

}
