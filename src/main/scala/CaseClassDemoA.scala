case class CarA(name: String, model: String, var year: String)
{
  var carName = name
  val carModel = model
  val carYear = year

  def printDetails() = {
    println(s"Car Name is: ${carName} and Car Model is: ${carModel}, and Car Year: ${carYear} or ${year}")
  }
}

object CaseClassDemoA {

  def main(args: Array[String]): Unit = {

    val bmw = CarA(name="BMW", model="550", year ="1950") // 1. No need to write new as it is a case class, apply method is autogenerated

    bmw.printDetails()

    println(bmw.name)
//    bmw.name = "B.M.W" // 2. Constructor parameter is val by default and cannot be changed directly as the mutator method is not autogenerated
    bmw.carName = "B.M.W"
    bmw.year = "1988"
    bmw.printDetails()

    bmw match {case CarA(a,b,c) => println(a,b,c)} // 3. There is unapply method used for matching

    val mercedes = bmw.copy(name = "mercedes") // 4. Autogenerates the copy method
    mercedes.printDetails()

    println(bmw == mercedes) // 5. equals and hashcode methods

    println(bmw) // 6. toString method autoimplemented

  }

}
