package scalaTest.QuickStudyScala.eleven

/**
 * Created by Administrator on 下午 9:30.
 */
object Name2 {
  def unapplySeq(input:String):Option[Seq[String]]={
    if(input.trim=="")None else Some(input.trim.split("\\s+"))
  }
}
