package scalaTest.QuickStudyScala.ten_trait.practice

import java.awt.Point

/**
 * Created by Administrator on 下午 7:39.
 */
//===========第二题
class OrderedPoint(x:Int,y:Int) extends java.awt.Point with scala.math.Ordered[java.awt.Point]{
  def compare(that: Point): Int = {
    if(this.x<=that.x&&this.y<that.y) -1
    else if (this.x == that.x && this.y == that.y) 0
    else -1
  }
}
