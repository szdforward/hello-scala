package scalaTest.QuickStudyScala.ten_trait.test1

/**
 * Created by Administrator on 下午 10:43.
 */
class ConsoleLogger extends Logger{
  override def log(msg: String): Unit = {
    println(msg)
  }
}
