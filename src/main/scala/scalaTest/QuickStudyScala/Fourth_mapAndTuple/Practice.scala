package scalaTest.QuickStudyScala.Fourth_mapAndTuple


import java.util.{Properties, Calendar}

import scala.collection.immutable.{IndexedSeq, SortedMap}
import scala.collection.{Set, mutable}
import scala.collection.mutable.Map
import scala.io.BufferedSource

/**
 * Created by Administrator on 下午 7:55.
 */
object Practice {

  def main(args: Array[String]) {
    //====================第一题
//    val stringToInt: mutable.Map[String, Int] = Map("qiag"->23,"abde"->45,"tony"->90)
//    val stringToDouble: mutable.Map[String, Double] = stringToInt.map(t=>(t._1,t._2*0.9))
//    println(stringToDouble)//Map(qiag -> 20.7, abde -> 40.5, tony -> 81.0)

    //===================第二题  或者使用百度文档上的那种
//    val string: String = scala.io.Source.fromFile("readme.txt").mkString
//    val split: Array[String] = string.split(" ")
//    val stringToInt = new scala.collection.mutable.HashMap[String,Int]
//    val countValueMap: mutable.Map[String, Int] = stringToInt.withDefaultValue(0)
//    for(i<- split) countValueMap += ((i, countValueMap(i) + 1))
//    println(countValueMap)//Map(ada -> 1, afda -> 1, dfs -> 1, dfa -> 2)

    //=============第三题 这次使用不可变的映射
//    val string1: String = scala.io.Source.fromFile("readme.txt").mkString
//    val split1: Array[String] = string1.split(" ")
//    var map=new scala.collection.immutable.HashMap[String,Int] //注意不可变的映射，    map("afd")=445 这样是会报错的！  map += ("afd"->23) 是不会报错的！
//    for(m<-split1)map += (m->(map.getOrElse(m,0)+1))
//    println(map)//Map(dfa -> 2, dfs -> 1, ada -> 1, afda -> 1)

//    //======================第四题，使用SortedMap，是已排序映射，immutable不可变，存入数据后在打印数据时是已经排好序的
//    val stringToInt1: SortedMap[String, Int] = scala.collection.immutable.SortedMap("sdfaf"->34,"abcd"->345,"orjd"->67)
//    println(stringToInt1)//Map(abcd -> 345, orjd -> 67, sdfaf -> 34)//以字母的顺序排序
//    val string2: String = scala.io.Source.fromFile("readme.txt").mkString
//    val split2: Array[String] = string2.split(" ")
//    var map2=SortedMap[String,Int]()
//    for (m <- split2) map2 += (m -> (map2.getOrElse(m, 0) + 1))
//    println(map2)//Map(ada -> 1, afda -> 1, dfa -> 2, dfs -> 1)

    //======================第五题 使用TreeMap
//    val stringToInt: util.TreeMap[String, Int] = new util.TreeMap[String,Int]()
//    stringToInt.put("abc",34)
//    stringToInt.put("dfsad" ,45)
//    import scala.collection.JavaConversions.mapAsScalaMap
//    val scores:scala.collection.mutable.Map[String,Int]= stringToInt
//    scores +=(("liye",56))
//    println(scores)//Map(abc -> 34, dfsad -> 45, liye -> 56)

//================第六题 使用LinkedHashMap
//    val linkedhashMap=new mutable.LinkedHashMap[String,Int]
//    linkedhashMap += ("Monday"->Calendar.MONDAY)
//    linkedhashMap += ("Tuesday" -> Calendar.TUESDAY)
//    linkedhashMap += ("Wednesday" -> Calendar.WEDNESDAY)
//    linkedhashMap += ("Thursday" -> Calendar.THURSDAY)
//    linkedhashMap += ("Friday" -> Calendar.FRIDAY)
//    linkedhashMap += ("Saturday" -> Calendar.SATURDAY)
//    linkedhashMap += ("Sunday" -> Calendar.SUNDAY)
//    println(linkedhashMap)

    //========================第七题  打印所有java系统属性的表格  properties到scala Map的转换
//    import scala.collection.JavaConversions.propertiesAsScalaMap
//    val map :scala.collection.Map[String,String] = System.getProperties
//    val keySet: Set[String] = map.keySet
//    var length=0
//    for (k <- keySet) {
//      if (k.length > length) length = k.length
//    }
//    for(k1<- keySet){
//      println(k1+"  " * (length-k1.length)+"|"+map(k1))
//    }

    //=================================第八题
//    val minmax1: (Int, Int) = minmax(Array(12, 34, 56))
//    println(minmax1)//(12,56)
//    val ints: Array[Int] = Array(12,34,56)
//    val count: Int = ints.count(_>35)
//    println(count)//1

    //================第九题
//    val iteqgt: (Int, Int, Int) = Iteqgt(Array(12, 34, 56,45,6),23)
//    println(iteqgt)//(2,0,3)

    //================第十题
    val zip: IndexedSeq[(Char, Char)] = "Hello".zip("World")
    println(zip)//Vector((H,W), (e,o), (l,r), (l,l), (o,d))

    val zip1: IndexedSeq[(Char, Char)] = "Hellohaha".zip("World")
    println(zip1) //Vector((H,W), (e,o), (l,r), (l,l), (o,d))

    val zip2: IndexedSeq[(Char, Char)] = "Hello".zip("Worldhaha")
    println(zip2) //Vector((H,W), (e,o), (l,r), (l,l), (o,d))


  }
  //====第八题
  def minmax(values:Array[Int])={
    (values.min,values.max)
  }
  //=====第九题
  def Iteqgt(values:Array[Int],v:Int)={
    (values.count(_<v),values.count(_==v),values.count(_>v))
  }
}
