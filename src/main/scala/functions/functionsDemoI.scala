package functions

object functionsDemoI {

  def main(args:Array[String]): Unit = {

    printIncrementValue(2)
    printIncrementValueB(incrementB())
  }

  def printIncrementValue(x: Int) = {
    println(s"Addition value is ${increment(x)}")
  }

  def increment (y: Int) = {
    println(s"Value of y is $y")
    var z = y + 1
    println(s"After incrementing value is $z")
    z
  }

// Pass a function as a parameter into another function

  def printIncrementValueB(m: => Int) = {
    println(s"Addition value is $m")
  }

  def incrementB() = {
    var y =  2
    println(s"Value of y is $y")
    var z = y + 1
    println(s"After incrementing value is $z")
    z
  }
}
