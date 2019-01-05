package scalaTest.QuickStudyScala.ten_trait.test4

/**
 * Created by Administrator on 下午 11:23.
 */
trait ShortLogger extends Logged{
  val maxLength=15
  override def log(msg:String): Unit ={
    if(msg.length<=maxLength) super.log(msg) else super.log(msg.substring(0,maxLength-3)+"···")
  }

}
