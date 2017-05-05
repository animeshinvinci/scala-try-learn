/**
  * Created by animesh on 5/5/17.
  */
object ScalaObjectLearn {

  def main(args: Array[String]): Unit = {


  }

  def  fact(num :Int) : Int = {
     if(num == 0){
       return 1
     }
     return num * fact(num - 1)

  }

}
