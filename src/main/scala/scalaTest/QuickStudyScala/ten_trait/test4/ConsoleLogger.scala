package scalaTest.QuickStudyScala.ten_trait.test4

/**
  * Created by Administrator on 下午 11:11.
  */
trait ConsoleLogger extends Logger{
   override def log(msg:String): Unit ={
     println(msg)
   }

 }
