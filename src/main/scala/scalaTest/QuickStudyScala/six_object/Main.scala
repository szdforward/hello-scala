package scalaTest.QuickStudyScala.six_object

/**
 * 测试方法，测试单例对象，测试伴生对象，测试扩展类或特质的对象
 */
object Main {
  def main(args: Array[String]) {
    val number: Int = Accounts.newUniqueNumber()
    println(number)
    println(Accounts.newUniqueNumber())
    val account: Account = new Account
    println(account.id)
    val account2: Account = new Account
    println(account2.id)

    val actions=Map("open"->DoNothingAction,"save"->DoNothingAction)

    //测试apply方法
    val account1: Account2 = Account2(23.4)
    println(account1)


  }

}
