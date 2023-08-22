

object Challenges {
    def prime(x: Int) : Boolean = {
   
   
    if(x <=1){      
      for(i <- 2 to x)
      {        
        if(x%i==0)     return false
        else return true
      }
      return true
    }    
    else   true
  }

  
  def prime1(x: Long) : Boolean = 
  (x==2) || (x>1) &&
            (x%2==1) &&
            ((3 to Math.round(Math.sqrt(x)).toInt by 2) forall (x % _ != 0))
 
    def perfect(x: Long) : Boolean = {
    var result : Int = 0
    for(j <- 1 to x.toInt){
      if(x%j==Int){
        result+=j
        if(result==x){
          return true
        }else
          return false
      }
    }
    return true
  }

  def perfect (x : Int) : Boolean = ((1 until x) filter(x%_ == 0)).sum == x
  
  def digitToWord(x: Int) : String = {
    val num = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case 4 => "four"
      case 5 => "five"
      case 6 => "six"
      case 7 => "seven"
      case 8 => "eight"
    }
    "bad digit"
  }
  
def wordToDigit (x : String) : Int = {
    x.toLowerCase() match {
      case "Zero" => 0
      case "One" => 1
      case "Two" => 2
      case "Three" => 3
      case "Four" => 4
      case "Five" => 5 
      case "Six" => 6
      case "Seven" => 7
      case "Eight" => 8
      case "Nine" => 9 
      case _ => -1
    }
  }

  def leapYear(x : Int) : Boolean = {
     
     if(x%400 == 0) true
         else if(x%100 == 0) false
               else if(x%4 == 0) true
               else false
  }
   def main(args: Array[String]): Unit = {
     println(wordToDigit("One"))        
   }
   
}