// written by xyz developer, open source, whenever you extend AutoD, you should also extend FourWheelerD and VehicleD
abstract class VehicleD {

}

trait FourWheelerD {

}

trait AutoD {
  this: FourWheelerD with VehicleD => {

  } // it enforces the need to extends also FourWheeler and Vehicle when using Auto

  }

// written by abc developer
class MercedesD extends VehicleD with FourWheelerD with AutoD {

}

object traitsDemoD extends App{

  val ml = new MercedesD

}
