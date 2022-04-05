import scala.annotation.tailrec

object FactorialTail {

  @tailrec
  def factorialTail(num: Long, acc:Long): Long =
    if (num == 0) acc
    else factorialTail(num - 1, acc * num)

  def factorial(num: Long): Long = {
    return factorialTail(num, 1);
  }

  def main(args: Array[String]): Unit = {
    println(factorial(40))
  }

}
