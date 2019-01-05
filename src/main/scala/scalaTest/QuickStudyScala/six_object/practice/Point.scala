package scalaTest.QuickStudyScala.six_object.practice
/**
 * Created by Administrator on 下午 6:18.
 */
class Point private (var x:Int,var y:Int){

}
object Point{
  def apply(x:Int,y:Int):Point={
    new Point(x,y)
}
}
