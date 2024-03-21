package exceptions
import scala.util.Try
import scala.util.Success
import scala.util.Failure

object exceptionDemoTrySuccessFailureA {

  def main(args: Array[String]): Unit = {

    val a = Try(10 / 0)

    println(a.getClass.getSimpleName)

    a match {
      case Success(value) => println(value)
//      case Failure(exception) => println(exception)
      case Failure(exception) => errorHandlingFunction(exception)
    }

  }

  def errorHandlingFunction(exception: Throwable) = {
    println(exception)
    if (exception.toString.equals("java.lang.ArithmeticException: / by zero")) {
      println("Hello, Arithmetic Exception has occurred!")
    }
  }
}
