object whileLoopDemo extends App {

  var x = 1

  // While is checking the condition at the start
  while (x<10) {
    println(s"Value x is $x less than 10")
    x = x+1
  }

  while (x <= 20) {
    if (x < 20) {
      println(s"Value x is $x less than 20")
      x = x + 1
    } else {
      println(s"Value x is $x equal to 20. The End!")
      x = x + 1
    }
  }

  // do While is the condition at the end
  // do While will execute the code at least once even if the condition is not met
  do {
    println(s"We are going on with x: $x less than 30")
    x = x + 1
  } while (x < 30)

}
