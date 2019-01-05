package scalaTest.QuickStudyScala.seven

import java.util.{HashMap=>javaHashMap}
import scala.collection.mutable._

/**
 * Created by Administrator on 上午 11:18.
 */
//选取器语法允许你重命名选到的成员 例如我在这里把java.util.HashMap的名称改为了javaHashMap这样在我的类里直接使用javaHashMap就可以了
object HashMapTest {
  def main(args: Array[String]) {
    val scalaMap=HashMap[String,Int]()
    val myJavaHashMap=new javaHashMap[String,Int]()
  }

}
