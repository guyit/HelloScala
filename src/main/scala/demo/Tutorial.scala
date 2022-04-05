package demo
object Tutorial {
  def main(args: Array[String]): Unit ={
    val rover = new Car()
    println(rover.toString)
    val ford = new Car(50)
    print(ford.toString)

  }

  class Car(val a: Int = 1000, val b: Int = 2000) {
    var topClassCost: Int = a
    private var roadTax = b
    val carNumber: Int = Car.newNumber

    def this() {
      //this.roadTax = roadTax
      //this.setTax(roadTax)
      this(5, 15)
      println("aux constructor")
    }

    def this(x: Int) {
      this(x, x)
      println("aux constructor 2")
    }

    def cost(basicCost: Int): Int = basicCost + topClassCost + roadTax

    def getRoadTax: Int = roadTax

    def setTax(roadTax: Int): Unit = this.roadTax = roadTax

    def getCarNumber: Int = carNumber

    override def toString: String = {
      "id: %d tax: %d\r\n".format(carNumber,roadTax)
    }
    object Car {
      private var number: Int = 0

      private def newNumber: Int = {
        number += 1; number
      }
    }
  }
}