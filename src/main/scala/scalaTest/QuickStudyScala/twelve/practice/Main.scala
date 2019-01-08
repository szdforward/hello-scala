package scalaTest.QuickStudyScala.twelve.practice

import scala.collection.immutable.IndexedSeq
import scala.collection.mutable.ArrayBuffer

/**
 * Created by Administrator on 下午 9:33.
 */
object Main {
  def main(args: Array[String]) {
    //============第一题
//    Test.values(x=>x*x,-5,5).foreach(println)
    //=======第二题：使用reduceLeft编写得到数组中的最大的函数
//    val arr=Array(12,45,67,88,4)
//    val left: Int = arr.reduceLeft((a:Int,b:Int)=>if(a<=b)b else a)
//    println(left)//88
    //=================第三题
//    val i: Int = 1 to 9 reduceLeft(_*_)
//    println(i)//362880
    //===========第四题
//    println(Test.question4(-2,4))//写的有问题
    //==============第五题
//    println(Test.lagest(x=>x*10-x*x,1 to 10))//25
    //=============第六题
//    println(Test.lagestAt(x => x * 10 - x * x, 1 to 10)) //5
    //===========第七题  练习柯理化
//    var pairs = (1 to 10) zip (11 to 20)
//    val pair: Int = Test.adjustToPair(_ *_)((6,7))
//    println(pair)//42
//    val map: IndexedSeq[Int] = pairs.map(Test.adjustToPair(_ * _))
//    println(map)//Vector(11, 24, 39, 56, 75, 96, 119, 144, 171, 200)  //是这样计算得到的： 1*11  2*12  3*13
    //================第八题
    val strings: Array[String] = Array("abcc","dee","")
    val ints: Array[Int] = Array(4,2,0)
    val corresponds: Boolean = strings.corresponds(ints)(_.length==_)
    println(corresponds)//false



  }

}
