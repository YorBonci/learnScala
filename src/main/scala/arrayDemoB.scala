object arrayDemoB extends App {

  var marks = Array(58,36,45,89,52,100,87,69,99,41,12,2,79,86)

  var index = 0
  for (mark <- marks) {
    println(s"Index: $index, Mark: $mark")
    index = index + 1
  }

  // Average marks
  var totalMarks = 0
  var averageMarks = 0

  // Scala approach
  for (mark <- marks) {
    totalMarks = totalMarks + mark
  }
  averageMarks = totalMarks / marks.length
  println(s"Average Marks is $averageMarks")

  // Java approach
  totalMarks = 0
  averageMarks = 0

  for (i <- 0 to (marks.length - 1)) {
    totalMarks = totalMarks + marks(i)
  }

  averageMarks = totalMarks / marks.length
  println(s"Average Marks is $averageMarks")


}
