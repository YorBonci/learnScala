case class CarC(name:String, cost:Int) {

}

object patternMatchingDemoB extends App {

  val mercedes = new CarC("Mercedes", 500000)
  val bmw = new CarC("BMW", 700000)
  val jaguar = new CarC("Jaguar", 1000000)
  val mercedesA = new CarC("Mercedes", 550000)

  for (car <- List(mercedes, bmw, jaguar,mercedesA)) {
    car match {
      case CarC("Mercedes",500000) => println("Car is Mercedes, Congrats!")
      case CarC("BMW", 700000) => println("Car is BMW, Wow!")
      case CarC(name,cost) => println(s"Car is $name, Cost is $cost, That's Awesome!!!")
    }
  }
}