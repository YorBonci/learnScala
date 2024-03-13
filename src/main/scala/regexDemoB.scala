import scala.util.matching.Regex

object regexDemoB extends App{

  val stringToFind = "Hello, I am Able to do it, abl11 able able0"

  val pattern = "[Aa]bl[ae]\\d*".r

  pattern findAllIn stringToFind foreach(element => print(element + " "))

  val stringToFindA = "-1.5 divided by 5 is 3 is wrong"
  val patternA = "(-)?(\\d+)(\\.\\d*)?".r

  patternA findAllIn stringToFindA foreach(element => print(element + " "))

  val Decimal = """(-)?(\d+)(\.\d*)?""".r
  val Decimal(sign, integerpart, decimalpart) = "-1.23" // Assign the value into 3 different parts, sign, integerpart and decimalpart

  for (Decimal(sign, integerpart, decimalpart) <- Decimal findAllIn stringToFindA)
    println(s"Sign is: $sign, Integer Part is: $integerpart, Decimal Part is: $decimalpart")


}
