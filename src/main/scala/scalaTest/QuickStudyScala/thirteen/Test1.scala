package scalaTest.QuickStudyScala.thirteen

import scala.collection
import scala.collection.{mutable, SortedSet}
import scala.collection.mutable.ArrayBuffer

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
    val ints: mutable.LinkedHashSet[Int] = mutable.LinkedHashSet(12,345,567,22,45,1,864)
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
    val grouped: Iterator[mutable.LinkedHashSet[Int]] = ints.grouped(2)
    while(grouped.hasNext){
      println(grouped.next())
}
    //结果：  返回的是一个迭代器 每一个元素为一个Set集合   第一个元素是下标为0 until n的集合，第二个元素是n until 2n的集合  依次往后，直到最后一个元素
//    Set(12, 345)
//    Set(567, 22)
//    Set(45, 1)
//    Set(864)
    val sliding: Iterator[mutable.LinkedHashSet[Int]] = ints.sliding(4)
    while (sliding.hasNext) {
      println(sliding.next())
    }
    //结果：  返回的是一个迭代器 每一个元素为一个Set集合   第一个元素是下标为0 until n的集合，第二个元素是1 until n+1的集合  依次往后(sliding是滑行的意思，一个个的往后滑)，直到最后一个元素
//    Set(12, 345, 567, 22)
//    Set(345, 567, 22, 45)
//    Set(567, 22, 45, 1)
//    Set(22, 45, 1, 864)

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
