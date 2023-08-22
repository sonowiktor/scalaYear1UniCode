import scala.io.StdIn.readInt

object ModuleResults {
  

def getResult( examMark : Int, courseWorkMark : Int) : String = {
    
    if(examMark < 0 || examMark > 100 || courseWorkMark < 0 || courseWorkMark > 100)   "invalid inputs"
    else if((examMark + courseWorkMark)/2  >= 40) "passed"
    else if(examMark < 40 && courseWorkMark  < 40) "resit module"
    else if(examMark < 40) "resit exam"
    else "resit course work"
      //  if(courseWorkMark  < 40)
    
    }      
  
  
  def main(args: Array[String]): Unit = {
    print("Enter exam mark (%): ")
    var exam: Int = readInt()
    
    print("Enter coursework mark (%): ")
    var coursework: Int = readInt()
    
    println(getResult(exam,coursework))
    
    
  }
}