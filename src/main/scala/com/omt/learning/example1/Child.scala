package com.omt.learning.example1

class Child extends Parent {
  override val omtVal:Int = 77;
  
  //omtVal = 1;
  
  

  def checkClassCastDetails():Boolean ={
    
    var result = false
    
    var value:Byte = 12.asInstanceOf[Byte]
    
    result = true
    
    result
    
  }
  
  
  def arrayExamples(): Unit = {
    var oneArray = Array[Option[String]](None,None,None,None)
    oneArray(0) = Some("omt")
    oneArray(2) = Some("Dhiral")
    oneArray(1) = Some("Pandya")
    
    for(value <- oneArray){
      println(value.getOrElse("No Value"))
    }
    
    for(i <- 0 to oneArray.length-2){
      val value = oneArray(i)
      println(value.getOrElse("No Value"))
    }
   
    
    
    
  }
  
}

