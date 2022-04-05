
object Factorial {
  def factorial(num: Long): Long = {
    if (num==0) return 1;
    return num * factorial(num-1);
  }

  def main(args: Array[String]): Unit = {
    println(factorial(11_000));
  }

}

