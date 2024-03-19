//import java.util._ imports everything
//import java.util.{List,Date} // imports multiple classes
import java.util.{List => utilList, Date} // import using aliases


object importDemoA extends App{

  val dateA = new Date()
  println(dateA)

  // we need to use the scala. package name to call the List because the java.util package also contain List
  val myList: List[Int] = List(1, 2, 3, 4, 5)
  println(myList)

}
