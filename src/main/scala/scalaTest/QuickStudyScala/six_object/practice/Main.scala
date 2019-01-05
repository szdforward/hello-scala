package scalaTest.QuickStudyScala.six_object.practice

import java.awt.Point

/**
 * Created by Administrator on 下午 6:24.
 */
object Main extends App {

  if(args.length>0){
    val length=args.length
    for(i<-0 until length reverse)print(args(i)+"  ")
  }

  println(Test6.toString())

//  print(Test6.FangPian)
//  print(Test6.HeiTao)
//  print(Test6.HongTao)
//  println(Test6.MeiHua)

  def check(huase:String):Boolean={
    if(Test6.FangPian==Test6.withName(huase)|| Test6.HongTao == Test6.withName(huase))true else false
  }

  private val check1: Boolean = check("♠")
  println(check1)
}
