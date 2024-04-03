import Array._

object arrayDemoG extends App{

  var marks1 = Array(5,6,8,9,2,4,6)
  var marks2 = Array(5,9,2,6,4,2,6)

  var allMarks = concat(marks1, marks2) // concat is used to combine arrays to a single array

  allMarks.foreach(println)


  var rollNo = range(1,101)
  rollNo.foreach(n => print(s"$n "))

}
