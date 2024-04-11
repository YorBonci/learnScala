package functions

import java.util.Date

// Partially Applied Function

object functionsDemoN {

  def main(args:Array[String]): Unit = {

    var date = new Date()
    val logwithDate = log(date, _:String) // Partially Applied Function. _ is the parameter expected by the partially applied function

    // Without a partially defined function
    log(date, msg = "Hello 1 ")

    Thread.sleep(2000)
    log(date, "Hello 2 ")

    Thread.sleep(2000)
    log(date, "Hello 3 ")

    // With a partially defined function
    Thread.sleep(2000)
    logwithDate("Hello 1 ")

    Thread.sleep(2000)
    logwithDate("Hello 2 ")

    Thread.sleep(2000)
    logwithDate("Hello 3 ")

    fourWheeler("Mercedes", "Car", 200000)

    car("Jeep")
    truck("BMW")

  }

  def log(date: Date, msg: String): Unit ={
    println(msg + date)
  }

  def fourWheeler(vehicleName: String, vehicleType: String, vehicleCost: Int): Unit = {
    println(s"Vehicle Name is: $vehicleName, Vehicle Type is: $vehicleType, Vehicle Cost is: $vehicleCost ")
  }

  val car = fourWheeler(_:String, "Car", 200000) // Partially Implemented Function
  val truck = fourWheeler(_:String, "Truck", 150000)

  val fourWheelerA = (vehicleName: String, vehicleType: String, vehicleCost: Int) => {
    println(s"Vehicle Name is: $vehicleName, Vehicle Type is: $vehicleType, Vehicle Cost is: $vehicleCost ")
  }
}
