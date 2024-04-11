package functions

// Function Call By Name

object functionsDemoJ {

  def main(args:Array[String]): Unit = {
    printValue(increment, 3)
    printValue(decrement, 2)

  }

  // Need to define the input data type
  def printValue (m: Int => Int, x: Int) = {
    println(s"Value is ${m(x)}")
  }

  def increment(y: Int) = {
    println(s"Value of y is $y")
    var z = y + 1
    println(s"Value of y after incrementing is $z")
    z
  }

  def decrement(y: Int) = {
    println(s"Value of y is $y")
    var z = y - 1
    println(s"Value of y after decrementing is $z")
    z
  }
}
