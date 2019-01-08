package scalaTest.QuickStudyScala.thirteen

/**
 * Created by Administrator on 下午 8:55.
 */
object MyFunction {
  def digits(n:Int):Set[Int]={
    if(n<0)digits(-n)
    else if(n<10)Set(n)
    else digits(n/10) + (n %10)
  }
}
