package scalaTest.QuickStudyScala.ten_trait.test2

/**
 * 带有具体实现的特质
 */
trait ConsoleLogger{
  def log(msg:String)={
    println(msg)
  }
}
