package scalaTest.QuickStudyScala.Third_Array

import java.util

import scala.collection.immutable.IndexedSeq
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * Created by Administrator on 上午 11:07.
 */
object ArrayTest {
  def main(args: Array[String]) {
    //==============定长数组（长度不变的数组）
//    val ints: Array[Int] = new Array[Int](10)//元素为Int的数组，包含10个元素，每个元素初始化为0
//    println(ints.toBuffer)//ArrayBuffer(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
//    val strings: Array[String] = Array("Hello","World")
//    println(strings.toBuffer)//ArrayBuffer(Hello, World)
//    strings(0)="goodbye"
//    println(strings.toBuffer)//ArrayBuffer(goodbye, World)

    //==================变长数组：数组缓冲
//    val bu=new ArrayBuffer[Int]()//一个空的变长数组，准备存放整数
//    bu += 1
//    println(bu)//ArrayBuffer(1)
//    bu ++= Array(23,4,56,2)
//    println(bu)//ArrayBuffer(1, 23, 4, 56, 2)
//    bu.trimEnd(2)//使用trimEnd移除最后几个元素，在数组尾端添加或者移除元素是一个高效的操作
//    println(bu)//ArrayBuffer(1, 23, 4)
//    bu.insert(1,55)//在下标1之前插入55（下标以0开始），效率不那么高效，所有在那个位置之后的元素都必须被平移
//    println(bu)//ArrayBuffer(1, 55, 23, 4)
//    bu.insert(2,34,45,56)//在下标2之前插入34,45,56
//    println(bu)//ArrayBuffer(1, 55, 34, 45, 56, 23, 4)
//    bu.remove(3,2)//从下标为3的位置处移除元素，移除2个元素
//    println(bu)//ArrayBuffer(1, 55, 34, 23, 4)
//    bu.remove(2)//得到ArrayBuffer(1, 55, 23, 4)  移除下标为2的元素

    //====================================数组的遍历
//    val array: Array[Int] = Array(1,2,3,4,5,6,7,8,9,0)
//    使用until的话到不了那个值，比如我until 10 的话，10这个元素是到不了的，最多到9  。until返回所有小于（但不包括）上限的数字
//        for(b<-0 until (array.length,2)){//每两个元素一跳，中间间隔一个元素，从下标为0的位置开始，依次跳到下标为2,4,6...
//          println(array(b))
//    }
//    结果：
//    1
//    3
//    5
//    7
//    9
    //===============示例：移除整个数组中除第一个负数之外的所有的其他负数
    //=========方式一
//    val buffer: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, -5, 6, -7, 8, -9, 0)
//    var length: Int = buffer.length
//    var l=0
//    var flag=true
//    while(l<length){
//      if(buffer(l)>=0) {
//        l += 1
//      }else{
//        if(flag){
//          flag=false
//          l += 1
//        } else {
//          buffer.remove(l)
//          length -= 1
//        }
//      }
//    }
//    println(buffer)//ArrayBuffer(1, 2, 3, 4, -5, 6, 8, 0)
    //==================方式二：首先拿到所有符合要求数据的下标，然后将元素移动到该去的位置，并移除尾端
//    val buffer2: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, -5, 6, -7, 8, -9, 0)
//    var first=true
//    val indexs: IndexedSeq[Int] = for (i <- 0 until buffer2.length if first || buffer2(i) >= 0) yield {
//      if (buffer2(i) < 0) first = false; i
//    }
//    for (j<-0 until indexs.length)buffer2(j)=buffer2(indexs(j))
//    buffer2.trimEnd(buffer2.length-indexs.length)
//    println(buffer2)//ArrayBuffer(1, 2, 3, 4, -5, 6, 8, 0)
    //============================方式三：得到所有负数的下标，如果得到的下标数大于2个的话drop掉第一个下标，然后将其他的下标处的数据移除
//    val buffer22: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, -5,6, -7,8, -9,0)
//    var ints: IndexedSeq[Int] = for(i<-0 until buffer22.length if (buffer22(i)<0))yield i
    //以下的println仅仅测试ints.drop()方法
//    println(ints)//Vector(4, 6, 8)
//    println(ints.drop(0)) //Vector(4, 6, 8)
//    println(ints)//Vector(4, 6, 8)
//    println(ints.drop(1))//Vector(6, 8)
//    println(ints)//Vector(4, 6, 8)   注意IndexedSeq类型数组的drop之后，先前的数组并没有发生改变！
//    if(ints.length>=2){
//      ints=ints.drop(1)
//      for (i <- ints.reverse) buffer22.remove(i)
//    }
//    println(buffer22)//ArrayBuffer(1, 2, 3, 4, -5, 6, 8, 0)
    //===========================================常用算法
//    val buffer3: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, -5, 6, -7, 8, -9, 0)
//    val sum: Int = buffer3.sum
//    val min: Int = buffer3.min
//    val max: Int = buffer3.max
//    println(Array("a","abc","dgddd","erdt").max)//erdt  按照首字符的顺序，得到最靠后的首字符所对应的字符串
//    val sorted: ArrayBuffer[Int] = buffer3.sorted
//    println(sorted)//ArrayBuffer(-9, -7, -5, 0, 1, 2, 3, 4, 6, 8)
//    println(buffer3)//ArrayBuffer(1, 2, 3, 4, -5, 6, -7, 8, -9, 0)  由此可见，在进行sorted方法之后是生成了新的ArrayBuffer，原来的并没有改变
//    val sortWith: ArrayBuffer[Int] = buffer3.sortWith(_ > _)
//    println(sortWith)//ArrayBuffer(8, 6, 4, 3, 2, 1, 0, -5, -7, -9)
//    val string: String = buffer3.mkString(" and ")//=======在mkString时我们可以指定每个元素之间的连接的字符是什么
//    println(string)//1 and 2 and 3 and 4 and -5 and 6 and -7 and 8 and -9 and 0

    //=========注意对于定长数组Array调用toString方法时只会打印出一个没有多大用处的地址，而变长数组ArrayBuffer调用toString时会打印出每个元素
    //=========使用mkString时可以指定前缀和后缀和中间的间隔字符
//    val string1: String = buffer3.mkString("<","|",">")
//    println(string1)//<1|2|3|4|-5|6|-7|8|-9|0>
    //======================================数组的padTo的方法释义：（个人）当第一个值小于数组的长度时，后面
    // 添加的元素会添加不上的，仅仅当第一个值大于等于数组的长度时，后面的元素才能添加到数组的尾部
//    val to: ArrayBuffer[Int] = buffer3.padTo(11,89)
//    println(to)//ArrayBuffer(1, 2, 3, 4, -5, 6, -7, 8, -9, 0, 89)
//    val to2: ArrayBuffer[Int] = buffer3.padTo(16, 89)
//    println(to2) //ArrayBuffer(1, 2, 3, 4, -5, 6, -7, 8, -9, 0, 89, 89, 89, 89, 89, 89)
//    val to1: ArrayBuffer[Int] = buffer3.padTo(5, 89)
//    println(to1)//ArrayBuffer(1, 2, 3, 4, -5, 6, -7, 8, -9, 0)
    //===============================================多维数组
//    val doubles: Array[Array[Double]] = Array.ofDim[Double](3,4)//构建了一个3行4列的多维数组
//    println(doubles(2)(0))//0.0  默认里面都是0
//    //或者创建不规则的数组， 每一行的长度各不相同
//    val doubles1: Array[Array[Double]] = new Array[Array[Double]](5)
//    for(i<-0 until  doubles1.length){
//      doubles1(i)=new Array[Double](i+1)

    //=============================与java的互操作
    val strings: ArrayBuffer[String] = ArrayBuffer("abc","dbd","121")
    import scala.collection.JavaConversions.bufferAsJavaList//注意一定要导入这个包之后下面的表达式才不会报错！
    val builder: ProcessBuilder = new ProcessBuilder(strings)//此时Scala缓冲strings被包装成了一个实现了Java.util.List接口的Java类的对象

    //反过来讲，当Java方法返回Java.util.List时，我们可以让它自动转换成一个Buffer  使用command方法
    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable.Buffer
    val command: Buffer[String] = builder.command()

    }

}
