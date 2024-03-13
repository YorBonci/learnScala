import scala.util.matching.Regex

object regexDemoA extends App {

  val pattern = new Regex("Hello")
  val stringToFind = "Hello How are you? Hello Again"

  val resultA  = pattern findFirstIn stringToFind
  println(resultA)

  val resultB = pattern findAllIn stringToFind
  println(resultB)

  // iterating through the resultB
  for (a <- resultB) {
    println(a)
  }

  // transforming the resultC to string using mkString()
  val resultC = (pattern findAllIn stringToFind).mkString(", ")
  println(resultC)

  var stringToFindA = "My name is Harish and age is 10 and I study in standard 7"
  val patternA = "[0-9]+".r // using the .r method to call the Regex constructor

  val resultD = (patternA findAllIn stringToFindA)
  for (a <- resultD) {
    println(a)
  }

  println((patternA findAllIn stringToFindA).mkString(", "))

  // creating an empty list and adding the results of the Regex iterating through the found elements
  var resultE = List.empty[Any]
  for (element <- (patternA findAllIn stringToFindA)) {
    resultE = element :: resultE
  }

  println(resultE)

  val stringToFindB = "Hello, my name is Hirsh, and I say hello hello again."
  val patternB = "(H|h)ello".r

  println((patternB findAllIn stringToFindB).toList)

  val patternC = "Hellooooo".r

  println((patternC findAllIn stringToFindB).mkString) // It returns null
  println((patternC findFirstIn stringToFindB getOrElse("No Match Found")).mkString)

  patternB findAllIn stringToFindB foreach(d => println(d))
  patternB findAllIn stringToFindB foreach(d => print(d + " "))



}
