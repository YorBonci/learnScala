import Array._

object arrayDemoF extends App{

  // Multidimensional Array

  // 2 dimensional Array
  var matrixEg = ofDim[Int](3,3)

  for (row <- 0 to 2) {
    for (column <- 0 to 2) {
      matrixEg(row)(column) = column + 3
    }
  }

  for (row <- 0 to 2) {
    for (column <- 0 to 2) {
      print(matrixEg(row)(column))
    }
    println("")
  }

  // Identity Matrix
  var identityMatrix = ofDim[Int](5,5)

  for (row <- 0 to 4) {
    for (column <- 0 to 4) {
      if (row == column) {
        identityMatrix(row)(column) = 1
      } else {
        identityMatrix(row)(column) = 0
      }
    }
  }

  for (row <- 0 to 4) {
    for (column <- 0 to 4) {
      print(identityMatrix(row)(column))
    }
    println("")
  }


}
