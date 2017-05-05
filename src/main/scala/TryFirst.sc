object TryNLearn{

  print("hi world hi how r u !")

  val num: Int = 4
  val num1: Int = 5

  print(x = num + num1)

  case class Student(num: Int,name: String)
  case class Subject(name:String,marks:Int)

  var dMap :Map[String,AnyRef] = Map()
  dMap += ("student" -> Student)
  dMap += ("Subject" -> Subject)


  println( "Keys in dMap : " + dMap.keys )
  println( "Values in dMap : " + dMap.values )
  println( "Check if dMap is empty : " + dMap.isEmpty )
  println(dMap.grouped(1))



  var objList = List(4,5,6,7)

  objList.foreach{i =>
      print( 2 * i)
      print(i +  " | ")}



  def notFound() = dMap ! None


}
