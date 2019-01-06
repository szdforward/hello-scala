package scalaTest.QuickStudyScala.ten_trait.practice

/**
 * Created by Administrator on 下午 8:02.
 */
//========第四题
trait Logger {
  def log(string: String,key :Int=3):String

}
class CryptoLogger extends Logger{
  override def log(string: String, key: Int): String ={
    for(i<-string)yield if(key>=0)(97+((i-97+key)%26)).toChar else (97+((i-97+26+key)%26)).toChar
  }

}
