import scala.collection.mutable.ArrayBuffer

object arrayDemoI extends App{

  // Resizable Array - do not need to specify the length of an array
  var marks = ArrayBuffer[Int]()
  marks += 10
  marks += 6
  marks += 3

  marks.foreach(println)

  marks += 7
  marks.foreach(println)

  marks.append(5)
  marks.foreach(println)

  marks ++= Array(2,3,4,5,6,7)
  marks.foreach(n => print(s"$n "))

  println("\nAfter removing 5")
  marks -= 5
  marks.foreach(n => print(s"$n "))


}
