package scalaTest.QuickStudyScala.eight

/**
 * Created by Administrator on 下午 8:10.
 */
class Creature {
  val range:Int=10
  val env:Array[Int]=new Array[Int](range)

}

class Ant extends Creature{
  override val range=2
}
