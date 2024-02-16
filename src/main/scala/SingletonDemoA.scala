object DemoObjectB {
  val x = 2
  val y = 3.2

  def addValue() = x + y

  println(s"x = ${x} and y = ${y}")
}



object SingletonDemoA {

  def main (args: Array[String]): Unit = {
    println("Hello World!")


//    val demoObjectB1 = new DemoClassB // we cannot create an object from another object
    println(DemoObjectB.x, DemoObjectB.y)

    val result = DemoObjectB.addValue()
    println(result)
  }

}
