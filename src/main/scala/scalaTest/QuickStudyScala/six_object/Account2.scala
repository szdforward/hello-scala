package scalaTest.QuickStudyScala.six_object

/**
 * apply方法的测试
 */
class Account2 private(val id:Int,initialBalance:Double) {
  private var balance=initialBalance

  override def toString: String = {
    id+" : "+balance
  }
}
object Account2{
  def apply(initialBalance:Double) ={
    new Account2(Accounts.newUniqueNumber(),initialBalance)
  }


}
