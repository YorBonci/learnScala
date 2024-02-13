object helloWorld {

  def main (args: Array[String]): Unit = {

    println("Hellow World")
    println("Hello World 1")

    var result = add(2,5)
    println(s"Addition of 2 and 5 is: ${result}")
  }

  def add (x: Int, y: Int): Int = {
    var z = x + y
    return z
  }

}
