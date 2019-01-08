package scalaTest.QuickStudyScala.eleven

/**
 * Created by Administrator on 下午 8:58.
 */
object Name {
  def unapply(input:String)={
    val pos=input.indexOf(" ")
    if(pos == -1) None
    else Some((input.substring(0,pos),input.substring(pos+1)))
  }

}
