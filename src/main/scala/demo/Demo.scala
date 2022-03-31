package demo

object Demo {
  def main(args: Array[String]): Unit = {
    println("Hi there")
    var a = 12.asInstanceOf[Byte]
    println(a)
    var b:Any = 12
    println(b)
    var con1 = true
    var con2 = false
    println(con1 & con2)
    //var c = 10.unary_+
    //println(c)
    println(add(20,30))
    var car = new Car()
    val value = car.cost(200)
    println("car cost "+ value)
    println("car road tax "+car.topClassCost)
  }

  def add(a:Int, b:Int) = a+b
}
