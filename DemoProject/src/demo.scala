import scala.io.StdIn._

object demo {
   def main(args: Array[String]): Unit = {
    println("Type in a number ")
    var number = readInt()
    
    if (number > 0) {
      println(number + " is positive")
    } else if (number < 0) {
      println(number + " is negative")
    } else {
      println(number + " is zero")
    }
  }
}