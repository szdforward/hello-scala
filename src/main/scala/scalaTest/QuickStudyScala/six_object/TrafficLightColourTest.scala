package scalaTest.QuickStudyScala.six_object
import TrafficLightColour._
/**
 * 测试枚举类
 */
object TrafficLightColourTest {
  def main(args: Array[String]): Unit = {
    println(doWhat(RED))//stop
    //获取枚举的id和名称
    println(RED.id+" : "+RED)//0 : stop
    println(YELLOW.id+" : "+YELLOW)//10 : YELLOW
    println(GREEN.id+" : "+GREEN)//11 : Go
    //获取枚举类中的单个枚举值,两种方式，一种是通过id，一种是名称
    val colour: TrafficLightColour.Value = TrafficLightColour(0)
    val colour2: TrafficLightColour.Value = TrafficLightColour.withName("YELLOW")
    //注意！如果枚举TrafficLightColour中并没有对应名字的枚举值的话，在编译期就会报错Exception in thread "main" java.util.NoSuchElementException: None.get
//    val colour3: TrafficLightColour.Value = TrafficLightColour.withName("YELLOW333")
    println(colour2)//YELLOW


  }
  //注意枚举的类型是TrafficLightColour.Value--但如果你在枚举中添加type TrafficLightColour=Value的话，这样枚举的类型成为了TrafficLightColour.TrafficLightColour
  def doWhat(color:TrafficLightColour.Value)={
    if (color==RED) "stop"
    else if(color==YELLOW) "hurry up"
    else "go"
  }
}
