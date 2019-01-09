package scalaTest.QuickStudyScala.thirteen

import java.util.Properties

import scala.collection
import scala.collection.immutable.IndexedSeq
import scala.collection.parallel.immutable.ParSeq
import scala.collection.{mutable, SortedSet}
import scala.collection.mutable.ArrayBuffer
import scala.io.{BufferedSource, Source}

/**
 * Created by Administrator on 下午 6:03.
 */
object Test1 {
  def main(args: Array[String]) {
//    val coll = Seq(1, 1, 2, 3, 5, 8, 13)
//    val toSet: Set[Int] = coll.toSet
//    println(toSet)//Set(5, 1, 13, 2, 3, 8)
//    val ints: ArrayBuffer[Int] = coll.to[ArrayBuffer]
//    println(ints)//ArrayBuffer(1, 1, 2, 3, 5, 8, 13)

    //集、序列、或映射跟同类的集合作比较
//    println(Seq(1,2,3)==(1 to 3))//true
//    println(Seq(1,2,3)==Array(1,2,3))//false
//    println(Seq(1, 2, 3).sameElements(Array(1, 2, 3)))//true

    //Scala优先使用不可变的集合
    //========注意!下面的集合产生的是一个不可变的集合
//    val stringToInt: collection.Map[String, Int] = scala.collection.Map("Hello"->23)

//    val numbers=scala.collection.immutable.Set(23,45)
    //生成的其实是predef.Set  其实跟scala.collection.immutable.Set是一致的!
//    val ints1: Set[Int] = numbers + 34//生成了一个新的Set不可变集

    //===========不可变集的 + 的使用
//    val digits: Set[Int] = MyFunction.digits(123)
//    println(digits)//Set(1, 2, 3)

    //-=--==============列表的测试
//    val digits=List(4,2)
//    println(digits.head)//4
//    println(digits.tail) //List(2)
//    println(digits.tail.head) //2
//    println(digits.tail.tail) //List()

//    val ints: List[Int] = 9 :: List(2,3)//注意:: 是右结合的
//    println(ints)//List(9, 2, 3)
//    val ints1: List[Int] = 9 :: 2 :: 3 :: Nil
//    println(ints1)//List(9, 2, 3)
//    //=======计算链表中的所有元素之和
//    val sum1: Int = sum(ints1)
//    println(sum1)//14
//    println(sum2(ints1)) //14

    //====================================集的练习
//    val weekdays=scala.collection.mutable.LinkedHashSet("avd","erds","adde");
//    weekdays.foreach(println)
    //结果：
//    avd
//    erds
//    adde
//    val set=Set(1,2,3,4,5,6)//  请注意！集并不保留元素的插入的顺序  如果想保留插入的顺序的话，请使用LinkedHashSet
//    set.foreach(println)
    //结果：
//    5
//    1
//    6
//    2
//    3
//    4
    //==========如果你想用已经排好序的顺序来访问的话，请使用SortedSet
//    val sortedSet = SortedSet(1, 2, 3, 4, 5, 6)
//    sortedSet.foreach(println)
//    var ss=scala.collection.mutable.Map(13->"dd")
//    ss += 23->"dsf"
//    ss(13)="2355"
//    println(ss)//Map(23 -> dsf, 13 -> 2355)

    //集的并 差  交 和 是否包含某个元素等
    //集是否包含某个元素
//    val digits=Set(1,2,3,7)
//    println(digits contains (4))//false
//    //某个集的所有元素是否都被另一个集合包含
//    println(Set(2,7) subsetOf(digits))//true
//    val my=Set(3,7,5)
//    //并集
//    println(digits.union(my))//Set(5, 1, 2, 7, 3)
//    //交集
//    println(digits.intersect(my))//Set(3, 7)
//    //差集
//    println(digits.diff(my))//Set(1, 2)

    //==========常用方法测试
//    val ints: mutable.LinkedHashSet[Int] = mutable.LinkedHashSet(12,345,567,22,45,1,864)
//    println(ints.head)//12
//    println(ints.headOption)//Some(12)  以Option的方法返回第一个 元素
//    println(ints.last)//864
//    println(ints.lastOption)//Some(864)
//    println(ints.init)//Set(12, 345, 567, 22, 45, 1)   除去最后一个元素之外的其他的元素 跟tail相似
//
//    println(ints.count(_>20))//5  统计符合条件的元素的个数
//    println(ints.forall(_>20))//false  所有元素都满足时返回true
//    println(ints.exists(_>20))//true  只要有一个元素满足就返回true
//
//    println(ints.filter(_>20))//Set(345, 567, 22, 45, 864)  过滤出满足条件的元素
//    println(ints.filterNot(_>20)) //Set(12, 1)  //过滤出不满足条件的元素
//    println(ints.partition(_>20))//(Set(345, 567, 22, 45, 864),Set(12, 1))  得到上面两种集合组成的对偶
//
//    println(ints.takeWhile(_>20))//Set()   返回满足前提表达式的一组元素（直到遇到第一个不满足的元素）
//    println(ints.dropWhile(_>20))//Set(12, 345, 567, 22, 45, 1, 864)  返回上面剩余的其他元素
//    println(ints.span(_>20))//(Set(),Set(12, 345, 567, 22, 45, 1, 864))   得到上面两种集合组成的对偶
//
//    println(ints.take(4))//Set(12, 345, 567, 22)   得到前4个元素的集合
//    println(ints.drop(4))//Set(45, 1, 864)  去掉4个元素后剩下的元素的集合
//    println(ints.splitAt(4))//(Set(12, 345, 567, 22),Set(45, 1, 864))   得到上面两种集合组成的对偶
//
//    println(ints.takeRight(4))//Set(22, 45, 1, 864)  得到从后面取的4个元素
//    println(ints.dropRight(4))//Set(12, 345, 567)   与上面的对应，得到去掉后面4个元素之后的剩下的元素
//
//    val grouped: Iterator[mutable.LinkedHashSet[Int]] = ints.grouped(2)
//    while(grouped.hasNext){
//      println(grouped.next())
//}
    //结果：  返回的是一个迭代器 每一个元素为一个Set集合   第一个元素是下标为0 until n的集合，第二个元素是n until 2n的集合  依次往后，直到最后一个元素
//    Set(12, 345)
//    Set(567, 22)
//    Set(45, 1)
//    Set(864)
//    val sliding: Iterator[mutable.LinkedHashSet[Int]] = ints.sliding(4)
//    while (sliding.hasNext) {
//      println(sliding.next())
//    }
    //结果：  返回的是一个迭代器 每一个元素为一个Set集合   第一个元素是下标为0 until n的集合，第二个元素是1 until n+1的集合  依次往后(sliding是滑行的意思，一个个的往后滑)，直到最后一个元素
//    Set(12, 345, 567, 22)
//    Set(345, 567, 22, 45)
//    Set(567, 22, 45, 1)
//    Set(22, 45, 1, 864)
//    val ab: ArrayBuffer[String] = ArrayBuffer("Peter","Paul","Mary")
//    //transform的使用  当场执行，而不是交出新的集合  它应用于可变集合  并将每个元素都替换成函数的结果
//    ab.transform(_.toUpperCase)
//    println(ab)//ArrayBuffer(PETER, PAUL, MARY)

    //collect  意思为收集，收集那些被定义的所有参数的函数值的集合
//    val collect: IndexedSeq[Int] = "-3+4".collect{case '+' =>1;case '-' => -1}
//    println(collect)//Vector(-1, 1)

    //groupBy  交出一个映射  它的键是函数求值后的值，而值是那些函数调用每个元素得到的此映射的键的那些元素
//    val ab1: ArrayBuffer[String] = ArrayBuffer("Peter", "Paul",  "Mary", "Abced","amy")
//    val by: Map[String, ArrayBuffer[String]] = ab1.groupBy(_.substring(0,1).toUpperCase)
//    println(by)//Map(M -> ArrayBuffer(Mary), P -> ArrayBuffer(Peter, Paul), A -> ArrayBuffer(Abced, amy))

    //foldLeft的使用
//    val left: Int = List(1,4,2,9).foldLeft(0)(_+_)//0+1+4+2+9=16
//    println(left)//16

    //=====================使用/: 来代表foldLeft
//    (Map[Char,Int]() /: "Mispi"){
//      (m,c)=>m+(c->(m.getOrElse(c,0)+1))
//    }
    //等同于：
//    val left1: Map[Char, Int] = "Mispi".foldLeft(Map[Char,Int]()) {
//      (m, c) => m + (c -> (m.getOrElse(c, 0) + 1))
//    }
//    println(left1)//Map(M -> 1, i -> 2, s -> 1, p -> 1)

    //scanLeft和scanRight方法将折叠和映射操作结合在一起，你将得到的包含所有中间结果的集合
//    val left2: List[Int] = List(1,2,3,4,5).scanLeft(0)(_+_)
//    println(left2)//List(0, 1, 3, 6, 10, 15)

    //====================================拉链操作 zip
//    val prices=List(5.0,20.0,9.5)//商品的价格
//    val quantities=List(10,2,1)//商品的数量
//    val tuples: List[(Double, Int)] = prices zip quantities
//    println(tuples)//List((5.0,10), (20.0,2), (9.5,1))
//    //计算所有商品的花费
//    val sum1: Double = tuples.map(x=>x._1*x._2).sum
//    println(sum1)//99.5
//    val prices2 = List(5.0, 20.0)
//    val quantities2 = List(10, 2) //商品的数量
//    val all: List[(Double, Int)] = prices.zipAll(quantities2, 0.0 , 5)//第一个值0.0 为当prices的元素较少时用0.0与quantities2进行拉链操作
//    println(all)//List((5.0,10), (20.0,2), (9.5,5))
//    val all2: List[(Double, Int)] = prices2.zipAll(quantities, 0.0 , 5) //第二个值5 为当quantities的元素较少时用5与prices2进行拉链操作
//    println(all2)//List((5.0,10), (20.0,2), (0.0,1))
    //==========zipWithIndex  方法返回对偶的列表  其中每个对偶中第二个组成部分是每个元素的下标
//    val index: IndexedSeq[(Char, Int)] = "Scala".zipWithIndex
//    println(index)//Vector((S,0), (c,1), (a,2), (l,3), (a,4))

    //=============迭代器
//    val file: BufferedSource = Source.fromFile("e:\\sparktest.txt","gbk")
//    val buffered: BufferedIterator[Char] = file.buffered
//    while(buffered.hasNext){
//      println("2222222222222")//一个回车代表两行
//      buffered.next()
//    }

    //============scala上的集合 与java上的集合之间的互转操作=========隐式转换
    //把java上的java.util.Properties转换为scala上的map
    import scala.collection.JavaConversions.propertiesAsScalaMap//注意如果没有用到的话是显示灰色的，有用到隐式转换的话，会变成黑色
    val props:scala.collection.mutable.Map[String,String]=System.getProperties

    //=============并行集合
    for(i<-(0 until 20).par)print(s"$i")//可以通过对要遍历的集合应用.par并行化for循环
    //012347891011121314151617181956  注意数字是按照作用于该任务的线程产出的顺序输出的   而在for  yield中。结果是依次组装的
    val strings: ParSeq[String] = for (i <- (0 until 20).par) yield i + " "
    println(strings)//ParVector(0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 19 )


  }

  //==========遍历链表常用的方法是使用递归
  def sum(list:List[Int]):Int={
    if(list == Nil) 0 else
    list.head + sum(list.tail)
  }
  //============或者使用模式匹配
  def sum2(list: List[Int]): Int = list match {
    case Nil => 0
    case h :: t => h + sum(t)
  }


}
