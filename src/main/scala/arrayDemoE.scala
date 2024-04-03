object arrayDemoE extends App{

  // reduceRight

  var marks = Array(21, 26, 37, 65, 88, 97, 25, 36, 66)
  var avg = marks.reduceRight((x, y) => (x + y) / 2)
  println(avg)

  var avgCounting = marks.reduceRight((x, y) => {
    println(s"value of x is $x and y is $y and their avg is ${(x + y) / 2}")
    (x + y) / 2
  }
  )

  //short hand notation

  var avg2 = marks.reduceRight(_ / 2 + _ / 2) // first diving the x and y and then adding the result
  println(avg2)

  var totalMarks = marks.reduceRight(_ + _)
  println(s"Total Marks is $totalMarks")

  var totalMarks2 = marks.reduceRight((a, b) => a + b)
  println(s"Total Marks is $totalMarks2")

  var maxMarks = marks.reduceRight(_ max _)
  println(s"Max Marks is $maxMarks")

  var minMarks = marks.reduceRight(_ min _)
  println(s"Min Marks is $minMarks")

}
