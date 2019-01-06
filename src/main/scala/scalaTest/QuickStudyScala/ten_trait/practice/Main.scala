package scalaTest.QuickStudyScala.ten_trait.practice

import java.awt.geom.Ellipse2D.Double
import java.awt.geom.{Rectangle2D, Ellipse2D}

/**
 * Created by Administrator on 下午 7:32.
 */
object Main extends  App{
  //使用自身类型  测试第一题
//  val egg: Double with RectangleLike = new Double(5,10,20,30) with RectangleLike
//  egg.translate(10,-10)
//  egg.grow(10,20)

  //=============测试第四题
  val plain="北京一卡通beijingyikatong"
  println("加密后："+new CryptoLogger().log(plain))
  println("加密后："+new CryptoLogger().log(plain,-3))


}
