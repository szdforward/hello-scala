package scalaTest.QuickStudyScala.ten_trait.test3

/**
 * Created by Administrator on 下午 11:13.
 */
class SavingAccount extends Logged{
  var balance:Double=200
  def withdraw(amount:Double): Unit ={
    if(balance<amount) log("there is no much more money")
    else balance -= amount
  }

}
