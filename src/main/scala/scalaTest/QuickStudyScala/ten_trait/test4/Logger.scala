package scalaTest.QuickStudyScala.ten_trait.test4

/**
 * Created by Administrator on 下午 11:10.
 */
trait Logger {
  def log(msg:String)
  def info(msg:String)={log(s"INFO: $msg")}

  def warn(msg: String) = {
    log(s"WARN: $msg")
  }

  def severe(msg: String) = {
    log(s"SEVERE: $msg")
  }
}
