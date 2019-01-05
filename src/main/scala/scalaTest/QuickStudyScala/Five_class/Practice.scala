package scalaTest.QuickStudyScala.Five_class

import scala.beans.BeanProperty

/**
 * Created by Administrator on 下午 11:48.
 */
object Practice {
  def main(args: Array[String]) {
    //=========第一题测试
//    val counter: Counter1 = new Counter1
//    counter.value=Int.MaxValue-1
//    counter.increment()
//    counter.increment()
//    println(counter.current)

    //===========测试第三题
    val time: Time = new Time(22,34)
    println(time)

//    val time: Time = new Time(122, 34)
//    val time1: Time = new Time(12, 34)
//    println(time)
//    println(time1)
//    val before: Boolean = time.before(time1)
//    println(before)

//    val student: Student = new Student
//    student.setName("abd")
//    println(student)

    val person: TestPerson = new TestPerson("adfd",-23)
    println(person)
  }

}
//============第一题
class Counter1{
   var value=0
  def increment(): Unit ={
    if (value==Int.MaxValue)value =0
    value += 1
  }
  def current=value
}

//============第二题
class BankAccount(val balance: String) {
  def deposit(): Unit = {
  }

  def withdraw(): Unit = {
  }
}

//==============第三题
class Time (var hours:Int,val minutes:Int){

  def before(other: Time): Boolean = {
    hours < other.hours || (hours == other.hours && minutes < other.minutes)
  }
  //======注意重写方法的书写
  override def toString():String={
    hours+":"+minutes
  }

}

//============第五题
class Student{
  @BeanProperty var name:String=_
  @BeanProperty var id:Long=0
  override def toString():String={
    name+":"+id
  }

}

class TestPerson(val name:String, var age:Int){
  age=if(age<0) 0 else age

  override def toString(): String = {
    name + ":" + age
  }

}

class TestPerson2(val name:String){
  private val split: Array[String] = name.split(" ")
  val firsrName:String= split(0)
  val lastName:String=split(1)



}
class Car(val manufacturer:String,val model :String,val year:Int= -1,var carNumber :String=""){

}


