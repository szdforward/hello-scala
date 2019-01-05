package scalaTest.QuickStudyScala.nine_sourceAndRegex
import java.nio.file._
import java.util
import java.util.stream.Stream

import scala.collection.mutable

/**
 * Created by Administrator on 下午 9:26.
 */
//遍历得到所有的文件夹和文件
object IteratorSubdirs2 {
  def main(args: Array[String]) {
//    val entries: Stream[Path] = Files.walk(Paths.get("G:\\checkpoint"))
//    entries.toArray.toBuffer.foreach(println)
//    entries.close()//遍历得到此路径下所有的文件夹和文件

    val list: Stream[Path] = Files.list(Paths.get("G:\\checkpoint"))
//    list.toArray.toBuffer.foreach(println)
    //也可以把流做iterator，进行一个个的遍历
    val iterator: util.Iterator[Path] = list.iterator()
    while(iterator.hasNext){
      //遍历得到Path类型的文件，根据需求进行处理
      val next: Path = iterator.next()
      println(next.getFileName)//打印的只是文件和文件夹的名字，没有路径！
    }
    list.close()//遍历得到当前路径下的文件夹和文件（不包含子文件夹）

  }

}
