trait Auto {

  def engine() = {
    println("Engine is 1000 CC")
  }

  def break() // unimplemented method

  def tyres() // unimplemented method
}

class Mercedes extends Auto {

  def break() = {
    println("Disk Breaks")
  }

  def tyres = {
    println("4 Tyres")
  }
}

object traitsDemoA extends App{

val ml = new Mercedes

ml.break
ml.tyres
ml.engine()

}
