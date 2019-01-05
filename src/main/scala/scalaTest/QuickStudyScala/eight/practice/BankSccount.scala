package scalaTest.QuickStudyScala.eight.practice

/**
 * Created by Administrator on 下午 10:01.
 */
class BankAccount(initialBalance:Double) {
  private var balance=initialBalance
  def deposit( amount:Double)={balance += amount;balance}
  def withdraw( amount:Double)={balance -= amount;balance}
}
//============第一题
class CheckingAccount(initialBalance:Double) extends BankAccount(initialBalance){
  override def deposit(amount: Double): Double =  deposit(amount-1)

  override def withdraw(amount: Double): Double = withdraw(amount+1)
}

class  SavingAccount(initialBalance: Double) extends BankAccount(initialBalance){
  private var num:Int=_
  def earnMonthlyInterest(): Unit ={
    num=3
    //每个月都有1块钱的利息产生
    super.deposit(1)
  }

  override def deposit(amount: Double): Double = {
    num-=1
    if(num>=0) super.deposit(amount) else super.deposit(amount-1)
  }

  override def withdraw(amount: Double): Double = {
    num -= 1
    if (num >= 0) super.withdraw(amount) else super.withdraw(amount +  1)
  }
}