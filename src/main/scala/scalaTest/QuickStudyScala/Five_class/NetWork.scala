package scalaTest.QuickStudyScala.Five_class
import scala.collection.mutable.ArrayBuffer
/**
 * 嵌套类
 */
class NetWork {
  class Member(val name:String){
    val contacts=new ArrayBuffer[Member]
  }
  private val members=new ArrayBuffer[Member]

  def join(name :String) ={
    val m=new Member(name)
    members += m
    m
  }

}

