package scalaTest.QuickStudyScala.ten_trait.test4

/**
 * Created by Administrator on 下午 11:14.
 */
object Main {
  def main(args: Array[String]) {
    val account=new SavingAccount with ConsoleLogger with TimestampLogger with ShortLogger//特质从最后一个开始被处理，注意 在每个trait里需要使用super.log来传递调用
    val account2=new SavingAccount with ConsoleLogger with ShortLogger with TimestampLogger
    account.withdraw(123)
    account2.withdraw(234)
  }

}
