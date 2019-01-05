package scalaTest.QuickStudyScala.second_funtionAndFor

import scala.math._
/**
 * Created by Administrator on 下午 9:36.
 */
object Practice_second {
  def main(args: Array[String]): Unit = {
//============第三题
//    var y=9
//    var x1=y=1
//    println(x1)

//    val test: Int = test1(23)
//    println(test)//1
//    println({})//()
//    //=================第四题  不用设置变量i
//    for(i<-0 to 10 reverse)println(i)

//    //================第五题
//    countdown(i)
    //============第六题
//    var getSum=1.0
//    for(i<-"Hello"){
//      getSum=getSum*i.toLong
//    }
//    println(getSum)

    //===========第七题
//    var getS:Long=1
//    "Hello".foreach(f=>{
//      getS=f.toLong*getS
//    })//或者使用下面的方法
//    "Hello".foreach(getS *= _.toLong)
//    println(getS)//9415087488

    //===========第八题测试
//     val product1: Long = product("Hello")
//    println(product1)//9415087488



  }

  //================第一题
  def test1(x:Int)={
    val signum = if (x>0)1 else if(x==0)0 else -1
    signum
  }
  def countdown(n:Int): Unit ={
    for(i<-0 to n reverse)println(i)
  }
  //===========第八题
  def product(s :String)={
    var t :Long=1
    s.foreach(t *= _.toLong)
    t
  }
  //==============第九题
  def digui(s:String):Long={
    if(s.length==1) return s.charAt(0).toLong
    else s.take(1).charAt(0).toLong*digui(s.drop(1))
    //下面仅仅为测试drop方法
//    val s = "string"
//    println(s.drop(1)) //tring
  }
  //============第十题
  def mi(x:Double,n:Int):Double={
    if(n==0)1
    else if (n>0 && n%2 == 0) mi (x,n / 2)* mi(x, n / 2)
    else if (n > 0 && n % 2 == 1) x * mi(x, n - 1)
    else 1 / mi(x, -n)
  }



}
