object arrayDemoH extends App{

  // Tridimensional Array
  var marks1 = Array(5,6,9)
  var marks2 = Array(5,9,7)
  var marks3 = Array(5,9,4)

  var marks = Array(marks1, marks2, marks3)

  for (marka <- marks) {
    print(s"Array $marks: ")
    for (markb <- marka) {
      print(markb)
    }
    println("")
  }

}
