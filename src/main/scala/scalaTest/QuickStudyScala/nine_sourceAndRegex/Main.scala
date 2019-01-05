package scalaTest.QuickStudyScala.nine_sourceAndRegex

/**
 * 序列化对象-将序列化后的对象存储到文件中=读取文件中的序列化对象
 */
//测试scala中的序列化与反序列化
object Main {
  def main(args: Array[String]) {
    val person: Person = new Person("liming",123)
    import java.io._
    val stream: ObjectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\tmp\\testSerializable"))
    stream.writeObject(person)7
    stream.close()
    val inputStream: ObjectInputStream = new ObjectInputStream(new FileInputStream("E:\\tmp\\testSerializable"))
    val person1: Person = inputStream.readObject().asInstanceOf[Person]
    println(person1.name)
  }

}
