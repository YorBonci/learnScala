// Auxiliary constructors

class demoClass3 (val a: Int, val b: Double, val c: String) {
  val x = a
  val y = b
  val z = c


  println(s"Primary constructor says: x = ${x} and y = ${y} and z = ${z}")

  def this() = {
    this(55,22.00,"Hellow Scala")
    println("Came into auxiliary constructor with 0 parameters")
  }

  def this(a: Int) = {
    this(a, 22.00, "Hellow Scala")
    println("Came into auxiliary constructor with 1 parameter")
  }

  def this(a: Int, b: Double) = {
    this(a, b, "Hellow Scala")
    println("Came into auxiliary constructor with 2 parameters")
  }

}


object ConstructorDemo3 extends App {

  val demandObject1 = new demoClass3(3,7.2,"Hello World!")
  val demandObject2 = new demoClass3()
  val demandObject3 = new demoClass3(7)
  val demandObject4 = new demoClass3(7, 5.5)

}

