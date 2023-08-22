

object Counter {
  private var value: Int = 0
  
  def incr(): Unit={
    value+=1
  }

  def getValue(): Int = {
    return value
  }

  def incr(n: Int) {
    //two alternatives here
    //for (i <- 1 to n) incr()
    value+=n
  }
  
  def setValue(newValue: Int){
    value=newValue
  }
      
  def reset() {
    value=0
  }
}