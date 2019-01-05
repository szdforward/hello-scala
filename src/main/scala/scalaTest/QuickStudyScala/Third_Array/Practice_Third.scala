package scalaTest.QuickStudyScala.Third_Array

import java.awt.datatransfer.SystemFlavorMap
import java.util
import java.util.TimeZone

import scala.collection.immutable.IndexedSeq
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.util.Random

/**
 * Created by Administrator on 下午 2:29.
 */
object Practice_Third {
  def main(args: Array[String]) {
    //===================第一题
//    val a: Array[Int] = getArray(6)
//    a.foreach(println)
//    println(a.toBuffer)//ArrayBuffer(4, 5, 0, 0, 3, 4)
    //===================第二题
//        val ints: Array[Int] = Array(1,2,3,4,5)
//        for(i<-0 until ints.length if i%2==1){
//          val temp=ints(i)
//          ints(i)=ints(i-1)
//          ints(i-1)=temp
//        }
//        println(ints.toBuffer)//ArrayBuffer(2, 1, 4, 3, 5)
    //===================第三题
    //    val ints: Array[Int] = Array(1, 2, 3, 4, 5)
    //    val newArray=for(i <- 0 until ints.length) yield {
    //        if(i!=ints.length-1){
    //          if (i % 2 == 1 )ints(i-1)
    //          else ints(i+1)
    //        }else if(i%2==0)ints(i)
    //        else ints(i-1)
    //    }
    //    println(newArray.toBuffer)//ArrayBuffer(2, 1, 4, 3, 5)
    //===================第四题
//    val ints: Array[Int] = Array(1, 2, 3,-3, 4, 5,0,43,-2,-3,11,67,-22)
//    var filter: Array[Int] = ints.filter(_>0)
//    val filter1: Array[Int] = ints.filter(_<=0)
//     filter ++= filter1
//    println(filter.toBuffer)
    //===================第五题
//    val ints: Array[Double] = Array(1.0, 2.34, 3.7, 4.09, 5)
//    val d: Double = ints.sum/ints.length
//    println(d)//3.226
    //===================第六题
//    val ints1: Array[Int] = Array(1, 2, 3, -3, 4, 5, 0, 43, -2, -3, 11, 67, -22)
//    val reverse: Array[Int] = ints1.sorted.reverse
//    println(reverse.toBuffer)//ArrayBuffer(67, 43, 11, 5, 4, 3, 2, 1, 0, -2, -3, -3, -22)
//    val intsBuffer1: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, -3, 4, 5, 0, 43, -2, -3, 11, 67, -22)
//    val reverse1: ArrayBuffer[Int] = intsBuffer1.sorted.reverse
//    println(reverse1)//ArrayBuffer(67, 43, 11, 5, 4, 3, 2, 1, 0, -2, -3, -3, -22)
    //=======================第七题
//    val ints4: Array[Int] = Array(1, 2, 3,  -2, 3, 11, 7, 2)
//    val distinct: Array[Int] = ints4.distinct
//    println(distinct.toBuffer)//ArrayBuffer(1, 2, 3, -2, 11, 7)
    //==========================第八题
//    val ints4: Array[Int] = Array(1, 2, 3, -2, 3, -11, -7, 2)
//    val ints: IndexedSeq[Int] = for (i<-0 until ints4.length if ints4(i)<0) yield i
//    val right: IndexedSeq[Int] = ints.reverse.dropRight(1)
//    val toBuffer: mutable.Buffer[Int] = ints4.toBuffer
//    for (i<-right) toBuffer.remove(i)
//    println(toBuffer)//ArrayBuffer(1, 2, 3, -2, 3, 2)
    //=================第九题
//    val ds: Array[String] = TimeZone.getAvailableIDs
//    val sorted: Array[String] = ds.filter(_.contains("America")).map(_.drop(8)).sorted
//    println(sorted.toBuffer)
    //=======================第十题
    import scala.collection.JavaConversions.asScalaBuffer
    import java.awt.datatransfer._
    import scala.collection.mutable.Buffer
    val flavors: SystemFlavorMap = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    val buff: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)//import这个asScalaBuffer包之后才不会报错
    buff.foreach(println)
    //结果：
//    PNG
//    JFIF
//    DIB
//    ENHMETAFILE
//    METAFILEPICT
  }
  //===============第一题定义的函数
  def getArray(n:Int):Array[Int]={
    val ints: Array[Int] = new Array[Int](n)
    val random: Random = new Random()
    for(i<-0 until ints.length){
      ints(i)=random.nextInt(n)
    }
    ints
  }
}
