object patternMatchingDemoA {

  def main (args:Array[String]): Unit = {

    def patternMatching(x:Int) = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "none of the above"
    }

    println(patternMatching(2))
    println(patternMatching(5))

    def patternMatchingB(x: Any) = x match {
      case 1 => "one"
      case 2 => "two"
      case "three" => 3
      case "four" => 4
      case _ => "none of the above"
    }

    println(patternMatchingB("three"))

  }
}
