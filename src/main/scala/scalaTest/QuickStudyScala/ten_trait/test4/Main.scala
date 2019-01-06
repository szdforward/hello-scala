package scalaTest.QuickStudyScala.ten_trait.test4

/**
 * Created by Administrator on 下午 11:14.
 */
object Main {
  def main(args: Array[String]) {
    //注意ConsoleLogger里面并没有使用super.log来传递调用
    val account=new SavingAccount with ConsoleLogger with TimestampLogger with ShortLogger//特质从最后一个开始被处理，注意 在每个trait里需要使用super.log来传递调用
    val account2=new SavingAccount with ConsoleLogger with ShortLogger with TimestampLogger
    account.withdraw(123)//Sun Jan 06 17:15:40 CST 2019 insufficient···
    account2.withdraw(234)//Sun Jan 06 1···

    println(s"${java.time.Instant.now()}")//2019-01-06T09:50:22.304Z
  }

}
