package demo

object Demo {
  def main(args: Array[String]): Unit = {
    println("Hi there")
    var a = 12.asInstanceOf[Byte]
    println(a)
    println("any")
    var b:Any = 12
    println(b)
    var con1 = true
    var con2 = false
    println(con1 & con2)
    //var c = 10.unary_+
    //println(c)
    //test
  }
}
