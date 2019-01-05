package scalaTest.QuickStudyScala.nine_sourceAndRegex

import java.io.File

/**
 * Created by Administrator on 下午 11:29.
 */
//遍历得到所有的子文件夹  方法一
object IteratorSubdirs {
  def main(args: Array[String]) {
    for(d<-subdirs(new File("G:\\checkpoint")))println(d.getName)

  }
//===========得到所有的子文件夹（仅仅是文件夹）
  def subdirs(dir:File):Iterator[File]={
    val children: Array[File] = dir.listFiles.filter(_.isDirectory)
    children.iterator ++ children.iterator.flatMap(subdirs _)
  }
}
