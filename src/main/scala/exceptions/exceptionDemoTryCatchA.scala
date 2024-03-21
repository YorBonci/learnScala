package exceptions
import java.io.FileReader // import package for reading files
import java.io.FileNotFoundException // import for exception FileNotFoundException
import java.io.IOException // import for IOException

object exceptionDemoTryCatchA extends App {

  println("Hello World!")

  val fA = new FileReader("/Users/yorbonci/IdeaProjects/learnScala/src/main/scala/exceptions/input.txt")

  try {
    val fB = new FileReader("/Users/yorbonci/IdeaProjects/learnScala/src/main/scala/exceptions/input.txt")
    val a = 10/0
    println(a)
    val array1 = Array(10)
    println(array1(11))
  } catch {
    case e: FileNotFoundException => {
      println("File is not found - Exception Received")
    }
    case e: IOException => {
      println("Error While reading the file - Exception Received")
    }
    case e: ArithmeticException => {
      println(s"Arithmatic Exception Received: $e")
      // instead of e any name can be used
      // in real world program, you will usually log this error in some error log file
    }
    case _: Exception => {
      println("It will catch all unhandled exception")
    }
  } finally {
    println("It will always be executed irrespective of Exception or not")
  }

}
