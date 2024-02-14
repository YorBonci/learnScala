// Default parameter
class demoClass2 (val a: Int = 55, val b: Double = 99.9, val c: String = "Hello Scala") {
  val x = a
  val y = b
  val z = c

  def addNumber() = {
    x + y
  }

  println(s"x = ${x} and y = ${y} and z = ${z}")

}


object ConstructorDemo2 extends App {

  val demoObject1 = new demoClass2() // The constructor is called and will call all the code defined in the class
  val demoObject2 = new demoClass2(500, 8.02, "Hello World Again!")
  val demoObject23 = new demoClass2(c = "Hello World Again!")

  println(demoObject1.x, demoObject1.y, demoObject1.z)
  val result = demoObject1.addNumber()
  println(s"result = ${result}")

}
