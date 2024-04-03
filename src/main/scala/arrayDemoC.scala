object arrayDemoC extends App {

  val marks = Array(58,36,45,89,52,100,87,69,99,41,12,2,79,86)

  // foreach and map

  //1. using for loop
  for (mark <- marks) {
    println(mark)
  }

  // 2. using foreach
  marks.foreach(println)

  // Average marks
  var totalMarks = 0
  var averageMarks = 0

  // 2. foreach

  marks.foreach(mark => totalMarks += mark)
  averageMarks = totalMarks / marks.length
  println(s"Average Marks is: $averageMarks")

  // 3. Short Hand Notation
  totalMarks = 0
  averageMarks = 0

  marks.foreach(totalMarks +=_)
  averageMarks = totalMarks / marks.length
  println(s"Average Marks is: $averageMarks")

  // map ===> It always give multiple output and it is faster as it works in parallel
  var newMarks = marks.map(mark => mark + 10)
  newMarks.foreach(println)

  // short hand notation
  newMarks = marks.map(_ + 10)
  newMarks.foreach(println)

  // to have a for loop to return an array, use for - yield
  newMarks = for (mark <- marks) yield (mark + 10)
  newMarks.foreach(println)


}
