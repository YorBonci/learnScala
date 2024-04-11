package functions

object functionsDemoG {

  def main(args: Array[String]): Unit = {

    var listOfNumbers = List(0,1,2,3,4,5,6,7,8,9)
    var result = listOfNumbers.map(n => divisibleByThree(n))
    println(result)

    listOfNumbers.foreach(n =>
      if (divisibleByThree(n)) {
        println(s"$n is divisible by 3")
      }
      else {
        println(s"$n is not divisible by 3")
      }
    )

    listOfNumbers.foreach(n =>
      if (divisibleByThreeA(n)) {
        println(s"$n is divisible by 3")
      }
      else {
        println(s"$n is not divisible by 3")
      }
    )

    // Use anonymous function with filter
    var resultB = listOfNumbers.filter((x:Int) => x%3 == 0)
//    var resultB = listOfNumbers.filter(x => x%3 == 0)
//    var resultB = listOfNumbers.filter(_%3 == 0)
    println(resultB)
    resultB.foreach(x => println(s"$x is divisible by 3"))


  }

  def divisibleByThree(x: Int) = {
    x%3 == 0
  }

  var divisibleByThreeA = (x:Int) => x%3 == 0


}
