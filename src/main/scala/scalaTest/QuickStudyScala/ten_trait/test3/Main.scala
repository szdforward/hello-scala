package scalaTest.QuickStudyScala.ten_trait.test3

/**
 * Created by Administrator on 下午 11:14.
 */
object Main {
  def main(args: Array[String]) {
    val account=new SavingAccount with ConsoleLogger
    account.withdraw(1234)
  }

}
