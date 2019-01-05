package scalaTest.QuickStudyScala.ten_trait.test4

import java.util.Date

/**
 * Created by Administrator on 下午 11:19.
 */
trait TimestampLogger extends Logged{
  override def log(msg:String): Unit ={
    super.log(new Date() +" "+msg)
  }

}
