package functions

// Variable number of arguments in a function

object functionsDemoC {

  // String* means you are defining Array[String]
  // the * parameter must come last
  // there must be max one * parameter in the arguments definition
  def printMultipleTimes(n:Int, args:String*) = {

    for (arg <- args)
      {
        println((s"$arg ")*n)
      }
  }

  def main(args: Array[String]): Unit = {
    printMultipleTimes(3, "Hello", "World", "India", "Rome")


  }

}
