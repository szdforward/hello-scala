package scalaTest.QuickStudyScala.twelve
import scala.math._
import scalaTest.KeLiHua.KeLiHua

/**
 * Created by Administrator on 下午 9:54.
 */
object Main extends App {
//  val num=3.14
//  val fun= ceil _//将fun定义为函数
//  val doubles: Array[Double] = Array(12.3,34.5,33.2)
//  val map: Array[Double] = doubles.map(fun)//使用foreach不返回值，使用map可以返回修改后的值，但原来的并没有发生改变！
//  println(map.toBuffer)//ArrayBuffer(13.0, 35.0, 34.0)
//  println(fun(23.4))
//  val f1=(_:String).charAt(_:Int) //这是一个(String,Int)=>Char的函数  或者像下面这样定义：
//  val f2:(String,Int)=>Char=_.charAt(_)

  //============测试带函数参数的函数
//  private val one: Double = Test1.valueAtOne(fun)
//  println(one)//1.0

  //==============测试高级函数  返回一个函数
//  val by: (Double) => Double = Test1.mulBy(3)
//  val map: Array[Double] = Array(23.4,4,6).map(by)
//  println(map.toBuffer)//ArrayBuffer(70.19999999999999, 12.0, 18.0)

  //==============一些有用的高阶函数
//  (1 to 9).map("*" * _).foreach(println)
  //结果：
//  *
//  **
//  ***
//  ****
//  *****
//  ******
//  *******
//  ********
//  *********
//reduceLeft的使用
//  val left: Int = (1 to 9).reduceLeft(_ * _)
//  println(left)//相当于(((1*2)*3)*4)*.....

  //对数组进行排序
//  val sortWith: Array[String] = "mary had a little lamb".split(" ").sortWith(_.length > _.length)
//  println(sortWith.toBuffer)//ArrayBuffer(little, mary, lamb, had, a)

//val time: Int = KeLiHua.mulOneAtATime(6)(2)
//  println(time)//12

//  val a=Array("Hello","World")
//  val b=Array("hello","world")
//  private val corresponds: ((String, String) => Boolean) => Boolean = a.corresponds(b)//柯理化，返回一个函数
//  val corresponds1: Boolean = a.corresponds(b)(_.equalsIgnoreCase(_))
//  println(corresponds1)//true

  //===========控制抽象的测试
//  Test2.runInThread{()=>println("Hi");Thread.sleep(3000L);println("Bye")}
//
//  Test2.runInThread2 {println("Hi"); Thread.sleep(3000L); println("Bye") }
//结果：请注意是一起打印的！因为是在子线程 里进行的操作，两个线程互不影响
  //Hi
//  Hi
//  Bye
//  Bye

  //===============  换名调用参数  的使用 Test2中的until的使用  类似于java中的while使用
 /* var x=10
  Test2.until(x==0){
    x -= 1
    println(x)
  }*/
  //结果 依次打印9 8 7 6 5 4 3 2 1 0

  //======测试indexOf  return表达式的使用
  val of: Int = Test2.indexOf("hello",'l')
  println(of)//2

}
