package functions

// Calling function by Value. The inside function is executed first

object functionsDemoL {

  def main(args:Array[String]): Unit = {
    println(s"Main Function: ${exec(time())}")

  }

  def time(): Long = {
    println("Inside time function")
    return System.nanoTime()
  }

  def exec(t:Long): Long = {
    println("Inside exec function")
    println(s"Time $t")
    println("Existing from exec function")
    return t
  }

}
