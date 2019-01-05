package scalaTest.QuickStudyScala.six_object.practice

import scala.util.Random

/**
 * 编写一个扑克牌四种花色的枚举
 */
object Test6 extends Enumeration {
  val MeiHua=Value(0,"♣")
  val FangPian=Value("♦")
  val HeiTao = Value("♠")
  val HongTao = Value("♥")
  override def toString()={
    Test6(new Random().nextInt(4)).toString
  }

}
