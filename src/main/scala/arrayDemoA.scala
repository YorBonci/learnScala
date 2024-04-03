object arrayDemoA extends App {

  var num:Array[Int] = new Array[Int](3)

  for (element <- num) {
    println(element)
  }

  num(0) = 25
  num(1) = 35
  num(2) = 50

  for (element <- num) {
    println(element)
  }

  println(num(1))

  var numB = Array(21,25,98)

  for (element <- numB) {
    println(element)
  }

  var strArray: Array[String] = new Array[String](3)

  for (element <- strArray) {
    println(element)
  }

  strArray(0) = "Katie"
  strArray(1) = "Rudolph"
  strArray(2) = "Lucy"

  println(strArray(2))

}
