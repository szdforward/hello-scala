package scalaTest.QuickStudyScala.six_object

/**
 * object对象的测试0单例对象
 */
object Accounts {
  private var lastNumber=0
  def newUniqueNumber()={lastNumber += 1;lastNumber}
}
