package scalaTest.QuickStudyScala.ten_trait.test4

/**
 * Created by Administrator on 下午 11:23.
 */
trait ShortLogger extends Logger{
  val maxLength=15//具体的字段
  abstract override def log(msg:String): Unit ={
    if(msg.length<=maxLength) super.log(msg) else super.log(msg.substring(0,maxLength-3)+"···")
  }

}
