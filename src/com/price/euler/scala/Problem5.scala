package com.price.euler.scala

/*
When testing a potential answer we don't need to check if every number (1..20) is a factor.
For example if we check that 20 is a factor we'll know that 2, 4, 5, and 10 are also factors.
 */
object Problem5 {
//  val primes = List(2, 3, 5, 7, 11, 13, 17, 19)
  val factors = List(20, 19, 18, 17, 16, 15, 14, 13, 12, 11)
  def main(args: Array[String]): Unit = {
    // using BigInt because I don't know how big the first common number will be.
    val result = generator(20).takeWhile(p => !factors.forall(p % _ == 0)).last+20 // takeWhile will test up to the # before the answer so we add 20
    println(result)

  }

  def generator(x:BigInt): Stream[BigInt] = {
    def stream(n:BigInt):Stream[BigInt] = {
      n #:: stream(n + 20)
    }
    stream(20)
  }
}
