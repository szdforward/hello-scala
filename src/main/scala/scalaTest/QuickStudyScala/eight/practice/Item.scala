package scalaTest.QuickStudyScala.eight.practice

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Administrator on 下午 10:42.
 */
abstract class Item {
  def price:Double
  def description:String
  override def toString():String={
    "description:"+description+" ;price:"+price
  }

}
class SimpleItem(val price:Double,val description:String) extends Item{

}

class Bundle{

  val pack:ArrayBuffer[Item]=new ArrayBuffer[Item]()

  def price ():Double={
    var total=0d
    pack.foreach(total +=  _.price)
    total
  }
  def addItem(item:Item){
    pack += item
  }
  //描述方法
  def description():String={
    pack.mkString(" ")
  }
}