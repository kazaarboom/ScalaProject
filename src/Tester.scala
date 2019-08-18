object Tester {
  def main(args: Array[String]): Unit = {
    println("hello World")
    val answer:String ="Meeeow"

    println(answer.charAt(0))
    println(answer.charAt(answer.length-1))

    var properString: String="Random_String"

    var editedString:String =properString.dropRight(3)
    println(editedString)

    //added the lines to see whether they get fetched
    //added more comments
    //only in depend branch
  }
}
