package functions

// Anonymous functions

object functionsDemoF {

  def main(args: Array[String]): Unit = {

    println(s"Increment Function output is: ${increments(5)}")
    println(s"Increment Anonymous Function A output is: ${incrementsA(5)}")
    println(s"Increment Anonymous Function B output is: ${incrementsB(5)}")

    printHelloWorld()
    printHelloWolrdA()

    println(s"The output of the Function is ${add(2,3)}")
    println(s"The output of the Anonymous Function is ${addA(2,3)}")

  }

  def increments (x: Int): Int = {
    x + 1
  }

  var x: Int = 5

  // Example 1.
  var incrementsA = (x: Int) => x + 1 // Anonymous Function
  var incrementsB = (x: Int) => {
    println(s"Value of x is: $x")
    x + 1
  }

  // Example 2. with 0 input and 0 output
  def printHelloWorld () = {
    println("Hello World")
  }

  var printHelloWolrdA = () => println("Hello World")

  // Example 3. two input and output parameters

  def add(x:Int, y:Int) : Int = {
    x + y
  }

  var addA = (x: Int, y:Int) => x + y


}
