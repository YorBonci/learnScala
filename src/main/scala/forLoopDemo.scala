import scala.util.control.Breaks

object forLoopDemo extends App {

  // 1.
  println("===========for loop to=============")
  for (i <- 1 to 10) {
    println(s"Value of i is $i using to")
  }

  // 2. not including the last value
  println("===========for loop until=============")
  for (i <- 1 until 10) {
    println(s"Value of i is $i using until")
  }

  // 3. nested for loop
  println("===========Nested for loop=============")
  for (i <- 1 to 10) {
    for (j <- 1 to 10) {
      println(s"Value of i is $i and value of j is $j")
    }
  }

  // 4. Nested loop in Scala syntax
  println("============Nested Loop in Scala Language============")
  for (i <- 1 to 10; j <- 1 to 10) {
    println(s"Value of i is $i and value of j is $j")

  }

  // List - immutable - iterating over lists

  println("============For Loop for Iterating through Collections=============")
  var numberList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  for (i <- numberList) {
    println(s"Value of i is $i")
  }

  // List - immutable - iterating over lists with filter

  println("============For Loop for Iterating through Collections with Filter=============")
  var numberList2 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  for (i <- numberList2 if i%2 == 0) {
    println(s"Value of i is $i")
  }

  for (i <- numberList2) {
    if (i%2 == 0) {
      println(s"Value of i is $i for JAVA")
    }
  }

  for (i <- numberList2 if i % 2 == 0; if i != 4) {
    println(s"Value of i is $i")
  }

  // List - immutable - iterating over lists with filter with Yield

  println("============For Loop for Iterating through Collections with Filter with Yield=============")
  var numberList3 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  var evenNumberList = for (i <- numberList3 if i % 2 == 0) yield i
  println(evenNumberList)

  // break - scala 2.8

  println("============For Loop for Break=============")
  var numberList4 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val breakObject = new Breaks;

  breakObject.breakable {
    for (i <- numberList4 if i % 2 == 0) {
      println(s"Value of i is $i")
      if (i == 4 ) {
        println(s"I am breaking at $i")
        breakObject.break
      }
    }
  }

}
