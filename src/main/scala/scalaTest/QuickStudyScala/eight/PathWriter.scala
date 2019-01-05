package scalaTest.QuickStudyScala.eight

import java.nio.file.Files


/**
 * Created by Administrator on 下午 4:47.
 */
//Scala类可以扩展Java类，在这种情况下，它的主构造器必须调用Java超类的某一个构造方法
class PathWriter(p:java.nio.file.Path,cs:java.nio.charset.Charset)extends java.io.PrintWriter(Files.newBufferedWriter(p,cs)) {


}
