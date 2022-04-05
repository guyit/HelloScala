package demo

import scala.io.StdIn.readLine

object Demo {
  def main(args: Array[String]): Unit = {

    var a = 12.asInstanceOf[Byte]
    println(s"--$a")
    var b:Any = 12
    println(b)
    var con1 = true
    var con2 = false
    println(con1 & con2)
    //var c = 10.unary_+
    //println(c)
    println(add(20,30))
    var car = new Tutorial.Car(100,150)
    val value = car.cost(200)
    printf("car cost %d, number %d",value, car.getCarNumber)
    println("car road tax "+car.topClassCost)

    var car2 = new Tutorial.Car()
    printf("Car2 id %d road tax %d ",car2.carNumber, car2.getRoadTax)
    var car3 = new Tutorial.Car(b=123)
    printf("Car3 id %d road tax %d ",car3.carNumber, car3.getRoadTax)
    var car4 = new Tutorial.Car(123)
    printf("Car4 id %d road tax %d ",car4.carNumber, car4.getRoadTax)

    testFor()
    testForString()
    //guessNumber
    val myVal = defWithDefaultValues(num2 = 30)
    println(myVal)
  }

  def add(a:Int, b:Int): Int = a+b

  def testWhile(): Unit =
  {
    var i = 0
    while(i<10){
      println(i)
      i+=1
    }
  }
  def testFor(): Unit =
    {
      println("testFor")
      var numList = List(1,2,3,4,5,6,7,8,9)
      var retVal = for{ a <- numList if a<5}yield a*10

      for(a <- retVal) print(a+" ")

      var myTuple = ("huy", 123, 1.23d)
      printf("\r\nMy result is %s\r\n",myTuple.productElement(1))
    }

  def testForString(): Unit = {
    var str = "guy itzhaki!"
    for( i <- 0 until str.length-4) print(str(i)+" ")

    println // just print empty line
  }

  def guessNumber(): Unit = {
    var guess = 0
    do{
      print("Guess a number ")
      guess = readLine.toInt
    }while(guess != 10)

    var name = "guy"
    println(f"walla you did it $name. Escape number is ${guess + 1}")

    printf("'%d'\r\n",123)
    printf("'%05d'\r\n",123)
    printf("'%-5d'\r\n",123)
  }

  def defWithDefaultValues(num1: Int=10, num2:Int = 20): Int = {
    num1+num2
  }
}
