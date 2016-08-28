package com.price.euler.scala

object Problem4 {
  def main(args: Array[String]): Unit = {
    def isPal(x:Integer): Boolean = { return x.toString() == x.toString().reverse }
    var result = 0
    (100 to 999).foreach(i => {
      (i to 999).foreach(j => {
        val x = i * j
        if(isPal(x) && (x) > result )
          result = (x)
      })
    })
    println(result)
  }
}
