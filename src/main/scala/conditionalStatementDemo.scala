object conditionalStatementDemo extends App {

  val x = 7

  if (x > 5) {
    println(s"x: $x is greater than 5")
  }

  val y = 2

  if (y > 5) {
    println(s"y: $y is greater than 5")
  }

  val z = 2

  if (z > 5) {
    println(s"z: $z is greater than 5")
  } else {
    println(s"z: $z is not greater than 5")
  }

  if (z == 1) {
    println(s"z: $z is equal to 1")
  } else if (z == 2) {
    println(s"z: $z is equal to 2")
  } else {
    println(s"z: $z is neither equal to 1 nor 2")
  }

}
