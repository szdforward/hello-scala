package scalaTest.QuickStudyScala.seven


package object random{
  val a=1664525
  val b=1013904223
  val n=32
  var seed:Int=_
  def nextInt():Int={
    val temp=(seed * a + b) % BigDecimal(2).pow(n)
    seed = temp.toInt
    seed
  }
  def nextDouble():Double={
    val temp = (seed * a + b) % BigDecimal(2).pow(n)
    seed = temp.toInt
    temp.toDouble
  }
}
package random {

  object Testrandom extends App{
    random.seed = 4
    println(random.nextInt())
    println(random.nextInt())
    println(random.nextInt())
    println(random.nextInt())
    println(random.nextDouble())
    println(random.nextDouble())
    println(random.nextDouble())
    println(random.nextDouble())
  }

}


