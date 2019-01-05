package scalaTest.QuickStudyScala.eight

/**
 * Created by Administrator on 下午 3:09.
 */
abstract class Person(val name:String,val age:Int) {
  def address:String
  def id:Int=2
  var weight:Double
  def run(){}
  def eat(){}

  //重写equals方法   注意obj的类型为scala.Any
//  final override def equals(other: scala.Any): Boolean = {
//    other.isInstanceOf[Person] &&{
//      val that = other.asInstanceOf[Person]
//      if (that == null) false
//      else name == that.name && age == that.age
//    }
//  }
  //或者更好的 方法，使用模式匹配
  final override def equals(other:Any)=other match{
    case that:Person=> name == that.name && age == that.age
    case _ => false
  }

//   注意 ##方法是hashCode的null值安全版本，对null值交出0而不是抛出异常
  override def hashCode() = (name,age).##
}
