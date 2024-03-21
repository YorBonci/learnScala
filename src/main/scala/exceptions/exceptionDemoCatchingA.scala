package exceptions
import scala.util.control.Exception.catching

object exceptionDemoCatchingA extends App {

  val catchException = catching(classOf[ArithmeticException], classOf[ArrayIndexOutOfBoundsException]).withApply(e => println(s"Exception has occurred: $e")) // exception we want tot catch

  val a = catchException(10/5)

  val b = Array(10)
  println(catchException(b(11)))

  if (a. !=()) {
    println(a)
  }

}
