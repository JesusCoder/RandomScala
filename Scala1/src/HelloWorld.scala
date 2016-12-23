/**
  * Created by stevesun on 12/23/16.
  */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    print("Hello World!\n")

    //    A beautiful one-liner to generate a continuous sequenece of prime numbers between the closed interval [a...b]
    val primes: Stream[Int] = {
      def generatePrimes (s: Stream[Int]): Stream[Int] =
        s.head #:: generatePrimes(s.tail filter (_ % s.head != 0))
      generatePrimes(Stream.from(2))
    }
    print(primes.filter(_ > 100).take(20).toVector)//get the first 20 prime numbers greater than 100
  }
}
