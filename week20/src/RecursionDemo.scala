

object RecursionDemo {
  def countdown(n: Int): Unit = {
    print(s"$n ")
    if (n == 0)
      println("Stopped")
    else
      countdown(n - 1)
  }

  def countTo10(n: Int): Unit = {
    print(s"$n ")
    if (n == 10)//or n>=10
      println("Stopped")
    else
      countTo10(n + 1)
  }
  
  def countTo10_2(n : Int) : Unit = {
    print(s"$n ")
    if (n < 10) 
      countTo10(n + 1)
    else 
      println("Stopped")  
  }


  def countToN(s: Int, e: Int): Unit = {
    print(s"$s ")
    if (s == e)//or s>=e
      println("Stopped")
    else
      countToN(s + 1, e)
  }

  def reverseCountToN(s: Int, e: Int): Unit = {
    print(s"$e ")
    if (s == e)
      println("Stopped")
    else
      reverseCountToN(s, e - 1)
  }

  def factorial(n: Long): Long = {
    if (n == 0)
      1
    else if (n < 0)
      0
    else
      n * factorial(n - 1)
  }
  
  def sumFromTo(s: Int, e: Int): Int = {
    if (s == e)
      s
    else
      s + sumFromTo(s + 1, e)
  }

  def sumList(xs: List[Int]): Int = {
    if (xs.isEmpty)
      0
    else
      xs.head + sumList(xs.tail)
  }

  def prodList(xs: List[Int]): Int = {
    if (xs.isEmpty)
      1
    else
      xs.head * prodList(xs.tail)
  }

  def lenList(xs: List[Int]): Int = {
    if (xs.isEmpty)
      0
    else
      1 + lenList(xs.tail)
  }

  def allTrue2(xs: List[Boolean]): Boolean = {
    if (xs.isEmpty)
      true
    else
      xs.head && allTrue2(xs.tail)
  }

  def allTrue(xs: List[Boolean]): Boolean = {
    if (xs.isEmpty)
      true
    else if (!xs.head)
      false
    else
      allTrue(xs.tail)
  }

  def anyTrue(xs: List[Boolean]): Boolean = {
    if (xs.isEmpty)
      false
    else
      xs.head || anyTrue(xs.tail)
  }
  
  def anyTrue2(xs: List[Boolean]): Boolean = {
    if (xs.isEmpty)
      false
    else if (xs.head)
      true
    else
      anyTrue2(xs.tail)
  }
  
  def  ackermann(a : Int, b : Int) : Int = {
    if( a == 0) 
      b + 1
    else if(a > 0  && b > 0)  
      ackermann(a -1,1)
    else 
      ackermann(a-1,ackermann(a,b-1))      
  }  


  def main(args: Array[String]): Unit = {
    println("Testing countdown works...")
    countdown(5)

    println("\nTesting countTo10 works...")
    countTo10(5)

    println("\nTesting countToN works...")
    countToN(15, 20)
    
    println("\nTesting reverseCountToN works...")
    reverseCountToN(15, 20)

    println("\nTesting factorial works...")
    println("fac(5) " + factorial(5))
    println("fac(-1) " + factorial(-1))
    println("fac(21) " + factorial(21))
    println("Max long value? " + Long.MaxValue)

    println("\nTesting sumFromTo works...")
    println(sumFromTo(2, 5))

    println("\nTesting sumList works...")
    println(sumList(List(2, 3, 4, 5)))

    println("\nTesting prodList works...")
    println(prodList(List(2, 3, 4)))

    println("\nTesting lenList works...")
    println(lenList(List(2, 3, 4)))

    println("\nTesting allTrue works...")
    println(allTrue(List(true, true, true)))

    println("\nTesting anyTrue works...")
    println(anyTrue(List(false, false, false)))
  }
}