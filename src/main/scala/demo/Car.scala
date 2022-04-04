package demo

class Car (val a:Int = 1000, val b:Int = 2000){
  var topClassCost: Int = a
  private var roadTax = b
  val carNumber = Car.newNumber
  def this()
  {
    //this.roadTax = roadTax
    //this.setTax(roadTax)
    this(5,15)
    println("aux constructor")
  }

  def this(x:Int){
    this(x,x)
    println("aux constructor 2")
  }

  def cost(basicCost:Int) = basicCost + topClassCost + roadTax

  def getRoadTax()= {roadTax}

  def setTax(roadTax: Int) = this.roadTax = roadTax

  def getCarNumber() = carNumber
  object Car
  {
    private var number = 0
    def newNumber()= number+=1; number
  }
}
