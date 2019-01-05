package scalaTest.QuickStudyScala.second_funtionAndFor

import java.text.MessageFormat

import scala.IllegalArgumentException
import scala.collection.immutable.IndexedSeq
import scala.io.Source
import scala.math._
import scala.xml.MalformedAttributeException

/**
 * 控制结构和函数
 */
object FunctionAndFor {
  def main(args: Array[String]) {
    //==========================高级for循环和for推导式
//    for(i<-1 to 3;j<-1 to 3)print((10*i+j)+"  ")//11  12  13  21  22  23  31  32  33
//    println()
//    for(i<-1 to 3;j<-1 to 3 if i != j)print((10*i+j)+"  ")//12  13  21  23  31  32
//    println()
//    for(i<-1 to 3;from=4-i;j<-from to 3) print((10 * i + j) + "  ")//13  22  23  31  32  33
    //========================for推导式
//    val ints: IndexedSeq[Int] = for(i<-1 to 4)yield i%3
//    println(ints)//Vector(1, 2, 0, 1)
    //======================for推导式生成的集合与它的第一个生成器是类型兼容的
//    val s: String = for(i<-"Hello";j<-0 to 1)yield (i+j).toChar
//    println(s)//HIeflmlmop
//    val chars: IndexedSeq[Char] = for(j<-0 to 1;i<-"Hello")yield (i+j).toChar
//    println(chars)//Vector(H, e, l, l, o, I, f, m, m, p)

    //========================函数之变长参数
//    val sum1: Int = sum(1,2,3,4,5,6)
//    println(sum1)//21
//    //==========================注意如果sum函数传入的是单个参数，name该参数必须是单个整数，而不是一个整数区间
//    //==========================解决这个问题的办法就是追加:_*  就像下面这样
//    val sum2: Int = sum(1 to 10:_*)
//    println(sum2)//55
    //============================当你调用变长参数且参数类型为Object的Java方法时需要注意手工对基本类型进行转换，类似这样  42.asInstanceOf[AnyRef]
//    val format1: String = MessageFormat.format("The Answer to {0} is {1}","everything",42.asInstanceOf[AnyRef])
//    println(format1)//The Answer to everything is 42
    //============================================过程-没有返回值或者返回值为Unit
// box("Hello")
    //=======================懒值：当val被声明为lazy时，它的初始化将被延迟
//    lazy val string: String = Source.fromFile("/sparktest.txt").mkString
//    println(string)
    //====================异常
    var x :Double= -9
    try{
      if (x >= 0) {
        x=sqrt(x)
      } else throw new IllegalArgumentException("x should not be negative")
    }catch {
      case _: IllegalArgumentException=>println("x is negative")//x is negative  如果你不使用捕获的异常对象的话，可以使用_代替
      case ex:Exception=>println("other exception")
    }
    println(x)//-9.0




  }

  def sum(args:Int*)={
    var result=0
    for(arg<-args)result += arg
    result
  }

  def box(s: String): Unit = {
    val line = "-" * s.length + "--\n"
    print(line + "|" + s + "|\n" + line)
  }


}
