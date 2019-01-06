package scalaTest.QuickStudyScala.ten_trait.test4

import java.io.PrintWriter

/**
 * Created by Administrator on 下午 5:46.
 */
trait FileLogger extends Logger{
  val out=new PrintWriter("app.log")//这是特质构造器的一部分
  out.println(s"#  ${java.time.Instant.now()}") //这也是特质构造器的一部分
  def log(msg:String){
    out.println(msg)
    out.flush()
  }

}
