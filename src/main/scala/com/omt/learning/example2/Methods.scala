package com.omt.learning.example2

object Methods {

  
  def main(args:Array[String]):Unit={
    println("This is method example")
    
    var obj =  new MethodsClass
    println(obj.max(2,7))
    println(obj.noParam)
    obj.equalSign
    
    println(obj.returnSameTHING(2,7))
    println(obj.returnAnyValDym(2,7))
    
    var a:Int = obj.returnAnyValDym(27,7).asInstanceOf[Int]
    
    println(obj.defaultValueInParam("Dhiral"))
    println(obj.defaultValueInParam("omt"))
  }
  
}


class MethodsClass {
  
  
  def max(a:Int, b:Int):Int = {
    if(a>b)
      a
    else 
      b
  }
  
  def noParam:String = "No params no "
  
  def equalSign() = println("nothing")
  
  
  def returnSameTHING(a:Int, b:Int) ={
    if(a>b)
      a
    else 
      b
    //Last statement is the return one. 
    "SAME STRING"
  }
  
  def returnAnyValDym(a:Int,b:Int) = {
     if(a>b) 
       a
     
  }
  
  def changeParam(a:Int) ={
    //a = a+1; error you can not re-assign
  }
  
  
  def defaultValueInParam(name:String = "omt"):Boolean = {
     if(name.equals("omt"))
        true
      else
       false
  }
}

object MethodsClass{
  def apple() = new MethodsClass
}
