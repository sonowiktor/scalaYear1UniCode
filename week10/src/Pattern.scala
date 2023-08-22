

object Pattern {
  def main(args: Array[String]): Unit = {
    val rows, cols = 20
    val on = 'X'
    val off = ' '
    
    (0 until rows).foreach(i => {
      (0 until cols).foreach(j => print(" " + (if (i != j) on else off))); println()
    })
    
    /* Try different patterns */
    //if (i <= j) on else off
    //if (i >= j) on else off
    //if (i <= cols - j - 1) on else off
    //if (i >= cols - j - 1) on else off
    //if (i % 4 != j % 4) on else off
    //if (i % 4 <= j % 4) on else off
    //if (i % 4 < 2 && j % 4 < 2) on else off
  }
}