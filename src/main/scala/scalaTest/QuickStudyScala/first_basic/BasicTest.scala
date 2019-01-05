package scalaTest.QuickStudyScala.first_basic
/**
 * Created by Administrator on 下午 12:06.
 */
object BasicTest {
  def main(args: Array[String]) {
    //-------------------------------------------------调用函数和方法--------------需要导入scala.math._----------------------------------------------
//    val sqrt1: Double = sqrt(2)
//    println (sqrt1)//1.4142135623730951
//    val pow1: Double = pow(2,3)
//    println (pow1)//8.0
//    val min1: Double = min(3,Pi)
//    println(min1)//3.0
    //--------------------------------一般来说不带参数且不改变当前对象的方法不带圆括号
//    val str="hello"
//    val distinct: String = str.distinct
//    println(str)//hello
//    println(distinct)//helo
    //-------------------------------------apply方法
//    val hello: Char = "Hello"(4)
//    println(hello)//o
    //-------------------------------------string字符串计算字符串中大写字母的个数
//    val count: Int = "HeLLo".count(_.isUpper)
//    println(count)//3
//----------------------------------------------将字符串中的一部分替换成另一部分字符串
    val patch: String = "Harry".patch(1,"eee",2)
    println(patch)//heeery
    println("harry".patch(1,"uu",4))//huu

  }

}
