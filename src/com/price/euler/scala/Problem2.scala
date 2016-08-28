package com.price.euler.scala

object Problem2 {

  def main(args: Array[String]): Unit = {
    val stream = fib
    val total = stream.takeWhile(_ < 4000000).filter(_ %2 == 0).sum
    println(total)
  }

  def fib: Stream[Long] = {
    def tail(h: Long, n: Long): Stream[Long] = h #:: tail(n, n+h)
    tail(0,1)
  }

}
