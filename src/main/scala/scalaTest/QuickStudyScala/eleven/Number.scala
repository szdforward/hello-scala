package scalaTest.QuickStudyScala.eleven

/**
 * Created by Administrator on 下午 9:22.
 */
object Number {
  def unapply(string: String):Option[Int]={
    try{
      Some(string.trim.toInt)
    }catch {
      case _:NumberFormatException=>None
    }
  }

}
