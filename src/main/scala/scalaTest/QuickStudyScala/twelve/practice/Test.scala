package scalaTest.QuickStudyScala.twelve.practice

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Administrator on 下午 9:27.
 */
object Test {
  def values(fun:(Int)=>Int,low:Int,high:Int)={
//    var arr=ArrayBuffer[(Int,Int)]()
//    for(i<-low to high) arr += ((i,fun(i)))
//    arr
//或者下面这种
//    var arr = ArrayBuffer[Int]()
//    for (i <- low to high) arr += i
//    arr.map(a => (a, fun(a)))
    //或者使用下面这种：
    for (i <- low to high) yield (i, fun(i))
  }

  //=========第四题
  def question4(low:Int,high:Int)={
    (low to high).foldLeft(1)(_*_)
  }

  //===========第五题
  def lagest(fun:(Int)=>Int,inputs:Seq[Int]):Int={
    inputs.map(fun).max
  }

  //===============第六题
  def lagestAt(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    inputs.reduceLeft((a,b)=>if(fun(a)>fun(b))a else b)
  }
  //=========第七题
  def adjustToPair(fun:(Int,Int)=>Int)(x:(Int,Int))={
    fun(x._1,x._2)
  }




}
