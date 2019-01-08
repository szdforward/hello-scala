package scalaTest.QuickStudyScala.eleven

/**
 * Created by Administrator on 下午 8:43.
 */
object Main extends App{
  val result=Fraction(3,4)
  println(result)
  val author="cay Horstmann"
  val Name(first,last)=author//会调用unapply方法
  println(first)//cay
/*  val myname="zhangsan"
  val Name(a, b) = myname
  println(a)*/
  val Number(abc)="34"
  println(abc)//34

  //==========测试Name2
  val myname2="abc def gth"
  myname2 match {
    case Name2(first,last)=>println(first)
    case Name2(first,second,last)=>println(second)
    case Name2(first,"def","bbb",last)=>println(last)
  }
  //结果 ：
//  def

}
