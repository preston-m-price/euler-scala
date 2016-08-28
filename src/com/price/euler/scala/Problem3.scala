package com.price.euler.scala

object Problem3 {

  def main (args: Array[String]): Unit = {
    val target:Long = 600851475143L
//    (1 until 100).foreach(f => if(isPrime(f)) println(f))
    val result:Long = (1L until Math.sqrt(target).toLong by 2L).filter(target%_==0).filter(isPrime(_)).max
    println(result)
  }

  def isPrime(x: Long) : Boolean = {
    return x == 2 || (x%2 != 0 && !( 3L to Math.sqrt(x).toLong by 2L).exists(x%_==0))
  }
}
