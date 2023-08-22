import scala.io.StdIn._

object ReadDetails {
  def main(args: Array[String]): Unit = {
    var firstName: String = readLine("Enter your first name ")
    
    var lastName: String = readLine("Enter your last name ")
    
    var address: String = readLine("Enter your address ")
    
    var error = ""
    
    if (firstName.isEmpty) {
      error += "You did not type first name\n"
    }
    
    if (lastName.isEmpty) {
      error += "You did not type last name\n"
    }
    
    if (address.isEmpty) {
      error += "You did not type address\n"
    }
    
    if (error.isEmpty) {
      println("Your full name is " + firstName + " " + lastName + "\n and your address is " + address)
    } else {
      print(error)
    }
  }
}