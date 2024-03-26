trait FourWheelerC {

  def tyres() = {
    println("4 Tyres is present in Four Wheeler")
  }
}

/*
  |In Scala programming, an abstract class is a class that cannot be instantiated directly
  |because it contains one or more abstract methods, which are methods declared without an implementation.
  |Abstract classes serve as blueprints for other classes to inherit from,
  |providing common functionality and structure. Subclasses of an abstract
  |class must implement all abstract methods defined in the abstract class
  |unless they are also marked as abstract.
  |Additionally, abstract classes can also contain non-abstract methods with implementations,
  |along with fields and constructors.
  |They are often used to define common behavior and characteristics shared among multiple related classes.
*/

abstract class VehicleC {
  def category()
}

trait AutoC {

  var x = 1000
  val t = 4

  def engine() = {
    println(s"Engine is ${x} CC")
  }

  def break() // unimplemented method

  def tyres() = {
    println(s"${t} Tyres is present in a car")
  }
}

class MercedesC extends VehicleC with AutoC with FourWheelerC {

  x = 2000 // it overwrites the var defined in the AutoC trait

  def break() = {
    println("Disk Breaks")
  }

  override def tyres() = super.tyres()

  def category() = {
    println("It is a Mercedes")
  }

//  override def engine(): Unit = {
//    println(s"Engine of Mercedes is ${x} CC")
//  }

}

object traitsDemoC extends App{

  val ml = new MercedesC

  ml.break
  ml.tyres
  ml.engine()
  ml.category()

}