package scalaTest.QuickStudyScala.first_basic
import scala.math._
import scala.BigInt._
import scala.util._

/**
 * Created by Administrator on 下午 8:36.
 */
object Practice {
  def main(args: Array[String]) {
    //---------------------------------------先计算3的平方根，在对该值求平方，最后与3看看相差多少
//    val sqrt1: Double = sqrt(3)
//    val pow1: Double = pow(sqrt1,2)
//    println(3-pow1)//4.440892098500626E-16
//-------------------------------------------------------scala允许你用数字去乘以字符串
//    val s: String = "crazy"*3
//    println(s)//crazycrazycrazy
    //----------------------------------------------------求两者之间的最大值
//    println(10 max 2)
    //-------------------------------------------------使用BigInt计算2的1024次方
//    val int: scala.BigInt = BigInt(2) pow (1024)
//    println(int)//179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216
    //------------------------------------------------------------------------为了使用下面的probablePrime方法时不在probablePrime和Random之前使用任何限定符，需要引入import scala.BigInt._和import scala.util._
//    val prime: scala.BigInt = probablePrime(100,Random)
//    println(prime)//712487530365293964027476317141
    //-----------------------------------------------------------------------------创建一个随机的BigInt，然后将它转换成三十六进制,输出字符串
//    val string: String = BigInt(Random.nextInt).toString(36)
//    println(string)//psx0v6
    //------------------------------------------------------------------在scala中获取字符串的首字符和尾字符
//    val last: Char = "hello".last//获取首字符
//    val head: Char = "hello".head//获取尾字符
//    println(head+"    "+last)
//--------------------------------------------------字符串函数中take，drop，takeRight，dropRight的用法，和substring相比呢
    val take: String = "hello".take(1)//h  注意这里take是指我要取出1个字符，参数是几就取出几个
    val drop: String = "hello".drop(1)//ello  个人理解，drop是扔掉几个字符，1的话意思是我要从左边开始扔掉1个字符
    val right: String = "abcdefg".takeRight(2)//fg  从右边开始取
    val right1: String = "abcdefg".dropRight(2)//abcde  从右边扔掉字符
    println(take)//h
    println(drop)//ello
    println(right)//fg
    println(right1)//abcde
  }

}
