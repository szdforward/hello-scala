package scalaTest.QuickStudyScala.six_object

/**
 * 枚举类的使用
 */
object TrafficLightColour extends Enumeration{
  //Value是Enumeration的内部类
  val RED=Value(0,"stop")
  val YELLOW=Value(10)
  val GREEN=Value("Go")
  val ABC,ERD=Value

}
