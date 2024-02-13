class demoClass {
  val x = 3
  val y = 2

  def addNumber(): Int = {
    x + y
  }

  println(s"x - ${x} and y - ${y}")

  val z = addNumber()
  println(s"z - ${z}")

}


object ConstructorDemo extends App {

  println("Hello World")

  val demoObject1 = new demoClass // The constructor is called and will call all the code defined in the class

}
