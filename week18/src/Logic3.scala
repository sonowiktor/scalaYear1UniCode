

object Logic3 {
  val mapTF :  Int => Char  = x => if(x == 0) 'F' else if( x == 1) 'T' else   otherValue
  
  val otherValue : Char = '~' 
  
  def or (a:Int, b:Int) : Char = {    
  
    if(a > 1 || b > 1)
    {
      if( a == 1 || b == 1) 'T'
      else if( a == 0 || b == 0) otherValue
      else   otherValue
    }    
    else 
    {
      if( (a+b) >= 1) 'T' else 'F' 
    }     
}
  
  def and(a:Int, b:Int) : Char = {
   
   if( ( a == 0 && b >= 2)  || ( b == 0 && a >= 2)) 'F' 
   else if( (a*b) >= 2)  otherValue
    else if(a*b == 0) 'F' else 'T'
  }
  
  def not(a:Int) : Char = {
    if(a == 0) 'T'
    else if(a == 1) 'F'
    else otherValue
  }
  
  def main(args: Array[String]): Unit = {
    println("\t---------------")
    println("\ta    (not a)")
    println("\t---------------")
    for(a <- 0 to 2)
           println("\t"+ mapTF(a) + "     " +not(a))
    println("\t---------------\n\n\n")           
       
    println("\t------------------------------")
    println("\ta   b  (a and b)  (a or b) ")
    println("\t------------------------------")
    for(a <- 0 to 2; b <- 0 to 2)
      println("\t"+mapTF(a)+ "    " + mapTF(b) + "       " + and(a,b) + "         " + or(a,b))
     println("\t------------------------------")
  }
}