package scalaTest.QuickStudyScala.six_object

/**
 * Created by Administrator on 下午 3:24.
 */
abstract class UndoableAction (val description:String){
  def undo()
  def redo()

}
object DoNothingAction extends UndoableAction("Do nothing"){
  override def undo(){}

  override def redo(){}
}

