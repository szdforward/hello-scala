package scalaTest.QuickStudyScala.Fourth_mapAndTuple


import java.awt.Font
import java.util
import java.util.Properties

import scala.collection.mutable
import scala.collection.mutable.Map

/**
 * Created by Administrator on 下午 8:43.
 */
object MapAndTuple {
  def main(args: Array[String]) {
    //======================创建Map的几种方式
//         val map: Map[String, Int] = Map("Alince"->12,"bob"->34,"candy"->55)
    //    val stringToInt = new mutable.HashMap[String,Int]
    //    stringToInt += (("str",34))
    //    val stringToInt1: mutable.Map[String, Int] = mutable.Map(("Alince",12),("bob",34),("candy",45))
    //    //获取映射中指定键对应的值的方式-下面三种==获取映射中指定键所对应的，如果有对应的话则得到值，如果没有的话则报错
    //    val int: Int = stringToInt1("Alince")//如果映射中不包含请求中使用的键，则会抛出异常
    //    println (int)//12
    //    val orElse: Int = stringToInt1.getOrElse("Alince2",0)
    //    println(orElse)//0
    //    val maybeInt1: Option[Int] = stringToInt1.get("abc")//返回一个Option对象，有值的话返回Some 没值的话返回None
    //    println(maybeInt1)//None

    //------------------------为元组中的元素设置默认值
//    val map: Map[String, Int] = Map("Alince" -> 12, "bob" -> 34, "candy" -> 55)
//        val newMap: mutable.Map[String, Int] = map.withDefaultValue(0)//注意这里会生成一个新的mutable.Map，先前的Map并不会改变！
//        val maybeInt= newMap("sdfds")//新的Map的如果对应的键不存在的话返回0
//        println(maybeInt)//0
//        val maybeInt1 = map("sdfds") //老的Map并没有发生改变！如果对应的键不存在的话报错！

//        val maybeInt2: Option[Int] = newMap.get("sdfds")
//        println(maybeInt2)//None  注意如果设置了默认值的话，只能是通过变量名()来获得默认的值，通过get方法得到的还是Some或者None（如果不存在的话还是None，即使你设置了默认值）
//      val maybeInt3: Option[Int] = map.get("sdfds")
//      println(maybeInt3)//None

    //    //================更新映射中的值
    //    stringToInt1("bob")=999
    //    println(stringToInt1)//Map(bob -> 999, candy -> 45, Alince -> 12)
    //    //==========移除某个键和对应的值 使用-= 进行操作
    //    stringToInt1 -= "bob"
    //    println(stringToInt1)//Map(candy -> 45, Alince -> 12)
    //    //=============在使用+操作的时候如果后面中的键在先前的map中已经存在的话，则会修改此键对应的值
    //    val stringToInt11: mutable.Map[String, Int] = stringToInt1 + ("a"->1,"b"->3,"candy"->7)//修改candy对应的值为7
    //    println(stringToInt11)//Map(b -> 3, candy -> 7, a -> 1, Alince -> 12)
    //    stringToInt11 += ("aBC"->3,a->333)
    //    //========注意无论是+还是+=  如果先前有对应的键的话，则会更新新的值，如下，将a对应的值改为了333
    //    println(stringToInt11)//Map(b -> 3, aBC -> 3, candy -> 7, a -> 333, Alince -> 12)
    //    //====================================迭代映射
//    val stringToInt11 = Map("aBC" -> 3, "candy" -> 7, "a" -> 333, "Alince" -> 12)
//    val int1ToString: mutable.Map[Int, String] = for ((k, v) <- stringToInt11) yield (v, k)
//    println(int1ToString) //Map(7 -> candy, 333 -> a, 12 -> Alince, 3 -> aBC)
//        for(i<-int1ToString.keySet)println(i)
    //结果：
//        7
//    333
//    12
//    3
//        for (v<-int1ToString.values)println(v)
    //结果：
//    candy
//    a
//    Alince
//    aBC
    //    //======================================与 java的互操作
//        import scala.collection.JavaConversions.mapAsScalaMap//导入之后才会把java中的TreeMap转换成scala中的Map成功
//        val scores: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String,Int]()
    //    //===========从java中的java.util.Properties到Map的转换
    //    import scala.collection.JavaConversions.propertiesAsScalaMap//导入之后才会把java中的Properties转换成scala中的Map成功
    //    val props: scala.collection.mutable.Map[String, String] = System.getProperties
    //反过来讲，把Scala映射转换成java映射  书中这样写的，实际操作报错！
//    import scala.collection.JavaConversions.mapAsJavaMap
//    import java.awt.font.TextAttribute._
//    val attrs = Map("aBC" -> 3, "candy" -> 7, "a" -> 333, "Alince" -> 12)
//    val font: Font = new Font(attrs)

    //========================tuple操作（元组操作   元组最多可以有22个元素）
    val t = (1, 34.4, "dfa")
    val (first, second, third) = t
    println(first) //1
    //======元组适用于返回不止一个值的情况-StringOps的partition方法返回的是一对字符串
    val partition: (String, String) = "New York".partition(_.isUpper)
    println(partition) //(NY,ew ork)   左边的是符合要求的数据，右边的是不符合要求的数据
    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    val zip: Array[(String, Int)] = symbols.zip(counts)
    println(zip.toBuffer)//ArrayBuffer((<,2), (-,10), (>,2))
    for ((x, y) <- zip) print(x * y) //打印输出    <<---------->>


  }

}
