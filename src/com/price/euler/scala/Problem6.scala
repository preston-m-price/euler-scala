package com.price.euler.scala

object Problem6 {

  def main(args: Array[String]): Unit = {
    var sumSquares:Long = 0
    (1L to 100L).foreach(sumSquares += Math.pow(_, 2).toLong)
    val squareOfSums = Math.pow((100 * 100 + 100)/2, 2)
    println(squareOfSums - sumSquares)
  }
}
