package demo

class Car {
  var topClassCost = 30
  private var roadTax = 100

  def cost(basicCost:Int) = basicCost + topClassCost + roadTax

  def getRoadTax()= {roadTax}

}
