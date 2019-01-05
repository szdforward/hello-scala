package scalaTest.QuickStudyScala.ten_trait.test4

/**
 * Created by Administrator on 下午 10:48.
 */
class SavingAccount extends Logged{
  var balance:Double=100
  def withdraw(amount:Double)={
    if(amount>balance) log("insufficient funds")
    else balance -= amount
  }

}
