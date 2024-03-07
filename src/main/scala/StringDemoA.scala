object StringDemoA {

  def main(args:Array[String]): Unit = {

    var greetings = "Hello World!" // Auto defining the data type
    println(greetings)
    greetings = "Hello India!"
    println(greetings)

    var greetingsNew: String = "Hello New World!" // Data type string is defined
    println(greetingsNew)

    // length method
    var lengthOfString = greetings.length()
    println(s"Length of string is ${lengthOfString}")

    var var1 = "Hello"
    var var2 = "World"

    // concat method
    println(var1 + " " + var2)
    println(var1.concat(var2))

    // equal method
    var varA = "Hello Katty"
    var varB = "Hello Katty"
    var varC = "Helly George"
    println(varA.equals(varB))
    println(varA.equals(varC))

    println(varA == varB)
    println(varA.isEmpty())

    // string formatting
    var nameOfCar = "Mercedes"
    var costOfCar = 500000
    var milageOfCar = 8.5

    printf("Name of car is: %s and cost of car is %d and milage is %f", nameOfCar, costOfCar, milageOfCar)

    // multi line strings
    println(" ")
    var multiLineString =
      """Hello
        |World
        |How
        |Are
        |You
        |""".stripMargin

    println(multiLineString)

    var multiLineStringB =
      """Hello
        $World
        $How
        $Are
        $You
        """.stripMargin('$')

    println(multiLineStringB)

    // string interpolation
    // s string interpolator
    var name = "Rodi"
    println(s"Hello $name")

    // f interpolator
    var nameA = "Rosa"
    var salary = 20000.2

    println(f"Name is $name%s and salary $salary%8.2f")

    // raw interpolator w/o escaping
    println(s"Hello World!\nHow are you?")
    println(raw"Hello World!\nHow are you?")



  }
}
