package scalaTest.QuickStudyScala.nine_sourceAndRegex

import java.io.PrintWriter

import scala.io.{BufferedSource, Source}

/**
 * Created by Administrator on 下午 12:18.
 */
object SourceTest {
  def main(args: Array[String]) {
    val file: BufferedSource = Source.fromFile("e:/sparktest.txt","gbk")
    //============读取行
//    val linesIterator: Iterator[String] = file.getLines()
//    for(l<-linesIterator.toArray.reverse){
//      println(l)
//    }

    //===========读取字符，处理字符
//    println(file.mkString)
//    for(c<-file)println(c)

    //=====处理字符======如果你想查看某个字符但又不处理掉的话，可以使用source对象的buffered方法
//    val buffered: BufferedIterator[Char] = file.buffered
//    while(buffered.hasNext){
//      //使用head方法查看，可以进行处理，也可以不处理，但对整个while循环并没有影响，还是需要next来进入下一个字符
//      if(buffered.head!="0"){
//        println(buffered.head)
//      }
//      val next: Char = buffered.next()
//      println(next)
//    }
//    file.close()

//    val split: Array[String] = file.mkString.split(" \\S+")
//    val ints: Array[Double] = for(w<-split)yield w.toDouble
//    println(ints.toBuffer)
//=======================读取词法单元和数字
    print("How old are you?")
    val age=Console.readInt()
    println("ok,you are young")

//val source: BufferedSource = Source.fromURL("www.baidu.com","utf-8")
//    val string: String = source.mkString
//    println (string)
//    val string1: Source = Source.fromString("i love you and you ?")
//    val string2: String = string1.mkString
//    val stdin: BufferedSource = Source.stdin
//     val string: String = stdin.mkString
//    println(string)
    //=================写入文本文件
//    val writer: PrintWriter = new PrintWriter("number.txt")
//    for(num<- 1 to 30) writer.write(num)
//    writer.close()

  }
}
