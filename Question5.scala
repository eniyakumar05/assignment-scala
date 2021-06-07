object Question5 {
  def test(num1: Int, num2: Int): Int = {
    val num1_abs = math.abs(num1- 100)
    val num2_abs= math.abs(num2- 100)
    if (num1_abs == num2_abs) 0
    else if (num1_abs < num2_abs) num1
    else num2
  }

  def main(args: Array[String]): Unit = {
    println(test(99,95))
    println(test(95,95))
    println(test(99,70))
  }
}
