package scalaTest.QuickStudyScala.ten_trait.test4

/**
 * Created by Administrator on 下午 10:48.
 */
class SavingAccount extends Account with Logger{
  var balance:Double=100


  override def log(msg: String): Unit = {}

  def withdraw(amount:Double)={
    if(amount>balance) severe("insufficient funds")
    else balance -= amount
  }

}
