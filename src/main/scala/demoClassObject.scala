class Car {

  var topClassExtraCost = 0
  private var roadTax = 100

  def cost(basicCost: Int): Int = basicCost + topClassExtraCost + roadTax

  def printTax = roadTax
}



object demoClassObject  extends App {

  println("Hello World")

  var bmw = new Car
  println(bmw.topClassExtraCost)
  bmw.topClassExtraCost = 50
  println(s"The new ExtraCost is : ${bmw.topClassExtraCost}")

  println("Road tax is: " + bmw.printTax)

  var result = bmw.cost(basicCost = 1000)
  println(s"Total cost is ${result}")

}
