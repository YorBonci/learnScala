class DemoClassA {
  val x = 2
  val y = 3.2

  def addValue() = x + y

  println(s"x = ${x} and y = ${y}")
}



object SingletonDemo {

  def main (args: Array[String]): Unit = {
    println("Hello World!")

    val demoObjectA1 = new DemoClassA
    println(demoObjectA1.x, demoObjectA1.y)

    val result = demoObjectA1.addValue()
    println(result)
  }

}
