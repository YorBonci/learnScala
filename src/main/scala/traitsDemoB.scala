trait FourWheelerB {

  def tyres() = {
    println("4 Tyres is present in Four Wheeler")
  }
}

trait AutoB {

  def engine() = {
    println("Engine is 1000 CC")
  }

  def break() // unimplemented method

  def tyres() = {
    println("4 Tyres is present in a car")
  }
}

class MercedesB extends AutoB with FourWheelerB {

  def break() = {
    println("Disk Breaks")
  }

  override def tyres() = super.tyres() // It makes sure to look for the method from the last extended trait
                                             // If not defined, it will take the method in the other trait

}

object traitsDemoB extends App{

  val ml = new MercedesB

  ml.break
  ml.tyres
  ml.engine()

}
