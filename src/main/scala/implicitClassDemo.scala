object implicitClassDemo extends App {

  val strr = "Hellow World"

  println(strr.toUpperCase)

  implicit class StringFuncClass(s: String) {

    def firstChar() = s.substring(0, 1)
    def nthChar(n:Int):String = s.substring(n,n+1)

  }

  println(strr.firstChar)
  println(strr.nthChar(3))

}
