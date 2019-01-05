package scalaTest.QuickStudyScala.eight.practice

/**
 * Created by Administrator on 下午 11:18.
 */
abstract class Shape {
def centerPoint()
}
class Rectangle extends Shape{
  override def centerPoint(): Unit = {

  }
}
class Circle extends Shape{

  override def centerPoint(): Unit = {

  }
}
class Square extends Shape{
  private var point: Point = null
  private var width: Double = 0
  def this(point:Point,width:Double){
    this()
    this.point=point
    this.width=width
  }
  override def centerPoint(): Unit = {

  }
}