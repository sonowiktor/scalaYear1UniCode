

object CurryingDemo {
  def add(x: Int)(y: Int) = x+y
  def sub(x: Int)(y: Int) = x-y
  def mul(x: Int)(y: Int) = x*y
  def div(x: Int)(y: Int) = x/y
  def mod(x: Int)(y: Int) = x%y
  
  def eq(c:Char)(d:Char) = c==d
  def neq(c:Char)(d:Char) = c!=d
  def lt(c:Char)(d:Char) = c<d
  
  def bracket(left: String)(right: String)(whatever: String) = left + whatever + right
  
  def byLength(length: Int)(word: String): Boolean = {
    return word.length()==length
  }
  
  def lastName(name: String):String={
    name.split(" ")(1)
  }
  
  def lt(x:String, y:String): Boolean = {
    lastName(x)<lastName(y)
  }
  
  def main(args: Array[String]): Unit = {
    
    val sub4: Int => Int = sub(4)//4-y
    println((1 to 10).map(sub4))//4-1, 4-2 , 4-3, 4-4 4-5
    //result should be 3,2,1,0,-1...
    println((1 to 10) map mul(3))//3*1 3*2...
    val mod5: Int => Int = mod(5)
    println(mod5(4))//5%4==1
    println(List("apple","pear","banana","peach") map bracket("[")("]"))
    println(List("apple","pear","banana","peach").filter(byLength(5)))
    println(List("Stefan Kuhn","Luke Atwood","Usama Mannai","Stuart O'Connor","Bello Bello").sortWith(lt))
    
  }
}