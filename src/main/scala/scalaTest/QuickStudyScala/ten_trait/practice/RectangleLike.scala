package scalaTest.QuickStudyScala.ten_trait.practice

/**
 * Created by Administrator on 下午 7:24.
 */
trait RectangleLike{
  this:java.awt.geom.Ellipse2D.Double =>
  def translate(x:Double,y:Double){
    this.x=x
    this.y=y
  }
  def grow(x:Double,y:Double): Unit ={
    this.x += x
    this.y += y
  }

}
