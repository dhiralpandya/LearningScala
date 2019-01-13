import com.omt.learning.example1.Child

object ExampleOne {
  def main(args: Array[String]): Unit = {
    println("omtomsairam")
    
    val child = new Child
    print(child.checkClassCastDetails)
    child.arrayExamples()
  }
}