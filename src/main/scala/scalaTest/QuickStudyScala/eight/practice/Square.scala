package scalaTest.QuickStudyScala.eight.practice

import java.awt

/**
 * Created by Administrator on 下午 6:38.
 */
class square(point:java.awt.Point,width:Int) extends java.awt.Rectangle(point.x,point.y,width,width) {
  def this(width:Int){
    this(new awt.Point(0,0),width)
  }

  def this() {
    this(new awt.Point(0, 0), 0)
  }



}
