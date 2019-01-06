package scalaTest.QuickStudyScala.nine_sourceAndRegex.practice

import java.io.PrintWriter

import scala.collection.mutable.ArrayBuffer
import scala.io.{BufferedSource, Source}
import scala.util.matching.Regex
import scala.math._

/**
 * Created by Administrator on 下午 1:09.
 */
object Main {
  def main(args: Array[String]) {
    //=============第一题  将某个文件中的行倒转顺序
//    val source: BufferedSource = Source.fromFile("e:/sparktest.txt", "gbk")
//    val toArray: Array[String] = source.getLines().toArray
//    val writer: PrintWriter = new PrintWriter("e:/sparktest.txt", "gbk")
//    for(a<-toArray reverse)writer.println(a)
//    source.close()
//    writer.close()

    //第二题
//    val source: BufferedSource = Source.fromFile("e:/sparktest.txt", "gbk")
//    var toArray: Array[String] = source.getLines().toArray
//    val r: Regex = "\\t".r
//    for(i<- 0 until toArray.length){
//      val in: String = r.replaceAllIn(toArray(i), "        ")
//      toArray(i)=in
//    }
//    val writer: PrintWriter = new PrintWriter("e:/sparktest.txt", "gbk")
//    for(a<-toArray)writer.println(a)
//    source.close()
//    writer.close()

    //========第三题
  /*  val source: BufferedSource = Source.fromFile("e:/sparktest.txt", "gbk")
    val buffered: BufferedIterator[Char] = source.buffered
    while(buffered.hasNext){
      val head: Char = buffered.head
      if(head.toInt>12)println(head)
      buffered.next()
    }
    source.close()*/
    //一行代码
//    Source.fromFile("e:/sparktest.txt", "gbk").filter(_>12).foreach(println)

    //===========第四题
//    val source: BufferedSource = Source.fromFile("e:/floattest.txt", "gbk")
//    val split: Array[String] = source.mkString.split("\\s+")
//    var doubleArray=ArrayBuffer[Double]()
//    for(s<-split) doubleArray += s.toDouble
//    println("总和："+ doubleArray.sum)//总和：189.56
//    println("最大值："+ doubleArray.max)//最大值：45.3
//    println("最小值：" + doubleArray.min)//最小值：2.3
//    println("平均值：" + (doubleArray.sum / doubleArray.length) )//平均值：27.080000000000002

    //===========第五题
    val writer: PrintWriter = new PrintWriter("e:/testFive.txt", "gbk")
    writer.println("快学scala132页第五题")
    count2n(20,writer)
    writer.close()



  }
  //-===========第五题定义的函数
  def count2n(n: Int,pw:PrintWriter)={
    val length: Int = n.toString.length
    for (i <- 1 to n) pw.print(i+" "*(length-i.toString.length)+"\t"+pow(2,i)+"\r\n")
  }

}
