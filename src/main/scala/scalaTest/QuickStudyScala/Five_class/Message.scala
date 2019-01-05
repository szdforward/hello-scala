package scalaTest.QuickStudyScala.Five_class

import java.util.Date

import scala.beans.BeanProperty
import scalaTest.b_class.Person


/**
 * Created by Administrator on 下午 9:43.
 */
class Message {
  //如果属性的值在对象构建完成后就不再改变，可以使用val字段
  val  timeStamp=new Date


}

class Counter{
  private var value=0
  def increment(){value += 1}
  def current=value
  def isLess(other:Counter)=value < other.value
}
//==========对于类私有的字段，scala生成私有的getter和setter方法，但对于对象私有的字段（使用private[this]），scala根本就不会生成getter和setter方法

class Person{
  @BeanProperty var name:String=_

  private var privateAge=0

  //相当于getAge方法
  def age = privateAge

  //相当于setAge方法
  def age_=(myage: Int) {
    if (myage > privateAge) privateAge = myage
  }

  def this(name:String){
    this()
    this.name=name
  }

  def this(name:String,age:Int){
    this(name)
    this.privateAge=age
  }


}

class Main{
  def main(args: Array[String]) {

    val person1: Person = new Person//主构造器
    val person2: Person = new Person("lihua")//第一个辅助构造器
    val person3: Person = new Person("wangtao",12)//第二个辅助构造器


  }
}
//==============主构造器的参数直接放置在类名之后，主构造器会执行类定义中的所有语句
class Man(val name:String=" ",val age:Int=0){
  println("Just contrusted another Person")
  def description=name + " is " + age + " years old"
  println(description)
}

//如果不带val或者var的类参数至少被一个方法所用，那么升级为字段,相当于使用了private[this]修饰
class Woman(name:String,age:Int){
  def daYin=name + " is "+age+" yeas old"
}
