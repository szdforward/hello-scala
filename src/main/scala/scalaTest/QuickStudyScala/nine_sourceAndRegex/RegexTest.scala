package scalaTest.QuickStudyScala.nine_sourceAndRegex

import scala.util.matching.Regex
import scala.util.matching.Regex.Match

/**
 * Created by Administrator on 下午 11:38.
 */
object RegexTest {
  def main(args: Array[String]) {
//    println("abcdefs".tail)//bcdefs
//    val numPattern: Regex = "[0-9]+".r
//    for(matchString<-numPattern.findAllIn("99 bottles,98 bottles"))println(matchString)
    //结果
//    99
//    98
//    val in: Option[String] = numPattern.findFirstIn("99 bottles,98 bottles")
//    println(in)//Some(99)
//    val in1: String = numPattern.replaceFirstIn("99 bottles,98 bottles","xx")
//    println(in1)//xx bottles,98 bottles
//    val in2: String = numPattern.replaceAllIn("99 bottles,98 bottles", "xx")
//    println(in2)//xx bottles,xx bottles
//    val in3: String = numPattern.replaceSomeIn("99 bottles,98 bottles",
//    m=>if(m.matched.toInt % 2 ==0) Some("xx") else None)
//    println(in3)//99 bottles,xx bottles
//
//    val in4: String = numPattern.replaceSomeIn("a99 bottles,a98 bottles",
//      m => if (m.matched.toInt  % 2==0) Some("xx") else None)
//    println(in4) //a99 bottles,axx bottles
//
//    //replaceSomeIn方法一个更有用的应用场景
//    val varPattern="""\$[0-9]+""".r
//    def format(message:String,vars:String*)=varPattern.replaceSomeIn(message,m=>vars.lift(m.matched.tail.toInt))
//    val format1: String = format("At $1, there was $2 on $0.","planet 7","12:30 pm","a disturbance of the force")
//    println(format1)//At 12:30 pm, there was a disturbance of the force on planet 7.

    //============正则表达式组
    val regex: Regex = "([0-9]+) ([a-z]+)".r//注意要使用正则表达式组的话需要在两个圆括号中间加上空格！否则匹配不上
    val in5: Iterator[Match] = regex.findAllMatchIn("99 bottles,98 bottles")
//    for(m<-in5)println(m.matched)
    //结果：
//    99 bottles
//      98 bottles
//    for(m<-in5)println(m.group(1))
    //结果：
//    99
//    98
//    for (m <- in5) println(m.start)
    //结果：
//    0
//    11
    for (m <- in5) println(m.start(1))
    //结果：
    //    0
    //    11
  }
}
