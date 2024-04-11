package functions

object functionsDemoH {

  def main(args:Array[String]): Unit = {
    var listOfNumbers = List(0,1,2,3,4,5,6,7,8,9)

    var result = listOfNumbers.filter(_%3 == 0)
    println(result)

    // using map
    var resultB = listOfNumbers.map(square)
    println(resultB)

    var resultC = listOfNumbers.map(squareB)
    println(resultC)

    var resultD = listOfNumbers.map((x: Int) => x * x)
    println(resultD)

    var resultE = listOfNumbers.map(x => x * x)
    // When you write listOfNumbers.map(_ * _), the Scala compiler interprets it as an attempt to use
    // placeholder syntax for a function that takes two parameters. Map can take only one input
    println(resultE)
  }

  def square(x:Int) = {
    x * x
  }

  var squareB = (x: Int) => x * x

  // Specify the output data type (optional)

  var squareC: Int => Int = (x: Int) => x * x


}
