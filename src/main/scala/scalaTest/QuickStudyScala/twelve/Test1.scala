package scalaTest.QuickStudyScala.twelve

/**
 * Created by Administrator on 下午 10:28.
 */
//============带函数参数的函数
object Test1 {
  def valueAtOne(f:(Double)=>Double)=f(0.23)
  //高阶函数也可以产出另一个函数：
  //传入的参数为Double类型的，传出的类型为一个匿名函数(x:Double)=>x*factor  闭包  闭包当变量不在作用域时函数仍然可以调用
  //确切的说，利用柯理化机制的函数就是闭包函数
  def mulBy(factor:Double)=(x:Double)=>x*factor


}
