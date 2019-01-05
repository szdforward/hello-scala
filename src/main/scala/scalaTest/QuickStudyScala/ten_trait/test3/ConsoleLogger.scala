package scalaTest.QuickStudyScala.ten_trait.test3

/**
 * Created by Administrator on 下午 11:11.
 */
trait ConsoleLogger extends Logged{
  override def log(msg:String): Unit ={
    println(msg)
  }

}
