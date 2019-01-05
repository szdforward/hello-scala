package scalaTest.QuickStudyScala.eight



import scalaTest.QuickStudyScala.Five_class.NetWork

/**
 * Created by Administrator on 下午 2:52.
 */
object Main {
  def main(args: Array[String]) {
    val work: NetWork = new NetWork
    work.join("abc")
    if(work.isInstanceOf[NetWork]){
      println("isInstanceOf")
    }
    if(work.getClass==classOf[NetWork]){
      println("another classOf")
    }
    val employee: Employee = new Employee("liming",23,"beijing",123)
    println(employee)

    //================匿名子类
    //这会创建出一个结构类型的对象，该类型标记为Person{def address: String; var weight: Double}，你可用这个类型作为参数类型的定义
    val person: Person {def address: String; var weight: Double} = new Person("xixi", 34) {
      override def address: String = address

      override var weight: Double = weight
    }

    def meet(p: Person{def address: String; var weight: Double}){
      println("name:"+p.name+"   age:"+p.age+"   "+p.weight)
    }
    meet(person)
//构造顺序和提前定义
    val ant: Ant = new Ant
    val length: Int = ant.env.length
    println(length)//0

    //对象相等性
    val person1: Person = new Person("li", 12) {

      override def address: String = address

      override var weight: Double = weight
    }
    val person2: Person = new Person("li", 12) {
      override def address: String = address

      override var weight: Double = weight

    }
    //需要重写equals方法之后两个对象才能按照内容进行比较是否相等
    println(person1==person2)





  }

}
