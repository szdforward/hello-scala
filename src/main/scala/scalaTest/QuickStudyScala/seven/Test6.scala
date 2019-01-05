package scalaTest.QuickStudyScala.seven
import java.util.{HashMap=>javaHashMap}
import scala.collection.mutable.{HashMap=>scalaHashMap}
/**
 * Created by Administrator on 上午 11:54.
 */
object Test6 {
  def main(args: Array[String]) {
    val stringToInt: javaHashMap[String, Int] = new javaHashMap[String,Int]()
    stringToInt.put("a",1)
    stringToInt.put("b",2)
    stringToInt.put("c",3)
    var scalahashMap= scalaHashMap[String,Int]()
    import scala.collection.JavaConversions.mapAsScalaMap//注意需要导入这个包，这样在scalahashMap += i操作时才不会编译报错（否则说类型不对）
    for(i<-stringToInt)scalahashMap += i
    println(scalahashMap)
  }

}
