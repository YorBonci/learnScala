class Person(var name: String, var age: Int) {

  // This is the primary constructor
  println("Primary constructor called")

  // Auxiliary constructors
  def this(name: String) {

    this(name, 0) // Calls the primary constructor with default age value
    println("Auxiliary constructor 1 called")
  }

  // Auxiliary constructor 2
  def this() {

    this("John Doe") // Calls the auxiliary constructor with default name and age
    println("Auxiliary constructor 2 called")
  }

  // Method to display the details of the person
  def display(): Unit = {
  println(s"Name: $name, age: $age")
  }

}

object scalaConstructors  extends App {

  val person1 = new Person("Alice", 30) // Calling the primary constructor
  val person2 = new Person("Bob") // Calling the auxiliary constructor 1
  val person3 = new Person() // Calling the auxiliary constructor 2

  // Display details of the person

  person1.display()
  person2.display()
  person3.display()

}
