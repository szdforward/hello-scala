package scalaTest.QuickStudyScala.eight

/**
 * 子类调用超类的构造方法
 */
//使用val重写抽象的def，学生的id通过构造器输入
//如果Person的id并没有实现的话可以在Employee的主构造器的id参数上不写override，但是如果Person的id已经赋了初始值，那么就必须写上override
//更常见的案例是用val重写抽象的def，就像下面的address字段一样
class Employee(name:String,age:Int,val address:String,override val id:Int)extends Person(name,age){



  override def toString: String = {
    "name"+" : "+name+"；age" + " : "+age +"；address" + " : " +address +"；id" + " : "  +id
  }

  //如果你使用var修饰的话，后期的子类只能用var来实现
  override var weight: Double = _
}
