package functions

// Function by Name. The only different is using => in the outside function.
// The outside function will run first and only when a reference to the inside function comes, the outside function will be called

object functionsDemoM {

  def main(args: Array[String]): Unit = {
    println(s"Main Function: ${exec(time())}")

  }

  def time(): Long = {
    println("Inside time function")
    return System.nanoTime()
  }

  def exec(t: => Long): Long = {
    println("Inside exec function")
    println(s"Time $t")
    println("Existing from exec function")
    return t
  }

}
