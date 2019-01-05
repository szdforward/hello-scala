package scalaTest.QuickStudyScala.Five_class

import java.util.Date

/**
 * Created by Administrator on 下午 11:11.
 */
object MyMain {
  def main(args: Array[String]) {
//=========测试自己设置的get  set方法
//    val person: Person = new Person()
//    person.age = 23
//    person.age = 12
//    println(person.age)//23  年龄并不能变小  调用者并不知道age是通过字段还是通过方法来实现的  我们修改了age_ 方法的实现

    //测试当你的字段使用val修饰时，在对象创建的那一刻 就固定了值，不能再修改
//    val message: Message = new Message
//    println(message.timeStamp)//Fri Jan 04 12:35:28 CST 2018
//    Thread.sleep(1000L)
//    val message1: Message = new Message
//    println(message1.timeStamp)//Fri Jan 04 12:35:29 CST 2018

    //测试带默认值的主构造器  我们可以使用带默认值的主构造器减少辅助构造器的创建
//val man: Man = new Man()
//    val man1: Man = new Man("lihua")
//    val man2: Man = new Man("zhangsan",23)

    //测试不带val var的类参数的类  注意 使用了private[this]修饰的字段，不能在对象中引用（即直接点出字段）
//    val woman: Woman = new Woman("lili",13)


//    val chatter: NetWork = new NetWork
//    val myFace: NetWork = new NetWork
//    val abc: NetWork#Member = chatter.join("abc")
//    val defg: NetWork#Member = chatter.join("defg")
//    abc.contacts += defg   //请注意！这样的话执行起来也是会报错的，报类型不匹配的错误！但是如果像下面的那样就可以正常执行
//    val lihua: NetWork#Member = myFace.join("lihua")
//    abc.contacts += lihua   //无论如何都不可以这样做，执行会报错，不能将一个myFace的Member添加到chatter.Member元素缓冲当中
// 每个实例都有自己的Member类，chatter.Member和myFace.Member是两个不同的类

    //=========可以正常运行的代码  去掉类型投影 NetWork#Member   不会报错
//    val chatter: NetWork = new NetWork
//    val myFace: NetWork = new NetWork
//    val abc = chatter.join("abc")
//    val defg = chatter.join("defg")
//    abc.contacts += defg
//    val lihua: NetWork#Member = myFace.join("lihua")
  }

}
