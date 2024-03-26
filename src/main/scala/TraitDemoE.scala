// Value Class: cannot allocate runtime object
// Value class always has ONLY 1 parameter with type as VAL
// You cannot extend a Value Class
// Value Class cannot extend a trait. That's why you have a universal trait

// Benefits of Value Class
// 1. Less initializations
// 2. Better performance
// 3. Less memory usage
// Use Case: Performance and memory optimization


// Universal Trait using extends Any
trait AutoE extends Any {
  def print() = {println(this)}
}

class MercedesE(val x:Int) extends AnyVal with AutoE {
  // var y = 1 --> cannot define any variables in a value class. Can only define methods

  def hello = {
    println("Hello")
  }
}

object TraitDemoE extends App {

  val ml = new MercedesE(5)
  ml.print()
  ml.hello

}
