package com.price.euler.scala

object Problem1 {

  def main(args: Array[String]): Unit = {
    val total = (1 until 1000).filter(isTarget).sum
    println(total)
  }

  def isTarget(i:Int): Boolean = {
    return i % 3  == 0 || i % 5 == 0;
  }
}
