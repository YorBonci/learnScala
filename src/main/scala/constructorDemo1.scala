// Parametrized constructor (primary constructor)

class demoClass1 (val a: Int, val b: Double, val c: String) {
  val x = a
  val y = b
  val z = c

  def addNumber() = {
    x + y
  }

  println(s"x = ${x} and y = ${y} and z = ${z}")

}


object ConstructorDemo1 extends App {

  val demoObject1 = new demoClass1(20, 12.6, "Hello World!") // The constructor is called and will call all the code defined in the class
  val demoObject2 = new demoClass1(500, 8.02, "Hello World Again!")


  println(demoObject1.x, demoObject1.y, demoObject1.z)
  val result = demoObject1.addNumber()
  println(s"result = ${result}")

  println(demoObject2.x, demoObject2.y, demoObject2.z)
  val result1 = demoObject2.addNumber()
  println(s"result = ${result1}")

}