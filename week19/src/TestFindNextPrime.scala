import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import FindNextPrime._

class TestFindNextPrime {
  @Test def testIsPrime1 {
    assertFalse("Negative numbers are not prime", isPrime(-5))
  }
  
  @Test def testIsPrime2 {
    assertFalse("0 is not prime", isPrime(0))
  }
  
  @Test def testIsPrime3 {
    assertFalse("1 is not prime", isPrime(1))
  }
  
  @Test def testIsPrime4 {
    assertTrue("2 is the lowest prime", isPrime(2))
  }
  
  @Test def testIsPrime5 {
    assertTrue("3 is prime", isPrime(3))
  }
 
  @Test def testIsPrime6 {
    assertFalse("4 is not prime", isPrime(4))
  }
  
   @Test def testIsPrime7 {
    assertFalse("{Int.MinValue..-1} -5", isPrime(-5))
  }
   
   @Test def testIsPrime8 {
    assertFalse("{0..1}", isPrime(0))
  }
   
   @Test def testIsPrime9 {
    assertTrue("primes between 2 and Int.MaxValue ", isPrime(7))
  }
  
     @Test def testIsPrime10 {
    assertFalse("non-primes between 2 and Int.MaxValue", isPrime(10))
  }
}