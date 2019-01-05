package scalaTest.QuickStudyScala.ten_trait.test2

/**
 * Created by Administrator on 下午 10:48.
 */
class SavingAccount extends ConsoleLogger{
  var balance:Double=100
  def withdraw(amount:Double)={
    if(amount>balance) log("insufficient funds")
    else balance -= amount
  }

}
