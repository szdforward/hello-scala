package scalaTest.QuickStudyScala.ten_trait.test1

/**
 * Created by Administrator on 下午 10:39.
 */
trait Logger {
  //你不需要将方法声明为abstract，特质中未被实现的方法默认就是抽象的
  def log(msg:String)
}
