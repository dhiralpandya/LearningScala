package com.omt.learning.example2

object Methods {

  
  def main(args:Array[String]):Unit={
    println("This is method example")
    
    var obj =  new MethodsClass
    println(obj.max(2,7))
    println(obj.noParam)
    obj.equalSign
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
}

object MethodsClass{
  def apple() = new MethodsClass
}
