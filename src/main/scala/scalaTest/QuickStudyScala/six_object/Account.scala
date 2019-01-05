package scalaTest.QuickStudyScala.six_object

/**
 * 伴生对象的测试
 */
class Account {
  val id=Account.newUniqueNumber()
  private var balance=0.0
  def deposit(amount:Double): Unit ={
    balance += amount
  }

}
object Account{
  private var lastNumber = 0
  def newUniqueNumber() = {
    lastNumber += 1;
    lastNumber
  }
}